package com.codev.registrationproxy.controller;

import com.codev.registrationproxy.model.RegistrationRequest;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class RegistrationController {

    @PostMapping(path = "/postRegistration")
    @ApiOperation(" accepts user registration requests and forwards it to be processed")
    public String acceptRegistrationRequest(@RequestBody RegistrationRequest registrationRequest){
        return "SUCCESS: Received request for UserName: " + registrationRequest.getUserName();
    }


}
