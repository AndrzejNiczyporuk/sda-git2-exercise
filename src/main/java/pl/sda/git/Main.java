package pl.sda.git;

import java.util.*;

public class Main {
	private static final Map<String, Action> possibleActions = new LinkedHashMap<>();
	
	
	public static void main(String[] args) {
		final Scanner scanner = new Scanner(System.in);
		System.out.println("Mozliwe akcje");
		
		possibleActions.entrySet().stream()
				.map(Map.Entry::getKey)
				.map(name -> "\t" + name)
				.forEach(System.out::println);
		
		System.out.println("Jaką akcje chcesz wykonac");
		final String actionName = scanner.nextLine();
		
		if (possibleActions.containsKey(actionName)) {
			System.out.println("Podaj argumenty?");
			final String argumentLine = scanner.nextLine();
			String[] argsWithoutSpaces = argumentLine.trim().split("\\s+"); // split po jednej lub wielu spacjach
			final List<String> arguments = Arrays.asList(argsWithoutSpaces);
			
			final Action action = possibleActions.get(actionName);
			final String result = action.doIt(arguments);
			System.out.println(result);
		} else {
			System.out.println("Podano nieprawidlową akcje!");
		}
	}
	
}
