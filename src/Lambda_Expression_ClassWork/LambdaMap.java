package Lambda_Expression_ClassWork;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class LambdaMap {

	public static void main(String[] args) {
		Map<Integer,String> m=new HashMap<>();
		m.put(30, "ABC");
		m.put(20, "PQR");
		m.put(40, "LMN");
		m.put(10, "XYZ");
		Set<Integer> key=m.keySet();
		key.forEach((a)->{          //new concept
			String name = m.get(a);
			System.out.print("  "+a);
			System.out.print("    "+name);
			System.out.println();
		});
	}

}
