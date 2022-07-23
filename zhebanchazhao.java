import java.util.Arrays;
import java.util.Scanner;

public class zhebanchazhao {
    public static void main(String[] args){
        int arr[]={15,69,7,52,42,5,36,23,87,14};
        Scanner in_put=new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
            arr[i]=in_put.nextInt();
        }
        System.out.println("排前数据"+Arrays.toString(arr));
        maopao_1(arr);
        System.out.println("排后数据"+Arrays.toString(arr));
        System.out.println("需要查找的数据为");
        Scanner in=new Scanner(System.in);
        int count=in.nextInt();
        zhebanchaxun(arr,count);

    }

    public static void maopao_1(int[] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-1;j++){
                if(arr[j]>arr[j+1]){
                    int num=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=num;
                }
            }
        }

    }
    public static void zhebanchaxun(int[] arr,int count){
        //System.out.println(arr.length/2);
        if(count<arr[arr.length/2]){
            for(int i=0;i<arr.length;i++){
              //  System.out.println(i);
                if(count==arr[i]){System.out.println(i+1);}
            }
           
        }
        else if(count>arr[arr.length/2]){
            for(int i=arr.length/2;i<arr.length;i++){
                //System.out.println(i);
                if(count==arr[i]){System.out.println(i+1);}
            }
            
        }
        else {
            System.out.println(arr.length);
          
        }
    }
}
