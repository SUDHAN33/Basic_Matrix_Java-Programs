package matrix.com;
import java.util.*;
public class SparseMatrix {

	public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	int r=input.nextInt();
	int c=input.nextInt();
	int size=r*c;
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
	 int e=0,d=0;
	 for(int i=0;i<r;i++) {
		 for(int j=0;j<c;j++) {
			 if(a[i][j]==0) {
				 d++;
			 }
			/* else {
				 e++;
			 }*/
		 }
	 }
	 if(d>size/2)//d>e
		 {
		 System.out.println("It is sparse matrix");
	 }
	 else {
		 System.out.println("It is not sparse matrix");
	 }
	}

}
