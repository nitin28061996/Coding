package ArraysAndStrings;

public class SetMatrixZeroes {
//	 HashSet<Integer> rows=new HashSet<Integer>();
//	 HashSet<Integer> cols=new HashSet<Integer>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//M x N matrix
		int[][] matrix=new int[][]{{1,2,3},{4,0,6},{7,8,9}};
		SetMatrixZeroes s=new SetMatrixZeroes();
//		for(int i=0;i<matrix.length;i++){
//			for(int j=0;j<matrix[i].length;j++){
//				if(matrix[i][j]==0){
//					s.rows.add(i);
//					s.cols.add(j);
//				}
//			}
//		}
//		s.makeZeroes(matrix,s.rows,s.cols);
//		s.print(matrix,3,3);
		
		Boolean isCol=false;
		int R=matrix.length;
		int C=matrix[0].length;
		for(int i=0;i<R;i++){
			if(matrix[0][0]==0)isCol=true;
			for(int j=1;j<C;j++){
				if(matrix[i][j]==0){
					matrix[0][j]=0;
					matrix[i][0]=0;
				}
			}
		}
		
		for(int i=1;i<R;i++){
			for(int j=1;j<C;j++){
				if(matrix[0][j]==0 || matrix[i][0]==0){
					matrix[i][j]=0;
				}
			}
		}
		
		if(matrix[0][0]==0){
			for(int i=0;i<C;i++){
				matrix[0][i]=0;
			}
		}
		if (isCol) {
		      for (int i = 0; i < R; i++) {
		        matrix[i][0] = 0;
		      }
		    }
		
		s.print(matrix,3,3);
	}
	

	 void print(int matrix[][],int rows,int columns){
		for(int i=0;i<rows;i++){
			for(int j=0;j<columns;j++){
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
	}
}
//	 int[][] makeZeroes(int[][] matrix,HashSet<Integer> rows, HashSet<Integer> cols){
//		
//		for(int i=0;i<matrix.length;i++){
//			for(int j=0;j<matrix[i].length;j++){
//				if(rows.contains(i) || cols.contains(j)){
//					matrix[i][j]=0;
//				}	
//				
//			}
//		}
//		return matrix;
//	}
//}
