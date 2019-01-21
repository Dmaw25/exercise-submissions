package com.rev.beans;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="USER_ROLE")
public class User_Role implements Serializable{
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 7192810405365511792L;

	public User_Role(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public User_Role( String name) {
		super();
		this.name = name;
	}
	public User_Role() {
		super();
	}

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user_roleSequence")
	@SequenceGenerator(allocationSize = 1, name = "user_roleSequence", sequenceName = "SQ_USER_ROLE_PK")
	@Column(name = "USER_ROLE_ID")
	private int id;

	@Column(name = "NAME")
	private String name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		User_Role other = (User_Role) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "User_Role [id=" + id + ", name=" + name + "]";
	}
}
