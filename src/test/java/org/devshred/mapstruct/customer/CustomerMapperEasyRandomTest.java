package org.devshred.mapstruct.customer;

import static java.time.format.DateTimeFormatter.ISO_DATE;
import static org.assertj.core.api.Assertions.assertThat;

import java.time.LocalDate;
import java.util.Random;

import org.jeasy.random.EasyRandom;
import org.jeasy.random.EasyRandomParameters;
import org.jeasy.random.FieldPredicates;
import org.junit.jupiter.api.Test;
import org.mapstruct.factory.Mappers;

class CustomerMapperEasyRandomTest {
    private static final EasyRandom DTO_GENERATOR = new EasyRandom(new EasyRandomParameters()
            .randomize(FieldPredicates.named("status"), CustomerMapperEasyRandomTest::randomConsumerStateAsString) //
            .randomize(FieldPredicates.named("contractType"), CustomerMapperEasyRandomTest::randomContractTypeAsString) //
            .randomize(FieldPredicates.named("startDate"), () -> LocalDate.now().format(ISO_DATE)) //
    );

    private static final EasyRandom ENTITY_GENERATOR = new EasyRandom();
    private final CustomerMapper mapper = Mappers.getMapper(CustomerMapper.class);

    private static String randomConsumerStateAsString() {
        return CustomerStatus.values()[new Random().nextInt(CustomerStatus.values().length)].name();
    }

    private static String randomContractTypeAsString() {
        return ContractType.values()[new Random().nextInt(ContractType.values().length)].name();
    }

    @Test
    void dtoToEntity() {
        final CustomerDto customerDto = DTO_GENERATOR.nextObject(CustomerDto.class);
        final CustomerEntity customerEntity = mapper.dtoToEntity(customerDto);

        assertThat(customerEntity) //
                .usingRecursiveComparison() //
                .ignoringFields("id", "customerId", "address", "contract") //
                .ignoringFieldsMatchingRegexes(".*Date")
                .withEqualsForFields((CustomerStatus e, String d) -> e.name().equals(d), "status") //
                .isEqualTo(customerDto);

        assertThat(customerEntity.getCustomerId()).isEqualTo(customerDto.getId());
        assertThat(customerEntity.getStartDate()).isToday();
        assertThat(customerEntity.getContract().getType().name()).isEqualTo(customerDto.getContractType());
        assertThat(customerEntity.getAddress().getCity()).isEqualTo(customerDto.getAddress().getCity());
    }

    @Test
    void entityToDto() {
        final CustomerEntity customerEntity = ENTITY_GENERATOR.nextObject(CustomerEntity.class);
        final CustomerDto customerDto = mapper.entityToDto(customerEntity);

        assertThat(customerEntity) //
                .usingRecursiveComparison() //
                .ignoringFields("id", "customerId", "address", "contract") //
                .ignoringFieldsMatchingRegexes(".*Date")
                .withEqualsForFields((CustomerStatus e, String d) -> e.name().equals(d), "status") //
                .isEqualTo(customerDto);

        assertThat(customerDto.getId()).isEqualTo(customerEntity.getCustomerId());
        assertThat(customerDto.getStartDate()).isEqualTo(customerEntity.getStartDate().format(ISO_DATE));
        assertThat(customerDto.getContractType()).isEqualTo(customerEntity.getContract().getType().name());
        assertThat(customerDto.getAddress().getCity()).isEqualTo(customerEntity.getAddress().getCity());
    }
}