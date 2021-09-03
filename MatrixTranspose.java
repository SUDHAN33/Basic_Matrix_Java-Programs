package matrix.com;
import java.util.*;
public class MatrixTranspose {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int r=input.nextInt();
		int c=input.nextInt();
		int a[][]=new int[r][c];
		 for(int i=0;i<r;i++) {
	        	for(int j=0;j<c;j++) {
	        		a[i][j]=input.nextInt();
	        	}
	        }
		 for(int i=0;i<r;i++) {
	        	for(int j=0;j<c;j++) {
	        		System.out.print(a[i][j]+" ");
	        	}
	        	System.out.println("");
	        }
		 System.out.println("");
		 for(int i=0;i<r;i++) {
	        	for(int j=0;j<c;j++) {
	        		System.out.print(a[j][i]+" ");
	        	}
	        	System.out.println("");
	        }
	}

}
