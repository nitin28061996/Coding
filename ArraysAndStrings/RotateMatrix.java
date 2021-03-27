package ArraysAndStrings;

public class RotateMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix=new int[][]{{1,2,3},{4,5,6},{7,8,9}};
		print(matrix,3,3);
		matrix=transpose(matrix);
		System.out.println("After Transpose");
	print(matrix,3,3);
	matrix=reverse(matrix);
	System.out.println("After Reverse");
	print(matrix,3,3);
	}
	static void print(int matrix[][],int rows,int columns){
		for(int i=0;i<rows;i++){
			for(int j=0;j<columns;j++){
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
	}
	static int[][] transpose(int matrix[][]){
		for(int i=0;i<matrix.length;i++){
			for(int j=i;j<matrix[i].length;j++){
							
				int temp=matrix[i][j];
				matrix[i][j]=matrix[j][i];
				matrix[j][i]=temp;
				
				
			}
			
		}
		return matrix;
	}
	static int[][] reverse(int matrix[][]){
		int n=matrix.length;
		for(int i=0;i<matrix.length;i++){
			for(int j=0;j<matrix[i].length/2;j++){
							
				int temp=matrix[i][j];
				matrix[i][j]=matrix[i][n-1-j];
				matrix[i][n-1-j]=temp;
				
				
			}
			
			
		}
		return matrix;
	}

}
