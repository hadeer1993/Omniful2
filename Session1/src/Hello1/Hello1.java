package Hello1;
import Hello2.Hello2;

public class Hello1 {
	public static void main(String[] args) {
		Hello2 hello2 = new Hello2();
		System.out.println(hello2.sum(1,2));
		System.out.println(hello2.multiplication(1,2));
	}
}
