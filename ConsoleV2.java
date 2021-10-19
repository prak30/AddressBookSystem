import java.util.Scanner;
import java.util.Set;

public class ConsoleV2 {
	void print(Set<AddressBookV2> contactList) {
		for (AddressBookV2 string : contactList) {
			System.out.println(string);
		}
	}
	void edit(AddressBookV2 contact) {
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
