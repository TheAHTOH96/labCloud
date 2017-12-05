package com.labcloud.prog1.emines;

import org.springframework.data.annotation.Id;
import java.math.BigInteger;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class Products {
    @Id
    private String id;

    private String name;
    private BigInteger amount;
    private BigInteger price;
}
