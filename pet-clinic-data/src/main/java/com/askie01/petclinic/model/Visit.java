package com.askie01.petclinic.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.LocalDate;

@Data
@Entity
@Table(name = "visits")
@EqualsAndHashCode(callSuper = true)
public class Visit extends BaseEntity {
    private LocalDate date;
    private String description;
    private Pet pet;
}
