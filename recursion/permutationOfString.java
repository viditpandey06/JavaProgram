import java.util.*;

public class permutationOfString{
    public static void main(String[] args) {
        System.out.println(generate("ab",""));
    }
    public static List<String> generate(String s1, String s2){
        if(s1.isEmpty()){
           List<String> aList1 = new ArrayList<>();
           aList1.add(s2+"");
           return aList1;
        }
         List<String> aList1 = new ArrayList<>();
         List<String> aList2 = new ArrayList<>();
         char ch = s1.charAt(0);
        
           
       aList1= generate(s1.substring(1), s2);
       aList2= generate(s1.substring(1), s2=s2+ch);
           
        aList1.addAll(aList2);
        return aList1;
    }
}