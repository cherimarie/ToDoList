import java.util.ArrayList;

import com.sun.tools.javac.code.Attribute.Array;
import com.sun.tools.javac.util.List;


public class TaskList<string> {
	private List<Task> taskList;
	   //taskList is a List of Task objects 
	
	public TaskList () {
		
	}

	
	public Array CheckDueDates(TaskList tl)
	{
		//for each task in tasklist, look at dueDate element, compare to date.now, print to array(?) ones with dueDate of today
		
		Array orderedList = new Array(null, null); 
		return orderedList; 
	}
	
	//sort is an inbuilt method for arrays - it can be called from Main, we don't have to make it specifically here

	public void AddTask (Task task)
	{
		taskList.add(task);
	}

	public void RmvTask (Task task)
	{
		taskList.remove(task);
	}
	
	public List<Task> ShowTaskList()
	{
		return taskList;
	}
}
