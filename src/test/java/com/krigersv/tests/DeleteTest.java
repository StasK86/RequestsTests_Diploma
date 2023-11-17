package com.krigersv.tests;

import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.krigersv.specs.DeleteSpec.deleteSpec;
import static com.krigersv.specs.UserAndLoginSpec.loginRequestSpec;
import static io.qameta.allure.Allure.step;
import static io.restassured.RestAssured.given;


public class DeleteTest extends TestBase {

    @Test
    @Tag("delete_test")
    @Owner("Stas")
    @DisplayName("Проверка удалений")
        void userDeletionTest() {
            step("Проверка ответа при удалений пользователя", () -> {
                given(loginRequestSpec)
                        .delete("/users/2")
                        .then()
                        .log().body()
                        .spec(deleteSpec);
            });
        }
    }

