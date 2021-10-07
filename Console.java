import java.util.ArrayList;
import java.util.Scanner;
import java.util.Set;

public class Console {
	void print(Set<AddressBook> contactList) {
		for (AddressBook s : contactList) {
			System.out.println(s);
		}
	}
	void edit(AddressBook contact) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Editted details firstname,last name,address,city,state,zip,phone number,email");
		contact.setFirstName(sc.nextLine());
		contact.setLastName(sc.nextLine());
		contact.setAddress(sc.nextLine());
		contact.setCity(sc.nextLine());
		contact.setState(sc.nextLine());
		contact.setZip(sc.nextLine());
		contact.setPhoneNumber(sc.nextLine());
		contact.setEmail(sc.nextLine());
	}
}
