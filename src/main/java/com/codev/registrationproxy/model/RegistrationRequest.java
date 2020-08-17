package com.codev.registrationproxy.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;

@Data
@Builder(builderClassName = "Builder", toBuilder = true)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonDeserialize(builder = RegistrationRequest.Builder.class)
@ToString
public class RegistrationRequest {

    @JsonProperty(value = "userName")
    @ApiModelProperty(example = "rakesh.venus", position = 1)
    private String userName;

    @JsonProperty(value = "userEmail")
    @ApiModelProperty(example = "rakesh.venus@gmail.com", position = 2)
    private String userEmail;

    @JsonProperty(value = "password")
    @ApiModelProperty(example = "Rakesh_Bangalore_123$", position = 3)
    private String password;
}
