package pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderPojo {
    private String firstName;
    private String lastName;
    private String address;
    private int metroStation;
    private String phone;
    private int rentTime;
    private String deliveryDate;
    private String comment;
    private List<String> color;

    public static OrderPojo getDefault() {
        return new OrderPojo("Кабанчик",
                "Кабанище",
                "Поле, 414 apt.",
                3,
                "+7 888 000 55 44",
                5,
                "2020-05-06",
                "Кабанчик вернись в Кабаноху",
                null);
    }
}
