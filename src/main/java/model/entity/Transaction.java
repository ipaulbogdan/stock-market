package model.entity;


import lombok.*;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.Table;
import java.math.BigInteger;

@Getter
@Setter
@Builder
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Table(name = "transactions")
public class Transaction extends BaseEntity {

    @JoinColumn(name = "seller")
    private User user_seller;

    @JoinColumn(name = "buyer")
    private User user_buyer;

    @Column
    private String stockName;

    @Column
    private BigInteger numberOfStocks;

    @Column
    private String price;


}
