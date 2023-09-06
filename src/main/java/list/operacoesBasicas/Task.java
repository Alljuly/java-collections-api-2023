package main.java.list.operacoesBasicas;

public class Task {
	
	private String description;
	
	public Task(String description)
	{
		this.setDescription(description);
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	@Override
	
	public String toString() {
		return description;
	}
}
	

