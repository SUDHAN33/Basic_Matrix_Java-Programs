package matrix.com;
import java.util.*;
public class MatrixEquality {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int r=input.nextInt();
		int c=input.nextInt();
		int r1=input.nextInt();
		int c1=input.nextInt();
	    int a[][]=new int[r][c];
	    int b[][]=new int[r1][c1];
	    if(r==r1 && c==c1) {
	    	int h=0;
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
					System.out.print(a[i][j]+" ");
				}
				System.out.println(" ");
			}
			for(int i=0;i<r;i++) {
				for(int j=0;j<c;j++) {
					System.out.print(b[i][j]+" ");
				}
				System.out.println(" ");
			}
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				if(a[i][j]!=b[i][j]) {
			       h++;
				}
			}
		}
		if(h==0) {
			System.out.println("They are equal matrices");
		}
		 else {
		    	System.out.println("They are not equal matrices");
		    }
	}
	    else {
	    	System.out.println("They are not equal matrices");
	    }
	}
	

}
