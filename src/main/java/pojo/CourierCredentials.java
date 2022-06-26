package pojo;

public class CourierCredentials {
    private String login;
    private String password;

    public CourierCredentials(CourierPojo courierPojo) {
        this.login = courierPojo.getLogin();
        this.password = courierPojo.getPassword();
    }

    public CourierCredentials(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public static CourierCredentials from(CourierPojo courierPojo) {
        return new CourierCredentials(courierPojo);
    }

    public static CourierCredentials withoutLogin(CourierPojo courierPojo) {
        return new CourierCredentials(courierPojo.getLogin(), "");
    }

    public static CourierCredentials withoutPassword(CourierPojo courierPojo) {
        return new CourierCredentials("", courierPojo.getPassword());
    }

}
