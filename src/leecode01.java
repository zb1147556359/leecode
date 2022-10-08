import java.util.Arrays;
import java.util.Scanner;

//窗口函数，首先输入一个整数N确定有几个整数，再次输入N个整数，最后输入一个整数确定窗口的个数M，求窗口的和最大的数
//思路:先用数组就收输入的整数，其次在创建一个数组接收窗口函数之和，返回窗口之和的最大值
public class leecode01 {
    public static void main(String[] args) {
        soultion();
    }


    public static void soultion(){

        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int  n = sc.nextInt();
            int []array = new int[n];
            for(int i = 0 ;i < n; i++){
                array[i] = sc.nextInt();
            }
            int m = sc.nextInt();

            //5
            //1 4 5 7 2
            //3
            //arrM.length = 3

            int []arrM = new int[n - m+1];

            for(int i = 0; i < n-m+1 ;i++){
                arrM[i] = 0;
                for(int j = 0 ;j < m;j++){
                    arrM[i] += arrM[i +j];
                }
                System.out.println(arrM[i]);
            }
            Arrays.sort(arrM);
            System.out.println(arrM[n - m]);
        }

    }
}
