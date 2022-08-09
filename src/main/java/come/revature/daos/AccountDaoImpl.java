package come.revature.daos;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;



import com.revature.models.AccountObject;
import com.revature.models.AccountStatus;
import com.revature.models.AccountStatusBanker;
import com.revature.models.PersonalInfo;
import com.revature.services.ConnectionUtil;

public class AccountDaoImpl implements AccountDAO{

	@Override
	public AccountObject getAccountById(int id) {
		try(Connection conn = ConnectionUtil.getConnection()){
			String sql = "SELECT * FROM customer_accounts LEFT JOIN accounts ON accounts.account_type = "
					+ "customer_accounts.account_type LEFT JOIN account_status_admin ON account_status_admin.email ="
					+ "customer_accounts.email "
					+ "LEFT JOIN account_status_banker ON account_status_banker.phone_number = "
					+ "customer_accounts.phone_number"
					+ " WHERE customer_id = " + id + ";";
			Statement statement = conn.createStatement();
			ResultSet result = statement.executeQuery(sql);
			
			if(result.next()) {//resultSets are cursor based, each time.next is called the cursor moves to the
							   //next group of values. It starts one before so you always need to call next.
				AccountObject AccountObject = new AccountObject(
						result.getInt("customer_id"),
						result.getString("user_name"),						
						result.getString("the_password"),
						result.getString("first_name"),
						result.getString("last_name"),
						result.getDouble("account_balance"),						
						null,
						null,
						null
						);
				String personalUser = result.getString("account_type");	
				String accountStatus = result.getString("email");
				String accountStatusBanker = result.getString("phone_number");
				if(personalUser != null) {		
					PersonalInfo customerInfo = new PersonalInfo();	
					customerInfo.setAccountType(personalUser);
					customerInfo.setCheckings(result.getDouble("checkings"));
					customerInfo.setCheckings(result.getDouble("savings"));
					customerInfo.setCheckings(result.getDouble("dogecoin"));					
					AccountObject.setPersonalInfo(customerInfo);
					
				}if(accountStatus != null) {		
					AccountStatus customerInfo2 = new AccountStatus();	
					customerInfo2.setEmail(accountStatus);					
					customerInfo2.setAccountstatus(result.getBoolean("administrator"));						
					AccountObject.setAccountstatus(customerInfo2);
					
				}if(accountStatusBanker != null) {		
					AccountStatusBanker customerInfo3 = new AccountStatusBanker();	
					customerInfo3.setPhonenumber(accountStatusBanker);					
					customerInfo3.setBanker(result.getBoolean("administrator"));					
					AccountObject.setAccountstatusbanker(customerInfo3);
				}
						
				return AccountObject;
			}
						
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
@Override
	public List<AccountObject> getAllAccounts() {
		try(Connection conn = ConnectionUtil.getConnection()){
			String sql = "SELECT * FROM customer_accounts LEFT JOIN accounts ON accounts.account_type = "
					+ "customer_accounts.account_type LEFT JOIN account_status_admin ON account_status_admin.email ="
					+ "customer_accounts.email "
					+ "LEFT JOIN account_status_banker ON account_status_banker.phone_number = "
					+ "customer_accounts.phone_number;";
					
			Statement statement = conn.createStatement();
			ResultSet result = statement.executeQuery(sql);
			
			List<AccountObject> accountList = new LinkedList<AccountObject>();
		
			while(result.next()) { //resultSets are cursor based, each time.next is called the cursor moves to the
						   		   //next group of values. It starts one before so you always need to call next.
				AccountObject AccountObject = new AccountObject(
						result.getInt("customer_id"),
						result.getString("user_name"),						
						result.getString("the_password"),
						result.getString("first_name"),
						result.getString("last_name"),
						result.getDouble("account_balance"),						
						null,
						null,
						null
						);
				String personalUser = result.getString("account_type");	
				String accountStatus = result.getString("email");
				String accountStatusBanker = result.getString("phone_number");
				if(personalUser != null) {		
					PersonalInfo customerInfo = new PersonalInfo();	
					customerInfo.setAccountType(personalUser);
					customerInfo.setCheckings(result.getDouble("checkings"));
					customerInfo.setCheckings(result.getDouble("savings"));
					customerInfo.setCheckings(result.getDouble("dogecoin"));					
					AccountObject.setPersonalInfo(customerInfo);
					
				}if(accountStatus != null) {		
					AccountStatus customerInfo2 = new AccountStatus();	
					customerInfo2.setEmail(accountStatus);					
					customerInfo2.setAccountstatus(result.getBoolean("administrator"));						
					AccountObject.setAccountstatus(customerInfo2);
					
				}if(accountStatusBanker != null) {		
					AccountStatusBanker customerInfo3 = new AccountStatusBanker();	
					customerInfo3.setPhonenumber(accountStatusBanker);					
					customerInfo3.setBanker(result.getBoolean("administrator"));					
					AccountObject.setAccountstatusbanker(customerInfo3);
				}
						
						accountList.add(AccountObject);
				}
		
				return accountList;					
		
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return null;
	
	}

	


	public void insertAccount(AccountObject account) {
		try(Connection conn = ConnectionUtil.getConnection()){		
			String sql = "INSERT INTO customer_accounts (user_name, the_password, first_name, last_name, account_balance, account_type)" 
						+ " VALUES (?,?,?,?,?,?);";		
		
			PreparedStatement statement = conn.prepareStatement(sql);
			
			
			int count = 0;
			statement.setString(++count, account.getUsername());
			statement.setString(++count, account.getPassword());
			statement.setString(++count, account.getFirstname());
			statement.setString(++count, account.getLastname());
			statement.setDouble(++count, account.getAccountbalance());			
			if(account.getPersonalInfo()!=null) {
				statement.setString(++count, account.getPersonalInfo().getAccountType());
			}
			else {
				statement.setString(++count, null);
			}			
			statement.execute();
			
		}catch(SQLException e) {
		e.printStackTrace();
		}		
		
	}

	@Override
	public void updateAccountType(String AccountType,int id) {
		try(Connection conn = ConnectionUtil.getConnection()){
			String sql = "UPDATE customer_accounts SET account_type = " + AccountType + " WHERE customer_id = " + id + ";";
			PreparedStatement statement = conn.prepareStatement(sql);			
			statement.execute();
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
	}	
	
	public void deleteAccount(int id) {
		try(Connection conn = ConnectionUtil.getConnection()){
			String sql = "DELETE FROM customer_accounts WHERE customer_id = " + id + ";";
			PreparedStatement statement = conn.prepareStatement(sql);				
			statement.execute();
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
	}
	public AccountObject getAccountbyUserName(String username) {
		try(Connection conn = ConnectionUtil.getConnection()){
			String sql = "SELECT * FROM customer_accounts LEFT JOIN accounts ON accounts.account_type = "
						+ "customer_accounts.account_type LEFT JOIN account_status_admin ON account_status_admin.email ="
						+ "customer_accounts.email "
						+ "LEFT JOIN account_status_banker ON account_status_banker.phone_number = "
						+ "customer_accounts.phone_number"
						+ " WHERE user_name = " + username + ";";
			Statement statement = conn.createStatement();
			ResultSet result = statement.executeQuery(sql);
			
			if(result.next()) {//resultSets are cursor based, each time.next is called the cursor moves to the
							   //next group of values. It starts one before so you always need to call next.
				AccountObject AccountObject = new AccountObject(
						result.getInt("customer_id"),
						result.getString("user_name"),						
						result.getString("the_password"),
						result.getString("first_name"),
						result.getString("last_name"),
						result.getDouble("account_balance"),						
						null,
						null,
						null
						);
				String personalUser = result.getString("account_type");	
				String accountStatus = result.getString("email");
				String accountStatusBanker = result.getString("phone_number");
				if(personalUser != null) {		
					PersonalInfo customerInfo = new PersonalInfo();	
					customerInfo.setAccountType(personalUser);
					customerInfo.setCheckings(result.getDouble("checkings"));
					customerInfo.setCheckings(result.getDouble("savings"));
					customerInfo.setCheckings(result.getDouble("dogecoin"));					
					AccountObject.setPersonalInfo(customerInfo);
					
				}if(accountStatus != null) {		
					AccountStatus customerInfo2 = new AccountStatus();	
					customerInfo2.setEmail(accountStatus);					
					customerInfo2.setAccountstatus(result.getBoolean("administrator"));						
					AccountObject.setAccountstatus(customerInfo2);
					
				}if(accountStatusBanker != null) {		
					AccountStatusBanker customerInfo3 = new AccountStatusBanker();	
					customerInfo3.setPhonenumber(accountStatusBanker);					
					customerInfo3.setBanker(result.getBoolean("administrator"));					
					AccountObject.setAccountstatusbanker(customerInfo3);
				}
						
				return AccountObject;
			}
						
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public void updateAccountBalance(double Accountbalance,int id) {
		try(Connection conn = ConnectionUtil.getConnection()){
			String sql = "UPDATE customer_accounts SET account_balance = " + Accountbalance + " WHERE customer_id = " + id + ";";
			PreparedStatement statement = conn.prepareStatement(sql);			
			statement.execute();
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
	}

	
	public void updatePassword(String password,int id) {
		try(Connection conn = ConnectionUtil.getConnection()){
			String sql = "UPDATE customer_accounts SET the_password = " + password + " WHERE customer_id = " + id + ";";
			PreparedStatement statement = conn.prepareStatement(sql);			
			statement.execute();
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	
	
}
