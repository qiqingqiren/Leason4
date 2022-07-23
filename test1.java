import java.util.Scanner;

public class test1 {
    public static void main(String[] args){
        int i=0,q=0;
        int sum=0;
        Scanner in=new Scanner(System.in);
        int in_a=in.nextInt();
        int in_b=in.nextInt();
        if(in_a<in_b){i=in_a;q=in_b;}
        if(in_a>=in_b){i=in_b;q=in_a;}
        
        while(i<=q){
            sum+=i;
            i++;
        }
        System.out.println(sum);
    }
}
