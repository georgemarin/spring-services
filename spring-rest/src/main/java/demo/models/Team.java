package demo.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;

import java.util.List;

import static javax.persistence.GenerationType.AUTO;

@Data
@Entity
@ToString
@XmlRootElement
@AllArgsConstructor
public class Team {

    @Id
    @GeneratedValue(strategy = AUTO)
    private Long id;
    private String name;
    private String mascot;
    private String location;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "teamId")
    private List<Player> players;

    public Team() {}

    public Team(String name, String mascot, String location, List<Player> players) {
        this.name = name;
        this.mascot = mascot;
        this.location = location;
        this.players = players;
    }
}

