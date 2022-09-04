package org.devshred.mapstruct.happypath;

import java.math.BigDecimal;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name = "happy_path")
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class HappyPathEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "native")
    @Column
    private Long id;

    private String field1;
    private String field2;
    private String field3;

    private BigDecimal price;

    @Enumerated(EnumType.STRING)
    private HappyState state;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "child_id", referencedColumnName = "id")
    private HappyChild child;
}
