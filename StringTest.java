package lab2;

public class StringTest {
	public static void main(String[] args) 
	{
		
		String message = "Hello, world!";
		
		String bigMessage = message.toUpperCase();
		System.out.println(bigMessage);
		
		String subMessage = message.substring(0, 5);
		System.out.println(subMessage);
		
		String repMessage = message.replace("o", "*");
		System.out.println(repMessage);
		
	}

}