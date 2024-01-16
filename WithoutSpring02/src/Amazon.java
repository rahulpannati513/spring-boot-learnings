
public class Amazon {
	
	private CourierService service;

public void setService(CourierService servicecs) {
		this.service = servicecs;
	}

	//here is the where i Wanted to invoke the courier services
	public boolean intitate(double amnt) {
		
		return service.servicecs(amnt);
	}




	
}
