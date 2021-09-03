package matrix.com;
import java.util.*;
public class MatrixAddition {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int r=input.nextInt();
		int c=input.nextInt();
	    int a[][]=new int[r][c];
	    int b[][]=new int[r][c];
	    int add[][]=new int[r][c];
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				a[i][j]=input.nextInt();
			}
		}
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				b[i][j]=input.nextInt();
			}
		}
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				b[i][j]=input.nextInt();
			}
		}
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				add[i][j]=a[i][j]+b[i][j];
			}
		}
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				System.out.print(add[i][j]+" ");;
			}
			System.out.println("");
		}
	}

}
