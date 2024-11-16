import lombok.*;

@AllArgsConstructor
@ToString(exclude = {"quantity"})
@Getter
@Setter
@EqualsAndHashCode(of = {"brand"})
public class CarWithLombok {
    private String model;
    private String brand;
    private int year;
    private int price;
    private String color;
    private int quantity;
}
