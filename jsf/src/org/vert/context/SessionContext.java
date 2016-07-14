package org.vert.context;

import java.io.Serializable;

import org.vert.bean.Auth;
import org.vert.bean.Register;

public class SessionContext implements Serializable{

	/**
	 * Session scoped beans
	 */
	private static final long serialVersionUID = 1L;
	
	private Auth auth;
	
	private Register register;

	public Auth getAuth() {
		if (auth == null){
			auth = new Auth();
		}
		return auth;
	}

	public void setAuth(Auth auth) {
		this.auth = auth;
	}

	public Register getRegister() {
		if (register == null){
			register = new Register();
		}
		return register;
	}

	public void setRegister(Register register) {
		this.register = register;
	}

}
