//Works with Info.java
public class Prog3 {
	public static void main(String[] args) {
		Info me = new Info("Brett", "Crimson Oaks", 25, "636-544-4342");
		Info bro = new Info("Branson", "Winghaven", 23, "N/A");
		Info mom = new Info("Christine", "Outer Space", 51, "636-357-3284");
		System.out.println(me.toString());
		System.out.println(bro.toString());
		System.out.println(mom.toString());
	}

}
