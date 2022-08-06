package come.revature.daos;

import com.revature.models.PersonalInfo;

public interface PersonalInfoDAO {
	
	PersonalInfo getEmailByName(String email);
}
