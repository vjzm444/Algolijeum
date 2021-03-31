/*
* URL뒤에붙은 get방식 추가파라메터 체크
* */
package AlgolijeumTest.test2;

import java.util.ArrayList;
import java.util.List;

public class FindParameter {

    public static void main(String[] arg){

        //예제 Url 값
        //String retUrl = "http://localhost:8080/nameRequest.do?newToken=789456abcdefg&new1=aaaa&new1=aaaa&new3=ccc&new4=ddddddddd";
        //String retUrl = "http://localhost:8080/nameRequest.do?newToken=789456abcdefg";
        //String retUrl = "http://localhost:8080/nameRequest.do";
        String retUrl = "https://kr.wirebarley.com/korean/check-name/res/v2?token=1599011386027&userId=0&recipientId=108250&enckey=475c6bd7-c962-4224-bb92-8fd28a0adedb&test=true&deviceType=WEB";


        String flag = "N"; //추가파라메터 플러그값
        String firstName = ""; //첫번째 파라메터 이름
        String firstValue = ""; //첫번째 파라메터 value

        List<Object> Array = new ArrayList<Object>(); //2개이상의 추가파라메터 이름
        List<Object> Array2 = new ArrayList<Object>(); //2개이상의 추가파라메터 벨류
        System.out.println("처음url="+retUrl);

        //url 유효성체크
        if(retUrl.contains("=") && !retUrl.contains("&")){ //추카파라메터 1개만
            flag = "1";
        }else if(retUrl.contains("=") && retUrl.contains("&")){ //추카파라메터 2개이상 O
            flag = "2";
        }else if(!retUrl.contains("=")){ //추카파라메터 아예 X
            flag = "0";
        }
        System.out.println("flag == "+flag );


//1번째 추가파라메터 체크
        if(flag.equals("1") || flag.equals("2")){
            int num1 = retUrl.indexOf("?"); // 36
            int num2 = retUrl.indexOf("="); // 45
            int num3 = 0;

            if(flag.equals("1")){ //추가파라미터가 1개
                num3 = retUrl.length(); // 52
            }else{ //추가파라미터가 2개 이상
                num3 =retUrl.indexOf("&"); // 52
            }

            firstName = retUrl.substring(num1+1, num2);
            firstValue = retUrl.substring(num2+1, num3);

            //Array.add(retUrl.substring(num1+1, num2));
            //Array2.add(retUrl.substring(num2+1, num3));
        } //1번째 추가파라메터 종료


//2번째 추가파라메터 체크시작
        if(flag.equals("2")){
            int retUrlLng = retUrl.indexOf("&");
            String retUrl2 = retUrl.substring(retUrlLng+1, retUrl.length());
            //System.out.println("retUrl2 ======= "+retUrl2);

            String date[] = retUrl2.split("&");
            //System.out.println("추가 파라미터 date.length ======= "+date.length);

            String str = "";

            for(int i=0 ; date.length > i ; i++){
                //System.out.println("date["+i+"] : "+date[i]);
                str += date[i]+"=";
            }

            //System.out.println("str==="+str);

            String date2[] = str.split("=");

            for(int i=0 ; date2.length > i ; i++){
                if(i%2==0){ //짝수는 name
                    //System.out.println("date2["+i+"] : "+date2[i]+"는 name");
                    Array.add(date2[i]);
                }else{ // 홀수는 value
                    //System.out.println("date2["+i+"] : "+date2[i]+"는 value");
                    Array2.add(date2[i]);
                }
            }
        }

        if(flag.equals("1") || flag.equals("2")){
            //추가파라메터가 있을경우 결과출력 로직작성
            System.out.print("firstName = "+firstName);
            System.out.println(" / firstValue = "+firstValue);

            if(Array.size()!=0){ //2개 이상
                for(int i =0; i < Array.size(); i++){
                    System.out.print("name = "+Array.get(i));
                    System.out.println(" / value = "+Array2.get(i));
                }
            }
        }else if(flag.equals("0")){ //결과url에 파라미터를 안적은 경우(순수Url)
            System.out.println("추가파라메터가 존재하지 않음");
        }


        System.out.println("==================모든 프로세스 종료 =================");

    }
}
