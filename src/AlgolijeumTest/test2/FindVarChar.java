package AlgolijeumTest.test2;


import java.util.ArrayList;

public class FindVarChar {

    public static void main(String[] args){

        String[] str2 = {"사과","배","사과","수박","사과","사과","사과","우예은","우예은","우예진","메","메","메","메","메","메","메","메"};
        int[] strCnt = new int[str2.length];
        ArrayList<String> strResult = new ArrayList<String>();
        int size=0;

        for(int i=0;i<str2.length;i++){
            String flag ="N";
            String result ="";

            for (int y = i; y < str2.length; y++) {
                if(!strResult.contains(str2[i])){ //포함되어있지않으면...
                    if (str2[i].equals(str2[y])) {
                        strCnt[i]+= 1;
                        flag = "Y";
                        result = str2[i];
                    }
                }
            }

            if(flag.equals("Y")) {
                strResult.add(result);
            }

        } //모든 반복문 종료

        for(int b=0;b<strCnt.length;b++) { //결과cnt를 담기위한 0을제외한 size크기를 구한다
            if(strCnt[b] != 0){
                size+=1;
            }
        }

        int[] resultSize = new int[size];
        int test =0;

        for(int b=0;b<strCnt.length;b++) { //결과cnt를 담기위한 0을제외한 size크기를 구한다
            if(strCnt[b] != 0){
                resultSize[test]= strCnt[b];
                test +=1;
            }

        }

        //결과물을 출력한다
        System.out.println(strResult);

        for(int b=0;b<resultSize.length;b++) {
            System.out.print(resultSize[b]+",");
        }


    }//메소드종료

} //FindVarChar End


