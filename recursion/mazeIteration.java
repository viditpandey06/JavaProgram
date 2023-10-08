public class mazeIteration {
    public static void main(String[] args) {
        System.out.println(nunberOfWays(2,2));
    }
    public static int nunberOfWays(int r, int c){
        if(r==1||c==1){
            return 1;
        }
        else{
            return nunberOfWays(r-1, c) + nunberOfWays(r, c-1);
        }
    }
}
