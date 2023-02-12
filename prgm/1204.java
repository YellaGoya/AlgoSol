import java.util.Scanner;
import java.io.FileInputStream;
class Solution{
	public static void main(String args[]) throws Exception{
		Scanner sc=new Scanner(System.in);
		int T,tmp;
		T=sc.nextInt();
		for(int test_case=1;test_case<=T;test_case++){
            test_case=sc.nextInt();
            int[] scs=new int[101];
            for(int i=0;i<1000;i++){
                tmp=sc.nextInt();
                scs[tmp]+=1;
            }
            tmp=0;
            int res=0;
            for(int i=0;i<101;i++){
                if(scs[i]>=tmp){
                    tmp = scs[i];
                    res=i;
                }
            }
            System.out.println("#"+test_case+" "+res);
        }
	}
}