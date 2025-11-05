// Splits a restaurant bill evenly among three diners.
public class Bill3 {
	public static void main(String[] args) {
	    String name1 = args[0]; 
		String name2 = args[1];
		String name3 = args[2];
		int value = Integer.parseInt(args[3]);
		double amount = value/3.0;
		amount= Math.ceil(amount);
		System.out.println ("dear" + name3 + "," + name2 + name1 + 
		":pay" + amount + "shakel each.");


	}
}
