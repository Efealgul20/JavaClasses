package JavaReviews;

public class HomeWork88 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a = {
                { -5, -2, -3, 7 },
                { 1, -5, -2, 2 },
                { 1, -2, 3, -4 }
                };int column = 1;
        int[][] array;
         for (int i = 0; i < a.length; i++) {
	            for (int j = 0; j < a[i].length; j++) {
//	              if (j != 1 && (i != 1 && i != 3)) {
	                    System.out.print(a[i][j] + " ");
	            }
	            System.out.println();
	        }
	    }
	}