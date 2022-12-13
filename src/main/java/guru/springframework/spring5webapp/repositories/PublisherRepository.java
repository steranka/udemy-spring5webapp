package guru.springframework.spring5webapp.repositories;

import org.springframework.data.repository.CrudRepository;
import guru.springframework.spring5webapp.domain.Publisher;

/**
 * Created by jt on 12/23/19.
 */
public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
