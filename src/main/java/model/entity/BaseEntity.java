package model.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Setter
@MappedSuperclass
public class BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String publicIdentifier;

    @Column
    private LocalDateTime dateCreated;

    @PrePersist
    protected  void initializeDate() {
        if(dateCreated == null) {
            dateCreated = LocalDateTime.now();
        }
    }

}
