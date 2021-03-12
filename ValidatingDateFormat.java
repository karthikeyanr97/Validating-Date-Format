import java.util.Scanner;

public class ValidatingDateFormat extends UserMainCode {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the Date:");
		String date = scanner.nextLine();

		int result = validateDate(date);

		if (result == 1)
			System.out.println("Valid date format");
		else
			System.out.println("Invalid date format");

		scanner.close();
	}
}

class UserMainCode {
	public static int validateDate(String date) {

		if (date.length() > 10)
			return -1;

		for (int i = 0; i < date.length(); i++) {

			if (!((date.charAt(i) >= '0' && date.charAt(i) <= '9') && (i >= 0 && i < 2) || (i > 2 && i < 5) || (i > 5)))
				if (!(date.charAt(i) == '/') && (i == 3 || i == 5))
					return -1;
		}
		return 1;
	}

}