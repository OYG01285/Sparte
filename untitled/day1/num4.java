package day1;
//수많은 마라톤 선수들이 마라톤에 참여하였습니다. 단 한 명의 선수를 제외하고는 모든 선수가 마라톤을 완주하였습니다.
//
//        마라톤에 참여한 선수들의 이름이 담긴 배열 participant와 완주한 선수들의 이름이 담긴 배열 completion이 주어질 때,
//        완주하지 못한 선수의 이름을 return 하도록 solution 함수를 작성해주세요.

//equals for: participant[0][1][2][3][4], completion[0] [1] [2]  equals

// ["leo", "kiki", "eden"]	["eden", "kiki"]

//for participant[0]
// if participant[0] completion[0]
// man에 중복되지 않은것을 대입한다.

import java.util.Arrays;
/*
https://programmers.co.kr/learn/courses/30/lessons/42576
 */
class Solution4 {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        Arrays.sort(participant);
        Arrays.sort(completion);

        System.out.println(Arrays.toString(participant));
        System.out.println(Arrays.toString(completion));

        for (int i = 0; i < completion.length; i++) {//3
            if (!participant[i].equals(completion[i])) {//0 eden 0 eden
                answer += participant[i];
                return answer;

            }
        }


        answer += participant[participant.length -1];
        return answer;
    }
}


class Test4 {
    static Solution4 s = new Solution4();

    public static void main(String[] args) {
        System.out.println(s.solution(new String[]{"zeo", "kiki", "eden"}, new String[]{"eden", "kiki"}));
    }
}
