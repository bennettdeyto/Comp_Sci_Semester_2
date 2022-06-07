package pkg;
import java.util.Scanner;
import java.util.Random;


public class Performer{
	public String name;
	public int age;
	
	public Performer(){
		name = "Doja Cat";
		age = 26;
	}
	public Performer(String name){
		this.name = name;
		age = 26;
	}
	public Performer(String name, int age){
		this.name = name;
		this.age = age;
	}
	public String getName(){
		return name;
	}
	public void practice(){
		System.out.println(name + " is practicing.");
	}
	public void perform(){
		System.out.println(name + " is performing.");
	}
	
	@Override
	public String toString(){
		return name + " " + age;
	}
	
	@Override
	public boolean equals(Object other){
		if(!(other instanceof Performer)){
			return false;
		}
		else{
			return this.name == ((Performer)other).name;
		}
		
	}
	
	
	
	
	
}

