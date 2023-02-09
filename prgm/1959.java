import java.util.Scanner;
import java.io.FileInputStream;

class Solution
{
    public static int sum(int a[], int b[], int range){
        int res = 0;
        for(int i = 0; i < range; i++){
            int temp = 0;
            for(int j = 0; j < b.length; j++){
                temp += a[j+i] * b[j];
            }
            if(res < temp){
                res = temp;
            }
        }
        return res;
    }
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++)
		{
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[] a = new int[n];
            int[] b = new int[m];
            for(int i = 0; i < n; i++){
                a[i] = sc.nextInt();
            }
            for(int i = 0; i < m; i++){
                b[i] = sc.nextInt();
            }
            
            int res;
            if(n > m){
                res = sum(a, b, n - m + 1);
            } else {
                res = sum(b, a, m - n + 1);
            }
            System.out.println("#" + test_case + " " + res);
		}
	}
}