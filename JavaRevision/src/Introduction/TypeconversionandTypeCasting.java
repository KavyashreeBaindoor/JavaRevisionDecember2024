package Introduction;

public class TypeconversionandTypeCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		byte b=127;
		int a=189;  //out of range of byte cant cast, if done will get wrong results
		
	//	b=a; //Type mismatch: cannot convert from int to byte
		
		b=(byte)a;
		
		System.out.println(b);  //-67 
		
	
		
		byte b1=127;
		int a1=12;  //within the range of byte can cast
		
		
		
		//b1=a1; //Type mismatch: cannot convert from int to byte
		
		//explicit conversion  (big to small container)
		b1=(byte)a1;
		
		System.out.println(b1);  //12
		
		
		
		
		//inpmlicit  casting  (smaller one to big)
		
		byte b3=127;
		int a3=12; 
		
	    a3=b3;
		
	    
	    ///////////////////////////////////////////
	    
	    int x=9;
	  //  byte m=x;  
	    
	    //Type mismatch: cannot convert from int to byte,
	    //big to small noo even if it is in range of byte
		
		
	    
	   // so cast it when u want to put big to small and that big should be in range of small
	    
	    byte m=(byte)x;
	    
	    
	    
	    ///////////////////////////////////////
	    
	    float f=1.7f;
	    
	    int x1=(int)f;    //will loose decimal values
	    
	    System.out.println(x1);  //1
	    
		
		
	    
	    ///casting of primitives is not imp later casting of objects is imp
	    
	    
	    
	    ////////////////////////////////////////////////////////////////////
	    
	    
	  //  type promotion implicitly done 
	    
	    
	    byte a8=12;
	    byte b8=90;
	    
	    int res=a8*b8;
	    
	    
	    
	    System.out.println(res); //1080
	    
	    
	    
	  //  byte res=a8*b8; //Type mismatch: cannot convert from int to byte

	}

}
