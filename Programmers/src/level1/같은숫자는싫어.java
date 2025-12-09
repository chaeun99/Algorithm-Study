package level1;

import java.util.*;

public class 같은숫자는싫어 {
    public int[] solution(int []arr) {

// 결과값을 담을 ArrayList 생성 (스택처럼 사용)
        ArrayList<Integer> list = new ArrayList<>();

// 첫 번째 원소는 무조건 추가 (스택의 push)
        if (arr.length > 0) {
            list.add(arr[0]);
        }

// 두 번째 원소부터 배열 끝까지 순회 (스택의 peek 원리로 비교)
        for (int i = 1; i < arr.length; i++) {
            int currentNum = arr[i];

            int lastAddedNum = list.get(list.size() - 1);

            if (currentNum != lastAddedNum) {
                list.add(currentNum);
            } else {

            }
        }

// ArrayList를 int[] 배열로 변환
        int[] answer = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}

