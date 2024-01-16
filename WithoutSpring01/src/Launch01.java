
public class Launch01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GreetingsGenerator greet = new GreetingsGenerator();
		System.out.println("Target obj before injecting Dependency obj"+greet);
		
		
		java.util.Date date = new java.util.Date();
		System.out.println("Dependecy obj =>"+date);
		
		greet.setDateRahul(date);//this obj is used in greetingsGenerator class
		//this process is called setter injection 
		
		System.out.println("Target obj After injecting Dependency obj"+greet);
		String message =greet.generateGreetings("virat Kholi");
		System.out.println(message);
		
		

	}

}
