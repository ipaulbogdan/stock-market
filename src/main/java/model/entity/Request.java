package model.entity;

import lombok.*;

import javax.persistence.*;
import java.math.BigInteger;

@Getter
@Setter
@Builder
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Entity
@Table(name = "requests")
public class Request extends BaseEntity {

    @Column(name = "stock_name")
    private String stockName;

    @JoinColumn(name = "user_id")
    @OneToOne
    private User user;

    @Column(name = "number_of_stocks")
    private BigInteger numberOfStocks;

    @Column
    private String price;


}
