import java.util.ArrayList;
import java.util.Date;

//do we want to use ArrayList or List<Task> ???

public class DatabaseInteraction {
	
	public DatabaseInteraction() {
		//read from feed file
		
	}
	
	public ArrayList getAllTasks() {
		ArrayList tasks = new ArrayList();
		
		ArrayList t1 = new ArrayList();
		t1.add("do homework");
		//task description
		//due date
		//priority
		
		ArrayList t2 = new ArrayList();
		t2.add("buy groceries");
		
		tasks.add(t1);
		tasks.add(t2);
		
		return tasks;	
	}
}
