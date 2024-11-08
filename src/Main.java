public class Main {
	public static void main(String[] args) {
		User user = new User("Elgun");
		System.out.println(user);
		
		user.setRole("Admin");
		System.out.println(user);
	}
}