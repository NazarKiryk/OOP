public class Echo implements Command{
	private String text;
	public Echo() {
		
	}
	public Echo(String text) {
		this.text = text;
	}
	
	public void execute() {
		System.out.println(text);
	}
	
	
}