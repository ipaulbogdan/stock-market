package model.dto;

import lombok.*;

import java.math.BigInteger;


@Builder
@Setter
@Getter
@AllArgsConstructor(access =  AccessLevel.PRIVATE)
@NoArgsConstructor
public class StockDto {

    private String name;
    private UserDto user;
    private BigInteger numberOfStocks;
}
