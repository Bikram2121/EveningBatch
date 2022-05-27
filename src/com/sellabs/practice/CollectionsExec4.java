/**
 * 
 */
package com.sellabs.practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author Sipun
 *
 */
public class CollectionsExec4 {
	
	public void ops()
	{
		Map<String, String> m = new HashMap<>();
		m.put("dino", "7181282192");
		m.put("mario", "465483383");
		m.put("vince", "238331346");
		
		//System.out.println(m.get("vince "));
		Set<String> key =  m.keySet();
		for(String keyName : key)
		{
			System.out.println(keyName + ": " + m.get(keyName));
		}
	}
	
	
	public static void main(String[] args) {

		CollectionsExec4 ce4 = new CollectionsExec4();
		ce4.ops();
	}

}
