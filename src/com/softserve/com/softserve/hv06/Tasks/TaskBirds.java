package com.softserve.hv06.Tasks;

import com.softserve.hv06.Classes.Bird;
import com.softserve.hv06.Classes.Chicken;
import com.softserve.hv06.Classes.Eagle;
import com.softserve.hv06.Classes.Penguin;
import com.softserve.hv06.Classes.Swallow;

public class TaskBirds {

	
	
	public static void runBirds() {
		
		Eagle eagle = new Eagle ("Brown", 10);
		Swallow swallow = new Swallow ("Black",3);
		Penguin penguin = new Penguin ("Black/White",1);
		Chicken chicken = new Chicken ("Red", 5);
		Bird[] birds = {eagle, swallow, penguin, chicken};
		
		eagle.fly();
		swallow.fly();
		penguin.fly();
		chicken.fly();
		
		

	}

}
