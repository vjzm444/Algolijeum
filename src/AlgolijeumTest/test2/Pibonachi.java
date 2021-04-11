package AlgolijeumTest.test2;

/*
 * 피보나치 수열을 구한다
 * */

import java.util.Scanner;

public class Pibonachi {
    /*
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int refit = sc.nextInt();
        String next = ""; //계산의 결과값 문자열

        int result =0;
        int cul =0;
        int second=1;

        for(int i=0;i<refit;i++) {

            if (i == 0) { //다음계산식을 위해서 처음부분은 예외처리한다
                next += ""+0+","+1+","; //0이처음이면 사라져버리기땜에 앞에 문자열을 붙임
            }else{ //처음계산식이외에는 항상 동일한규칙이 정용됨
                cul = result + second;

            //System.out.println("test["+i+"]= "+cul);

            next += cul+","; //문자열을 담는다

            //다음계산을 위해 서로 자리 체인지
            result = second;
            second = cul;
            }

            //System.out.println("배열값["+i+"]= "+next);
        }
        System.out.println(cul); //최종결과값 cul

    }
*/
//밑에는 재귀함쉬식 구하는방법인데 이해가안됨..
        public static void main(String[] args) {

            int x;
            Scanner sc= new Scanner(System.in);
            x = sc.nextInt();

            System.out.println(fibo(x));
        }


        public static int fibo(int n) {
            System.out.println("n ="+n);
            if (n <= 1)
                return n;
            else
                return fibo(n-2) + fibo(n-1);
        }



}
