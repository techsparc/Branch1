package Execution;

import org.junit.Test;

public class SmokeTest {
	
	@Test
	public void StringClass() {
		
		//String Class
		//String is a datatype. However, String is actually a class.
		//String is a immutable class.
		//Immutable means it cannot save the value in an existing memory location.
		//Length starts from 1
		//Index starts from 0
		
		
		String i = " SHIHAB";
		String k = " is a boy";
		String j = i.concat(k); //touppercase is a builtin method of String class which capitalizes the value.
		//concat means concatanation merging of two values.
		System.out.println(j);
		
		int m = i.length(); //length gives you the number of characters of var i
		System.out.println(i.length()); //after execution, its going to get lost from the memory location.
		System.out.println(m); //this is going to create a new memory location under var m
		System.out.println(m);
		System.out.println(m);
		
		String l = i.toLowerCase();
		System.out.println(l);
		
		//Whitespace is a space that is infront of a text.
		
		String k1 = i.trim(); //trim takes off the whitespace of a text.
		System.out.println(k1);
		
		String k2 = k1;
		
		String l1 = k1.toLowerCase();
		System.out.println(l1);
		
		String o1 = k1.replace('H', 'h'); //replace method changes characters, character sequences and etc.
		System.out.println(o1);
		
		String o2 = k1.replace("AB", "BU");
		System.out.println(o2);
		
		String removedH= k1.replace('H', ' ');
		System.out.println(removedH);
		
		//Niamul will come back to this part.
		/*int indexValue = k1.length()-1;
		int indexOfI = k1.indexOf('I', indexValue);
		System.out.println(indexOfI);*/
		
		System.out.println(k1.endsWith("B"));; //endswith return a boolean result either true or false.
		//Same goes with startswith method.
		
		boolean b = k1.startsWith("s");
		System.out.println(b);
		
		char c = k1.charAt(4); //charAt return me the value of the String provided that I put the index value of that characater.
		System.out.println(c);
		
		boolean b1 = k1.contains("HiH");
		System.out.println(b1);
		
		boolean b2 = k1.equalsIgnoreCase(l1); //equalIgnoreCase basically ignores case sensitivity when comparing two string values.
		System.out.println(b2);
		
		System.out.println(k1.equals(k2));;
		
		//difference between == and .equals method?
		
		System.out.println(k1.hashCode());;
		System.out.println(k2.hashCode());;
		
		//String class
		//StringBuffer Class
		//StringBuilder class
		
		byte j1[] = k1.getBytes();
		System.out.println(j1[5]);
		
		String k3 = "Shihab is a good boy";
		System.out.println(k3.substring(6));; //substring method is used to capture a portion of an string value.
		System.out.println(k3.substring(6, 9));;
		
		char t = 'd';
		char tear[] = {'d','e','f'}; //length of this array is 3. Arrays are counted as index value.
		//So if the length of the array is 3, them the array index is 2.
		
		String s = "shaon";
		int i3 = 3;
		
		//Array is a concept that holds more than one value. A variable can hold more than one value based on the capacity of that variable.

		String name = "Shihabuddin";
		char n[] = name.toCharArray();
		
		for(int iterator = name.length()-1; iterator >= 0; iterator--) {
			
			System.out.print(n[iterator]);
			
		}
	}
	
	@Test
	public void arrExample() {
	
		
		int s[] = new int[10];
		
		s[0] = 10;
		s[1] = 20;
		s[2] = 30;
		
		int t[] = {40,50,60};
		
		int[] salary;
		salary = new int[20];
		
		salary[0] = 1000;
		
		
		
		
		
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}


