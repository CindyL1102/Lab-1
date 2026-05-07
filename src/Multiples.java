public class Multiples {
    public static void main(){
        System.out.println(count(1000));
    }
    private static int count(int limit){
        int count = 0;
        for (int i = 1; i < 1000; i++){
            if (i%3 == 0 || i%5 == 0){
                count++;
            }
        }
        return count;
    }
}
