package org.devshred.mapstruct;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class MapstructApplication {

    public static void main(String[] args) {
        SpringApplication.run(MapstructApplication.class, args);
    }

}
