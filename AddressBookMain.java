import java.util.Scanner;

public class AddressBookMain {
	public static void main(String[] args) {
		System.out.println("Welcome to address book program");
		
		AddressBook c1 = new AddressBook();
		c1.setFirstName("bob");
		c1.setLastName("james");
		c1.setAddress("bakers street");
		c1.setCity("panjim");
		c1.setState("goa");
		c1.setZip("403001");
		c1.setPhoneNumber("2714511");
		c1.setEmail("bob@gmail.com");

		AddressBook c2 = new AddressBook();
		c2.setFirstName("steph");
		c2.setLastName("curry");
		c2.setAddress("bay area");
		c2.setCity("ohio");
		c2.setState("california");
		c2.setZip("11582");
		c2.setPhoneNumber("2255443");
		c2.setEmail("curry@hotmail.com");
		
		AddressBook newContact = new AddressBook();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter details ");
		System.out.println("Enter first name ");
		newContact.setFirstName(sc.nextLine());
		System.out.println("enter last name ");
		newContact.setLastName(sc.nextLine());
		System.out.println("enter address ");
		newContact.setAddress(sc.nextLine());
		System.out.println("enter city ");
		newContact.setCity(sc.nextLine());
		System.out.println("enter state ");
		newContact.setState(sc.nextLine());
		System.out.println("enter zip ");
		newContact.setZip(sc.nextLine());
		System.out.println("enter phone number ");
		newContact.setPhoneNumber(sc.nextLine());
		System.out.println("enter email ");
		newContact.setEmail(sc.nextLine());
		sc.close();

		ContactStore contactStore = new ContactStore();
		contactStore.add(c1);
		contactStore.add(c2);
		contactStore.add(newContact);

		Console console = new Console();
		console.print(contactStore.getContactList());
	}
	}


