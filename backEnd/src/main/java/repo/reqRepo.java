package repo;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import beans.reqdetails;

@Repository
public interface reqRepo extends CrudRepository<reqdetails, Long>{

	List<reqdetails> findByReqState(String string);

}