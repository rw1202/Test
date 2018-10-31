package ACO.App;

import java.util.HashMap;
import java.util.Scanner;

public class Service {

	static HashMap<Integer, AccountDetails> hmap = new HashMap<Integer, AccountDetails>();
	static AccountDetails acc1 = new AccountDetails("Bob", "Bob", 1);
	static AccountDetails acc2 = new AccountDetails("Bob", "Rob", 2);
	static AccountDetails acc3 = new AccountDetails("Bob", "Cob", 3);
	static AccountDetails acc4 = new AccountDetails("Dob", "Dob", 4);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		addAccount();
		retrieve();
		System.out.println("test");
		searchName("Bob");

	}

	public static Boolean searchName(String NameToSearch) {
		int count = 0;
		// for (int i = 0; i <= hmap.size() - 1; i++) {
		// if (hmap.get(i).getFirstName().equals(NameToSearch)) {
		// count++;
		// }
		// }

		long nameCount = hmap.entrySet().stream().filter(x -> x.getValue().getFirstName().equals(NameToSearch)).count();

		System.out.println("There are " + nameCount + " people with the name " + NameToSearch);
		if (nameCount > 0) {
			return true;
		}
		return false;
	}

	public static void addAccount() {

		hmap.put(1, acc1);
		hmap.put(2, acc2);
		hmap.put(3, acc3);
		hmap.put(4, acc4);

	}

	public static void retrieve() {

		System.out.println("Enter the ID of the Account you'd like to retrieve: ");
		Scanner scanner = new Scanner(System.in);
		int key = scanner.nextInt();

		System.out.println("The Account Number is " + ((AccountDetails) hmap.get(key)).getAccountNumber());
		System.out.println("The Account First Name is " + ((AccountDetails) hmap.get(key)).getFirstName());
		System.out.println("The Account Last Name is " + ((AccountDetails) hmap.get(key)).getLastName());

	}

}
