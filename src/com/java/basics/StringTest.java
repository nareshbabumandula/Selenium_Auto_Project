package com.java.basics;

public class StringTest {

	public static void main(String[] args) {
					
		String sText1 = "hello";
		String sText2 = "WORLD";
		String sText3 = "            welcome to core java training            ";
		String sText4 = "";
		String sText5 = "The variety and types of email forms that you can create with myContactForm.com are virtually endless. "
				+ "We have created a system that can be completely tailored to fulfill any of your data submission needs. "
				+ "We offer both the ability to create forms from templates or create custom forms from scractch. "
				+ "The sample form below shows the large variety of field types and questions that are available for your forms. "
				+ "To the left, we have listed a number of forms that can be used as templates. If you can dream it, "
				+ "you can create it!";
		
		System.out.println(sText1.isEmpty());
		System.out.println(sText1.toUpperCase());
		System.out.println(sText2.toLowerCase());
		System.out.println(sText3);
		System.out.println(sText3.trim());
		System.out.println(sText4.isEmpty());
		System.out.println(sText1.charAt(0));
		System.out.println("Length of the string hello is : " + sText1.length() + " characters");
		//System.out.println(sText1.charAt(10));
		System.out.println(sText2.indexOf('D'));
		System.out.println(sText3.contains("java"));
		System.out.println(sText1.equals("hello"));
		System.out.println(sText1.equalsIgnoreCase("HELLO"));
		System.out.println(sText1.concat(" ").concat("world"));
		System.out.println(sText1 + " " + "world");
		System.out.println(sText3.trim().endsWith("training"));
		System.out.println(sText3.trim().startsWith("welcome"));
		System.out.println(sText5.substring(10));
		System.out.println(sText5.substring(0, 5));
		System.out.println(sText3.replace("java", "J2SE"));
		
		// Split the string based on the delimiter
		String strText = "hello world this is core java online training";
		String[] asText=strText.split(" ");
		System.out.println(asText.length);
		System.out.println(asText[0]);
		System.out.println(asText[1]);
		//System.out.println(asText[10]); // Exception: ArrayIndexOutOfBoundsException
		System.out.println("For loop started..!");
		for (int i = 0; i < asText.length; i++) {
			System.out.println(asText[i]);
		}
		
		System.out.println("For loop with a temporary variable started..!");
		for (int i = 0; i < asText.length; i++) {
			String value = asText[i];
			System.out.println(value);
			
		}
		
		System.out.println("For each or enhanced for loop");
		for (String item : asText) {
			System.out.println(item);
		}
				
		System.out.println(strText.join(">", asText));
		System.out.println(sText1.hashCode());
		System.out.println(sText2.hashCode());
		sText1="hi"; // Assign new string
		System.out.println(sText1.hashCode());
		System.out.println(sText1.getBytes());
		System.out.println(sText1.getClass());
		
		StringBuffer sb = new StringBuffer("Hello");
		System.out.println(sb.hashCode());
		sb.append("world");
		System.out.println(sb.hashCode());
		System.out.println(sb);

		System.out.println(StringTest.class);
				
		int[] marks= {40,10,50,70,60};
		String[] students= {"sandeep","arun","Sheshu","sheenu","ravi", "swetha"};
		System.out.println(marks.length);
		System.out.println(students.length);
		
	}

}
