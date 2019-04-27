package demo;

import demo.models.Player;
import demo.models.Team;
import demo.repositories.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class SpringRestApplication {

    @Autowired
    private TeamRepository teamRepository;

    public static void main(String[] args) {
        SpringApplication.run(SpringRestApplication.class, args);
    }

    @PostConstruct
    public void addTeams() {
        Player pogba = new Player("Pogba", "CM");
        Player rashford = new Player("Rashford", "ST");
        Team manUtd = new Team("Manchester United", "Devil", "UK", Arrays.asList(pogba, rashford));
        Player messi = new Player("Messi", "RW");
        Player suarez = new Player("Suarez", "ST");
        Team barcelona = new Team("Barcelona", "", "Spain", Arrays.asList(messi, suarez));
        List<Team> teams = Arrays.asList(manUtd, barcelona);
        teamRepository.saveAll(teams);
    }
}

