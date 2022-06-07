package pkg;
import java.util.Scanner;
import java.util.Random;


public class Apprentice extends Musician{
	public String school;
	public int yearsOfExperience;
	
	public Apprentice(){
		school = "CVHS";
		yearsOfExperience = 0;
	}
	public Apprentice(String school, int yearsOfExperience){
		this.school = school;
		this.yearsOfExperience = yearsOfExperience;
	}
	public Apprentice(String instrument, String school, int yearsOfExperience){
		super(instrument);
		this.school = school;
		this.yearsOfExperience = yearsOfExperience;
	}
	public Apprentice(String name, int age, String instrument, String school, int yearsOfExperience){
		super(name, age, instrument);
		this.instrument = instrument;
		this.school = school;
		this.yearsOfExperience = yearsOfExperience;
	}
	public void playInstrument(){
		System.out.println(name + " is playing their instrument as an Apprentice.");
	}	
	public void practice(){
		System.out.println(name + " is practicing with " + yearsOfExperience + " years of experience.");
	}
	public void perform(){
		System.out.println(name + " is performing as an Apprentice.");
	}
	public void practiceAtUniversity(){
		System.out.println(name + " is practicing at " + school + ".");
	}

	
	
	
	
	
}

