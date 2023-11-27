package com.crnts.WrapperClassess;

public class WrapperClass {

	public static void main(String[] args) {

		WrapperClass wrapperClass =new WrapperClass();
//Write a program to convert primitive to wrapper class and wrapper to primitive		
		wrapperClass.autoBoxing();
		wrapperClass.autoUnBoxing();

//Write a program throw NumberFormatException while converting from string to   primitive values.
		wrapperClass.numFormatException();		 //NumberFormatException
		
// Write a program to convert from String to primitive values.
		wrapperClass.stringToPrimitive();
//Write a program by utilizing all utility functions of wrapper classes and show the  difference from one class function to another class function
//Write a program to implement different methods of wrapper class.
		wrapperClass.methodsOfWrapperClass();   //Methods and utilities
		
//Write a program to wrap values into wrapper class objects (for all classes)
	    wrapperClass.wrapValuesToWrapperClass();
	    
//Write a program to check given string value is string or number.
		wrapperClass.checkStringIsNumberOrNot();
		
	
			
	}
	
	void autoBoxing()
	{
		int value=9;
		Integer value1=new Integer(value);
//		Integer value1=value; //Auto boxing
		System.out.println( "Auto boxing :"+value1); 
	}
	
	void autoUnBoxing()
	{   Integer value1=new Integer(34);
		int newValue=value1; //Auto un-boxing
		System.out.println("Auto un-boxing :"+newValue);
	}
	
	void numFormatException()
	{
		Integer value3=Integer.parseInt("34334"); //NumberFormatException
		System.out.println(value3);
		System.out.println(value3.TYPE);
	
	}
	
	void stringToPrimitive()
	{
		String value7="4";
		Short value8=Short.parseShort(value7);  
		System.out.println(value8.TYPE);
		
		String value3="5656";
		Integer value4=Integer.parseInt(value3);  
		System.out.println(value4.TYPE);
		
		String value5="12.300";
		Double value6=Double.parseDouble(value5);  
		System.out.println(value6.TYPE);
		
		String value1="rue";
		Boolean value2=Boolean.parseBoolean(value1);  
		System.out.println( "using boolean  :"+value2);
		System.out.println(value2.TYPE);
	}
	
	void methodsOfWrapperClass()
	{   int longValue=8098080;
//		Long value8=Long.valueOf("98989");  
	    Long value8=Long.valueOf(longValue);
		System.out.println(value8.TYPE);
		
		Long value= new Long(898);
		Long value1=Long.lowestOneBit(value);  
		System.out.println(value1.TYPE +":"+ value1);
		
		System.out.println("using hash code : "+value.hashCode()); 
		Long value2= new Long(78787);
		System.out.println(value.compareTo(value2));  //returns 0 if same    1 if value is larger    -1 if value is smaller
		
		String value3=value.toString();
		System.out.println(value3.charAt(0));  //converts to a string
	
	}
	
	void wrapValuesToWrapperClass()
	{

		int value=9;
		Integer intValue=new Integer(value);
//		Integer value1=value; //Auto boxing
		System.out.println( "Auto boxing int :"+intValue); 
		
		long value2=767767676;
		Long longValue=value2;
		System.out.println( "Auto boxing long :"+longValue); 
		
		short value3=76;
		Short shortValue=value3;
		System.out.println( "Auto boxing short :"+shortValue); 
	}
	
	void checkStringIsNumberOrNot()
	{ try {
		String value3="bjjh";
		Integer value4=Integer.parseInt(value3);  
		System.out.println("check String Is Number Or Not : "+ value4.TYPE);
	}catch (NumberFormatException e) {
		System.out.println("Given input is not number");
	}
	}
	static  void checkStringIsNumberOrNot1()
	{
		String value3="bjjh";
		Integer num=6876;
		
//		System.out.println(num.isNumeric());
//		System.out.println(value3.is);
	}
	
	}


