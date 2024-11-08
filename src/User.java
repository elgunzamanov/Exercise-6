public class User {
	private final String username;
	private String role;
	
	public User(String username) {
		this.username = username;
		role = "Guest";
	}
	
	public User(String username, String role) {
		this.username = username;
		this.role = role;
	}
	
	public void setRole(String role) {
		if (role.equals("Admin") || role.equals("User") || role.equals("Guest")) {
			this.role = role;
		} else {
			throw new IllegalArgumentException("Invalid role");
		}
	}
	
	public String getUsername() {
		return username;
	}
	
	public String getRole() {
		return role;
	}
	
	@Override
	public String toString() {
		return "User {username: '%s', role: '%s'}".formatted(username, role);
	}
}