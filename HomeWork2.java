public class HomeWork2 {
        public static void main(String[] args) {
                chekSumm();
                chekNumber();
                chekCompare();
                wordAndNumber();




        }

        public static void chekSumm() {
                        int w = 3;
                        int b = 7;
                        int c = (w + b);
                        System.out.println(c >= 10 && c <= 20);
            System.out.println(); // разделяем для комфортного чтения результата.
                }


            public static void chekNumber() {
                    int a = -5;
                    if ( a >= 0)
                            System.out.println("sum is positive");
                    if ( a < 0)
                            System.out.println("sum is negative");
                System.out.println(); // разделяем для комфортного чтения результата.

            }

            public static void chekCompare() {
                    int a = -1;
                    System.out.println(a >= 0);
                System.out.println(); // разделяем для комфортного чтения результата.
            }


        public static void wordAndNumber() {
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 1; j++) {
                    System.out.print("word");
                }
                System.out.println();
            }
        }
/* как раотать с аргументами не совсем понятно. что то пытался попробовать сделать, но у меня разногласия идут с main.

 */

            /* делал домашнее задание и только в конце обнаружил подсказки.
            Там не так как я сделал, но у меня тоже работает согласно условию задачи. Насколько мое решение верное?
             */

}
