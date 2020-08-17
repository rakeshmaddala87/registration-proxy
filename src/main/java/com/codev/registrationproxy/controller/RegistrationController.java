package com.codev.registrationproxy.controller;

import com.codev.registrationproxy.model.RegistrationRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class RegistrationController {

    @PostMapping
    public String acceptRegistrationRequest(@RequestBody RegistrationRequest registrationRequest){
        return "Received request for UserName " + registrationRequest.getUserName();
    }


}
