package com.example.demo.model;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name = "Task")
public class Task 
{
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY) 
private long id;
private String title;
private String descr;
private boolean completed;
//get et set 
public void setid(long id) 
{
	this.id=id;
}
public long getid()
{
   return id;	

}

public String getTitle() {
    return title;
}

public void setTitle(String title) {
    this.title = title;
}

public String getDescription() {
    return descr;
}

public void setDescription(String desc) {
    this.descr = descr;
}

public boolean isCompleted() {
    return completed;
}

public void setCompleted(boolean completed) {
    this.completed = completed;
}
}

	
	
	
	
	
	
