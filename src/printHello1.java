public class printHello1 {
    public static void main(String[]args){
        java.util.Scanner sc =new java.util.Scanner(System.in);

        double a,b,c;

        System.out.print("a:");
        a=sc.nextDouble();
        System.out.print("b:");
        b=sc.nextDouble();
        System.out.print("c:");
        c=sc.nextDouble();

        double Sum=(a+b+c);
        double adv=(a+b+c)/3;

        System.out.println(Sum +""+ adv);


    }
}

