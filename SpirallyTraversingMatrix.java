package matrix.com;
import java.util.*;
public class SpirallyTraversingMatrix {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int r= sc.nextInt();
		int c = sc.nextInt();
		int matrix[][] = new int[r][c];
		for(int i=0;i<r;i++) {
			for(int j=0;i<c;j++) {
				matrix[i][j] = sc.nextInt();
			}
		}
		ArrayList<Integer> a  = new ArrayList<>();
        int k = 0, l=0;
        while(k<r && l<c){
      for(int i=l;i<c;i++){
          a.add(matrix[k][i]);
      }
      k++;
      for(int i=k;i<r;i++){
          a.add(matrix[i][c-1]);
      }
      c--;
      if(k<r){
      for(int i=c-1;i>=l;i--){
           a.add(matrix[r-1][i]);
      }
      r--;
      }
      if(l<c){
      for(int i=r-1;i>=k;i--){
          a.add(matrix[i][l]);
      }
      l++;
      }
        }
       System.out.println(a);

	}

}
