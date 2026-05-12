package strings;

// StringBuilder is mutable, whereas String is immutable

public class StringBuilderDemo {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Java");
		
		sb.append(" Programming");
		
		System.out.println(sb);
	}

}
