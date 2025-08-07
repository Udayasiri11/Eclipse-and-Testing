package wipro;

public class Overloading
		{
		Overloading(int a)
		{
			System.out.println("Argument 1");
			System.out.println(a);
		}
		Overloading(int a,int b)
		{
			System.out.println("Argument 2");
			System.out.println(a);
			System.out.println(b);
		}
		public static void main(String[] args) {
		// TODO Auto-generated method stub
		Overloading m1=new Overloading(100);
		Overloading m2=new Overloading(100,200);
	}

}
