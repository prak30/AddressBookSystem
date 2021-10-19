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
		
		ContactStore contactStore = new ContactStore();
		contactStore.add(c1);
		contactStore.add(c2);
		
		Console console = new Console();
		console.print(contactStore.getContactList());
		
		ConsoleV2 console2 = new ConsoleV2();
		console2.print(contactStore.getContactListTwo());
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1 to add details to AddressBook and 2 to add to AddressBookTwo");
		int select = sc.nextInt();
		if (select == 1) {
		AddressBook newContact = new AddressBook();
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter details ");
		System.out.println("Enter first name ");
		newContact.setFirstName(sc1.nextLine());
		System.out.println("enter last name ");
		newContact.setLastName(sc1.nextLine());
		System.out.println("enter address ");
		newContact.setAddress(sc1.nextLine());
		System.out.println("enter city ");
		newContact.setCity(sc1.nextLine());
		System.out.println("enter state ");
		newContact.setState(sc1.nextLine());
		System.out.println("enter zip ");
		newContact.setZip(sc1.nextLine());
		System.out.println("enter phone number ");
		newContact.setPhoneNumber(sc1.nextLine());
		System.out.println("enter email ");
		newContact.setEmail(sc1.nextLine());
		contactStore.add(newContact);
		console.print(contactStore.getContactList());
		}
	 else if (select == 2) {
		AddressBookV2 newContact2 = new AddressBookV2();
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter details ");
		System.out.println("Enter first name ");
		newContact2.setFirstName(sc1.nextLine());
		System.out.println("enter last name ");
		newContact2.setLastName(sc1.nextLine());
		System.out.println("enter address ");
		newContact2.setAddress(sc1.nextLine());
		System.out.println("enter city ");
		newContact2.setCity(sc1.nextLine());
		System.out.println("enter state ");
		newContact2.setState(sc1.nextLine());
		System.out.println("enter zip ");
		newContact2.setZip(sc1.nextLine());
		System.out.println("enter phone number ");
		newContact2.setPhoneNumber(sc1.nextLine());
		System.out.println("enter email ");
		newContact2.setEmail(sc1.nextLine());
		contactStore.add(newContact2);
		console2.print(contactStore.getContactListTwo());
		}
		
		

//		ContactStore contactStore = new ContactStore();
//		contactStore.add(c1);
//		contactStore.add(c2);
//		contactStore.add(newContact);

//		Console console = new Console();
//		console.print(contactStore.getContactList());
//		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter name of contact you want to edit");
//		String name = sc.nextLine();
//		if(c1.getFirstName().equalsIgnoreCase(name) == true)
//			console.edit(c1);
//		else if(c2.getFirstName().equalsIgnoreCase(name) == true)
//			console.edit(c2);
////		else if(newContact.getFirstName().equalsIgnoreCase(name) == true)
////			console.edit(newContact);
//		System.out.println("Contact List after edit");
//		console.print(contactStore.getContactList());
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter person contact you want to delete");
//		String contactName = sc.nextLine();
//		if(c1.getFirstName().equalsIgnoreCase(contactName))
//			contactStore.delete(c1);
////		else if(newContact.getFirstName().equalsIgnoreCase(contactName))
////			contactStore.remove(newContact);
//		else if(c2.getFirstName().equalsIgnoreCase(contactName) == true)
//			contactStore.delete(c2);
//		System.out.println("Contact List after deletion");
//		console.print(contactStore.getContactList());
	}
}