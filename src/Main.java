public class Main {


    public static void main(String[] args) {
        // task1
        int i = 0;
        while (i<10) {
            i++;
            System.out.println(i + "");
        }
        System.out.print("");
        for (; i > 0; i--) {
            System.out.println(i + " ");
        }
        System.out.println();

        // task 2
        for (int friday = 4; friday <= 28; friday += 7 ) {
            System.out.println("Сегодня пятница, " + friday + " -е число. Необходимо подготовить отчет");
        }
        int currentYear = 2022;
        int start = currentYear - 200;
        int end = currentYear + 100;
        int period = 79;
        int firstAppearedYear = 0;
        for (int year = firstAppearedYear; year <= end; year += period) {
            // 0 - 2122, каждый 79 лет
            if (year >= start) {
                System.out.println(year);
            }
        }






            }


}