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

