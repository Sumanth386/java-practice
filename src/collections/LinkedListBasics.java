package collections;

import java.util.LinkedList;

public class LinkedListBasics {

	public static void main(String[] args) {
		LinkedList<String> superHeroes = new LinkedList<>();
		
		superHeroes.add("Iron Man");
		superHeroes.add("Thor");
		superHeroes.add("Hulk");
		
		System.out.println(superHeroes);
		
		superHeroes.addFirst("Captain America");
		superHeroes.addLast("Natasha");
		
		System.out.println(superHeroes);
		
		System.out.println("First superhero: " + superHeroes.getFirst());
		System.out.println("Last superhero: " + superHeroes.getLast());
		
		superHeroes.removeFirst();
		superHeroes.removeLast();
		
		System.out.println(superHeroes);
	}

}
