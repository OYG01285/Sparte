package day1;

//자연수 N이 주어지면, N의 각 자릿수의 합을 구해서 return 하는 solution 함수를 만들어 주세요.
//예를들어 N = 123이면 1 + 2 + 3 = 6을 return 하면 됩니다.
//
//제한사항
//N의 범위 : 100,000,000 이하의 자연수
/*
https://programmers.co.kr/learn/courses/30/lessons/12931
 */

//자연수 N이 주어지면, N의 각 자릿수의 합을 구해서 return 하는 solution 함수를 만들어 주세요.
//        예를들어 N = 123이면 1 + 2 + 3 = 6을 return 하면 됩니다.

// answer += n%10 -> n = (n-(n%10))/10
class Solution6 {
    public int solution(int n) {
        int answer = 0;

        while(n>0) {
            answer += n % 10;
            n = (n - (n % 10)) / 10;
        }
        return answer;
    }
}

class Test6 {
    static Solution6 s = new Solution6();

    public static void main(String[] args) {
        System.out.println(s.solution(859));
    }
}