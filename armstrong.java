import java.util.*;
public class armstrong {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        sc.close();
        for (int num = 1; num <= a; num++) {
            int temp = num;
            int sum = 0;
            int numberOfDigits = String.valueOf(num).length();
            while (temp > 0) {
                int digit = temp % 10;
                sum += Math.pow(digit, 3);
                temp /= 10;
            }
            if (sum == num) {
                System.out.println(num + " is an Armstrong number.");
            }
        }
		}
	}
	
