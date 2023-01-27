package day1;

import java.util.Arrays;

/*
https://programmers.co.kr/learn/courses/30/lessons/12910
array의 각 element 중 divisor로 나누어 떨어지는 값을 오름차순으로 정렬한 배열을 반환하는 함수, solution을 작성해주세요.
divisor로 나누어 떨어지는 element가 하나도 없다면 배열에 -1을 담아 반환하세요.
*
반복문 > cnt ++;
new int[cnt]
*/
// int cnt : 정답 answer배열의 길이값 (정수)가 들어감
// int[] answer에 cnt만큼의 크기를 갖는 배열을 다시 선언하고 반복문을 돌려서
// arr[i]%divisor == 0 일때 answer[i] = arr[i]%divisor
class Solution2{
    public int[] solution(int[] arr, int divisor) {
        int cnt = 0;
        int num = 0;

        for(int i = 0 ; i < arr.length; i++){
            if(arr[i] % divisor == 0) {
                cnt++;

            }
        }

        if(cnt ==0){
            int[] answer = {-1};
            return answer;
        }

        int [] answer = new int[cnt];

        for(int i = 0 ; i < arr.length; i++) {
            if (arr[i] % divisor == 0) {
                answer[num] = arr[i];
                num++;

            }
        }

        Arrays.sort(answer);
        return answer;

    }
}
class TestDivNumArray {
    static Solution2 s = new Solution2();
    public static void main(String[] args) {
        System.out.println(Arrays.toString(s.solution(new int[]{5, 9, 7, 10},5)));
    }
}