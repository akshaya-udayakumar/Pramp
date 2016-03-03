
public class MatrixSpiralPrint {
	public static void mSPrint(int[][] M) {
		int row = M.length;
		int col = M[0].length;
		
		int top = 0;
		int bottom = row - 1;
		int left = 0;
		int right = col - 1;
		
		
		while (top < bottom) {
			
			for (int i = left; i <= right; i++) {
				System.out.print(M[top][i] + " ");
			}
			top++;
			
			for (int i = top; i <= bottom; i++) {
				System.out.print(M[i][right] + " ");
			}
			right--;
			
			for (int i = right; i >= left; i--) {
				System.out.print(M[bottom][i] + " ");
			}
			bottom--;
			
			for (int i = bottom; i >= top; i--) {
				System.out.print(M[i][left] + " ");
			}
			left++;
			
		}
	}
	
	
	public static void main(String[] args) {
		int[][] M = new int[4][5];
		int n = 1;
		
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 5; j++) {
				M[i][j] = n++;
			}
		}
		
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 5; j++) {
				if (M[i][j] < 10) {
					System.out.print(" " + M[i][j] + " ");
				} else {
					System.out.print(M[i][j] + " ");
				}
			}
			System.out.println();
		}
		
		System.out.println();
		mSPrint(M);
	}

}