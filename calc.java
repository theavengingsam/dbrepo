public class calc{
	static float add(float a,float b){
		return a+b;
	}
	static float subtract(float a,float b){
		System.out.println(" **in subtract** ");
		return a-b;
	}
	static float multiply(float a,float b){
		return a*b;
	}
	static float divide(float a,float b){
		System.out.println(" **in divide** ");
			return a/b;
	}
	public static void main(String args[])
	{
		int a=5,b=6;
		System.out.println("qwertyuiop");
		System.out.println("hello a="+a+" b="+b+" add="+add(a,b)+" subtract="+subtract(a,b)+" multiply="+multiply(a,b)+" divide="+divide(a,b));
	}
}