package GramPanchayat.service;

import GramPanchayat.model.UserDtls;

public interface UserService {
	
	public UserDtls createUser(UserDtls user,String url);

	public boolean checkEmail(String email);
	
	public boolean verifyAccount(String code);

}
