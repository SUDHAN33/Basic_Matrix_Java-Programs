package matrix.com;
import java.util.*;

public class OddAndEvenFrequency {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int a=input.nextInt();
		int b=input.nextInt();
		int arr[][]=new int[a][b];
		for(int i=0;i<a;i++) {
			for(int j=0;j<b;j++) {
				arr[i][j]=input.nextInt();
			}
		}
		int c=0,d=0;
		for(int i=0;i<a;i++) {
			for(int j=0;j<b;j++) {
				if(arr[i][j]%2==0) {
					c++;
				}
				else {
					d++;
				}
			}
		}
		System.out.println("Odd frequency is : "+ d);
		System.out.println("Even frequency is : "+ c);
	}

}
