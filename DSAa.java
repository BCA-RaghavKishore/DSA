import java.util.HashMap;
import java.util.Map;
public class DSAa {
    public static void main(String[] args) {
        Map<Integer, Integer> marks = new HashMap<>();

        marks.put(101,85);
        marks.put(102,92);
        marks.put(103,78);

        int studentId = 104;
        
        if (marks.containsKey(studentId)){
            System.out.println(
                "Marks: "+ marks.get(studentId)
            );
        } else {
            System.out.println("Student not found");
        }
    }
    
}
