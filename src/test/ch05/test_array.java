package test.ch05;

public class test_array {

	public static void main(String[] args) {

		
//		1: 4 
//		2: 3 
//		3: 2 
//		4: 2 
//		5: 3
//
//		6: 3,5

//		int[][] array = {
//				{95,86},
//				{83,92,96},
//				{78,83,93,97,88}
//		};
//		
//		System.out.println(array.length);
//		System.out.println(array[2].length);
		
//		7
		
//		int[] arr = {10,20,30,40,50};
//		int sum = 0;
//		
//		for (int i = 0; i<arr.length; i++) {
//			sum += arr[i];
//		}
//		
//		System.out.println(sum);
		
//		8
		
//		int[]array= {1,5,3,8,2};
//		int max = array[0];
//		
//		for (int i=0; i<array.length; i++) {
//			if(max < array[i]) {
//				max = array[i];
//			} 
//		}
//		
//		System.out.println(max);
		
//		9
		
//		int [][]array = {{95,86},{83,92,96},{78,83,93,87,88}};
//		int sum = 0;
//		int sum2 = 0;
//		double avg = 0;
//		
//		
//		for (int i=0; i<array.length; i++) {
//			sum2 += array[i].length;
//			for(int j=0; j < array[i].length; j++) {
//				sum += array[i][j];
//				avg = (double) sum / sum2;
//			}
//		}
//		
//		
//		System.out.println(sum);
//		System.out.println(avg);
		
//		10
		

	
				int[]ballArr = {1,2,3,4,5,6,7,8,9};
				int[]ball3 = new int [3];
				
				for (int i = 0; i < ballArr.length; i++) {
					int j = (int)(Math.random()*ballArr.length);
					int tmp = 0;
					
					tmp = ballArr[i];
					ballArr[i] = ballArr[j];
					ballArr[j] = tmp;
					
				}
				
//				ball3[0]=ballArr[0];
//				ball3[1]=ballArr[1];
//				ball3[2]=ballArr[2];
				
				System.arraycopy(ballArr, 0, ball3, 0, 3);
				
				for (int i = 0; i<ball3.length; i++) {
					System.out.println(ball3[i]);
				}
				
				
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
