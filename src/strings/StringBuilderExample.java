package strings;
// StringBuilder are not thread-safe, but are mutable and fastest

public class StringBuilderExample {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Java");
		
		sb.append(" Programming");
		
		System.out.println(sb);
	}

}
