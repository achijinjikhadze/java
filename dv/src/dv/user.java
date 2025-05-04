package dv;

public class user {
     
	public long id;
	public String name;
	public String email;
	
	user(long id, String name, String email){
		this.id =id;
		this.name=name;
		this.email=email;
	}
	
	public long getid() {
		return id;
	}
	public String getname() {
		return name;
	}
	public String getemail() {
		return email;
	}
	
	public void setid(long x) {
		this.id=x;
	}
	
	public void setname(String name) {
		this.name=name;
	}
	
	public void setemail(String email) {
		this.email=email;
	}
}

