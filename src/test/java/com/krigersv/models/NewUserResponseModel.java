package com.krigersv.models;

import lombok.Data;

@Data
public class NewUserResponseModel {
    String name;
    String job;
    Integer id;
    String createdAt;
}