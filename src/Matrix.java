
public class Matrix {

	static void findElement(int element, int rows, int cols) {
		int x = element % cols;
		int y = (element / cols) + 1;
		int matrix = cols * rows;

		if (x == 0) {
			x = cols;
			y = y - 1;
		}

		if (element > matrix) {
			System.out.println("element is outside the matrix");

		} else {
			System.out.print("column  " + x + "  row " + y);
		}
	}

	public static void main(String[] args) {

		findElement(10, 3, 3);
	}
}
