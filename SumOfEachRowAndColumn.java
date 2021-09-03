package matrix.com;
import java.util.*;
public class SumOfEachRowAndColumn {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int r=input.nextInt();
		int c=input.nextInt();
		int a[][]=new int[r][c];
		int sr[]=new int[r];
		int sc[]=new int[c];
        for(int i=0;i<r;i++) {
        	for(int j=0;j<c;j++) {
        		a[i][j]=input.nextInt();
        	}
        }
        
	 for(int i=0;i<r;i++) {
    	for(int j=0;j<c;j++) {
    		sr[i] +=a[i][j];
    	}
      }
	 for(int i=0;i<r;i++) {
	    	for(int j=0;j<c;j++) {
	    		sc[i] +=a[j][i];
	    	}
	      }
	 for(int i=0;i<r;i++) {
		System.out.print(sr[i]+" "); 
	 }
	 System.out.println("");
	 for(int i=0;i<r;i++) {
			System.out.print(sc[i]+" "); 
		 }
	}

}
