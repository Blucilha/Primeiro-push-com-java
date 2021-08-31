package br.Principal;

import br.com.Animal.Animal;

public class Principal {

	public static void main(String[] args) {
		Animal animal = new Animal("felino", "Tigre", 4, true, true, false, false, true, false);
		System.out.println(animal.toString());

	}

}
