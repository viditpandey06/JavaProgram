public class findingMazePath {
    public static void main(String[] args) {
        String s="";
        mazeIteration(s, 3, 3);
        System.out.println(s);
    }

    public static void mazeIteration(String s, int r, int c) {

        if (r == 1 && c == 1) {
           System.out.println(s);
            return;
        } 
        else 
        {
            if (r > 1) {
                mazeIteration(s + "D", r-1, c );
            }
             if (c > 1) {
                mazeIteration(s + "R", r, c-1);
            } 
        }
    }
}
