package com.rev.beans;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="USER")
public class User implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -8366228481036499242L;
	public User(int id, String username, String password, User_Role userRole) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.userRole = userRole;
	}
	public User(String username,String password, User_Role userRole)
	{
		super();
		this.username = username;
		this.password = password;
		this.userRole = userRole;
	}
	public User(String username,String password)
	{
		super();
		this.username = username;
		this.password = password;
	}
	public User()
	{
		super();
	}
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="userSequence")
	@SequenceGenerator(allocationSize=1,name="userSequence",sequenceName="SQ_USER_PK")
	@Column(name="USER_ID")
	private int id;
	@Column(name="USER_NAME")
	private String username;
	@Column(name="PASSWORD")
	private String password;
	@ManyToOne(fetch=FetchType.EAGER, cascade=CascadeType.PERSIST)
	@JoinColumn(name="USER_ROLE_ID")
	private User_Role userRole;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public User_Role getUserRole() {
		return userRole;
	}
	public void setUserRole(User_Role userRole) {
		this.userRole = userRole;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		result = prime * result + ((userRole == null) ? 0 : userRole.hashCode());
		result = prime * result + ((username == null) ? 0 : username.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (id != other.id)
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (userRole == null) {
			if (other.userRole != null)
				return false;
		} else if (!userRole.equals(other.userRole))
			return false;
		if (username == null) {
			if (other.username != null)
				return false;
		} else if (!username.equals(other.username))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password=" + password + ", userRole=" + userRole + "]";
	}
}
