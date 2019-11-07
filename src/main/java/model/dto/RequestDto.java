package model.dto;

import lombok.*;

import java.math.BigInteger;

@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class RequestDto {

    private String publicId;
    private String stockName;
    private UserDto user;
    private BigInteger numberOfStocks;
    private String price;
}
