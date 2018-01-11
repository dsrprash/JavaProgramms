
/*
 * @author = Prashanth Dasari
 * dated : 11 January, 2018
 *
 *
 * This class has all math utility methods for handy to developers!
 * All methods are declared to be static for quick access and usage!
 *
 */
 

public class MathUtils {
    //Method which accepts two args and return max value out of them
	public static int max(int x, int y) {
		return (x > y) ? x : y;
	}
    //method designed to accept variable number of arguments and return max value out of them
	public static int max(int... a) {
		int max = Integer.MIN_VALUE;
		max = a[0];
		for (int index = 0; index < a.length; index ++)
			if (max < a[index])
				max = a[index];
		
		return max;
	}

    //Method which accepts two args and return min value out of them
	public static int min(int x, int y) {
		return (x < y) ? x : y;
	}
    //method designed to accept variable number of arguments and return min value out of them
    public static int min(int... a) {
		int min = Integer.MAX_VALUE;
		min = a[0];
		for (int index = 0; index < a.length; index ++)
			if (min > a[index])
				min = a[index];
		
		return min;
	}

	public static void main(String[] args) {

		int a = 19, b = 9;
		System.out.println("int args " + a + " " + b);
		System.out.println(max(a, b,90));
		System.out.println(min(a, b,-12));

//		float p = 1.9, q = 0.9;
//		System.out.println("float args" + p + " " + q);
//		System.out.println(max(p, q));
//		System.out.println(min(p, q));
//
//		double c = 1.0009, d = 0.008;
//		System.out.println("double args " + c + " " + d);
//		System.out.println(max(c, d));
//		System.out.println(min(c, d));
//
//		long u = 123, v = 32;
//		System.out.println("double args " + c + " " + d);
//		System.out.println(max(u, v));
//		System.out.println(min(u, v));
	}
}