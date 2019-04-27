package demo.repositories;

import demo.models.Player;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RestResource;

@RestResource(path = "players2", rel = "player")
public interface PlayerRepository extends CrudRepository<Player, Long> {
}
