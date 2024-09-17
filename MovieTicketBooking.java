package forInterview;

public class MovieTicketBooking {
	public static void main(String[] args) {
		int row= 4;
		int coloums= 5;
		int section= 2;
		
		boolean[][][]seats= new boolean[section][row][coloums];
		seats[1][0][0]= true;
		seats[0][1][2]= true;
		seats[1][2][4]= true;
		seats[1][3][4]= true;
		
		
		int totalSeats= row*coloums*section;
		int bookedSeats= countBookedSeats(seats);
		int availableSeats= totalSeats- bookedSeats;
		int leftSeats= availableSeats;
		
		System.out.println("print totalSeats: "+totalSeats);
		System.out.println("print booked seats: "+bookedSeats);
		System.out.println("print left seats: "+leftSeats);
		
		
	}

	private static int countBookedSeats(boolean[][][] seats) {
		int count= 0;
		for(int section= 0; section<seats.length; section++) {
			for(int row= 0; row<seats[section].length; row++) {
				for(int coloum= 0; coloum<seats[section][row].length; coloum++) {
					if(seats[section][row][coloum]) {
						count++;
					}
				}
			}
		}
		return count;
	}
}
