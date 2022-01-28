package prime;

public class Prime {
    public static void main(String[] args) {
        Prime prime = new Prime();
        boolean answer = prime.isPrime(2);
        System.out.println(answer);
    }

    public boolean isPrime(int x){
        boolean answer = true;
        //sqrt : 2부터 루트x까지의 범위에서 소수를 판별해주는 함수
        //범위가 2부터 루트x까지인 이유는 소수는 1과 자기 자신으로만 나누어지는 숫자이기 때문이다.
        for(int i = 2; i<=Math.sqrt(x); i++){
            if(x % i ==0){
                answer = false;
                break;
            }
        }


        return answer;
    }
}
