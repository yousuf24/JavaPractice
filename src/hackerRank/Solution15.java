package hackerRank;

public class Solution15 {

	public static void main(String[] args) {
		int[][] matrix= {
				{1, 1, 1,0 ,0, 0},
				{0 ,1, 0, 0 ,0 ,0},
				{1 ,1, 1, 0, 0, 0},
				{0, 9 ,2, -4 ,-4, 0},
				{0 ,0, 0 ,-2 ,0 ,0},
				{0, 0 ,-1, -2 ,-4, 0}};
		int m=matrix.length,n=matrix[0].length,sum=0,gsum=0;
		int row=0,col=0;
		
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				sum = 0;
				for (int index1 = i; index1 <= i + 2 && index1 < m; index1++) {
					for (int index2 = j; index2 <= j + 2 && index2 < n; index2++) {
						if (index1 != i + 1)
							sum += matrix[index1][index2];
						else {
							if (index2 == j + 1)
								sum += matrix[index1][index2];
						}
					}

				}
				gsum = Math.max(sum, gsum);

			}
		}System.out.println(gsum);

	}

}
