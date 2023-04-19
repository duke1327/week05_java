package test.for1;
import java.util.Scanner;

public class ForTest2 {
	public static void main(String[] args) {	
		Scanner i = new Scanner(System.in);
		Scanner s = new Scanner(System.in);
		while(true) {
			System.out.print("수를 입력하세요 : ");
			int num = i.nextInt();
			
			int sum = 0;
			for(int n = 1; n <= num; n++)
				sum += n;
			System.out.printf("1부터 %d까지의 합은 %d입니다.", num, sum);
			System.out.print("계속 하시겠습니까? (y/n) : ");
			String end = s.nextLine();
			if(end.equals("n"))
				break;
		}
		i.close();
		s.close();
	}
}
