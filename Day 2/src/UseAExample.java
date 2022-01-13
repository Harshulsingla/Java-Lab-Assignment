

abstract class Vehicle{
	public abstract void move(String s, String d);
}


class Bus extends Vehicle{
	public void move(String s, String d) {
		System.out.println("moving from"+ s + "to" + d + " using bus");
	}
}


class Metro extends Vehicle{
	public void move(String s, String d) {
		System.out.println("moving from"+ s + "to" + d + " using metro");
	}
}

class Passenger{
	private String name;
	
	public Passenger(String name) {
		this.name=name;
	}
	public void travel(String s, String d, Vehicle vehicle) {
		System.out.println("name of passenger :"+ name);
		vehicle.move(s,d);
	}
}

public class UseAExample {
	public static void main(String[] args) {
		Vehicle v=new Bus();
		Passenger passenger=new Passenger("raj");
		passenger.travel("laxminagar", "noida", v);
	}
}
