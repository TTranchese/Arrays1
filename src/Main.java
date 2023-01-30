import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		String[] carBrands = new String[]{"ferrari", "bugatti", "koennisseng", "lotus", "jaguar"};
		System.out.println(carBrands.length);
		System.out.println(carBrands[2]);

		int[] primeNumbers = new int[6];
		primeNumbers[0]=2;
		primeNumbers[1]=3;
		primeNumbers[2]=7;
		primeNumbers[3]=11;
		primeNumbers[4]=13;
		primeNumbers[5]=17;
		System.out.println(Arrays.toString(primeNumbers));


	}
}