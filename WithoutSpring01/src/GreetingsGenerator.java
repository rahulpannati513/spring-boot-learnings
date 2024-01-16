import java.util.Date;


// Target class
public class GreetingsGenerator {
	
	private Date date;// its a java util 
	
	public GreetingsGenerator() {
		System.out.println("GreetingsGenerator is instantiated");
	}
	
	
	
	public void setDateRahul(Date date) {
		this.date=date;
		
	}




	//Business logic
	public String generateGreetings(String name) {
		
		int hour =date.getHours();
		
		if(hour < 12) {
			return "Good Morning"+name;
		}else if(hour <16) {
			return "Good Afternoon"+name;
		}else if(hour<20) {
			return "Good Evening"+name;
		}
		else {
			return "Good Night"+name;
		}
		
		
	}



	@Override
	public String toString() {
		return "GreetingsGenerator [date=" + date + "]";
	}

}
