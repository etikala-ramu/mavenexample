package com.maven.web.model;

public class Employee {
private int eid;
private String name;
private String email;

/*public Employee() {
	super();
}
public Employee(int eid, String name, String email) {
	super();
	this.eid = eid;
	this.name = name;
	this.email = email;
}*/

public int getId() {
	return eid;
}
public void setId(int eid) {
	this.eid = eid;
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
@Override
public String toString() {
	return "Employee [id=" + eid + ", name=" + name + ", email=" + email + ", getId()=" + getId() + ", getName()="
			+ getName() + ", getEmail()=" + getEmail() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
			+ ", toString()=" + super.toString() + "]";
}

}
