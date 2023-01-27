package day1;

/*
https://programmers.co.kr/learn/courses/30/lessons/12930
 */
//"try hello world"	"TrY HeLlO WoRlD"
class Solution5 {
    public String solution(String s) {
        String answer = "";
        String[] str = s.split("");
        int num = 0;
        for (int i=0; i<str.length; i++){
            if (str[i].equals(" ")){
                num = 0;
                answer += " ";
                continue;
            }
            if (num%2==0){
                answer += str[i].toUpperCase();
                num++;
            }
            else {
                answer += str[i].toLowerCase();
                num++;
            }
        }
        return answer;
    }
}

class Test5 {
    static Solution5 s = new Solution5();
    public static void main(String[] args) {
        System.out.println(s.solution("try hello world"));
    }
}

// 공백도 포함 해서 홀수는 대분자 짝수는 소문자