package demo.models;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;

import static javax.persistence.GenerationType.AUTO;

@Data
@Entity
@XmlRootElement
@AllArgsConstructor
public class Player {

    @Id
    @GeneratedValue(strategy = AUTO)
    private Long id;
    private String name;
    private String position;

    public Player() {
    }

    public Player(String name, String position) {
        this.name = name;
        this.position = position;
    }
}
