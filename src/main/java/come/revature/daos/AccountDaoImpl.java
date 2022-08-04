package come.revature.daos;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.revature.models.Account;
import com.revature.models.AccountObject;
import com.revature.services.ConnectionUtil;

public class AccountDaoImpl implements AccountDAO{

	@Override
	public AccountObject getAccountByName(String username) {
		try(Connection conn = ConnectionUtil.getConnection()){
			String sql = "SELECT * FROM accounts WHERE username = " + username + ";";
			Statement statement = conn.createStatement();
			ResultSet result = statement.executeQuery(sql);
			
			if(result.next()) {//resultSets are curser based, each time.next is called the cursor moves to the
							   //next group of values. It starts one before so you always need to call next.
				AccountObject AccountObject = new AccountObject(
						result.getString("username"),
						result.getString("password"),
						result.getInt("permissions"),
						null,
						null
						);
				return AccountObject;
			}
			
			
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
public static void main(String[] args) {
	AccountDAO aDao = new AccountDaoImpl();
	AccountObject a = aDao.getAccountByName("user_name");
	System.out.println(a);
}
}
