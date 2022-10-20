package beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class logindetails {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long aId;
	@Column
	private String uName;
	@Column
	private String pass;	
	public String getuName() {
		return uName;
	}	
	public void setuName(String uName) {
		this.uName = uName;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
		
	public logindetails(String uName, String pass) {
		super();
		this.uName = uName;
		this.pass = pass;
	}
	public logindetails() {
		super();
	}
	@Override
	public String toString() {
		return "Credentials [uName=" + uName + ", pass=" + pass + "]";
	}
}
