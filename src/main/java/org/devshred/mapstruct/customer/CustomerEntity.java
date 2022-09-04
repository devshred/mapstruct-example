package org.devshred.mapstruct.customer;

import java.time.LocalDateTime;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Type;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name = "customer")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
@EntityListeners(AuditingEntityListener.class)
public class CustomerEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "native")
    @Column
    private Long id;

    @Column(nullable = false, unique = true)
    @Type(type = "org.hibernate.type.UUIDCharType")
    private UUID customerId;

    @Column(name = "status")
    @Enumerated(EnumType.STRING)
    private ConsumerStatus status;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String city;

    @Column(name = "created_date", nullable = false, updatable = false)
    @CreatedDate
    private LocalDateTime createdDate;

    @Column(name = "modified_date")
    @LastModifiedDate
    private LocalDateTime modifiedDate;

    public static CustomerEntity createCustomerEntity(final String name, final String city) {
        return createCustomerEntity(UUID.randomUUID(), name, city);
    }

    public static CustomerEntity createCustomerEntity(final UUID customerId, final String name, final String city) {
        return CustomerEntity.builder().customerId(customerId).name(name).city(city).build();
    }
}
