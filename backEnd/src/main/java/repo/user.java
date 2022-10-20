package repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import beans.aadhar;

@Repository
public interface user extends CrudRepository<aadhar, Long>{

	aadhar findByEmail(String email);

}