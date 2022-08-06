package come.revature.daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.revature.models.PersonalInfo;
import com.revature.services.ConnectionUtil;


public class PersonalInfoDaoImpl implements PersonalInfoDAO {
	public PersonalInfo getEmailByName(String name) {
		try(Connection conn = ConnectionUtil.getConnection()){
			String sql = "SELECT * FROM personal_info WHERE email = ?;";
			
			PreparedStatement statement = conn.prepareStatement(sql);
			
			statement.setString(1, name); //this is where SQL injection is checked for.
			
			ResultSet result = statement.executeQuery();
			
			if(result.next()) {
				PersonalInfo personalinfo = new PersonalInfo();
				personalinfo.setEmail(result.getString("email"));
				personalinfo.setFirstName(result.getString("first_name"));
				personalinfo.setLastName(result.getString("last_name"));
				personalinfo.setPhoneNumber(result.getString("phone_number"));
				personalinfo.setAccountBalance(result.getDouble("account_balance"));
				personalinfo.setCredit(result.getBoolean("credit"));
			}							
						
		}catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
}
