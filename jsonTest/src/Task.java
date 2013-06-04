import com.google.gson.*;

public class Task {
	String name;
	int time;
	int priority;
	String reward;
	
	public Task(String name,int time,int priority,String reward){
			this.name = name;
			this.time = time;
			this.priority = priority;
			this.reward = reward;
	}
	
	public static void Main(){		
		Gson g = new Gson();
		Task target = new Task("feed cat",1369855800,5,"cat");
		String json = g.toJson(target); // serializes target to Json
		//MyType target2 = gson.fromJson(json, MyType.class); // deserializes json into target2
		System.out.println(json);
	}
}
