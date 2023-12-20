package Practice.Seleniumday1;

public class Mobile {
	public void makeCall() {
		System.out.println("MAKE CALL");
	}
	public void sendMessage() {
		System.out.println("SEND MESSAGE");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mobile mobile=new Mobile();
		mobile.makeCall();
		mobile.sendMessage();
		System.out.println("Runned Successfully!");
	}

}
