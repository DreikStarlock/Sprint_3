package api;

import io.restassured.response.Response;
import pojo.CourierCredentials;
import pojo.CourierPojo;
import io.qameta.allure.Step;

public class CourierApi extends MainApi {
    @Step("Послать POST запрос на ручку /courier")
    public Response sendPostRequestCreateCourier(CourierPojo courierPojo) {
        return reqSpec.body(courierPojo)
                .when()
                .post("/courier");
    }

    @Step("Авторизация")
    public Response sendPostLoginCourier(CourierCredentials credentials) {
        return reqSpec.body(credentials)
                .when()
                .post("/courier/login");
    }

    @Step("Удаление курьера")
    public Response sendDeleteCourier(int courierId) {
        return reqSpec.pathParam("courierId", courierId)
                .when()
                .delete("/courier/{courierId}");
    }
}
