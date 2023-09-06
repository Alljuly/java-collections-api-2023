package main.java.list.operations.task;

import java.util.*;


public class TaskList {
	
	private List<Task> taskList;
	
	public TaskList() {
		this.taskList = new ArrayList<>();
	}
	
	
	public void addTask(String description) {
		taskList.add(new Task(description));
	}
	
	
	public void removeTask(String description) {
		List<Task> removeTask = new ArrayList<>();
		for(Task t : taskList) {
			if(t.getDescription().equalsIgnoreCase(description)) {
				removeTask.add(t);
			}
		}
		taskList.removeAll(removeTask);
	}
	
	public int getTotalTasks() {
		return taskList.size();
	}
	
	public void getDescriptionTasks() {
		System.out.println(taskList);
	}
	
	public static void main(String[] args) {
		TaskList taskList = new TaskList();
		
		
		
		
		taskList.addTask("Task 1");
		taskList.addTask("Task 1");	
		taskList.addTask("Task 3");
		System.out.println("O total de tarefas ate o momento e de " + taskList.getTotalTasks());
		
		
		taskList.getDescriptionTasks();																
		
		taskList.removeTask("Task 1");
		
		System.out.println("O total de tarefas ate o momento e de " + taskList.getTotalTasks());
		
	}
}
