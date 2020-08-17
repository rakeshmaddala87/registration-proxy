package com.codev.registrationproxy.controller;

import com.codev.registrationproxy.model.RegistrationRequest;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@Slf4j
public class RegistrationController {

    @Value("${kafka.topic.name}")
    private String topicName;

    @Autowired
    private KafkaTemplate<String, RegistrationRequest> kafkaTemplate;

    @PostMapping(path = "/postRegistration")
    @ApiOperation(" accepts user registration requests and forwards it to be processed")
    public String acceptRegistrationRequest(@RequestBody RegistrationRequest registrationRequest) {
        String userName = registrationRequest.getUserName();
        log.info("SUCCESS: Received request for UserName: {}",userName);
        log.info("Sending payload with UserName: {} to Topic: {} .....",userName, topicName);
        sendMessage(registrationRequest);
        log.info("SUCCESS: payload with UserName: {} sent to Topic: {}",userName, topicName);
        return "";

    }

    private void sendMessage(RegistrationRequest registrationRequest) {
        kafkaTemplate.send(topicName,registrationRequest.getUserName()+ UUID.randomUUID(), registrationRequest);
    }
}
