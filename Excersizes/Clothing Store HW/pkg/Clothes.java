package pkg;
import java.util.Scanner;
import java.util.Random;


public class Clothes{
	public int price;
	public String producer;
	public Clothes(int price, String producer){
		this.price = price;
		this.producer = producer;
	}
	public int getPrice(){
		return price;
	}
	public String getProducer(){
		return producer;
	}
}

public class Pants extends Clothes{
	public double length;
	public Pants(int price, String producer, double length){
		super(price, producer);
		this.length = length;
	}
	public double getLength(){
		return length;
	}
}

public class Socks extends Clothes{
	public String type;
	public Socks(int price, String producer, String type){
		super(price, producer);
		this.type = type;
	}
	public String getType(){
		return type;
	}
}

public class Shirts extends Clothes{
	public String material;
	public Shirts(int price, String producer, String material){
		super(price, producer);
		this.material = material;
	}
	public String getMaterial(){
		return material;
	}
}

public class DesignerShirts extends Shirts{
	public String designer;
	public DesignerShirts(int price, String producer, String material, String designer){
		super(price, producer, material);
		this.designer = designer;
	}
	public String getDesinger(){
		return designer;
	}
	//OVERRIDING VVV
	public String getPrice(){
		return "More than your rent $$$";
	}
}

