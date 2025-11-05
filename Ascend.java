public class Ascend {
	public static void main(String[] args) {
	int lim = Integer.parseInt(args[0]);
	int a = (int) (Math.random()*lim);
	int b = (int) (Math.random()*lim);
	int c = (int) (Math.random()*lim);
	int min = Math.min (a,Math.min (b,c));
	int max = Math.max (a, Math.max (b,c));
	int middle = (a + b + c -min -max);
	System.out.println(max + " " + middle + " " + min);
	System.out.println(min + " " + middle + " " + max);
	}
}
