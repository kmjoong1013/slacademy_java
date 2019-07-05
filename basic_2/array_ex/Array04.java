package array_ex;

public class Array04 {

	public static void main(String[] args) {
		int arr[][] = new int [3][4];
		
		for (int i = 0; i < arr.length; i++) {// arr.length 줄의 수
			for (int j = 0; j < arr[i].length; j++) {// arr[i].length 칸의수 
			System.out.print(" a["+i+"]["+j+"]="+arr[i][j]);
			
			
			}System.out.println();
		}
	}
}
