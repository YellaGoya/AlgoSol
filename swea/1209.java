import java.util.Scanner;
import java.io.FileInputStream;
class Solution{
	public static void main(String args[]) throws Exception{
        Scanner sc = new Scanner(System.in);
		for(int t=1;t<=10;t++){
            sc.nextInt();
            int arr[][]=new int[100][100];
            for(int j=0;j<100;j++){
                for(int k=0;k<100;k++){
                    arr[j][k]=sc.nextInt();
                }
            }
            int res=0;
            int tmp;
            for(int j=0;j<100;j++){
                tmp=0;
                for(int k=0;k<100;k++){
                    tmp+=arr[j][k];
                }
                if(res < tmp){res = tmp;}
                tmp=0;
                for(int k=0;k<100;k++){
                    tmp+=arr[k][j];
                }
                if(res < tmp){res = tmp;}
            }
            tmp=0;
            for(int j=0;j<100;j++){
                tmp += arr[j][j];
            }
            if(res < tmp){res = tmp;}
            tmp=0;
            for(int j=0;j<100;j++){
                tmp += arr[99-j][j];
            }
            if(res < tmp){res = tmp;}
            System.out.println("#"+t+" "+res);
        }
	}
}