package com.krigersv.models.user;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;
@Data
public class UsersResponseModel {
    int page,total;
    @JsonProperty("per_page")
    int perPage;
    @JsonProperty("total_pages")
    int totalPages;
    List<UsersDataResponseModel> data;
    UsersSupportResponseModel support;
}
