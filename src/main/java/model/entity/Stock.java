package model.entity;

import lombok.*;

import javax.persistence.*;
import java.math.BigInteger;

@Builder
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@Setter
@Entity
@Table(name = "stocks")
public class Stock extends BaseEntity {

    @Column
    private String name;

    @JoinColumn(name = "user_id")
    @OneToOne
    private User user;

    @Column(name = "number_of_stocks")
    private BigInteger numberOfStocks;

}
