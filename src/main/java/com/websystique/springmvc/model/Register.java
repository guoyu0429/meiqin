package com.websystique.springmvc.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@Entity
@Table(name="REGISTER")
public class Register {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@NotNull
	@Size(min=3, max=50)
	@Column(name = "LOGINNAME", nullable = false)
	private String loginname;


	@NotNull
	@Size(min=11, max=15)
	@Column(name = "PNUMBER", nullable = false)
	private String pnumber;
	
	@NotNull
	@Size(min=6, max=50)
	@Column(name="PASSWORD", nullable = false)
	private String password;
	
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLoginname() {
		return loginname;
	}

	public void setLoginname(String loginname) {
		this.loginname = loginname;
	}

	public String getPnumber(){
		return pnumber;
	}
	public void setPnumber( String punmber){
		this.pnumber = punmber;
	}
	public String getPassword(){
		return password;
	}
	public void setPassword(String password){
		this.password = password;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((loginname == null) ? 0 : loginname.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Register))
			return false;
		Register other = (Register) obj;
		if (id != other.id)
			return false;
		if (loginname == null) {
			if (other.loginname != null)
				return false;
		} else if (!loginname.equals(other.loginname))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Register [id=" + id + ", loginname=" + loginname + ", pnumber="
				+ pnumber + "]";
	}
	
	
}
