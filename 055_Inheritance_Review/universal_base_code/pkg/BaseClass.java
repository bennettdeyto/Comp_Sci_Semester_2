package pkg;
import java.util.Scanner;
import java.util.Random;


public class CourseClass{
	String Teacher;
	int grade;
	int credit;

	public CourseClass(String Teacher, int grade){
		this.Teacher = Teacher;
		this.grade = grade;
		this.calcCredit()
	}
	
	public void setTeacher(String Teacher){
		this.Teacher = teacher;
	}
	public void setgrade(int grade){
		this.grade = grade;
	}
	public void setcredit(int credit){
		this.credit = credit;
	}
	public int getcredit(){
		return credit;
	}
	public void calcCredit(){
		if(this.grade >= 90){
			credit = 4;
		}
		else if(this.grade >= 80){
			credit = 3;
		}
		else if(this.grade >= 70){
			credit = 2;
		}
		else if(this.grade >= 60){
			credit = 1;
		}
		else{
			credit = 0;
		}
	}
	
	public String toString(){
		return Teacher + " " + credit;
	}
	
	public boolean equals(Object other){
		if(!(other instanceof CourseClass)){
			return false;
		}
		else{
			return this.Teacher == ((CourseClass)other).Teacher;
		}
	}
}

public class Math extends CourseClass{
	String Difficulty;
	public Math(String Teacher, int grade, String Difficulty){
		super(Teacher, grade);
		this.Difficulty = Difficulty;
	}
	public void setDifficulty(String other){
		Difficulty = other;
	}
	public String toString(){
		return Teacher + " " + credit + " " + Difficulty;
	}
}

public class History extends CourseClass{
	int Era;
	public History(String Teacher, int grade, int Era){
		super(Teacher, grade);
		this.Era = Era;
	}
	public void Era(int other){
		Era = other;
	}
	public String toString(){
		return Teacher + " " + credit + " " + Era;
	}
}

public class Science extends CourseClass{
	String Field;
	public Science(String Teacher, int grade, String Field){
		super(Teacher, grade);
		this.Field = Field;
	}
	public void setField(String other){
		Field = other;
	}
	public String toString(){
		return Teacher + " " + credit + " " + Field;
	}
}

public class APSci extends Science{
	public APSci(String Teacher, int grade, String Field){
		super(Teacher, grade, Field);
		setcredit(getcredit() + 1);
	}
}

public class RecoverySci extends Science{
	public APSci(String Teacher, int g, String Field){
		if(g > 60){
			grade = 100;
		}
		else{
			grade = 0;
		}
		super(Teacher, grade, Field);
	}	
}


