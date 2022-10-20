package repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import beans.logindetails;

@Repository
public interface adminRepo extends CrudRepository<logindetails, Long> {
	logindetails findByuName(String uName);
}


 