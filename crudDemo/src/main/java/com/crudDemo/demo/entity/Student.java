package com.crudDemo.demo.entity;

public class Student {
	String id;
	String name;
	String batch;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String id, String name, String batch) {
		super();
		this.id = id;
		this.name = name;
		this.batch = batch;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBatch() {
		return batch;
	}
	public void setBatch(String batch) {
		this.batch = batch;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", batch=" + batch + "]";
	}
	

}
