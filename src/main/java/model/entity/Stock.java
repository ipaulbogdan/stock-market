package model.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.Table;
import java.math.BigInteger;

@Builder
@NoArgsConstructor
@AllArgsConstructor
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
