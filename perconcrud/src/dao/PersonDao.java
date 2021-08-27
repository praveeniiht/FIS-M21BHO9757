package dao;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


import model.Persons;

public class PersonDao {
	
	static Connection con = null;
	PreparedStatement pst =null;
	Statement st = null;
	ResultSet rs = null;
	
	static {
		String url = "jdbc:mysql://localhost:3306/fisglobal";
		String userid="root";
		String passwd="root";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			con =   DriverManager.getConnection(url,userid,passwd);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public String insertPerson(Persons person) {
		int status=0;
		try {
			String sql = "insert into persons values(?,?,?)";
			
			pst =  con.prepareStatement(sql);
			pst.setString(1, person.getName());
			pst.setString(2, person.getCity());
			pst.setString(3, person.getState());
			status = pst.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (status ==1)
			return "Record inserted";
		else
			return "Record Not inserted";
	}
	
	
	public List<Persons> displayPersons(){
		String sql ="select * from persons";
		List<Persons> persons = new ArrayList();
		try {
			st = con.createStatement();
			rs = st.executeQuery(sql);
			while(rs.next()) {
				persons.add(new Persons(rs.getString(1),rs.getString(2), rs.getString(3)));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return persons;
	}
	public Persons searchPerson(String name) {
		String sql = "select * from persons where name = ?";
		Persons person=null;
		try {
			pst = con.prepareStatement(sql);
			pst.setString(1, name);
			rs = pst.executeQuery();
			rs.next();
			person = new Persons(rs.getString(1),rs.getString(2),rs.getString(3));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return person;
	}
}
