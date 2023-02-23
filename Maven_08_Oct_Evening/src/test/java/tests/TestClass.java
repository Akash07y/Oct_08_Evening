package tests;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;

import testNGTest.TestClass123;

               // Generic declaration
public class TestClass  {
	
	// Insertion
	// Deletion
	// Retrieval 
	
	public static void main(String[] args) {
		
		             // Key, Value
		Hashtable<String, Float> student1 = new Hashtable<String, Float>();
		// Insertion
		student1.put("Math", 34f);
		student1.put("Science", 45.87f);
		student1.put("History", 34f);
		student1.put("Manua", 90f);
		student1.put("Automation", 23f);
		
		
		for(Map.Entry<Character, Integer>  s : table.entrySet())
		{
			System.out.println("Key = " + s.getKey() + " Value = " + s.getValue());
		}
		
		System.out.println("===================");
		table.remove('H');
		
		for(Map.Entry<Character, Integer>  s : table.entrySet())
		{
			System.out.println("Key = " + s.getKey() + " Value = " + s.getValue());
		}
		
		
		
		
		
//		HashMap<Integer, String> map = new HashMap<Integer, String>();
//		
//		// Insertion
//		map.put(null, "Class");
//		map.put(84, "Test");
//		map.put(45, null);
//		map.put(77, "Velocity");
//		map.put(87, null);
//		
//		// // Retrieval 
//		for(Map.Entry<Integer, String> s : map.entrySet())
//		{
//			System.out.println("Key = " + s.getKey() + " Value = " + s.getValue());
//		}
//		
//		// Deletion
//		map.put(null, "Testing");
//		
//		System.out.println("==============================");
//		for(Map.Entry<Integer, String> s : map.entrySet())
//		{
//			System.out.println("Key = " + s.getKey() + " Value = " + s.getValue());
//		}
		
		
		
		
		
		
		
		
		
		
		
		
//		HashSet<String> a = new HashSet<String>();
//		// Insertion
//		a.add("Velocity");
//		a.add("Testing");
//		a.add("Class");
//		a.add("Batch");
//		a.add("2023");
//		a.add("Class");
//		
//		// Adavace for loop
//		// for each
//		
//		// Retrieval
//		for(String x : a)
//		{
//			System.out.println(x);
//		}
//		System.out.println("===========");
//		
//		// deletion
//		a.remove("Batch");
//		
//		for(String x : a)
//		{
//			System.out.println(x);
//		}
//		
		
		
		
		
		
		
//		List<Integer> b = new ArrayList<Integer>();
//		// insertion
//		b.add(56);
//		b.add(93);
//		b.add(78);
//		b.add(93);
//		b.add(28);
//		b.add(82);
//		System.out.println("Size = "  + b.size());
//		
//		for(int i = 0 ; i < b.size() ; i++)
//		{ 
//			                    // Retrieval 
//			System.out.println( b.get(i) );
//		}
//		
//		// deletion
//		b.remove(3);
//		System.out.println("=================");
//		
//		System.out.println("Size = "  + b.size());
//		for(int i = 0 ; i < b.size() ; i++)
//		{ 
//			                    // Retrieval 
//			System.out.println( b.get(i) );
//		}
		
	
	}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	int a ;
//	Y b ;  // Generic Use
//	
//	Y demo(D c)
//	{
//		System.out.println(b);
//		return b ;
//	}
//	
//	
//	public static void main(String[] args) {
//		
//		TestClass x = new TestClass();
//		x.a = 23 ;
//			
//		TestClass<String, Character> y = new TestClass<String, Character>();
//		y.b = "Velocity" ;
//		String data = y.demo('&');
		
		
		
	
		
		
		
		
		
		
		
//		final  - Keyword
//		used with variable, methods, class
//		final variable - value can't be change
//		final method - can't be override 
//		final class - Can't be inherited 
//		
//		
//		finally  - Block
//		It is used to placed the importance code which should be execute 
//	    either exception is handled or not 
//		
//		
//		finallize  - method
//		Used to execute the memory cleanup activity code 
//		
	
		

