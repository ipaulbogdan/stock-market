package model.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Builder
@Getter
@Entity
@NoArgsConstructor()
@AllArgsConstructor()
@Table(name = "users")
public class User extends BaseEntity {

    @Column
    private String username;


}
