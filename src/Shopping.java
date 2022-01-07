import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Shopping {
	
	public void display_items() throws SQLException, ClassNotFoundException {
		
		Connection con = connect();
		
		Scanner inu = new Scanner(System.in);
		System.out.println("Select the product to be displayed");
		System.out.println("Mobile");
		System.out.println("Laptop");
		System.out.println("Tablet");
		System.out.println("All gadget");
		int ch = inu.nextInt();
		System.out.println("Category\tBrand\tmodel\tprice\tstock");
		
		
		switch(ch)
		{
		case 1: 
			Statement statement = con.createStatement();
			String sql = "select * from inventory_details_1 where category = 'Mobile' ";
			ResultSet result = statement.executeQuery(sql);
			
			while(result.next()) {
				String Category = result.getString("category");
				String  Brand   = result.getString("brand");
				String model    = result.getString("model");
				String price    = result.getString("price");
				String stock    = result.getString("stock");
				
				System.out.println(Category+"\t"+Brand+"\t"+model+"\t"+price+"\t"+"\t"+stock);
			}
			
			
			
			
			break;
		case 2:
			Statement stm = con.createStatement();
			String sql1 = "select * from inventory_details_1 where category = 'Laptop' ";
			ResultSet result1 = stm.executeQuery(sql1);
			
			while(result1.next()) {
				String Category = result1.getString("category");
				String  Brand   = result1.getString("brand");
				String model    = result1.getString("model");
				String price    = result1.getString("price");
				String stock    = result1.getString("stock");
				
				System.out.println(Category+"\t"+Brand+"\t"+model+"\t"+price+"\t"+"\t"+stock);
			}
			
			break;
		case 3:
			Statement statement2 = con.createStatement();
			String sql2 = "select * from inventory_details_1 where category = 'Tablet' ";
			ResultSet result2 = statement2.executeQuery(sql2);
			
			while(result2.next()) {
				String Category = result2.getString("category");
				String  Brand   = result2.getString("brand");
				String model    = result2.getString("model");
				String price    = result2.getString("price");
				String stock    = result2.getString("stock");
				
				System.out.println(Category+"\t"+Brand+"\t"+model+"\t"+price+"\t"+"\t"+stock);
			}
			
			break;
		case 4:
			Statement statement3 = con.createStatement();
			String sql3 = "select * from inventory_details_1 ";
			ResultSet result3 = statement3.executeQuery(sql3);
			
			while(result3.next()) {
				String Category = result3.getString("category");
				String  Brand   = result3.getString("brand");
				String model    = result3.getString("model");
				String price    = result3.getString("price");
				String stock    = result3.getString("stock");
				
				System.out.println(Category+"\t"+Brand+"\t"+model+"\t"+price+"\t"+"\t"+stock);
			}
			
			break;
			default:
				System.out.print("Invalid selection");
				break;
				
		}
		
		
		
		
		
		
	}
	private static Connection connect() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		return DriverManager.getConnection("jdbc:mysql://localhost:3306/z-kart", "root", "root");
	}

}
