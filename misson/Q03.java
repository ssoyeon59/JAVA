public class Q03 {

    public static void main(String[] args) {

        System.out.println("시작!");

        while (true) { //while문은 조건이 true이어야 계산을 시작
            int num1 = (int) (Math.random() * 6) + 1;
            int num2 = (int) (Math.random() * 6) + 1;

            System.out.println("("+num1+","+num2+")");
            if (num1 + num2 == 5) {
               break; //while구문은 끊임없이 반복하기 때문에 조건을 정해주고 break를 적어줘야하 한다.
            }
        }

        System.out.println("끝");
    }
}
