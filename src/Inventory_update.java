import java.io.FileNotFoundException;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Inventory_update {
	
	public void inv_update() throws FileNotFoundException, ClassNotFoundException, SQLException {
		String fileName = "C:\\Users\\Balakrishnan K S\\eclipse-workspace\\Z-kart\\z-kart_db.txt";
		for(Inventory inv : readInventoryFromFile(fileName)) {
			saveInventory(inv);
		}
		
	}

	public static List<Inventory> readInventoryFromFile(String fileName) throws FileNotFoundException {
		List<Inventory> invList = new ArrayList<>();
		FileReader fr = new FileReader(fileName);

		Scanner input = new Scanner(fr);

		while (input.hasNextLine()) {
			String str = input.nextLine();
			//System.out.println(str);

			String[] arr = str.split("\t");

			invList.add(new Inventory(arr[0], arr[1], arr[2], arr[3], arr[4])) ;
		}

		if (input != null) {
			input.close();
		}
		return invList;
	}

	private static Connection connect() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		return DriverManager.getConnection("jdbc:mysql://localhost:3306/z-kart", "root", "root");
	}

	private static void saveInventory(Inventory inv) throws SQLException, ClassNotFoundException {
		Connection con = connect();
		
		PreparedStatement ptm = con.prepareStatement("INSERT INTO inventory_details_1 VALUES (?,?,?,?,?)");
		ptm.setString(1, inv.getcategory());
		ptm.setString(2, inv.getband());
		ptm.setString(3, inv.getmodel());
		ptm.setString(4, inv.getprice());
		ptm.setString(5, inv.getstock());

		ptm.executeUpdate();

		
	}

}
