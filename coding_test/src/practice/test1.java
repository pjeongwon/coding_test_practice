package practice;

public class test1 {

	public static void main(String[] args) {

		System.out.println(solution("AB", 1));
		System.out.println(solution("z", 1));
		System.out.println(solution("a B z", 4));
	}

	public static String solution(String s, int n) {  // s문자열을 n크기만큼 이동 

		char[] s2 = s.toCharArray(); // 문자열을 배열로 변경
		for (int i = 0; i < s2.length; i++) {
			if (s2[i] == ' ') {
				s2[i] = ' ';
			} // 띄어쓰기 처리
			else if (s2[i] >= 'a' && s2[i] <= 'z') { // 소문자인 경우
				s2[i] = (char) (s2[i] + n);
				if (s2[i] > 'z') {
					s2[i] = (char) (96 + (s2[i] - 122));
				}
			} else if (s2[i] >= 'A' && s2[i] <= 'Z') { // 대문자인 경우
				s2[i] = (char) (s2[i] + n);
				if (s2[i] > 'Z') {
					s2[i] = (char) (64 + (s2[i] - 90));
				}
			}
		}

		String answer = new String(s2); // 배열을 다시 문자열로

		return answer;
	}
}
