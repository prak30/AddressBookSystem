import java.util.HashSet;
import java.util.Set;

public class ContactStore {
	private Set<AddressBook> contactList = new HashSet<>();
	private Set<AddressBookV2> contactListTwo = new HashSet<>();

	public Set<AddressBook> getContactList() {
		return contactList;
	}
	public Set<AddressBookV2> getContactListTwo() {
		return contactListTwo;
	}
	public void add(AddressBook address) {
		contactList.add(address);
	}
	public void add(AddressBookV2 address) {
		contactListTwo.add(address);
	}
	
	public void delete(AddressBook contact) {
		contactList.remove(contact);
	}
	public void delete(AddressBookV2 contact) {
		contactListTwo.remove(contact);
	}


}
