package com.polarmb.portfolio_backend.infrastructure.rest;

import com.polarmb.portfolio_backend.domain.dto.TestResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/test")
public class TestController {

    @GetMapping("/getTest")
    public ResponseEntity<TestResponse> getTest() {
        TestResponse response = new TestResponse();
        response.setTest("test");
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
