package com.polarmb.portfolio_backend.domain.model;

import lombok.Data;
import java.util.Date;

@Data
public class Applicant {

    private Integer id;
    private String name;
    private String lastname;
    private String email;
    private String country;
    private Date birthday;

}
