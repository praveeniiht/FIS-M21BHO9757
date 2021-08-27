package jdbc;
import java.sql.*;
/*
 * visit www.mvnrepository.com
 * search for mysql connector in the search text box
 * select mysql connector/j and select the version (select latest version)
 * select the jar file, this will automatically download the jar file into local machine
 * 
 *  steps to add the jar to project.
 * 1. right click on the project
 * 2. build path -->configure the build path --> select libraries tab   -->click on
 * the classpath --> click on the add external jars button ----> browse to the location
 * of the jar downloaded from the mvn repository ---> open --> Apply and close
 * 
 * 
 * 
 * 
 */
public class DisplayData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			String url = "jdbc:mysql://localhost:3306/fisglobal";
			String userid="root";
			String passwd="root";
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con =   DriverManager.getConnection(url,userid,passwd);
			Statement st = con.createStatement();
			String sql ="select * from persons";
			ResultSet rs = st.executeQuery(sql);
			while(rs.next())
				System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3));
			
			rs.close();
			st.close();
			con.close();
			
		}
		catch(Exception e) {
			
		}

	}

}
