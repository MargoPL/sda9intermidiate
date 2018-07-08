package bookstore.products;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Setter
@Getter
public class Product {
    private Long id;
    private String name;
    private String additionalInfo;
    private BigDecimal price;
}
