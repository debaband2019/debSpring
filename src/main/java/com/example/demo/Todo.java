package com.example.demo;

import java.util.Date;

public class Todo {

    private int id;

    private String user;

    private String desc;

    private Date targetDate;

    private boolean isDone;
    
    public Todo(int id,String us,String des,Date dt,boolean d) {
    
    	this.id = id;
    	this.desc = des;
    	this.isDone =d;
    	this.targetDate = dt;
    	this.user = us;
    	
    }

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public Date getTargetDate() {
		return targetDate;
	}

	public void setTargetDate(Date targetDate) {
		this.targetDate = targetDate;
	}

	public boolean isDone() {
		return isDone;
	}

	public void setDone(boolean isDone) {
		this.isDone = isDone;
	}

//Getters, Setters, Constructors, toString, equals and hash code

}