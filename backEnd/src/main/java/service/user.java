package service;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import beans.aadhar;

@Service
public class user {
	
	@Autowired
	repo.user us;
	@Autowired
	RestTemplate restTemplate;
	
	public boolean login(String email, String pass) {
		aadhar uCred= us.findByEmail(email);
		if(uCred==null)
		{
			return false;
		}
		if(uCred.getEmail().matches(email)&&uCred.getPass().matches(pass))
		{
			return true;
		}
		else
			return false;
		
	}
	public boolean register(aadhar uCred) {
		us.save(uCred);
		return true;
	}
	public Iterable<aadhar> getAll(){
		return us.findAll();
	}
	
	public Long applyAadhar(aadhar userCred) {
		String url="http://localhost:9091/admin/applyCard";
		HttpHeaders headers = new HttpHeaders();
	    headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
	    HttpEntity<aadhar> entity = new HttpEntity<aadhar>(userCred,headers);
	    return restTemplate.exchange(url, HttpMethod.POST, entity, Long.class).getBody();
		
	}
	
	public boolean sendRequest(aadhar userCred,String reqName) {
		String url="http://localhost:9091/admin/submitRequest";
		HttpHeaders headers = new HttpHeaders();
	    headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
	    HttpEntity<aadhar> entity = new HttpEntity<aadhar>(userCred,headers);
	    Map<String, String> map = new HashMap<>();
	    map.put("reqName", reqName);
		return restTemplate.exchange(url, HttpMethod.POST, entity, Boolean.class, map).getBody();
	}
}