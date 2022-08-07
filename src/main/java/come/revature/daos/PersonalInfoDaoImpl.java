package come.revature.daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.revature.models.AccountObject;
import com.revature.models.PersonalInfo;
import com.revature.services.ConnectionUtil;
public class PersonalInfoDaoImpl implements PersonalInfoDAO {
	
	@Override
	public PersonalInfo getAccountTypeByName(String name) {
		try(Connection conn = ConnectionUtil.getConnection()){
			String sql = "SELECT * FROM accounts WHERE account_type = ?;";
			
			PreparedStatement statement = conn.prepareStatement(sql);
			
			statement.setString(1, name); //this is where SQL injection is checked for.
			
			ResultSet result = statement.executeQuery();
			
			if(result.next()) {
				PersonalInfo personalinfo = new PersonalInfo();
				personalinfo.setAccountType(result.getString("account_type"));
				personalinfo.setCheckings(result.getDouble("checkings"));
				personalinfo.setSavings(result.getDouble("savings"));
				personalinfo.setDogecoin(result.getDouble("dogecoin"));				
				return personalinfo;
			}							
						
		}catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

					
	
}
