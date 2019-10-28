package model.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.Table;
import java.math.BigInteger;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "requests")
public class Request extends BaseEntity {

    @Column(name = "stock_name")
    private String stockName;

    @JoinColumn(name = "user_id")
    private User user;

    @Column(name = "number_of_stocks")
    private BigInteger numberOfStocks;

    @Column
    private BigInteger price;


}
