package dasturlash_uz_problems;

public class Yigindi {
    public static void main(String[] args) {
        System.out.println(yigindi(158));
    }
    public static int yigindi(int a){
        int r1=0,b;
        while(a>0){
            b=a%10;
            r1+=b;
            a/=10;
        }
        return r1;
    }
}