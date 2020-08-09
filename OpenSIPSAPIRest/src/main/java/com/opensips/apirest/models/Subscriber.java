package com.opensips.apirest.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="subscriber")
public class Subscriber implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	private String username;
	private String domain;
	private String password;
	private String email_address;
	private String ha1;
	private String ha1b;
	private String rpid;
	private Integer enabled;
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getDomain() {
		return domain;
	}
	public void setDomain(String domain) {
		this.domain = domain;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail_address() {
		return email_address;
	}
	public void setEmail_address(String email_address) {
		this.email_address = email_address;
	}
	public String getHa1() {
		return ha1;
	}
	public void setHa1(String ha1) {
		this.ha1 = ha1;
	}
	public String getHa1b() {
		return ha1b;
	}
	public void setHa1b(String ha1b) {
		this.ha1b = ha1b;
	}
	public String getRpid() {
		return rpid;
	}
	public void setRpid(String rpid) {
		this.rpid = rpid;
	}
	public Integer getEnabled() {
		return enabled;
	}
	public void setEnabled(Integer enabled) {
		this.enabled = enabled;
	}

}
