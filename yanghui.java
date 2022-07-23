import java.io.IOException;

public class yanghui {
    public static void main(String[] args) throws IOException{
        System.out.println("输入需要的层数");
        int a=System.in.read()-48;
        //System.out.println(a);
        hanshu(a);

    }
    public static void hanshu(int a){
        int rows=a+1;
        //System.out.println(rows);
        int[][] arr=new int[100][100];
        for(int i=0;i<100;i++){
            for(int j=0;j<100;j++){
                arr[i][j]=1;
            }
        }
        for(int i=1;i<rows;i++){
            for(int q=0;q<rows-i;q++){
            System.out.print("  ");
            }
            System.out.printf("%4d",1);
            for(int j=1;j<i;j++){
                if(j==i-1){
                System.out.format("%4d",1);
                }else{
                arr[i][j]=arr[i-1][j-1]+arr[i-1][j];
                System.out.printf("%4d",arr[i][j]);
                }
            }
            System.out.println("\n");
        }
        

    }
}
