package pkg;
import java.util.Scanner;
import java.util.Random;

public interface Creature{
	public String getName();
	public boolean isDead();
	public boolean takeDamage(int a);
	public void attack(Role);
	public void burp();
}

public class Zombie implements Creature{
	Random rand = new Random();
	String name;
	int health;
	int attack;

	public Zombie() {
		name = "Zack";
		health = rand.nextInt(5) + 5;
		attack = rand.nextInt(5) + 5;
	}
	public String getName(){
		return name;
	}
	public boolean isDead(){
		if(health <= 0){
			return true;
		}
		return false;
	}
	public boolean takeDamage(int a){
		health = health - a;
	}
	public void attack(Creature a){
		
	}
	public void burp(){
		System.out.println(name + ": *burp*");
	}
public class Zombie implements Creature{	
	public Spider() {
		name = "Charlotte";
		health = rand.nextInt(5) + 5;
		attack = rand.nextInt(5) + 5;
	}
	public String getName(){
		return name;
	}
	public boolean isDead(){
		if(health <= 0){
			return true;
		}
		return false;
	}
	public boolean takeDamage(int a){
		health = health - a;
	}
	public void attack(Creature a){
		
	}
	public void burp(){
		System.out.println(name + ": *burp*");
	}
}


