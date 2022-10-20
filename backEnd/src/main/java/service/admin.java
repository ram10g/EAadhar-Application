package service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import beans.card;
import beans.logindetails;
import beans.reqdetails;
import repo.adminRepo;
import repo.cardRepo;
import repo.reqRepo;

@Service
public class admin {
	
	@Autowired
	adminRepo ap;
	@Autowired
	cardRepo cp;
	@Autowired
	reqRepo rp;
	
	public void create(logindetails cred) {
		ap.save(cred);		
	}
	
	public List<logindetails> readAll(){
		return (List<logindetails>) ap.findAll();
	}
	
	public logindetails read(String uName) {
		return ap.findByuName(uName);
	}
	
	public List<card> getAllCards(){
		return (List<card>) cp.findAll();
	}
	
	public void updateCardDetails(card newCardData) {
		Optional<card> oldData=cp.findById(newCardData.getCitizenId());
		cp.save(newCardData);
	}
	
	public boolean deleteCard(long citizenId) {
		cp.deleteById(citizenId);
		return true;
	}
	
	public boolean addCard(card data) {
		cp.save(data);
		return true;
	}
	public List<card> PendingReq(){
		return cp.findByState("Pending");
	}
	
	public List<card> ApprovedReq(){
		return cp.findByState("Approved");
	}
	public long find(String name) {
		return cp.findByName(name).getCitizenId();
		
	}
	public Iterable<reqdetails> allUserRequests() {
		return rp.findAll(); 		
	}
	public boolean submitRequest(reqdetails req) {
		rp.save(req);
		return true;
	}
	public List<reqdetails> viewPending(){
		return rp.findByReqState("Pending");
	}
}