
public class MainClass {
	public static void main(String[] args){
		Calculator cl = new Calculator();
		Calculator c2 = new Calculator();
		
		cl.name = "Awesomeness";
		c2.name = "Greatfullness";
		
		System.out.println(cl.name + " calculated "+ cl.add(3, 4));
		System.out.println(c2.name + " calculated " + c2.modulus(29, 5));
			
	}
}
