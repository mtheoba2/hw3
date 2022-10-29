
public class Elevator {
	
	public static int current_Floor=5;
	int dest_Floor;
	
	private Elv_states State = new Elv_states();
	
	public Elevator (int dest_floor)
	{
	this.dest_Floor=dest_floor;
	System.out.println("*** Destination floor is: "+ dest_Floor);
	arrive_atFloor();

	}

	private void arrive_atFloor() {
		while(current_Floor != dest_Floor) {
		
		if (current_Floor>dest_Floor) {
			State.Current_state = State.Moving_down;
			current_Floor--;
			System.out.println(State.Current_state);
		}
		if (current_Floor<dest_Floor) {
			State.Current_state = State.Moving_up;
			current_Floor++;
			System.out.println(State.Current_state);
		}
		if (current_Floor==dest_Floor) {
			State.Current_state = State.Arrived;
			System.out.println(State.Current_state);
			break;
		}
		
		}
	}
		
}
