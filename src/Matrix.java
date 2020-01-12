
public class Matrix {

	static void findElement(int[][] matrix, int element, int rows, int cols) {
		int i, j;
		boolean exists = false;
		for (i = 0; i < rows; i++) {
			for (j = 0; j < cols; j++) {
				if (matrix[i][j] == element) {
					System.out.println("found element " + element + " at column " + (i + 1) + " row " + (j + 1));
					exists = true;

				}
			}

		}
		if (exists == false) {
			System.out.println("element " + element + " was not found in the matrix");
			return;
		}

	}

	public static void main(String[] args) {
		int searchMatrix[][] = { { 4, 5, 8 },
								 { 3, 9, 11 },
								 { 7, 3, 6 }, };

		findElement(searchMatrix, 1, 3, 3);
	}
}
	


