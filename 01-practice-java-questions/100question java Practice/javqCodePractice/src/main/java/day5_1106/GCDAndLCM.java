package day5_1106;
//GCD(a, b) = GCD(b, a % b)(Ecuadorian algorithm)
public class GCDAndLCM {
    public static void main(String[] args) {
        System.out.println(findGCd(48,18));

    }
    private static int findGCd(int a , int b){

        if (b==0){
            return a;
        }
       return findGCd(b,a%b);


    }

}
