import java.util.Scanner;
import java.io.FileInputStream;

class Solution {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
        sc.nextLine();
        
		for(int test_case = 1; test_case <= T; test_case++) {
			String bits = sc.nextLine();
            char tmp = '0';
            int count = 0;
            for(int i = 0; i < bits.length(); i++){
                if(bits.charAt(i) != tmp){
                    tmp = bits.charAt(i);
                    count++;
                }
            }
            System.out.println("#"+test_case+" "+count);
		}
	}
}