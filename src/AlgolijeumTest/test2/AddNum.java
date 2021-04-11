package AlgolijeumTest.test2;

import java.util.Scanner;

public class AddNum {

    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);

        //int aa_leng = sc.nextInt();
        String aa = sc.next();     //54321 = 15


        //String aa = "1";
        //System.out.println(aa.length());

        String[] result = new String[aa.length()];
        //System.out.println(result.length); //문자열의갯수

        int lastResult=0;

        for(int i =0; i<result.length;i++){
           result[i] = aa.substring(i,i+1);

           lastResult = lastResult + Integer.parseInt((result[i]));
           //System.out.println(i+"번째계산식 더하기결과= "+lastResult);
           //System.out.println(i+"번째계산식결과= "+Integer.parseInt(result[i]));
        }

        System.out.println(lastResult);


    }

}
