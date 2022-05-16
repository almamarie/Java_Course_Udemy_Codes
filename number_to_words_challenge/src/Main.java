public class Main {

    public static void main(String[] args){
        numberToWords(100);
    }



    public static void numberToWords(int number){
        if(number < 0)
            System.out.println("Invalid Value");

        if(number == 0){
            System.out.println("Zero");
            return;
        }

        int digit = 0;
        int reversed = reverse(number);
        int numberOfDigits = getDigitCount(number);
        int reversedNumberOfDigits = getDigitCount(reversed);

        if((numberOfDigits != reversedNumberOfDigits) && reversed < 10){
            switch (reversed) {
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
            }


            for(int i=0; i < (numberOfDigits - 1); i++){
                System.out.println("Zero");
            }


        } else if (numberOfDigits != reversedNumberOfDigits) {

            while (reversed > 0){

                digit = reversed % 10;
                reversed /= 10;

                switch (digit) {
                    case 0:
                        System.out.println("Zero");
                        break;
                    case 1:
                        System.out.println("One");
                        break;
                    case 2:
                        System.out.println("Two");
                        break;
                    case 3:
                        System.out.println("Three");
                        break;
                    case 4:
                        System.out.println("Four");
                        break;
                    case 5:
                        System.out.println("Five");
                        break;
                    case 6:
                        System.out.println("Six");
                        break;
                    case 7:
                        System.out.println("Seven");
                        break;
                    case 8:
                        System.out.println("Eight");
                        break;
                    case 9:
                        System.out.println("Nine");
                        break;
                }
            }

            for(int i=0; i < (numberOfDigits - reversedNumberOfDigits); i++){
                System.out.println("Zero");
            }




        } else {

            while (reversed > 0){

                digit = reversed % 10;
                reversed /= 10;

                switch (digit) {
                    case 0:
                        System.out.println("Zero");
                        break;
                    case 1:
                        System.out.println("One");
                        break;
                    case 2:
                        System.out.println("Two");
                        break;
                    case 3:
                        System.out.println("Three");
                        break;
                    case 4:
                        System.out.println("Four");
                        break;
                    case 5:
                        System.out.println("Five");
                        break;
                    case 6:
                        System.out.println("Six");
                        break;
                    case 7:
                        System.out.println("Seven");
                        break;
                    case 8:
                        System.out.println("Eight");
                        break;
                    case 9:
                        System.out.println("Nine");
                        break;
                }
            }
        }


    }


    public static int reverse(int number){
        int sign = 1;
        if(number < 0) {
            sign = -1;
            number *= sign;
        }

        int reversed = 0;
        int digit = 0;
        int count = 10;

        while (number > 0){
            digit = number % 10;
            number /= 10;
            reversed = (count * reversed) + digit;
        }
        return reversed * sign;
    }

    public static int getDigitCount(int number){

        if(number < 0) {
            return -1;
        }

        if(number < 10){
            return 1;
        }

        int digit = 0;
        int count = 0;

        while (number > 0){
            digit = number % 10;
            number /= 10;
            count++;
        }
        return count;
    }

}