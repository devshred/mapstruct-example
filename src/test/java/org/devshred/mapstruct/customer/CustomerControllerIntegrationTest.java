package org.devshred.mapstruct.customer;

import static java.time.format.DateTimeFormatter.ISO_DATE;
import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.http.MediaType.APPLICATION_JSON;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.time.LocalDate;
import java.util.Optional;
import java.util.UUID;

import org.devshred.mapstruct.MapstructApplication;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import com.google.gson.Gson;

@SpringBootTest(classes = MapstructApplication.class)
@AutoConfigureMockMvc
class CustomerControllerIntegrationTest {
    private static final Gson GSON = new Gson();

    @Autowired
    private MockMvc mvc;

    @Autowired
    private CustomerRepository customerRepository;

    private static String today() {
        return LocalDate.now().format(ISO_DATE);
    }

    @Test
    void createEntity() throws Exception {
        final UUID customerId = UUID.randomUUID();
        final CustomerDto customer = CustomerDto.builder() //
                .id(customerId) //
                .name("Peter") //
                .contractType("ECONOMY") //
                .address(new AddressDto("Berlin", "Parkstrasse")) //
                .startDate(today()) //
                .build();

        mvc.perform( //
                post("/customer") //
                        .contentType(APPLICATION_JSON) //
                        .content(GSON.toJson(customer))) //
                .andExpect(status().isCreated());

        Optional<CustomerEntity> dbResult = customerRepository.findByCustomerId(customerId);

        assertThat(dbResult).isPresent();
    }
}