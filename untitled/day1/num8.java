package day1;
import java.util.Arrays;
import java.util.Collections;

/*
https://programmers.co.kr/learn/courses/30/lessons/12933
함수 solution은 정수 n을 매개변수로 입력받습니다.
n의 각 자릿수를 큰것부터 작은 순으로 정렬한 새로운 정수를 리턴해주세요.
예를들어 n이 118372면 873211을 리턴하면 됩니다.
 */



class Solution8 {
    public long solution(long n) {
        long answer = 0;
        long inputNumber = n;
        int num = 0;
        String str = "";


        // num에 자릿수 저장 (몇자리수인지)
        while (inputNumber>0){
            inputNumber /= 10;
            num ++;
        }
        // [2,7,3,8,1,1]
        Integer[] arr = new Integer[num];
        for (int i=0; i<num; i++){
            arr[i] = (int)(n%10);
            n = (n-(n%10))/10;
        }
        Arrays.sort(arr, Collections.reverseOrder());
        for (int i=0; i<arr.length; i++){
            str += arr[i];
        }
        answer = Long.parseLong(str);
        return answer;
    }
}
class Test8 {
    static Solution8 s = new Solution8();
    public static void main(String[] args) {
        System.out.println(s.solution(118372));
    }
}
