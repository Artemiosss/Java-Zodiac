import java.util.*;
public class Zodiac{
	public static void main (String[] args){
		Scanner yourdata= new Scanner (System.in);
		System.out.println();
		System.out.println("Welcome to the Zodiac sign calculation program.");
		System.out.println();
		System.out.println("Enter your date of birth");
		System.out.println();
		System.out.print("Month: ");
		int yourmonth= yourdata.nextInt();
		System.out.print("Day: ");
		int yourday= yourdata.nextInt();
		Zodiaccalculation zcalc= new Zodiaccalculation(yourmonth, yourday);
		String yourresult= zcalc.getz();
		System.out.println();
		System.out.println("Your sign of zodiac is "+yourresult);
	}
}

class Zodiaccalculation{
	public Zodiaccalculation (int m, int d){
		yourmonth=m;
		yourday= d;
		yourresult="not calculated";
	}
		
	public String getz(){
		int[] fm= {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
		int[] lm= {2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 1};
		int[] fd= {21, 20, 21, 21, 21, 22, 23, 24, 24, 24, 23, 22};
		int[] ld= {19, 20, 20, 20, 21, 22, 23, 23, 23, 22, 21, 20};
		String[] sz= {"Aquarius", "Pisces", "Aries", "Taurus", "Gemini", "Cancer", "Leo", "Virgo", "Libra", "Scorpio", "Sagittarius"};
		
		for (int i=0; i<=11; i++){
			if (yourmonth==fm[i]){
				if (yourday>=fd[i]){
					yourresult= sz[i];
				}
			}
			if (yourmonth==lm[i]){
				if (yourday<=ld[i]){
					yourresult= sz[i];
				}
			}	
		}
			
		return yourresult;
	}
		private int yourmonth;
		private int yourday;
		private String yourresult;
}