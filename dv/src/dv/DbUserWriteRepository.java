package dv;

import java.sql.*;



public class DbUserWriteRepository implements UserWriteRepository {
    
	//save
    public void save(user user) {
        
    	 try (Connection con = DBConnection.getConnection();
                 Statement st = con.createStatement()) {

                
                String insertSql = "insert into users (username, email) values ('axali', 'mail@gmail.com')";
                st.executeUpdate(insertSql);
                System.out.println("daemata");
    	 } catch (SQLException e) {
             e.printStackTrace();
         }
    	 
    	String sql = "insert into users ( username, email) values ( ?, ?)";
        
        try (Connection con = DBConnection.getConnection(); 
           
            PreparedStatement st = con.prepareStatement(sql)) {
           // st.setLong(1, user.getid());
            st.setString(1, user.getname());
            st.setString(2, user.getemail());
            st.executeUpdate();
            System.out.println("daemata");
        } 
        
        catch (SQLException e) {
            e.printStackTrace();
        }
        
    }

    //update
    public void update(user user) {
    	
        String sql = "update users set username = ?, email = ? where id = ?";
        
        try (Connection con = DBConnection.getConnection();
        		
            PreparedStatement st = con.prepareStatement(sql)) {
            st.setString(1, user.getname());
            st.setString(2, user.getemail());
            st.setLong(3, user.getid());
            st.executeUpdate();
            System.out.println("ganaxlda");
        } 
        
        catch (SQLException e) {
            e.printStackTrace();
        }
    }

    //washla
    public void delete(Long id) {
        String sql = "delete from users where id = ?";
        
        try (Connection con = DBConnection.getConnection();
        		
            PreparedStatement st = con.prepareStatement(sql)) {
            st.setLong(1, id);
            st.executeUpdate();
            System.out.println("waishala");
            
            
        } 
        catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

