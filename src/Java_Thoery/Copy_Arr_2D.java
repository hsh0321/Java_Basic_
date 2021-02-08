package Java_Thoery;

public class Copy_Arr_2D {

	public static void main(String[] args) {
		
		//	1차원 배열의 깊은 복사의 경우 위에서 소개한 메서드를 사용하면 쉽게 복사가 가능합니다. 
		//	하지만 2차원 배열의 경우 위의 메서드를 활용해도 깊은 복사가 되지 않습니다.
		
		int arr1[][] = { { 1, 2, 3 }, { 4, 5, 6, }, { 7, 8, 9 } };
		int[][] arr2 = new int[arr1.length][arr1[0].length];

		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[i].length; j++) {
				arr2[i][j] = arr1[i][j];
			}
		}
		
		//	2차원 객체 배열의 복사를 할 경우 arraycopy나 clone을 이용해서 복사할 수가 없습니다. 
		//	그렇기에 이중 포문을 복사하시려면 이중 for문을 돌면서 값을 일일이 옮겨주셔야 합니다.
		
        int a[][] = {{1,2,3},{4,5,6,},{7,8,9}};
        int b[][] = new int[a.length][a[0].length];
	    
        for(int i=0; i<b.length; i++){
            System.arraycopy(a[i], 0, b[i], 0, a[0].length);
        }
        
        //	이중 for문이 싫으시다면 for문을 돌려 System.arraycopy 메서드를 이용해 2차원 배열을 복사할 수 있습니다. 
        //	1차원 배열을 2차원 배열의 row 길이만큼 복사합니다.
	}

}
