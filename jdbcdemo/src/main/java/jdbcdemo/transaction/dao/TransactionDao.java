package jdbcdemo.transaction.dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;

import jdbcdemo.dbutil.DBUtill;
import jdbcdemo.transaction.entity.Transaction;

public class TransactionDao {
public boolean addEmployee(Transaction t) {
		
		String query = "INSERT INTO transaction (namePerson, depositeAmmount, withdrawAmmount, balanceInquiry) VALUES(?, ?, ?)";
		
		try (Connection connection = DBUtill.getConnection();
				CallableStatement cst = connection.prepareCall("{?= call getAccDetails(?,?,?,?)}"))
		{
				
			
			cst.setString(2, "Shivam");
			cst.setInt(3,1000);
				cst.setInt(4, 100);
				cst.setInt(5, 900);
		
				
			
			
			int count = cst.executeUpdate();
			if(count == 1)
				return true;				
		}catch(

	SQLException ex)
	{
			ex.printStackTrace();
		}return false;
}

}
