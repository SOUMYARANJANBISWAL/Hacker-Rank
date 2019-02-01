public class Testing_java {

	public static void main(String[] args) {

		int a=5,b=10,c=0;
		c=a++*++b;
		System.out.println(c);
		
		a=100;b=200;c=0;
		c=a+b>200?1:2;
		System.out.println(c);
		
		c=a>b?a:b/a<b?a:b;
		System.out.println(c);
		
		System.out.println(a>b?"ABC":"XYZ");
	}

}
