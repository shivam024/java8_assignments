package simplejavaprogram;

public class StaticVariable {
	public static void main(String[] args) {
		try {
			int i = Integer.parseInt("ten");
		}
		catch (NullPointerException e) {
			int i = 0;
			System.out.println(i);
		}
	}
}
