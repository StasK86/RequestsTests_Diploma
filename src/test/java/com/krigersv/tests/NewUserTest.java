package com.krigersv.tests;

import com.krigersv.models.NewUserModel;
import com.krigersv.models.NewUserResponseModel;
import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.krigersv.specs.CreateUserSpec.createUserResponseSuccessSpec;
import static com.krigersv.specs.UserAndLoginSpec.loginRequestSpec;
import static io.qameta.allure.Allure.step;
import static io.restassured.RestAssured.given;
import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

public class NewUserTest {
    @Test
    @Tag("newUser_test")
    @Owner("Stas")
    @DisplayName("Создание нового пользователя")
    void CreatingNewUserTest() {
        NewUserModel newUser = new NewUserModel();
        newUser.setName("Stas");
        newUser.setJob("engineer");

        NewUserResponseModel responseModel = step("Создание нового пользователя", () ->
                given(loginRequestSpec)
                        .body(newUser)
                        .when()
                        .post("/users")
                        .then()
                        .spec(createUserResponseSuccessSpec)
                        .extract().as(NewUserResponseModel.class));

        step("Проверяем созданного пользователя", () -> {
            assertThat("Stas").isEqualTo(responseModel.getName());
            assertThat("engineer").isEqualTo(responseModel.getJob());
            assertThat(responseModel.getId()).isNotNull();
            assertThat(responseModel.getCreatedAt()).isNotNull();
        });
    }
}
