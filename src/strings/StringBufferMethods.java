package strings;

// StringBuffer is mutable, thread-safe, faster

public class StringBufferMethods {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Hello");
		
		sb.append(" Java");
		
		System.out.println(sb);
		
		sb.insert(5, " World");
		
		System.out.println(sb);
		
		sb.replace(0, 5, "Hi");
		
		System.out.println(sb);
		
		sb.delete(0, 3);
		
		System.out.println(sb);
		
		sb.reverse();
		
		System.out.println(sb);
	}

}
