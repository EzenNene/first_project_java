package test.ch05;

public class ArrayMulti_EX {

	public static void main(String[] args) {
//		int[] scores = {10,90,10};
		
		int[][] scores = { {80,90,96},{76,88} };
		
		int [][] mathScores = new int [2][3];
		
		for (int i =0; i < mathScores.length; i++) {
			for(int k=0; k<mathScores[i].length; k++) {
				System.out.println("수학점수: " + mathScores[i][k]);
			}
		}

		mathScores[0][0]
				mathScores[0][0]
						mathScores[0][0]
		
		
		System.out.println("1차원 배열 길이 (반의 수)" + scores.length);
		System.out.println("2차원 배열 길이 (첫번째 반의 학생 수)" + scores[0].length);
		System.out.println("2차원 배열 길이 (두번째 반의 학생 수)" + scores[1].length);
		
		System.out.println("첫번째 반의 세번째 학생:" + scores[0][2]);
		System.out.println("첫번째 반의 세번째 학생:" + scores[1][1]);
		
		// 첫번째 반의 평균점수
		
		int class1Sum = 0;
		
		for (int i =0; i<scores[0].length; i++) {
			class1Sum += scores[0][i];
		}
		
		double class1Avg = (double) class1Sum/scores[0].length;
		System.out.println("첫번째 반의 평균: " + class1Avg);
		
		// 두번째 반의 평균점수
		
		int class2Sum = 0;
		
		for (int i =0; i<scores[1].length; i++) {
			class2Sum += scores[1][i];
		}
		
		double class2Avg = (double) class2Sum/scores[1].length;
		System.out.println("두번째 반의 평균: " + class2Avg);
		
		
//		int[][] scores = {
//				{80,90,96},
//				{76,88}
//		};
		
		// 전체 학생의 평균 점수
		
		int totalStudent = 0;
		int totalSum = 0;
		
		for (int i=0; i<scores.length; i++) {
			totalStudent += scores[i].length; // 학생 수
			for (int j=0; j<scores[i].length; j++) {
				totalSum += scores[i][j]; // 점수 합산
			}
			
			
		}
		
		double totalAvg = (double) totalSum / totalStudent;
		System.out.println("전체학생평균"  + totalAvg);
		
		
		
		
		
		
		
		
		
		
	}

}
