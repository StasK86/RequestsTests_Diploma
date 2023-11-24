package com.krigersv.tests;

import com.krigersv.models.login.LoginErrorRequesModel;
import com.krigersv.models.login.LoginRequestModel;
import com.krigersv.models.login.LoginRequestSpecModel;
import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.krigersv.specs.UserAndLoginSpec.*;
import static com.krigersv.specs.UserAndLoginSpec.loginResponseSpec;
import static io.qameta.allure.Allure.step;
import static io.restassured.RestAssured.given;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.assertEquals;

@Tag("LoginTests")
@Owner("Stas")

public class LoginRequestTests {

    @Test
    @DisplayName("Проверка запросов")
    void successfulLoginVerificationTest() {
        LoginRequestModel login = new LoginRequestModel();
        login.setEmail("eve.holt@reqres.in");
        login.setPassword("cityslicka");

        LoginRequestSpecModel response = step("Запрос логина с паролем", () ->
                given(loginRequestSpec)
                        .body(login)
                        .when()
                        .post("/login")
                        .then()
                        .spec(loginResponseSpec)
                        .extract().as(LoginRequestSpecModel.class));

        step("Проверка токена", () ->
                assertEquals("QpwL5tke4Pnpja7X4", response.getToken()));
    }

    @Test
    @DisplayName("Проверка запросов")
    void failedLoginCheckTest() {
        LoginRequestModel body = new LoginRequestModel();
        body.setPassword("cityslicka");

        LoginErrorRequesModel response = step("Проверка логина c паролем", () ->
                given(loginRequestSpec)
                        .body(body)
                        .when()
                        .post("/login")
                        .then()
                        .spec(errorResponseSpec)
                        .extract().as(LoginErrorRequesModel.class));

        step("Проверка токена", () ->
                assertThat(response.getError(), equalTo("Missing email or username")));
    }
}
