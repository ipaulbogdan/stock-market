package model.dto;

import lombok.*;

import java.math.BigInteger;

@Builder
@Setter
@Getter
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class StockUpdateDto {

    private BigInteger numberOfStocks;

}
