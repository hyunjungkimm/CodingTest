package codingTest.practice;

public class NextNumber {
    public int solution(int n) {
        int answer = 0;
        String a = Integer.toString(n, 2);
        int count = 0;

        for(int i =0; i<a.length(); i++){
            if(a.charAt(i) == '0') count++;
        }

        while(true){
            int check = 0;
            String b = Integer.toString(n+1, 2);
            for(int i =0; i<b.length(); i++){
                if(b.charAt(i) == '0') check++;
            }

            if(count==check) return Integer.parseInt(b,10);
            else n++;
        }
    }

    public static void main(String[] args) {
        NextNumber nextNumber = new NextNumber();
        int answer = nextNumber.solution(78);
        System.out.println(answer);
    }
}
