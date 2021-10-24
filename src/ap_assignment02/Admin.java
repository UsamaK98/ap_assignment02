package ap_assignment02;

public class Admin extends Accounts {
	
	public Admin () {
		this.head=new Node();
		this.head.username="Admin";
		this.head.password="admin123";
		this.head.accType='A';
		this.head.next=null;
	}
	
	public boolean createAccount(String u, String p) throws Exception {
		Node current = this.getHead();
		while (current.next!=null) {
			if (current.username==u) {
				throw new Exception();
				//return false;
			}
			current=current.next;
		}
		return true;
	}
}
