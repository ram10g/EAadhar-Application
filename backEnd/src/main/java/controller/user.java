package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import beans.aadhar;

@RestController
@RequestMapping("/AadharApp")
public class user {
	@Autowired
	service.user us;
	
	@PostMapping("/login")
	public boolean login(@RequestParam String email,@RequestParam String pass) {
		return us.login(email, pass);
	}
	
	@PostMapping("/register")
	public boolean register(@RequestBody aadhar uCred) {
		return us.register(uCred);
	}
	
	@PostMapping("/applyCard")
	public long applyCard(@RequestBody aadhar userCred) {
		return us.applyAadhar(userCred);
		
	}
	@PostMapping("/sendRequest")
	public boolean sendRequest(@RequestBody aadhar userCred,@RequestParam String reqName) {
		return us.sendRequest(userCred, reqName);
	}

}