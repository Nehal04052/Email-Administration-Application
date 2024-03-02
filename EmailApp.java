package emailapp;

import java.util.Scanner;


public class EmailApp {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.print("Enter The Frist Name Of Empolyee : ");
		String frist_name = s.next();
		
		System.out.print("Enter The Last Name Of Empolyee : ");
		String last_name = s.next();

		// Creating a new employee (i.e. an object of the Email class)
		
		 Email em1 = new Email(frist_name,last_name);
		
		int choice = -1;
		do {
			System.out.println("\n**************************\n\nENTER YOUR CHOICE\n\n1.Show Info\n2.Change Password"
					+ "\n3.Change Mailbox Capacity\n4.Set Alternate Email\n5.Exit\n");
			choice = s.nextInt();
			switch(choice) {
			case 1:
				em1.getInfo();
				break;
			case 2:
				em1.set_password();
				break;
			case 3:
				em1.set_mailCap();
				break;
			case 4:
				em1.alternate_email();
				break;
			case 5:
				System.out.println("\nTHANKS!!!");
				break;
			default:
				System.out.println("INVALID CHOICE! ENTER AGAIN!");
			}
			
		}while(choice!=5);
		s.close();
	}

}
