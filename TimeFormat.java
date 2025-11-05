 import java.text.Format;
public class TimeFormat {
	public static void main(String[] args) {
		
		int hours = Integer.parseInt("" + args[0].charAt(0)+ args[0].charAt(1));
		int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
		int displayHours;
		if (hours == 0 ) {
			displayHours = 0;}
			else{
				displayHours=hours %12;
				if (displayHours==0) displayHours=12; 
			}
		

		// הוספת 0 לפני דקות קטנות מ-10
		String formattedMinutes;
		if (minutes<10){
		formattedMinutes = "0" + minutes;}
		else{
		formattedMinutes = "" + minutes;}
		//קבלת am או pm
		if (hours<12){
		System.out.println(displayHours + ":" + formattedMinutes + " AM");}
		else{
		System.out.println(displayHours + ":" + formattedMinutes + " PM");
		}
	}
}