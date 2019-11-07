package model.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@Setter
@MappedSuperclass
public class BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "public_identifier")
    private String publicIdentifier;

    @Column(name = "date_created")
    private LocalDateTime dateCreated;

    @PrePersist
    protected  void initializeDate() {
        if(dateCreated == null) {
            dateCreated = LocalDateTime.now();
        }

        if(publicIdentifier == null) {
            publicIdentifier = UUID.randomUUID().toString();
        }
    }

}
