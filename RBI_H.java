package RBI_Bank;

class Bank_H //super class
	{
	float getrateOfInterst()   // float method
	{
	return 0f; //return value
	}
	}

  	class HDFC extends Bank_H // super class inherit sub class 1
{
	float getRateOfInterest()
	{
		return 8.4f;
	}  
}
	class RBL extends Bank_H // super class inherit sub class 2
{
		float getRateOfInterest()
		{
			return 7.3f;
		}
}
	class KotakMahindra extends Bank_H  //super class inherit sub class 3
{
		float getRateOfInterest()
		{
			return 9.2f;
		}
}
	
public class RBI_H   //system define class
{
	public static void main(String args[])  // system define method
{
	 Bank_H b = new Bank_H();
	 
	//b = new HDFC (); // object creat for HDFC  
	System.out.println("HDFC Rate Of Interest"+" "+b.getrateOfInterst());
	
	b = new RBL(); // object creat for RBL
	System.out.println("RBL Rate Of Interest"+" "+b.getrateOfInterst());
	
	b = new KotakMahindra(); // object creat for KotakMahindra
	System.out.println("Kotak_Mahindra Rate Of Interest"+" "+b.getrateOfInterst());
		
}

}
