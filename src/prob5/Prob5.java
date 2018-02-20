package prob5;

import java.util.Random;
import java.util.Scanner;

public class Prob5 {
	public static void main(String[] args) {
		Random rand = new Random();
		Scanner scanner = new Scanner(System.in);
		int round = 1;
		int higher = 1;
		int lower = 100;
		int answer = rand.nextInt()%100;
		answer = (answer*answer)%100 + 1;
		System.out.println("수를 결정했습니다. 맞추어 보세요");
		
		while(true) {
			System.out.println(higher + "-" + lower);
			System.out.print(round + ">>");
			int input = scanner.nextInt();
			
			if(input == answer) {
				System.out.println("맞았습니다.");
				break;
			} else {
				if(input < answer) {
					System.out.println("더 높게");
					higher = input;
				} else {
					System.out.println("더 낮게");
					lower = input;
				}
			}
			
			round++;
		}
	}
}