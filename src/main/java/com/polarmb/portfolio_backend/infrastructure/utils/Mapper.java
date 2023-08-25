package com.polarmb.portfolio_backend.infrastructure.utils;

import com.polarmb.portfolio_backend.domain.dto.ApplicantDTO;
import com.polarmb.portfolio_backend.infrastructure.entity.ApplicantEntity;
import org.modelmapper.ModelMapper;

public class Mapper {

    public static ApplicantDTO applicantToDto(ApplicantEntity applicant) {
        if (applicant != null) {
            return new ModelMapper().map(applicant, ApplicantDTO.class);
        } else {
            return null;
        }
    }

}
