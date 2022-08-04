package come.revature.daos;

import com.revature.models.AccountObject;

public interface AccountDAO {

	public AccountObject getAccountByName(String username);
	
	
}
