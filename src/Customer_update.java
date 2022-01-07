import java.io.FileNotFoundException;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Customer_update {
	
	
	public void cus_update() throws ClassNotFoundException, SQLException, FileNotFoundException {
	String fileName = "C:\\Users\\Balakrishnan K S\\eclipse-workspace\\Z-kart\\zuser_db.txt";
	for(Customer cus : readCustomerFromFile(fileName)) {
		saveCustomer(cus);
	}
	
}

public static List<Customer> readCustomerFromFile(String fileName) throws FileNotFoundException {
	List<Customer> cusList = new ArrayList<>();
	FileReader fr = new FileReader(fileName);

	Scanner input = new Scanner(fr);

	while (input.hasNextLine()) {
		String str = input.nextLine();
//		System.out.println(str);

		String[] arr = str.split("\t");

		cusList.add(new Customer(arr[0], arr[1], arr[2], arr[3])) ;
	}

	if (input != null) {
		input.close();
	}
	return cusList;
}

private static Connection connect() throws ClassNotFoundException, SQLException {
	Class.forName("com.mysql.jdbc.Driver");
	return DriverManager.getConnection("jdbc:mysql://localhost:3306/z-kart", "root", "root");
}

private static void saveCustomer(Customer cus) throws SQLException, ClassNotFoundException {
	Connection con = connect();
	
	PreparedStatement ptm = con.prepareStatement("INSERT INTO customer_details_1 VALUES (?,?,?,?)");
	ptm.setString(1, cus.getEmail());
	ptm.setString(2, cus.getPassword());
	ptm.setString(3, cus.getName());
	ptm.setString(4, cus.getMobile());

	ptm.executeUpdate();

}


}
