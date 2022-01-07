import java.io.FileNotFoundException;
import java.sql.SQLException;
import java.util.Scanner;

public class Task {

	public static void main(String[] args) throws ClassNotFoundException, FileNotFoundException, SQLException  {
		Customer_update cu = new Customer_update();
		cu.cus_update() ;
		
		
		Inventory_update iv = new Inventory_update();
		iv.inv_update();
		
		Scanner inn = new Scanner(System.in);
		System.out.println("Select Login type by entering the number");
		System.out.println("1. User login");
		System.out.println("2. admin login");
		int a = inn.nextInt();
		switch(a)
		{
		case 1:
			
			System.out.println("***************************Welcome to user log in ***************************");
			System.out.println("Enter the User name");
			String uname_id = inn.nextLine();
			System.out.println("Enter the password");
			String pass = inn.nextLine();
			
			User_login ul = new User_login();
			ul.customer_login(uname_id,pass);
			break;
		case 2:
			System.out.println("***************************Welcome to admin log in ***************************");
			Admin_login adl = new Admin_login();
			adl.admin_login_method();
			break;
			default:
				System.out.println("Invalid selection");
		
		}
		
		
		
		
	
		
	
		
		
				
	}

	
}