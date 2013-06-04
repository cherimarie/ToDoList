import java.util.Date;

public class Task {
	
	
	private String taskName;
	private int catID;
	private int rewardType;
	private int priority;
	private Date dueDate;
	private Date dateComplete;
	
	
	
	public Task(String taskName, int catID, int rewardType, int priority, Date dueDate, Date dateComplete)
	{
		this.taskName = taskName;
		this.catID = catID;
		this.rewardType = rewardType;
		this.priority = priority;
		this.dueDate = dueDate;
		this.dateComplete = dateComplete;
		
	}
	
	public String getTaskName()
	{
		return taskName;
	}

	
	public void DestroyItem(Task task)
	{
		//tell DatabaseInteractions to destroy the item
	}
	
	public void UpdateItem(Task task, int param, String newData)
	{
		//find the item using DatabaseInteractions method
		//find the paramater represented by param
		//insert the newData into param
		
		//idk about datatypes here, or how we'll deal with multiple changes at once
	}
	
}
