package com.polarmb.portfolio_backend.application.service;

import com.polarmb.portfolio_backend.domain.dto.ApplicantDTO;
import com.polarmb.portfolio_backend.infrastructure.adapter.ApplicantDAO;
import com.polarmb.portfolio_backend.infrastructure.utils.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class ApplicantService {

    @Autowired
    private ApplicantDAO applicantDAO;

    public ApplicantDTO getApplicant(int applicantId) {
        return Mapper.applicantToDto(applicantDAO.getApplicant(applicantId));
    }

}
