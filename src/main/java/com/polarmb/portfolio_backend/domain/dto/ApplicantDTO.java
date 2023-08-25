package com.polarmb.portfolio_backend.domain.dto;

import com.polarmb.portfolio_backend.infrastructure.utils.DateFormatter;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@NoArgsConstructor
@Getter
@Setter
public class ApplicantDTO {

    private Integer id;
    private String name;
    private String lastname;
    private String email;
    private String city;
    private String country;
    @Setter(AccessLevel.NONE)
    private String birthday;
    private String jobTitle;

    public ApplicantDTO setBirthday(Date birthday) {
        this.birthday = DateFormatter.formatDate(birthday);
        return this;
    }
}
