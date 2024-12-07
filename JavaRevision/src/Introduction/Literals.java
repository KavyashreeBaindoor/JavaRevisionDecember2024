package Introduction;

public class Literals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int x=10;
		
//		int--datatype/keyword
//		x-vriable name
//		10--any constant value assigned to varaible  is literal
		
		
		
		
	//integral data types   ---octa,hexa,base10
		
		
		

	int x1=10;
	long l=10L;
	
	
	//big to small cant assign
	//int x2=10l;
	//type mismatch: cannot convert from long to int
	
	
	//small to big assign yes okay  (int(4byte) to long(8 byte))
	
	long l1=10;  ///ok
	
	
	byte b=10; //ok  ---witin range of byte
	
	

	//every integral non decimal number is int type by default
	
	//byte b1=128;  //ype mismatch: cannot convert from int to byte
	
	//////////////////////////////////////////////////////////////////////////////
	
	//every integral  decimal number is double type by default
	
//	float f=123.456;//type mismatch: cannot convert from double to float
	float f=123.456F;
	
	
	double d=123.456;
	
	double d1=123.456f;
	
	double d3=123.4556d; //not reuired just showing it is okay
	
	
	double d5=10;
	
	//int x3=10.0; //Type mismatch: cannot convert from double to int
	
	/////////////////////////////////////////////////////////////////////////////////
	
	char c='a';
	
	//char c="b";//Type mismatch: cannot convert from String to char
	
//	char c1=a;  //a cannot be resolved to a variable
	
	//char c='ab';  //Invalid character constant
	
	
	//unicode value ---- 0 to 65535
	
	//a-- 97
	
	
	char c1=97;
	
	char c2=98;
	
	//all escape character is a valid char literal
	
	char c3='\n';   //new line
	char c4='\t';   //tab
	char c5='\'';
	char c6='"';
		
//System.out.println("c:\kavya\file.java"); //Invalid escape sequence (valid ones are  \b  \t  \n  \f  \r  \"  \'  \\ )
		
System.out.println("c:\\kavya\\file.java");		



char k=98; //'b'
k++;

System.out.println(k);  //c
		
	///////////////////////////////////////////////////////////////////////////////////////////////


//String literals   --not primitive type  
//sequence of character witin ""


String s="d";
String s1="kavya";



////////////////////////////////////////////////////////////////////////////


//byte --->short  ----int -----long(8b)
//
//float (4b)---double

//smaller ones can be put to bigger contianers not viec versa


long l3=10;

//byte b=10l;  //Type mismatch: cannot convert from long to byte

//exception case:
float k1=10l;  ///bcz in memory floating point is represented different from integers

System.out.println(k1);//10.0













	}

}
