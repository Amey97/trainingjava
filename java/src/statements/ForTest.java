package statements;

public class ForTest {

	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			sum += (i * i);
		}
		System.out.println(sum);
	}

}
