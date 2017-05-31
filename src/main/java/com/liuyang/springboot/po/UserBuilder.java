package com.liuyang.springboot.po;

public class UserBuilder {
	private String firstName;     // 必传参数
    private String lastName;      // 必传参数
    private int age;              // 可选参数
    private String phone;         // 可选参数
    private String address;       // 可选参数
    
    public UserBuilder(String firstName,String lastName){
    	this.firstName = firstName;
    	this.lastName = lastName;
    }
    
    public UserBuilder age(int age){
    	this.age = age;
    	return this;
    }
    
    public UserBuilder phone(String phone){
    	this.phone = phone;
    	return this;
    }
    
    public UserBuilder address(String address){
    	this.address = address;
    	return this;
    }

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
    
    
    public User builder(){
    	User user = new User(this);
    	return user;
    }
}
