package prob1;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Prob1 {
	public static void main(String[] args) throws IOException {
		BufferedWriter bw = new BufferedWriter(
				new OutputStreamWriter(System.out));
		Scanner scanner = new Scanner( System.in );		
		System.out.print( "금액:" );
		int money = scanner.nextInt();
		
		if(money > 50000) {
			bw.write(String.format("50000원: %d개\n", money/50000));
			money = money%50000;
		}
		
		if(money > 10000) {
			bw.write(String.format("10000원: %d개\n", money/10000));
			money = money%10000;
		}
		
		if(money > 5000) {
			bw.write(String.format("5000원: %d개\n", money/5000));
			money = money%5000;
		}
		
		if(money > 1000) {
			bw.write(String.format("1000원: %d개\n", money/1000));
			money = money%1000;
		}
		
		if(money > 500) {
			bw.write(String.format("500원: %d개\n", money/500));
			money = money%500;
		}
		
		if(money > 100) {
			bw.write(String.format("100원: %d개\n", money/100));
			money = money%100;
		}
		
		if(money > 50) {
			bw.write(String.format("50원: %d개\n", money/50));
			money = money%50;
		}
		
		if(money > 10) {
			bw.write(String.format("10원: %d개\n", money/10));
			money = money%10;
		}
		
		if(money > 5) {
			bw.write(String.format("5원: %d개\n", money/5));
			money = money%5;
		}
			
		bw.write(String.format("1원: %d개\n", money/1));
		
		bw.flush();
		bw.close();
		scanner.close();
 	}
}