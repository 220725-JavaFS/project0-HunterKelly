package come.revature.daos;

import java.util.List;

import com.revature.models.AccountObject;

public interface AccountDAO {	
	
	public abstract AccountObject getAccountById(int id);	
	
	List<AccountObject> getAllAccounts();
	
	public abstract void insertAccount(AccountObject account);	
	
	public abstract void updateAccountType(String AccountType, int id);
	public abstract void deleteAccount(int id);
	
	public abstract AccountObject getAccountbyUserName(String username);

	public void updateAccountBalance(double Accountbalance, int id);
	public void updatePassword(String password, int id);

	
}
