package business;

import javax.persistence.Entity;
import java.io.Serializable;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
public class Compte implements Serializable {

	String login;
	String pwd;
	
	public Compte(String login, String pwd) {
		this.login=login;
		this.pwd=pwd;
	}
	
	public Compte() {
		
	}
	
	
	@Id
	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

 
}

