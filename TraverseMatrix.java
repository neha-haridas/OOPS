import java.util.*;

class TraverseMatrix{
	
	public static void main(String args[]){
		
		int row, col;
		Scanner sc= new Scanner(System.in);
		boolean isSymmetic= true;
		
		System.out.print("Enter the number of rows for the Matrices : ");
		row= sc.nextInt();
		System.out.print("Enter the number of columns for the Matrices : ");
		col= sc.nextInt();
		
		int[][] matrix= new int[row][col];
		
		System.out.println("Enter the elements for the Matrix : ");
		for(int i=0;i<row;i++){
			for(int j=0;j<col;j++){
				matrix[i][j]= sc.nextInt();
			}
		}
		System.out.println("\n");
		
		System.out.println("The matrix traversal is : ");
		for(int i=0;i<row;i++){
			for(int j=0;j<col;j++){
				System.out.print(matrix[i][j]+"   ");
			}
			System.out.println("\n");
		}
	}
}
