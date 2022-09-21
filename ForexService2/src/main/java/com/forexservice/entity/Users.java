package com.forexservice.entity;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "userdetail")
public class Users {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@NotNull(message = "USERName cannot be null")
	
	@Size(min = 3, message = "UserName should be of min 3 chars")
    private String username;
	
	@NotNull(message = "password cannot be null")
	@Size(min = 3, message = "password should be of min 3 chars")
    private String password;
	
    @NotNull(message = "Name cannot be null")
	@Size(min = 3, message = "Name should be of min 3 chars")
    private String name;
    
    @Column(name = "email")
    @Email(message = "you should follow the emailvalidation")
    private String email;
    
    @NotNull(message = "name should not be null")
    
	private String phone;
	
	public Users() {
		super();
	}

	public Users(Integer id, String username, String password, String name, String email, String phone) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.name = name;
		this.email = email;
		this.phone = phone;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
}
