package com.krigersv.tests;

import com.krigersv.models.object.CreateUserIdResponseModel;
import com.krigersv.models.object.CreateUserRequestModel;
import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.krigersv.specs.CreateUserSpec.createUserRequestSpec;
import static com.krigersv.specs.CreateUserSpec.createUserResponseSuccessSpec;
import static io.qameta.allure.Allure.step;
import static io.restassured.RestAssured.given;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class CreatingUserTest {

    @Test
    @Tag("creating_test")
    @Owner("Stas")
    @DisplayName("Проверка сведений")
    void createUsersTest() {
        CreateUserRequestModel requestModel = new CreateUserRequestModel();
        requestModel.setName("morpheus");
        requestModel.setJob("leader");

        CreateUserIdResponseModel response = step("Запрос сведений о пользователе", () ->
                given(createUserRequestSpec)
                        .body(requestModel)
                        .when()
                        .post("/users")
                        .then()
                        .spec(createUserResponseSuccessSpec)
                        .extract().as(CreateUserIdResponseModel.class));

        step("Проверка полей в ответе", () -> {
            assertThat(response.getName(), equalTo("morpheus"));
            assertThat(response.getJob(), equalTo("leader"));
            assertNotNull(response.getId());
            assertNotNull(response.getCreatedAt());
        });
    }
}
