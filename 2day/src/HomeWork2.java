import java.util.Scanner;
public class HomeWork2 {
	
	public static boolean Tryagle(int a, int b, int c){
		int max1, max2,max;
		max1=Math.max(a, b);
		max2=Math.max(b, c);
		max=Math.max(max2, max1);
		boolean gk=false;
		
		if((max==a)&&(a<b+c))
			return gk=true;
		else if((max==b)&&(b<a+c))
			return gk=true;
		else if((max==c)&&(c<a+b))
			return gk=true;
		else return gk=false;
	}
	
	static void triangle(int x1,int y1,int x2,int y2,int x3, int y3){
		
		double tq1=Math.sqrt(((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1)));
		double tq2=Math.sqrt(((x3-x2)*(x3-x2)+(y3-y2)*(y3-y2)));
		double tq3=Math.sqrt(((x1-x3)*(x1-x3)+(y1-y3)*(y1-y3)));
		
		if(Tryagle((int)tq1,(int)tq2,(int)tq3)==true){
		
		int a=((x1*y2+x2*y3+x3*y1)-(x2*y1+x3*y2+x1*y3));
		if(((x1*y2+x2*y3+x3*y1)-(x2*y1+x3*y2+x1*y3))<0)
			a=((x1*y2+x2*y3+x3*y1)-(x2*y1+x3*y2+x1*y3))*(-1);
		System.out.println((0.5)*a);
		}
		else
			System.out.println("»ï°¢ÇüÀÌ ¾Æ´Ô");
	}

	public static void main(String[] args) {
			Scanner s=new Scanner(System.in);
			System.out.print("Input: ");
			int x1=s.nextInt();
			int y1=s.nextInt();
			int x2=s.nextInt();
			int y2=s.nextInt();
			int x3=s.nextInt();
			int y3=s.nextInt();
			
			triangle(x1,y1,x2,y2,x3,y3);
	}
}
