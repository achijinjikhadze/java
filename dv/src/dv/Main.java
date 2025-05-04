package dv;

public class Main {
    public static void main(String[] args) {
    	
        UserWriteRepository usr = new DbUserWriteRepository();

        
       user user1 = new user(1, "saxeli2", "saxeli@gmail.com");
       usr.save(user1);

        
       user1.setname("sxvasaxeli");
       user1.setemail("sxva@gmail.com");
        usr.update(user1);

        
        usr.delete(1L);
    }
}
