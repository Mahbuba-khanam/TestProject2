package interfaceExample;

public class Company {

	public static void main(String[] args) {
		OnlineCustomer sara;
		 sara = new OnlineCustomer();
		 sara.purchaseItems();
		 sara.printEmployeeProfile();
		 

		ICustomer maria;
		maria = new OnlineCustomer();

		maria.createProfile();
		maria.printProfile();
		maria.updateProfile();
		maria.deleteProfile();

		OnlineCustomer joe;
		joe = new OnlineCustomer();
		joe.phone = 33333;

		joe.createProfile();
		joe.updateProfile();
		

	}

	
	}



