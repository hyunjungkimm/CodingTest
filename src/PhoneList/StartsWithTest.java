package PhoneList;

public class StartsWithTest {
    public static void main(String[]args){
        String startsWithT = "자바 코딩 테스트 ";
        System.out.println(startsWithT.startsWith("자바"));//true
        System.out.println(startsWithT.startsWith("자바 "));//true
        System.out.println(startsWithT.startsWith("자"));//true
        System.out.println(startsWithT.startsWith(" 자"));//false
    }
}
