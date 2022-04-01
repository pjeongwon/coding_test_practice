package practice;

public class test2 {

	public static void main(String[] args) {

		System.out.println(solution("abcde"));
		System.out.println(solution("aabb"));
	}

	public static String solution(String s) { // 짝수 : 가운데 두 문자 출력, 홀수 : 가운데 한 문자 출력
		String answer = "";
		int length = s.length();
		if (length % 2 == 0) { // 짝수
			answer = s.substring(length / 2 - 1, length / 2 + 1);
		} else if (length % 2 == 1) { // 홀수
			answer = s.substring(length / 2, length / 2 + 1);
		}
		return answer;
	}
}