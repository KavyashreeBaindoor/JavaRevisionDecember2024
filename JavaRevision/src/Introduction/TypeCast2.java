package Introduction;

public class TypeCast2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//implicit ---
		//explicit---
		
		
		
//implicit /widening/upcasting---compiler does this--smaller  one to big container
		
		int x='a';
		System.out.println(x); //97
		
		
		double d=10;
		System.out.println(d); //10.0
		
	///////////////////////////////////////////////////////////////////////////	
		
//explicit---programmer does this  --- bigger one to smaller conatiner(but bigger one should be in range of smaller one for 
	//	not to have any data loss)
		
		
		int x2= 120;
	//	byte x1=x2;//Type mismatch: cannot convert from int to byte
		
		byte x1=(byte)x2;
		
		System.out.println(x1); //120
		
		
		///////////////////////////////////////////////////////////////////
		
		
		int l=150;
	//	short s=l;  //Type mismatch: cannot convert from int to short
		
		short s=(short)l;
		
		System.out.println(s); //150
		
		
		byte b=(byte)l;
		
		System.out.println(b);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
