package ap_assignment02;

public abstract class Accounts {
	
	public class Node {
		public String username;
		public String password;
		public char accType;
		Node next;
	}
	
	protected Node head;
	
	public Node getHead() {
		return head;
	}
	
	public boolean Login(String u, String p) {
		Node current=head;
		while (current!=null) {
			if (current.username==u) {
				if (current.password==p) {
					System.out.println("[SUCCESS] Login complete!");
					return true;
				} else {
					System.out.println("[FAILURE] Invalid password!");
				}
			} 
			current=current.next;
		}
		System.out.println("[FAILURE] User not found!");
		return false;
	}
	
	public String getUsername() {
		return head.username;
	}
	public String getPassword() {
		return head.password;
	}
	public void setUsername(String username) {
		this.head.username = username;
	}
	public void setPassword(String password) {
		this.head.password = password;
	}
}


