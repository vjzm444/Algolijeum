package codingTest;

public class Chapter1 {

    public static void  main(String[] args){
        int n =1260;
        int cnt = 0;
        int[] coinTypes = {500,100,50,10};

        for(int i = 0; i<4; i++){
            int coin = coinTypes[i];
            cnt += n / coin;
            System.out.println("현재 나누는 동전은 = "+coinTypes[i]+" 떨어지는 cnt는="+cnt);
            n %= coin;
        }
        System.out.println(cnt);

    }
}
