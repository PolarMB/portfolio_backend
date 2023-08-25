package com.polarmb.portfolio_backend.infrastructure.adapter;

import com.polarmb.portfolio_backend.infrastructure.entity.ApplicantEntity;

public interface ApplicantDAO {

    ApplicantEntity getApplicant(int applicantId);
}
