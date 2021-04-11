package AlgolijeumTest.test2;

/*
 * 오름차순/ 내림차순 정렬을 한다. 단 중복은 제거해야된다.
 * */

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Sort {

    public static void main(String[] arg){

        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        List<Integer> aa = new ArrayList<>();
        int result =sc.nextInt();

        for(int i =0;i<result;i++) { //ex 5,5,4,3,2
            aa.add(sc.nextInt()); // 5개의숫자를 임의로 임력하면 정렬한다.
        }
        //System.out.println(aa);

        Collections.sort(aa);
        //aa.sort(Comparator.naturalOrder()); //오름차순
        //aa.sort(Comparator.reverseOrder()); //내림차순
        //System.out.println("sort 후 = "+aa);
/*
  //중복된수가 들어올경우
        for(int i =0;i < aa.size()-1;i++) {

            if(aa.get(i) == aa.get(i+1)){
                //System.out.println(aa.get(i)+" == "+aa.get(i+1));
                aa.remove(i);
            }

        }
*/
        //이하는 스트링 버퍼로 출력하는 방법이다
        for(int value : aa) {
            sb.append(value).append('\n');
        }

        System.out.println(sb);




    }
}
