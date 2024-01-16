
public class LaunchApp {

	public static void main(String[] args) {
		//here we need to add Amazon as a target class
		Amazon a = new Amazon();
//		FedEx b = new FedEx();
//	
	a.setService(new FedEx());
	boolean status =a.intitate(1234.09);
	
	if(status) {
		System.out.println("Order Devlivered succesfully");
	}else if(status) {
		System.out.println("pedda order eh !");
	}
	else {
		System.out.println("Order Devlivered succesfully");
	}
	
	

	}

}
