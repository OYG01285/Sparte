package day1;
import java.util.Arrays;

/*
https://programmers.co.kr/learn/courses/30/lessons/12932
자연수 n을 뒤집어 각 자리 숫자를 원소로 가지는 배열 형태로 리턴해주세요.
예를들어 n이 12345이면 [5,4,3,2,1]을 리턴합니다.
* */
class Solution7 {
    public int[] solution(long n) {
        long inputNumber = n;
        int num = 0;

        while (inputNumber>0){
            inputNumber /= 10;
            num ++;
        }


        int[] answer = new int[num];
        for (int i=0; i<num; i++){
            answer[i] = (int)(n%10);
            n = (n-(n%10))/10;
        }
        return answer;
    }
}

class Test7 {
    static Solution7 s = new Solution7();
    public static void main(String[] args) {
        System.out.println(Arrays.toString(s.solution(12345)));
    }
}