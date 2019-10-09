public class EvenDigitSum {

    public static int getEvenDigitSum (int number) {

        if (number < 0) {
            System.out.println(-1);
            return -1;
        }

        int sum = 0;
        while (number > 0) {
            if (((number % 10) % 2) == 0) {
                sum += (number %10);
            }
            number /= 10;
        }

        System.out.println(sum);
        return sum;

//        Even-th digit sum
//
//        int originalNumber = number;
//
//        // Count how many digit
//        int counter = 0;
//        while (number > 0) {
//            number /= 10;
//            counter++;
//        }
//
//        number = originalNumber;
//        int sum = 0;
//        if (counter % 2 == 0) {
//            while (number > 0) {
//                sum += (number % 10);
//                number /= 100;
//            }
//            System.out.println(sum);
//            return sum;
//        } else {
//            number /= 10;
//            while (number > 0) {
//                sum += (number % 10);
//                number /= 100;
//            }
//            System.out.println(sum);
//            return sum;
//        }

    }
}
