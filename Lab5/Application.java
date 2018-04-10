public class Application {

	public static void main(String[] args) {
		if(args == null || args.length > 2 || args.length == 0) {
			System.out.println("Error");
			return;
		}
		if(args[0].equals("help") && args.length == 1) {
			Help help = new Help();
			help.execute();
		}
		else if(args[0].equals("echo") && args.length == 2) {
			Echo echo = new Echo(args[1]);
			echo.execute();
		}
		else if(args.length == 2 && args[0].equals("date") && args[1].equals("now")) {
			Date date = new Date();
			date.execute();
		}
		else if(args.length == 1 && args[0].equals("exit")) {
			Exit exit = new Exit();
			exit.execute();
		}
		else {
			System.out.println("Error");
		}

	}

}