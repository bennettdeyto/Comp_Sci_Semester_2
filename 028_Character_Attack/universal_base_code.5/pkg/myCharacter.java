package pkg;
import java.util.Scanner;
import java.util.Random;


public class myCharacter {
	Scanner sc = new Scanner(System.in);
	Random rand = new Random();
	String role = new String();
	int strength;
	int dexterity;
	int intelligence;
	int constitution;
	int charisma;
	int level = 0;
	int points = 0;
	int maxHealth = 0;
	int currentHealth = 0;
	int attackModifier = 0;
	
	public int setStrength(int a){
		strength = a;
		return strength;
	}
	private int setDexterity(int a){
		dexterity = a;
		return dexterity;
	}
	private int setIntelligence(int a){
		intelligence = a;
		return intelligence;
	}
	private int setConstitution(int a){
		constitution = a;
		return constitution;
	}
	private int setCharisma(int a){
		charisma = a;
		return charisma;
	}
	
	//HEALTH
	
	public int getHealth(){
		return currentHealth;
	}
	public void setHealth(int a){
		currentHealth = a;
		System.out.println("You have " + currentHealth + "/" + maxHealth + " Health");
		return;
	}
	public void setMaxHealth(){
		if(role.equals("Warrior")){
			maxHealth = constitution + rand.nextInt(6) + 1;
		}
		else if(role.equals("Wizard")){
			maxHealth = constitution + rand.nextInt(3) + 1;
		}
		else if(role.equals("Rogue")){
			maxHealth = constitution + rand.nextInt(4) + 1;
		}
		else{
			maxHealth = constitution;
		}
		System.out.println("Max Health =  " + maxHealth);
	}
	//DAMAGE
	public void takeDamage(int d){
		if(d > currentHealth){
			currentHealth = 0;
			System.out.println("You're dead.");
		}
		else{
			currentHealth = currentHealth - d;
		}
	}
	public boolean isDead(){
		if(currentHealth == 0){
			System.out.println("You're dead.");
			return true;
		}
		return false;
	}
	public void setAttackMod(){
		if(role.equals("Warrior")){
			attackModifier = 2 + rand.nextInt(strength/level) + 1;
			System.out.println("Your new attack modifier is " + attackModifier);
		}
		else if(role.equals("Wizard")){
			attackModifier = 2 + rand.nextInt(intelligence/level) + 1;
			System.out.println("Your new attack modifier is " + attackModifier);
		}
		else if(role.equals("Rogue")){
			attackModifier = 2 +rand.nextInt(dexterity/level) + 1;
			System.out.println("Your new attack modifier is " + attackModifier);
		}
		else{
			attackModifier = attackModifier + 2;
			System.out.println("Your new attack modifier is " + attackModifier);
		}
	}
	
	
	//LEVELUP
	
	public void levelUp(){
		Scanner sc = new Scanner(System.in);
		if(level == 0){
			level = 1;
			points = points + 25;
		}
		else if(level > 0){
			level = level + 1;
			points = points + 10;
		}
		setMaxHealth();
		setHealth(maxHealth);
		System.out.println("You've leveled up! Congrats! Spend your points in the following wisely. Strength, Dexterity, Intelligence, Constitution, and Charisma");
		System.out.println(" ");
		
		System.out.println("You have " + points + " left to spend.");
		System.out.print("Strength? Max 10: ");
		int strengtha = sc.nextInt();
		while(strengtha > 10 || strengtha < 0 || strengtha > points){
			System.out.print("Incorrect number of points, try again. You can spend " + points + ":");
			strengtha = sc.nextInt();
		}
		System.out.println(" ");
		setStrength(strengtha);
		points = points - strengtha;
		
		System.out.println("You have " + points + " left to spend.");
		System.out.print("Dexterity? Max 10: ");
		int dexa = sc.nextInt();
		while(dexa > 10 || dexa < 0 || dexa > points){
			System.out.print("Incorrect number of points, try again. You can spend " + points + ":");
			dexa = sc.nextInt();
		}
		System.out.println(" ");
		setDexterity(dexa);
		points = points - dexa;
		
		System.out.println("You have " + points + " left to spend.");
		System.out.print("Intelligence? Max 10: ");
		int inta = sc.nextInt();
		while(inta > 10 || inta < 0 || inta > points){
			System.out.print("Incorrect number of points, try again. You can spend " + points + ":");
			inta = sc.nextInt();
		}
		System.out.println(" ");
		setIntelligence(inta);
		points = points - inta;
		
			System.out.println("You have " + points + " left to spend.");
		System.out.print("Constitution? Max 10: ");
		int cona = sc.nextInt();
		while(cona > 10 || cona < 0 || cona > points){
			System.out.print("Incorrect number of points, try again. You can spend " + points + ":");
			cona = sc.nextInt();
		}
		System.out.println(" ");
		setConstitution(cona);
		points = points - cona;
		
		System.out.println("You have " + points + " left to spend.");
		System.out.print("Charisma? Max 10: ");
		int chara = sc.nextInt();
		while(chara > 10 || chara < 0 || chara > points){
			System.out.print("Incorrect number of points, try again. You can spend " + points + ":");
			chara = sc.nextInt();
		}
		System.out.println(" ");
		setCharisma(chara);
		points = points - chara;
		
		if(points == 0){
			System.out.println("Congrats on the level up! You've spent all your points!");
		}
		else{
			System.out.println("Congrats on the level up! You have " + points + " left to spend!");
		}
		
	}
	
	//SETROLE
	public myCharacter() {
		role = "No Role";
		strength = 0;
		
	}
	public void setRole(String a){
		if(a.equals("Rogue")){
			System.out.println("You've chosen the Rogue! How cunning!");
			role = "Rogue";
		}
		else if(a.equals("Wizard")){
			System.out.println("You've chosen the Wizard! Excelsior!");
			role = "Wizard";
		}
		else if(a.equals("Warrior")){
			System.out.println("You've chosen the Warrior! For honor!");
			role = "Warrior";
		}
		else{
			System.out.println("You've decided not to choose a role. Rerun program.");
		}
	}
		
	
	public myCharacter(String a) {
		setRole(a);
		
		
	}
	public void myToString(){
		System.out.println("Your role is " + role + "\nYour strength trait is " + strength + "\nYour dexterity trait is " + dexterity + "\nYour intelligence trait is " + intelligence + "\nYour constitution trait is " + constitution + "\nYour charisma trait is " + charisma);
	}
	

	
	
	public boolean setAll(String a, int strength, int dexterity, int intelligence, int constitution, int charisma){
		setRole(a);
		setStrength(strength);
		setDexterity(dexterity);
		setIntelligence(intelligence);
		setConstitution(constitution);
		setCharisma(charisma);
		if(a.equals("Warrior")||a.equals("Wizard")||a.equals("Rogue")){
			return true;
		}
		else{
			return false;
		}
		
	}

}

