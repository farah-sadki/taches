package com.example.demo.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.repository.Taskrepository;
import java.util.List;
import java.util.Optional;
import com.example.demo.model.Task;
@Service

public class TaskService {
	   @Autowired
	private Taskrepository taskrepository;
	public List<Task> getalltasks()
	{
		
		return taskrepository.findAll();
		
	}
	public Optional<Task> gettaskid(Long id)
	{
	
		return taskrepository.findById(id);
		
		
	}
	public Task saveTask(Task task)
	{
		
		return taskrepository.save(task);
		
		
	}
	public void deletetask(Long id)
	{
		 taskrepository.deleteById(id);
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}