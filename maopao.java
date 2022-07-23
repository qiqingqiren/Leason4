import java.util.Arrays;

public class maopao {
    public static void main(String[] args){
        //int[] arr= new int[10]={15,69,7,52,42,5,36,23,87,14};
        int arr[]={15,69,7,52,42,5,36,23,87,14};
        System.out.println("排前数据"+Arrays.toString(arr));
        // for(int i=0;i<arr.length;i++){
        //     System.out.print(arr[i]+" "); 
        // }

        //maopao_1(arr);
        charu(arr);
        System.out.println("排后数据"+Arrays.toString(arr));    
        // for(int i=0;i<arr.length;i++){
        //     for(int j=0;j<arr.length-1;j++){
        //         if(arr[j]>arr[j+1]){
        //             int num=arr[j+1];
        //             arr[j+1]=arr[j];
        //             arr[j]=num;
        //         }
        //     }
        // }
        // for(int i=0;i<arr.length;i++){
        // System.out.print(arr[i]+" ");
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
    public static void charu(int[] arr){
        for(int i=1;i<arr.length;i++){
            for(int j=i;j>0;j--){
                if(arr[j]<arr[j-1]){
                    int num=arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=num;
                }
            }
        }
    }

}
