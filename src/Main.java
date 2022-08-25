public class Main {

    public static void main(String[] args) {

        // Task 1

        int a = 1;
        while (a<=10){
            System.out.print(" " + a + " ");
            a++;
        }
        System.out.println();
        for (int b = 10; b > 0; b--){
            System.out.print(" "+ b +" ");
        }
        System.out.println();

        // Task 2

        int friday = 5;
        System.out.println("Сегодня пятница " + friday + "-e число");
        for (int i = 0; i < 3; i++){
            if (friday <= 31){
                friday=friday + 7;
                System.out.println("Сегодня пятница " + friday + "-e число");
            }
        }

        // Task 3
        int start = 1822;
        for (int year = 1822; year <= 2122; year++ ){
            if (year %79 == 0){
                System.out.println(year);
            }
        }

        // Task 4*

        int count = 0;
        for (count = 1; count <=30; count++) {
            if (count % 5 == 0 && count % 3 == 0) {
                System.out.println(count + ":ping pong");
            }
            if (count % 3 == 0 && count != 15 && count != 30) {
                System.out.println(count+ ":ping");
            }
            if (count % 5 == 0 && count != 15 && count != 30) {
                System.out.println(count + ":pong");
            } else {
                if (count != 15 && count != 30){
                System.out.println(count + ":");}
            }
        }

        // Task 6*   (Каюсь, эту задачу стыбзил с инета, чтобы понять как оно вообще так заработало. P.S. Не понял(((  )

        int first = 0;
        int second = 1;
        int allCount = 0;
        System.out.print(first + " " + second + " ");
        for (int i = 0; i <= 7; i++){
            allCount = first + second;
            System.out.print(allCount + " ");
            first = second;
            second = allCount;
        }
        System.out.println();

    }
}
