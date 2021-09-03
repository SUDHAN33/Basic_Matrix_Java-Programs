package matrix.com;
import java.util.*;
public class IdentityMatrix {

	public static void main(String[] args) {
      Scanner input=new Scanner(System.in);
      int r=input.nextInt();
  	int c=input.nextInt();
  	int a[][]=new int[r][c];
  	if(r==c) {
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
  	 int d=0,e=0;
  	 for(int i=0;i<r;i++) {
       	for(int j=0;j<c;j++) {
       	if(a[i][j]==1 && a[j][i]==1) {
       		d++;
       	}
       	if(a[i][j]==0) {
       		e++;
       	}
       	}
       }
  	 if(d-r==0 && e-(r-1)*r==0) {
  		 System.out.println("It is identity matrix");
  	 }
  	 else {
  		System.out.println("It is not identity matrix");
  	 }
	}
  	else {
  		System.out.println("It is not square matrix");
  	}
	}
    
}
