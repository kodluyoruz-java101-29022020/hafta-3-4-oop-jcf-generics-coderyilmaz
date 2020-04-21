package Soru2Main;


public class Main {
	
	public static void main(String[] args) {
		MyList integers = new MyList();
		
		integers.add(1);
		integers.add(2);
		integers.add(7);
		integers.add(3);
		integers.add(4);
		
		System.out.println(integers.toString());
		System.out.println("Length : "+integers.length());
		
	}

}
