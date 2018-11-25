package controlller;

import model.bo.LoginBO;
import model.dao.LoginDAO;
import view.admin.ViewDangNhap;

public class LoginController {
	private LoginDAO loginDAO;
	private LoginBO loginBO;
	private ViewDangNhap loginView;
	public LoginDAO getLoginDAO() {
		return loginDAO;
	}
	public void setLoginDAO(LoginDAO loginDAO) {
		this.loginDAO = loginDAO;
	}
	public LoginBO getLoginBO() {
		return loginBO;
	}
	public void setLoginBO(LoginBO loginBO) {
		this.loginBO = loginBO;
	}
	public void checkLogin() {
		
	}
}
