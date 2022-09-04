package org.devshred.mapstruct.happypath;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

@DataJpaTest
class HappyPathRepositoryTest {
    @Autowired
    HappyPathRepository repository;

    @Test
    void persistAndRetrieve() {
        final HappyPathEntity entity = repository.save(HappyPathEntity.builder() //
                .field1("eins") //
                .field2("zwei") //
                .state(HappyState.GREAT) //
                .child(HappyChild.builder().name("Peter").build()) //
                .build());

        final Optional<HappyPathEntity> found = repository.findById(entity.getId());


        assertThat(found) //
                .isPresent().get() //
                .extracting("field1", "field2") //
                .containsExactly("eins", "zwei");
    }
}