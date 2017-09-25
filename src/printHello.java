import java.util.*;
public class printHello {
    public static void main(String arg[]){
        Scanner in=new Scanner(System.in);
        int a,b,c,x,y;
        System.out.print("a:");
        a=in.nextInt();
        System.out.print("b:");
        b=in.nextInt();
        System.out.print("c:");
        c=in.nextInt();
        System.out.print("x");
        x=in.nextInt();
        y=a*x*x+b*x+c;
        System.out.printf("y=%d",y);
    }
}
