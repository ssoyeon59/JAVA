public class Q01 {

    public static void main(String[] args) {

        int var1 = 5;
        int var2 = 2;
        double var3 = (double) var1 / var2; //var1, 2 둘 중 하나는 실수여야지 2.5 값이 나온다 따라서 var4의 값이 5가 나온다.
        int var4 = (int) (var3 * var2);

        System.out.println(var4);
    }
}

