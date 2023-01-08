//final class A{
class A{
	//final void display(){}
	void display(){}
}

class B extends A{
	void display(){}
}

class FinalTest 
{
	//final FinalTest(){} // error: modifier final not allowed here
	final int n = 12; //instance variable
	final int age; //blank final variable

	FinalTest(){
		age=35;
	}
	public static void main(String[] args) 
	{
		final int n=10; //local variable
		System.out.println(n);

		//n = 12; //error: cannot assign a value to final variable n

		FinalTest obj = new FinalTest();
		System.out.println(obj.n);
		//obj.n = 12; //error: cannot assign a value to final variable n
	}
}
