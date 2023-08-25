package com.polarmb.portfolio_backend.infrastructure.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.NaturalId;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "applicant")
@NoArgsConstructor
@Getter
@Setter
@ToString
public class ApplicantEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "lastname")
    private String lastname;

    @Column(name = "email")
    @NaturalId
    private String email;

    @Column(name = "city")
    private String city;

    @Column(name = "country")
    private String country;

    @Column(name = "birthday")
    private Date birthday;

    @Column(name = "job_title")
    private String jobTitle;

}
