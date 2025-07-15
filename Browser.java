package Methods;

public class Browser {
	
	public void launchBrowser() {
		System.out.println("Browser launched Successfully");
	}
	
	public void loadurl() {
		System.out.println("Appl url launched Successfully");
	}
	
	public static void main(String[] args) {
		Browser sel=new Browser();
		sel.launchBrowser();
		sel.loadurl();
	
	}

}
