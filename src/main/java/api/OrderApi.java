package api;

import pojo.OrderPojo;
import io.qameta.allure.Step;
import io.restassured.response.Response;

import java.util.List;

public class OrderApi extends MainApi {
    @Step("Послать POST запрос на ручку /orders")
    public Response sendPostRequestCreateOrder(OrderPojo orderPojo) {
        return reqSpec.body(orderPojo)
                .when()
                .post("/orders");
    }

    @Step("Получить статус успешного создания заказа - 201")
    public int responseCreatedOrderStatus201(Response response) {
        return response.then()
                .assertThat()
                .statusCode(201)
                .extract()
                .path("track");
    }

    @Step("Послать GET запрос на ручку /orders, чтобы получить список заказов")
    public List<Object[]> sendGetRequestGetOrderList() {
        return reqSpec.get("/orders")
                .then().log().all()
                .assertThat()
                .statusCode(200)
                .extract()
                .path("orders");
    }

}
