package com.polarmb.portfolio_backend.infrastructure.adapter;

import com.polarmb.portfolio_backend.domain.model.Applicant;
import com.polarmb.portfolio_backend.infrastructure.entity.ApplicantEntity;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;

@Repository
public class ApplicantDAOImpl implements ApplicantDAO {

    @Autowired
    private EntityManager factory;

    @Override
    public ApplicantEntity getApplicant(int applicantId) {
        Session session = factory.unwrap(Session.class);
        ApplicantEntity entity = session.find(ApplicantEntity.class, applicantId);
        session.close();
        return entity;
    }
}
