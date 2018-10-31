package ACO.App;

import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class JSONobj {

	static AccountDetails acc1 = new AccountDetails("Bob", "Bobert", 123);
	static AccountDetails acc2 = new AccountDetails("Rob", "Robert", 234);
	static AccountDetails acc3 = new AccountDetails("Cob", "Cobert", 345);
	static AccountDetails acc4 = new AccountDetails("Dob", "Dobert", 456);

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		JSONObject obj = new JSONObject();

		obj.put(1, acc1.getFirstName() + " " + acc1.getLastName() + " " + acc1.getAccountNumber());
		obj.put(2, acc2.getFirstName() + " " + acc2.getLastName() + " " + acc2.getAccountNumber());
		obj.put(3, acc3.getFirstName() + " " + acc3.getLastName() + " " + acc3.getAccountNumber());
		obj.put(4, acc4.getFirstName() + " " + acc4.getLastName() + " " + acc4.getAccountNumber());

		JSONArray accounts = new JSONArray();

		accounts.add(acc1);
		accounts.add(acc2);
		accounts.add(acc3);
		accounts.add(acc4);

		System.out.print(obj.toJSONString());

	}

}