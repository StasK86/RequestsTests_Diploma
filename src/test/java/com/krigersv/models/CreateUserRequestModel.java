package com.krigersv.models;

import lombok.Data;

@Data
public class CreateUserRequestModel {
    String name;
    String job;
    Integer id;
    String createdAt;
}
