import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class User_login {
	
	public String uname;
	public String pwd;

	private static Connection connect() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		return DriverManager.getConnection("jdbc:mysql://localhost:3306/z-kart", "root", "root");
	}
	public void customer_login(String uname_id, String pass) throws SQLException, ClassNotFoundException {		
		uname = uname_id;
		pwd = pass;
		Connection con = connect();
		String sql_querry = "SELECT * FROM customer_details_1 WHERE user_id='uname'AND pwd = 'pass'";
		Statement stm = con.createStatement();
		ResultSet result = stm.executeQuery(sql_querry);
		int a = result.getRow();
		
		if(a != 0)
		{
			System.out.println("Login success");
		}else
		{
			System.out.println("Login failed");
		}
		Shopping sh = new Shopping();
		sh.display_items();
		
	
	}
		
	}

	
	
