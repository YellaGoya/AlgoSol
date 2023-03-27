import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    static StringBuilder sb;
    static Map<String, String> users = new HashMap<>();
    static List<Log> logs = new ArrayList<>();
    
    public String[] solution(String[] record) {
        int len = record.length;
        for (int i = 0; i < len; i++) {
            String[] elements = record[i].split(" ");
            
            switch (elements[0]) {
                case "Leave":
                    logs.add(new Log(false, elements[1]));
                    break;
                case "Enter":
                    logs.add(new Log(true, elements[1]));
                case "Change":
                    users.put(elements[1], elements[2]);
                    break;
            }
        }
        String[] res = new String[logs.size()];

        len = res.length;
        for (int i = 0; i < len; i++) {
            sb = new StringBuilder();
            Log temp = logs.get(i);

            sb.append(users.get(temp.id));
            if (temp.iao)
                sb.append("님이 들어왔습니다.");
            else
                sb.append("님이 나갔습니다.");

            res[i] = sb.toString();
        }

        return res;
    }
}

class Log {
    boolean iao;
    String id;

    public Log(boolean iao, String id) {
        this.iao = iao;
        this.id = id;
    }
}