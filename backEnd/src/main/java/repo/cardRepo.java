package repo;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import beans.card;
@Repository
public interface cardRepo extends CrudRepository<card,Long> {

	List<card> findByState(String string);

	card findByName(String name);

}