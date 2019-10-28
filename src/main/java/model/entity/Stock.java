package model.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.Table;
import java.math.BigInteger;

@Builder
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@Entity
@Table(name = "stocks")
public class Stock {

    @Column
    private String name;

    @JoinColumn(name = "user_id")
    private User user;

    @Column(name = "number_of_stocks")
    private BigInteger numberOfStocks;

}
