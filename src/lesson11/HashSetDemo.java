package lesson11hashtable;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {

		public static void main(String[] args) {
		
			HashSet<String> set = new HashSet();
			set.add("Java");
			set.add("Swing");
			set.add("Java Spring");
			System.out.println(set);
			System.out.println("Removed Java from the set " + set.remove("Java"));
			System.out.println("Set contains Swing : " +set.contains("Swing"));
			System.out.println("Size of the set : "+set.size());
			
	}

}
