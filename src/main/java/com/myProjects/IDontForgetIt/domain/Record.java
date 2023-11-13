package com.myProjects.IDontForgetIt.domain;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "record")
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Record {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String tittle;

    private String text;

    private LocalDateTime creationDate;

    private LocalDateTime nextEventDate;

    private int factor;

    @Enumerated(EnumType.ORDINAL)
    TimePeriods timePeriod;

}
