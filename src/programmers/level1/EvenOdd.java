package programmers.level1;

public class EvenOdd {
    //정수 num이 짝수일 경우 "Even"을 반환하고 홀수인 경우 "Odd"를 반환하는 함수, solution을 완성해주세요.
    public static void main(String[] args) {
        int num = 5;
        String answer = num%2 == 0 ? "Even" : "Odd";
        System.out.println(answer);
    }
}
