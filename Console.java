import java.util.ArrayList;
import java.util.Set;

public class Console {
	void print(Set<AddressBook> contactList) {
		for (AddressBook i : contactList) {
			System.out.println(i);
		}
	}
}
