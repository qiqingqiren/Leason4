import java.util.Scanner;

public class test{
    public static void main(String[] args){
        // Scanner in_put=new Scanner(System.in);
        // System.out.println("请输入a：");
        // int a_in=in_put.nextInt();
        // System.out.println("请输入b:");
        // int b_in=in_put.nextInt();

        int a=shuru_a();
        int b=shuru_b();
       // int d=hanshu1(a,b);
        boolean jieguo=bijiao(a,b);
        System.out.println(jieguo);}
 
    public static boolean bijiao(int a,int b){
        if(a==b){
        return true;}
        else{return false;}
    }
    

    public static int hanshu1(int a , int b) {
        int c=a>b?a:b;
        return c;
        }
    public static int shuru_a(){
        Scanner in_put_1=new Scanner(System.in);
        System.out.println("请输入a：");
        int a_in=in_put_1.nextInt();

        return a_in;
    }
    private static int shuru_b() {
        Scanner in_put_2=new Scanner(System.in);
        System.out.println("请输入b:");
        int b_in=in_put_2.nextInt();
        return b_in;

    }
    
}