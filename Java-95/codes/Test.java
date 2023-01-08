class Test{

Test(long a, String b){
System.out.println("Inside constructor with long parameter");
}

Test(Integer a, String b){
System.out.println("Inside constructor with Integer parameter");
}

Test(short a, String b){
System.out.println("Inside constructor with short parameter");
}

public static void main (String[] args) {

Test test1 = new Test(1,"String1");
short s = 100;
Test test2 = new Test (s,"String2");
Test test3 = new Test (10000,"String3");
}

}
