import java.util.ArrayList;

import com.sun.tools.javac.code.Attribute.Array;
import com.sun.tools.javac.util.List;


public class TaskList<string> {
	private List<Task> taskList;
	   //taskList is a List of Task objects 
	
	public TaskList () {
		//gets ALL tasks
		DatabaseInteraction d  = new DatabaseInteraction();
		ArrayList tasks = d.getAllTasks();
		
		for(int i=0;i<tasks.size();i++) {
			//tasks.set(i, new Task((ArrayList) tasks.get(i)));
			
			
		}
	}
	
public TaskList (string filterType, string filter) {
		
		
	}

	public Array CheckDueDates(TaskList tl)
	{
		//for each task in tasklist, look at dueDate element, print to array(?) in order of proximity
		Array orderedList = new Array(null, null); 
		return orderedList; 
	}
	
	public Array Sort(TaskList tl, String filter)
	{
		//for each task in tasklist, sort by filter
		Array sortedList = new Array(null, null);
		return sortedList; 
	}

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
