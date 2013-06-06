import java.util.Date;

public class Task {
	
	
	private String taskName;
	private int idNum;
	private int catID;
	private int rewardType;
	private int priority;
	private Date dueDate;
	private Date dateComplete;
	
	public Task(String user_input)
	{
		//read user input a string that is task name 
		taskName = user_input;
		//other params can be added by user later editing the task
		
		this.idNum = 0;
		//initialized as 0, database interaction should change it to db id# after saving it 
	}

	public void setTaskName(String taskName){
		this.taskName = taskName;
	}	
	public String getTaskName(){
		return taskName;
	}
	public void setidNum(int idNum){
		this.idNum = idNum;
	}	
	public int getidNum(){
		return idNum;
	}	
	public void setcatID(int catID){
		this.catID = catID;
	}	
	public int getcatID(){
		return catID;
	}	
	public void setPriority(int priority){
		this.priority = priority;
	}	
	public int priority(){
		return priority;
	}
	public void setrewardType(int rewardType){
		this.rewardType = rewardType;
	}	
	public int rewardType(){
		return rewardType;
	}
	public void setdueDate(Date dueDate){
		this.dueDate = dueDate;
	}	
	public Date dueDate(){
		return dueDate;
	}
	public void setdateComplete(Date dateComplete){
		this.dateComplete = dateComplete;
	}	
	public Date dateComplete(){
		return dateComplete;
	}
	
	
	public boolean RemoveItem(int idNum)
	{
		Boolean success = false;
		if (!success)
		{
			idNum = 0;
			//since we use idNum to refer to the object, setting it to 0 makes object invisible and effectively dead forever
			//then, tell DatabaseInteractions to destroy the item (not coded because not necessary for assignment)
			success = true; 
		}
		return success;
	}
	
	public boolean UpdateField(String field, int newData)
	{
		Boolean success = false;
		if(!success)
		{  
			if (field.equals("priority")){
				//find the paramater represented by field, insert the newData into param
				setPriority(newData); 
				success = true;
			} else if (field.equals("catId")){
				setcatID(newData);
				success = true;
			} else if (field.equals("rewardType")){
				setrewardType(newData);
				success = true;
			} else {
				success = false;
			}
		}
		
		return success;
		//idk about datatypes here, or how we'll deal with multiple changes at once
	}
	
	public boolean UpdateDate(String field, Date newData)
	{
		Boolean success = false;
		
		if(!success)
		{  
			if (field.equals("dueDate")){
				//find the paramater represented by field, insert the newData into param
				setdueDate(newData); 
				success = true;
			} else if (field.equals("dateComplete")){
				setdateComplete(newData);
				success = true;
			} else {
				success = false;
			}
		}
		
		
		return success;
		//idk about datatypes here, or how we'll deal with multiple changes at once
	}
	
}
