
class Main {

	public static void main(String[] args) {
		
		BookService b = new BookService();
		
		b.initBookStore();
		boolean exit = false;
		
		do {
			System.out.println("Please enter your command below: ");
			String comm = Input.scan.nextLine();
			
			String[] command = comm.split(" ");
			switch (command[0]) {
			default:
				System.out.println("Did not recognise command \"" + command[0] + "\". Use the \"help\" command to see list of valid commands");
				break;
			case "addBook":
				try {
					b.addBook(command[1], command[2], command[3], command[4]);
				} catch (Exception e) {
					System.out.println("Invalid arguments, must be \"addBook\" then \"author\", \"title\", \"genre\", \"year published\"");
				}
				break;
			case "deleteBook":
				try {
					Integer deleteID = Integer.parseInt(command[1]);
					b.deleteBook(deleteID);
				} catch (Exception e) {
					System.out.println("Invalid argument, must state valid ID");
				}
				break;
			case "end":
				exit = true;
				break;
			case "help":
				System.out.println("Valid commands: \"addBook\", \"deleteBook\", \"end\", \"help\", \"output\"");
				break;
			case "output":
				b.output();
				break;
			}
		} while (!exit);
	}
}
