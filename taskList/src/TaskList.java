import java.util.ArrayList;


public class TaskList<string> {
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
}
