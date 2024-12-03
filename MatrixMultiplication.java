import java.util.Scanner;

public class MatrixMultiplication {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        
        System.out.println("Enter the number of rows in matrix 1: ");
        int mat1_rows = key.nextInt();
        
        System.out.println("Enter the number of columns in matrix 1: ");
        int mat1_cols = key.nextInt();
        
        System.out.println("Enter the number of rows in matrix 2: ");
        int mat2_rows = key.nextInt();
        
        if (mat1_cols != mat2_rows) {
            System.out.println("Dimension mismatch! Cannot multiply these matrices!");
            System.exit(0);
        }
        
        System.out.println("Enter the number of columns in matrix 2: ");
        int mat2_cols = key.nextInt();
        
        // Create two matrices
        int[][] matrix1 = new int[mat1_rows][mat1_cols];
        int[][] matrix2 = new int[mat2_rows][mat2_cols];
        
        // Input for the first matrix
        for (int i = 0; i < mat1_rows; i++) 
        {
            for (int j = 0; j < mat1_cols; j++) 
            {
                System.out.println("Enter the value for matrix1 at position (" + i + ", " + j + "): ");
                matrix1[i][j] = key.nextInt();
            }
        }

        // Input for the second matrix
        for (int i = 0; i < mat2_rows; i++) 
        {
            for (int j = 0; j < mat2_cols; j++) 
            {
                System.out.println("Enter the value for matrix2 at position (" + i + ", " + j + "): ");
                matrix2[i][j] = key.nextInt();
            }
        }

        // Matrix multiplication
        int[][] productMatrix = new int[mat1_rows][mat2_cols];
        
        for (int i = 0; i < mat1_rows; i++) 
        {
            for (int j = 0; j < mat2_cols; j++) 
            {
                int sum = 0;
                for (int k = 0; k < mat1_cols; k++) 
                {
                    sum += matrix1[i][k] * matrix2[k][j];
                }
                productMatrix[i][j] = sum;
            }
        }

        // Print the product matrix
        System.out.println("Product of the matrices:");
        for (int i = 0; i < mat1_rows; i++) 
        {
            for (int j = 0; j < mat2_cols; j++) 
            {
                System.out.print(productMatrix[i][j] + " ");
            }
            System.out.println();
        }
        
        
        key.close();
        
        //print the product matrix
        for(int i=0; i< mat1_rows; i++)
        {
        	for(int j=0; j<mat2_cols; j++)
        	{
        		System.out.print(productMatrix[i][j]+" ");     
        	}
        	System.out.println();
        }
    }
}




	
	
	
	
	
	
	
	
