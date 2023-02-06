import java.util.Scanner;
import java.io.FileInputStream;

class Solution
{
    public static int check(int nine[]){
        for(int i = 0; i < 9; i++){
            for(int j = i + 1; j < 9; j++){
                if(nine[i] == nine[j]){
                    return 0;
                }
            }
        }
        return 1;
    }
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
        
		for(int test_case = 1; test_case <= T; test_case++)
		{
            int arr[][] = new int[9][9];
            for(int i = 0; i < 9; i++){
                for(int j = 0; j < 9; j++){
                    arr[i][j] = sc.nextInt();
                } 
            }
            
            int res = 1;
            int temp[] = new int[9];
            for(int i = 0; i < 9; i++){
                temp = arr[i];
                res = res * check(temp);
            }
            
            temp = new int[9];
            for(int i = 0; i < 9; i++){
                for(int j = 0; j < 9; j++){
                    temp[j] = arr[j][i];
                }
                res = res * check(temp);
            }
            for(int i = 0; i < 3; i++){
                for(int j = 0; j < 3; j++){
                    int count = 0;
                    for(int k = 0; k < 3; k++){
                		for(int l = 0; l < 3; l++){
                            temp[count++] = arr[i*3+k][j*3+l];
                        }
                    }
                    res = res * check(temp);
                }
            }                
            System.out.println("#" + test_case + " " + res);
		}
	}
}