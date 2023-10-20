package com.example.restful_crud_mybatis.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Timestamp;

@Entity
@Table(name = "language")
@Data
public class LanguageEntity {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer language_id;

    @Column
    private String name;

    @Column
    private Timestamp last_update;

}
