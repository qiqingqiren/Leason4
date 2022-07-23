import java.util.Random;

public class qipan {
    public static int qipan[][]=new int[8][8];
    private static int COUNT = 0;
    public static void main(String[] args){
        
        //Random ran=new Random()
        // for(int i=0;i<8;i++){
        //     qipan[(int)(1+Math.random()*(7-1+1))][(int)(1+Math.random()*(7-1+1))]=1;
        // }
    }
    public static final boolean check(int row, int col) {

        // 判断当前位置的上面是否有皇后
        for (int i = row - 1; i >= 0; i--) {
            if (qipan[i][col] == 1)
                return false;
        }

        // 判断左上是否有皇后
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (qipan[i][j] == 1)
                return false;
        }

        // 判断右上是否有皇后
        for (int i = row - 1, j = col + 1; i >= 0 && j < 8; i--, j++) {
            if (qipan[i][j] == 1)
                return false;
        }

        return true;
    }

}
