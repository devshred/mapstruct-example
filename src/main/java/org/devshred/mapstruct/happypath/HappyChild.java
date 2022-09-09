package org.devshred.mapstruct.happypath;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name = "happy_child")
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@ToString
public class HappyChild {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    private String name;

    @ToString.Exclude
    @OneToOne(mappedBy = "child")
    private HappyPathEntity parent;
}
