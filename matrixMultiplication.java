import java.util.Scanner;

public class matrixMultiplication{
    Scanner s=new Scanner(System.in);
    public void Display(int [][] arr,int row,int col){
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }

    }

    public int[][] input(int row,int col){
        int[][] arr=new int[row][col];
        System.out.println("Enter the elements of matrix");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr[i][j]=s.nextInt();
            }
        }
        return arr;
    }

    public int[][] multiplication(int row, int col,int[][] arr1,int[][] arr2){
        int[][] arr3=new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                for(int k=0;k<col;k++){
                    arr3[i][j]+=arr1[i][k]*arr2[k][j];
                }
            }
        }
        return arr3;
    }


    public static void main(String[] args){
        int row1,col1,row2,col2;
        matrixMultiplication obj=new matrixMultiplication();
        System.out.println("Enter the number of rows and columns of matrix 1");
        row1=obj.s.nextInt();
        col1=obj.s.nextInt();
        System.out.println("Enter the number of rows and columns of matrix 2");
        row2=obj.s.nextInt();
        col2=obj.s.nextInt();
        if(col1!=row2 && row1!=col2){
            System.out.println("Multiplication not possible");
        }
        else{
            int[][] arr1=obj.input(row1,col1);
            int[][] arr2=obj.input(row2,col2);
            while(true){
                System.out.println("1.Display\n2.Multiply\n3.Exit");
                int ch=obj.s.nextInt();
                switch(ch){
                    case 1:
                        System.out.println("Matrix 1");
                        System.out.println("**********");
                        obj.Display(arr1,row1,col1);
                        System.out.println("**********");
                        System.out.println("Matrix 2");
                        System.out.println("**********");
                        obj.Display(arr2,row2,col2);
                        break;
                    case 2:
                        int[][] arr3=obj.multiplication(row1,col1,arr1,arr2);
                        obj.Display(arr3,row1,col2);
                        break;
                    case 3:
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Invalid choice");
                }
            }
        }

    }

}