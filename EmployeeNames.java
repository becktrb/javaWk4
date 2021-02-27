package javaWk4Code;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class EmployeeNames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		List<String>employeeNames = new ArrayList<String>();
		employeeNames.add("John");
		employeeNames.add("Sue");
		employeeNames.add("Paul");
		employeeNames.add("Susanne");
		employeeNames.add("Todd");
		
		
		Set<Integer>ids = new HashSet<Integer>();
		ids.add(11236);
		ids.add(13756);
		ids.add(1236);
		ids.add(199045);
		ids.add(12599);
		
		Map<Integer, String> employeeMap = new HashMap<Integer, String>();
		
		
		int i = 0; 
		
		for (Integer id : ids) {
			employeeMap.put(id, employeeNames.get(i));
						
			i++;
		}
		for (Map.Entry<Integer,String> entry : employeeMap.entrySet())  
            System.out.println("Key = " + entry.getKey() + 
                             ", Value = " + entry.getValue());		
		System.out.println("The set is: " + employeeMap.keySet());
		
		StringBuilder idsBuilder = new StringBuilder();	
		
		for (Integer id : ids)
			idsBuilder.append(id + "-");
			
			System.out.println(idsBuilder.toString());
			
		StringBuilder namesBuilder = new StringBuilder();
		for (String employee : employeeNames) {
			namesBuilder.append(employee + " " );
			System.out.println(namesBuilder.toString());
		}
		}
	}
		




	
