package model.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.Table;
import java.math.BigInteger;

@Builder
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Table(name = "offers")
public class Offer extends BaseEntity {

    @JoinColumn(name = "stock_id")
    private Stock stock;

    @Column(name = "number_of_stocks")
    private BigInteger numberOfStocks;

    @Column
    private String price;



}
