package hum.imm_hum.dbmanager.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Json {

    @Id
    String id;

    String type;

    String content;
}
