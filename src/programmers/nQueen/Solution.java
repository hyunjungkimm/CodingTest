package programmers.nQueen;

class Solution {

    static int n;
    static int[] sel;
    static int totalCnt;

    public int solution(int n) {
        this.n = n;
        //col을 1부터 n까지 적용시킨다.
        for(int i=1;i<=n;i++){
            sel = new int[n+1];
            setQueens(1);
        }
        return totalCnt;
    }
    public static void setQueens(int row) {
        if(row > n){
            //유망한 경우에만 계속해서 따라왔으므로 그대로 해가 된다.
            totalCnt++;
            return;
        }

        //가능한 선택지(1열부터 N열까지)
        for(int j= 1 ; j<=n; j++){
            sel[row] = j; //해당행에 배치
            if(checking(row)){ //유망한지 검사
                setQueens(row+1);
                //일차원 배열로 퀸의 위치를 관리하므로 시도했던 선택시 열값을 되돌릴 필요가 없음
            }
        }

    }
    //행에 퀸을 놓을 수 있는지 여부 판단
    private static boolean checking(int row) {
        for(int i = 1; i< row; i++){
            //같은 열인지
            //같은 대각라인 인지
            if(sel[row] == sel[i] || Math.abs(sel[row] - sel[i]) == row -i){
                int check = Math.abs(sel[row] - sel[i]);
                return false; //놓을 수 없으면 false
            }
        }

        return true; //검사를 무사히 나왔으면 true
    }

}

