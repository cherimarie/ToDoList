import java.util.Date;

import com.sun.org.apache.xerces.internal.impl.dv.xs.DateTimeDV;


public class Notification {
	//auto runs at a set time each day. gets all tasks due that day from checkDueDate method, pushes that list to Display method

	//should have a date as a property, the time at which it should autorun. TODO. 
	public Notification()
	{//constructor
		
	}
	
	public void Display(){
		//shows all results from checkDueDates method in a list, sends as push notification 
	}
	
	public void Snooze(){
		//make the automatic daily method run again in an hour 
	}
	
	public void Delete(){
		//kill current notification 
	}
	
	public void Done(){
		//change status of task 
	}
}
