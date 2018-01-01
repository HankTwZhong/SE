import java.util.Scanner;

public class letterGrade  {
	
	public String Grade(int Source){
		if(Source >=90 && Source <=100){
			return	"A";
		}
		else if (Source >= 80 && Source < 90) {
			return	"B";
		}
		else if (Source >= 70 && Source < 80) {
			return	"C";
		}
		else if (Source >= 60 && Source < 70) {
			return	"D";
		}
		else if (Source >= 0  && Source < 60) {
			return	"F";
		}		
		return "X";
	}
	public static void main(String[] args) {
		letterGrade letgrade = new letterGrade();
		String result = "";
	    while(result !="X" ) {
			Scanner scan= new Scanner(System.in);
		    String Score= scan.nextLine();
		    result = letgrade.Grade(Integer.parseInt(Score));
		    System.out.println(result);
	    }
	}
}
