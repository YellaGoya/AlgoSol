import java.util.Scanner;
import java.io.FileInputStream;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++)
		{
            System.out.println("#"+test_case);
            int n = sc.nextInt();
            int[][] arr = new int[n][n];
            for(int i = 0; i < n; i++){
                for(int j = 0; j < n; j++){
                    arr[i][j] = sc.nextInt();
                }
            }
            for(int i = 0; i < n; i++){
                for(int j = 0; j < n; j++){
                    System.out.print(arr[n-j-1][i]);
                }
                System.out.print(" ");
                for(int j = n-1; j>-1; j--){
                    System.out.print(arr[n-i-1][j]);
                }
                System.out.print(" ");
                for(int j = 0; j<n; j++){
                    System.out.print(arr[j][n-i-1]);
                }
                System.out.print(" \n");
            }
		}
	}
}