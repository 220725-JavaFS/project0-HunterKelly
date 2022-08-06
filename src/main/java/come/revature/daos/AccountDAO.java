package come.revature.daos;

import java.util.List;

import com.revature.models.AccountObject;

public interface AccountDAO {
	
	
	public abstract AccountObject getAccountById(int id);
	
	
	List<AccountObject> getAllAccounts();
	
	public abstract void insertAccount(AccountObject account);


	

	
}
