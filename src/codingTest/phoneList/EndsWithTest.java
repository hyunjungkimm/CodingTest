package codingTest.phoneList;

public class EndsWithTest {
    public static void main(String[]args){
        String endsWithT = "자바 코딩 테스트 ";
        System.out.println(endsWithT.endsWith("테스트"));//false
        System.out.println(endsWithT.endsWith("테스트 "));//true
        System.out.println(endsWithT.endsWith("트 "));//true
        System.out.println(endsWithT.endsWith(" 테"));//false
    }
}
