public class Main {

    public static void main(String[] args) {

        /// Видео

        int salary = 65535;
        int total = 0;
        int i = 0;
        while ( total < 1_000_000 ) {
            total = total + total / 100;
            total = total + salary;
            if ( i % 5 == 0 ){
                System.out.println("Месяц  " + i + " Итого " + total);
            }
 //           System.out.println("Месяц " + i + " Итого " + total);
            System.out.println(total);
        }
   //         System.out.println(total);
     //   System.out.println(i);



        // ДЗ


        }

    }
