package sample.controller;

import java.util.Scanner;
import sample.model.PlayDohCircle;
import sample.model.PlayDohCube;
public class SampleController 
{
	public void start()
	{
		PlayDohCube firstCube = new PlayDohCube();
		PlayDohCube secondCube;
		secondCube = new PlayDohCube(24);
		
		
		
		
		PlayDohCircle firstCircle = new PlayDohCircle();
		PlayDohCircle secondCircle;
		secondCircle = new PlayDohCircle();
		
		PlayDohCircle thirdCircle;
		thirdCircle = new PlayDohCircle(10);
		
		
		System.out.println("This is a sample proect to show the github and");
		System.out.println("eclipse process so I develop muscle memory :D");
	
		testScanner();
	}
	
	private void testScanner()
	{
		Scanner firstScanner; //Decres a Scanner object.
		firstScanner = new Scanner(System.in); //Instanciates a Scanner object.
		System.out.println("Please type your favouite food");
		String answer = firstScanner.nextLine();
		System.out.println("Oh, you like to eat " + answer);
	}
}