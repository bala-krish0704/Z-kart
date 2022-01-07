import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Admin_login {
	
	public void admin_login_method() throws ClassNotFoundException, SQLException{
		Connection conn = connect();
		Scanner inn1 = new Scanner(System.in);
		System.out.println("Enter the User name");
		String uname_id1 = inn1.nextLine();
		System.out.println("Enter the password");
		String pass1 = inn1.nextLine();
		
		System.out.println("\n\nThe product with less than and equal to 10 stocks\n\n\n");
		System.out.println("\n\nCategory\tBrand\tmodel\tprice\tstock");
		
		
		if(uname_id1.equals("admin@zoho.com")&& pass1.equals("xyzzy")) {
			Statement statement = conn.createStatement();
			String sql = "select * from inventory_details_1 where stock<=10 ";
			ResultSet result = statement.executeQuery(sql);
			
			while(result.next()) {
				String Category = result.getString("category");
				String  Brand   = result.getString("brand");
				String model    = result.getString("model");
				String price    = result.getString("price");
				String stock    = result.getString("stock");
				System.out.println(Category+"\t"+Brand+"\t"+model+"\t"+price+"\t"+"\t"+stock);
		}
		
		
		
		
	}
		else {
			System.out.println("Enter the valid details");
		}
	}
	

	
	
	
	
	
	
	private static Connection connect() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		return DriverManager.getConnection("jdbc:mysql://localhost:3306/z-kart", "root", "root");
	}

}
