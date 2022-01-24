package kakao;

import java.util.Arrays;

public class Split {
    public static void main(String[] args) {
        String str = "010-1234-5678";
        String[] mobNum = str.split("-");
        String ret1 = mobNum[0];
        String ret2 = mobNum[1];
        String ret3 = mobNum[2];

        System.out.println("ret1 = " + ret1);//ret1 = 010
        System.out.println("ret2 = " + ret2);//ret2 = 1234
        System.out.println("ret3 = " + ret3);//ret3 = 5678

        System.out.println(ret1 +"-" + ret2 + "-" + ret3);//010-1234-5678

        String str2 = "서울,대전,대구,부산,인천,울산";
        String[] cityArr = str2.split(",");

        for(String city : cityArr){
            System.out.println(city);
        }

        System.out.println("-----------------------------------");

        String str3 = "81-2-010-1234-5678";
        String[] arr = str3.split("-", 2);
        System.out.println("ret4 = " + arr[0]);//ret4 = 81
        System.out.println("ret5 = " + arr[1]);//ret5 = 2-010-1234-5678

        String[] arr2 = str3.split("-",4);
        for(String s : arr2){
            System.out.println(s);// 81, 2 , 010, 1234-5678
        }

    }
}
