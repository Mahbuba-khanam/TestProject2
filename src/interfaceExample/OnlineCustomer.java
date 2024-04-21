package interfaceExample;

public class OnlineCustomer implements ICustomer, IEmployee {
	int phone;

	@Override
	public void createProfile() {
		System.out.println("Profile is created");

	}

	@Override
	public void updateProfile() {

		System.out.println("Profile is updated");
	}

	@Override
	public void printProfile() {
		System.out.println("Profile is printed");

	}

	@Override
	public void deleteProfile() {
		System.out.println("Profile is deleted");

	}

	@Override
	public void printEmployeeProfile() {
		System.out.println("Sara's profile is updated");

	}

	@Override
	public void purchaseItems() {
		System.out.println("Sara's purchased is updated");

	}

}
