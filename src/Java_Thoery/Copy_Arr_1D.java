package Java_Thoery;

import java.util.Arrays;

public class Copy_Arr_1D {

	public static void main(String[] args) {
		//	배열 복사의 잘못된 예 (얕은 복사)
		
		int[] arr1 = { 1, 2, 3, 4 };
        int[] arr2 = arr1;
        
		//	= 연산자는 주소를 이어준다는 의미입니다. 
		//	해당 코드로 a의 배열을 b배열로 = 연산자를 활용하여 대입하면 깊은 복사가 되지 않고 얕은 복사가 됩니다. 
		//	그렇기에 b배열의 값을 수정하여도 a배열까지 같이 수정되어버리는 상황이 나옵니다. 이렇게 되면 사실상 배열을 복사하는 의미가 없습니다.
        
        
        //	배열 복사의 올바른 예 (깊은 복사)
        
        int[] arr3 = { 1, 2, 3, 4 };
        int[] arr4 = new int[arr3.length]; 
        for (int i = 0; i < arr3.length; i++) {
            arr4[i] = arr3[i];
        }
        
        int[] arr5 = { 1, 2, 3, 4 };
        int[] arr6 = arr5.clone();
        
        // Array.clone()을 사용하면 배열을 쉽게 복사할 수 있습니다. (깊은 복사) 가장 보편적인 방법입니다.
        
        int[] arr7 = { 1, 2, 3, 4 };
        int[] arr8 = Arrays.copyOf(arr7, arr7.length);
        
        //	Arrays클래스는 배열을 조작할 수 있는 메소드를 가진 클래스입니다. 
        //	이 클래스 안에 있는 Arrays.copyOf()를 사용하면 배열의 시작점 ~ 원하는 length까지 배열의 깊은 복사를 할 수 있습니다.
        
        int[] arr9 = { 1, 2, 3, 4 };
        int[] arr10 = Arrays.copyOfRange(arr9, 1, 3);
        
        //	Arrays.copyOf()는 배열의 처음~지정한 length까지 복사하는 메서드였다면 
        //	Arrays.copyOfRange() 메서드는 복사할 배열의 시작점도 지정할 수 있습니다.
        
        int[] arr11 = { 1, 2, 3, 4 };
        int[] arr12 = new int[arr11.length];
        System.arraycopy(arr11, 0, arr12, 0, arr11.length);
        
        //	System.arraycopy() 메서드는 지정된 배열을 대상 배열의 지정된 위치에 복사합니다.
     
	}

}
