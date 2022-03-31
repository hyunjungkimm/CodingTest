package binarysearch;

public class Solution
{

    //순차탐색
    public int search(int[]arr, int k){
        int answer = -1;
        for(int i = 0; i<arr.length; i++){
            if(arr[i] ==  k ) answer = i;
        }
        return answer;
    }

    //재귀
    public int recursiveBinarySearch(int[]arr, int k, int startIdx, int endIdx){
        int answer = -1;
        int idx = arr.length / 2 ;

        if(arr[idx] == k){
            answer = idx;
            return answer;
        }else if(arr[idx] < k){
            startIdx = idx;
            return recursiveBinarySearch(arr, k, startIdx, endIdx);
        }else{
            endIdx = idx;
            return recursiveBinarySearch(arr, k, startIdx, endIdx);
        }

    }

    //for문
    public int nonRecursiveBinarySearch(int[]arr, int k, int startIdx, int endIdx){
        int answer = -1;
        int idx = arr.length / 2 ;

        while(startIdx < endIdx){
            if(arr[idx] == k){
                answer = idx;
                return answer;
            }else if(arr[idx] < k){
                startIdx = idx;
            }else{
                endIdx = idx;
            }
        }

        return answer;

    }




}
