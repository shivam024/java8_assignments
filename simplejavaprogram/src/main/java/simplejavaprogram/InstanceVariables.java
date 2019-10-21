package simplejavaprogram;

public class InstanceVariables {
	int i;
	boolean b;
	public static void main(String[] args) {
		//System.out.println(i);
		InstanceVariables t = new InstanceVariables();
		System.out.println(t.i);
		System.out.println(t.b);
		t.methodOne();
		
		
	}
	public void methodOne() {
		System.out.println(i=100);
	}

}
