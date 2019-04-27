package demo.repositories;

import demo.models.Team;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RestResource;

@RestResource(path="teams2", rel="team")
public interface TeamRepository extends CrudRepository<Team, Long> {
}
