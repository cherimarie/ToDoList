import java.util.Map;
import com.google.gson.*;

@SuppressWarnings("unused")
public class json {
	public static String input = "{\"name\":\"feed cat\",\"time\":\"1369855800\",\"priority\":\"high\",\"reward\":\"cat\"}";
	
	public static void Main(){		
		Gson g = new Gson();
		Task target = new Task("feed cat",1369855800,5,"cat");
		String json = g.toJson(target); // serializes target to Json
		//MyType target2 = gson.fromJson(json, MyType.class); // deserializes json into target2
		System.out.println(json);
	
		
		
	}
	
	
}
