package phoneList;

import java.util.Arrays;

public class PhoneList {
    public static void main(String[]args){
        String[]phone_book= {"2,32"};
        boolean answer = true;

        Arrays.sort(phone_book);

        for(int i = 0; i<phone_book.length-1; i++){
            int index = phone_book[i+1].indexOf(phone_book[i]);
            if(index!=-1 && index+(phone_book[i].length()) == phone_book[i].length()){
                answer = false;
                break;
            }
        }
        System.out.println(answer);
    }
}
