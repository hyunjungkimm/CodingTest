package leetcode.no227;

class Solution {
    public int calculate(String s) {
        int result = 0;
        int currentNumber = 0;
        int lastNumber = 0;
        int length = s.length();
        char operator = '+';

        for(int i = 0; i<length; i++){
            char charCurrent = s.charAt(i);

            if(Character.isDigit(charCurrent)){
                currentNumber = (currentNumber * 10) + (charCurrent-'0');
            }

            if((!Character.isDigit(charCurrent) && !Character.isWhitespace(charCurrent)) || i == length -1){
                if(operator == '+' || operator == '-'){
                    result += lastNumber;
                    lastNumber = (operator == '+')? currentNumber : -currentNumber;
                }else if(operator == '*'){
                    lastNumber *= currentNumber;
                }else if(operator == '/'){
                    lastNumber /= currentNumber;
                }
                operator = charCurrent;
                currentNumber = 0;
            }

        }
        result += lastNumber;
        return result;
    }
}
