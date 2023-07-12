public class Third {
	static {
		 a=50;
		System.out.println("a:"+ a);
		System.out.println("a:"+Third.a);
	}
	static int a=m1();
	static int m1() {
		System.out.println("a:"+a);
		return 70;
		
	}
	static {
		System.out.println("a:"+a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("a:"+a);

	}
	static {
		System.out.println("a:"+a);
	}

}
