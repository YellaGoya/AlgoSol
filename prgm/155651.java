import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Solution {
    public int solution(String[][] book_time) {
        int[][] book_int = new int[book_time.length][2]; 
        // 예약 시각을 int 값으로 변환 하여 저장 할 2차원 배열
        
        List<Integer> book_list = new ArrayList<Integer>();
        book_list.add(-10);
        // 각 호실의 마지막 예약 시간대를 저장하는 리스트
        // 객실이 늘어날지 그대로 일지 모르기에 유동적으로
        
        // -10 을 add 하여 첫 번째 값 부터 비교 가능하게

        for (int i = 0; i < book_time.length; i++) {
            book_int[i][0] = Integer.parseInt(book_time[i][0].substring(0, 2)) * 100
                    + Integer.parseInt(book_time[i][0].substring(3, 5));
            book_int[i][1] = Integer.parseInt(book_time[i][1].substring(0, 2)) * 100
                    + Integer.parseInt(book_time[i][1].substring(3, 5));
        }
        // '시간:분'을 substring으로 잘라 int 값으로 parse "11:40" > 1140 으로 변환하여 저장
        // [i][0]은 입실 시각, [1][0]은 퇴실 시각

        Arrays.sort(book_int, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] != o2[0] ? o1[0] - o2[0] : o2[1] - o1[1];
                // 입실 시각을 기준으로 오름차 순으로 정렬 후
                // 오래 대실하는 예약을 먼저 넣을 수록 비는 시간을 줄일 수 있음
                // 퇴실 시각을 기준으로 내림차 순으로 정렬
            }
        });
        // 2차원 배열에 대한 새로운 정렬 기준을 @Override 하여 정렬

        for (int[] time : book_int) {
            boolean flag = true;
            // 존재하는 호실 중 예약이 가능한지 확인하는 flag
            
            for (int i = 0; i < book_list.size(); i++) {
                // 기존의 객실, i = 0 인 객실에 가까울 수록 이른 시간대
                // 추가된 객실, i = n 인 객실에 가까울 수록 늦은 시간대
                
                int gap;
                if (time[0] / 100 > book_list.get(i) / 100)
                    gap = time[0] - book_list.get(i) - 40;
                else
                    gap = time[0] - book_list.get(i);
                // 시간을 정수로 나타 내었기에 십의 자리 범위 100과
                // 분의 범위 60 사이의 차이를 없애기 위한 if 문
                
                // 18:03 - 17:58 은 5분 차이라 청소할 시간이 없지만
                // 정수로 나타내었을 때는 1803 - 1758 = 45
                
                if (gap >= 10) {
                    book_list.set(i, time[1]);
                    flag = false;
                    break;
                }
                // 입실 시각과 대실 시각 사이에 10분의 여유가 있다면
                // 해당 객실에 예약
            }
            if (flag)
                book_list.add(time[1]);
            // 어떤 객실에도 예약되지 못 할 경우 새로운 객실에 예약
        }

        return book_list.size();
        // 각 객실의 마지막 예약 시간 리스트의 size를 반환 = 총 객실
    }
}