package edu.homework07.Animal;

public interface IAnimal extends IJump {

	default String voice() {
		return "\tVoice not assigned!!!";
	};

	default void feed() {
		System.out.println("\tCan't feed!!!");
	};

}
