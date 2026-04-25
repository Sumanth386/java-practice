package loops;

// Inverted pyramid
public class Pattern11 {

	public static void main(String[] args) {
		int n = 4;
		
		for(int i = 1; i <= n; i++) {
			// space
			for(int j = 1; j <= i - 1; j++) {
				System.out.print("  ");
			}
			
			// stars
			for(int j = 1; j <= (2 * (n - i) + 1); j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
