package com.codev.registrationproxy.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

@Data
@Builder(builderClassName = "Builder", toBuilder = true)
@JsonIgnoreProperties(ignoreUnknown = true)
public class RegistrationRequest {

    private String userName;
    private String emailId;
    private String password;

}
