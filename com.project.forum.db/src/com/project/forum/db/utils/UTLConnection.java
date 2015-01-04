package com.project.forum.db.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class UTLConnection {
	private static final String USER = "postgres";
	private static final String URL  = "jdbc:postgresql://localhost:5432/forum";
	private static final String PASS = "USUARIO12"; 
	
	
	public UTLConnection(){
		
	}
	
	public boolean createConnection(){
		boolean connected = false;
		Connection con = null;
        Statement st = null;
        ResultSet rs = null;   
        
        try{
        	con = DriverManager.getConnection(URL, USER, PASS);
            st = con.createStatement();
            rs = st.executeQuery("SELECT VERSION()");
            
        }catch(SQLException e){
        	
        }
		
		return connected;
	}
	

    public static void main(String[] args) {
    	Connection con = null;
        Statement st = null;
        ResultSet rs = null;        
        

        try {
            con = DriverManager.getConnection(URL, USER, PASS);
            st = con.createStatement();
            rs = st.executeQuery("SELECT VERSION()");

            if (rs.next()) {
                System.out.println(rs.getString(1));
            }

        } catch (SQLException ex) {
            Logger lgr = Logger.getLogger(UTLConnection.class.getName());
            lgr.log(Level.SEVERE, ex.getMessage(), ex);

        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (st != null) {
                    st.close();
                }
                if (con != null) {
                    con.close();
                }

            } catch (SQLException ex) {
                Logger lgr = Logger.getLogger(UTLConnection.class.getName());
                lgr.log(Level.WARNING, ex.getMessage(), ex);
            }
        }
    }
    
}
