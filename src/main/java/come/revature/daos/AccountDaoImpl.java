package come.revature.daos;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;



import com.revature.models.AccountObject;

import com.revature.models.PersonalInfo;
import com.revature.services.ConnectionUtil;

public class AccountDaoImpl implements AccountDAO{

	@Override
	public AccountObject getAccountById(int id) {
		try(Connection conn = ConnectionUtil.getConnection()){
			String sql = "SELECT * FROM customer_accounts WHERE customer_id = " + id + ";";
			Statement statement = conn.createStatement();
			ResultSet result = statement.executeQuery(sql);
			
			if(result.next()) {//resultSets are cursor based, each time.next is called the cursor moves to the
							   //next group of values. It starts one before so you always need to call next.
				AccountObject AccountObject = new AccountObject(
						result.getInt("customer_id"),
						result.getString("user_name"),
						result.getString("the_password"),						
						null							
						);
				String personalEmail = result.getString("email");				
				if(personalEmail != null) {
					PersonalInfoDAO PersonalDao = new PersonalInfoDaoImpl();
					PersonalInfo personalinfo = PersonalDao.getEmailByName(personalEmail);
					AccountObject.setPersonalInfo(personalinfo);
				}
						
				return AccountObject;
			}
			
			
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	//Test main method
	//public static void main(String[] args) {
	//	AccountDAO aDao = new AccountDaoImpl();
		//AccountObject a = aDao.getAccountByName("user_name");
		//System.out.println(a);
	
	//List<AccountObject> list = aDao.getAllAccounts();
	//}
@Override
	public List<AccountObject> getAllAccounts() {
		try(Connection conn = ConnectionUtil.getConnection()){
			String sql = "SELECT * FROM accounts LEFT JOIN ON personalinfo.user_name = accounts.user_name;";
			Statement statement = conn.createStatement();
			ResultSet result = statement.executeQuery(sql);
			List<AccountObject> accountList = new ArrayList<AccountObject>();
		
			while(result.next()) {
				if(result.next()) {//resultSets are cursor based, each time.next is called the cursor moves to the
						   		   //next group of values. It starts one before so you always need to call next.
					AccountObject AccountObject = new AccountObject(
							result.getInt("customer_id"),
							result.getString("user_name"),
							result.getString("the_password"),
							result.getString("email"),
							null							
							);
					String personalUser = result.getString("user_name");
					
						if(personalUser != null) {
						
							PersonalInfo customerInfo = new PersonalInfo();	
							customerInfo.setEmail(result.getString("email"));
							customerInfo.setFirstName(result.getString("first_name"));
							customerInfo.setLastName(result.getString("last_name"));							
							customerInfo.setPhoneNumber(result.getString("phonenumber"));
							customerInfo.setAccountBalance(result.getDouble("account_balance"));
							customerInfo.setCredit(result.getBoolean("credit"));
						
						}
						
						accountList.add(AccountObject);
				}
		
				return accountList;
			}		
		
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return null;
	
	}

public void insertAccount(AccountObject account) {
	try(Connection conn = ConnectionUtil.getConnection()){
		String sql = "INSERT INTO accounts (user_name, password, email" 
				+ " VALUES (?,?,?);";
		
		PreparedStatement statement = conn.prepareStatement(sql);
		
		int count = 0;
		statement.setString(++count, account.getUsername());
		statement.setString(++count, account.getPassword());		
		if(account.getPersonalInfo()!=null) {
			statement.setString(++count, account.getPersonalInfo().getEmail());
		}
	}catch(SQLException e) {
		e.printStackTrace();
	}
}


}
