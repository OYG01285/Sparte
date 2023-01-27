package day1;

import java.util.Arrays;
/*
https://programmers.co.kr/learn/courses/30/lessons/12922
 */
class Solution3 {
    public String solution(int n) {
        String answer = "";

        for (int i=1; i<n+1; i++){
            if (i%2==1){
                answer += '수';
            }
            else {
                answer += '박';
            }
        }
        return answer;
    }
}

//1. n번 반복하는 for문 사용
//2. if문으로 n값을 나누어 표시
// n값이 5일때 i % 2를 햇을때 나머지 값이 1이면 수를 표시하고 else 일 경우 박을 표시

//길이가 n이고, "수박수박수박수...."와 같은 패턴을 유지하는 문자열을 리턴하는 함수, solution을 완성하세요.
// 예를들어 n이 4이면 "수박수박"을 리턴하고 3이라면 "수박수"를 리턴하면 됩니다.
//
//제한 조건
//n은 길이 10,000이하인 자연수입니다.


class Test3 {
    static Solution3 s = new Solution3();
    public static void main(String[] args) {
        System.out.println(s.solution(6));
    }
}