import java.util.Scanner;
public class HomeWork1 {
	
	public static void Tryagle(int a, int b, int c){
		int max1, max2,max;
		max1=Math.max(a, b);
		max2=Math.max(b, c);
		max=Math.max(max2, max1);
		
		if((max==a)&&(a<b+c))
			System.out.println("�ﰢ���� ���� �� ����");
		else if((max==b)&&(b<a+c))
			System.out.println("�ﰢ���� ���� �� ����");
		else if((max==c)&&(c<a+b))
			System.out.println("�ﰢ���� ���� �� ����");
		else System.out.println("�ﰢ���� ���� �� ����");
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Input: ");
		Tryagle(s.nextInt(),s.nextInt(),s.nextInt());
	}
}
