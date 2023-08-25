package com.polarmb.portfolio_backend.infrastructure.rest;

import com.polarmb.portfolio_backend.application.service.ApplicantService;
import com.polarmb.portfolio_backend.domain.dto.ApplicantDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ApplicantController {

    @Autowired
    private ApplicantService applicantService;
    private final int APPLICANT_ID = 1;

    @GetMapping(path = "/applicant", produces = "application/json")
    public ResponseEntity<ApplicantDTO> getApplicant() {
        return new ResponseEntity<>(applicantService.getApplicant(APPLICANT_ID), HttpStatus.OK);
    }
}
