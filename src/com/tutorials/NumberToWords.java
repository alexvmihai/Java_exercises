package com.tutorials;

public class NumberToWords {

    public static void numberToWords ( int number ) {
        if ( number < 0 ) {
            System.out.println("Invalid Value");
        }
        int number2 = reverse(number);
        int number3 = number;
        int lastDigit;
        while ( true ) {
            lastDigit = number2 % 10;
                switch (lastDigit){
                    case 0 :
                        System.out.println("Zero");
                        break;
                    case 1 :
                        System.out.println("One");
                        break;
                    case 2 :
                        System.out.println("Two");
                        break;
                    case 3 :
                        System.out.println("Three");
                        break;
                    case 4 :
                        System.out.println("Four");
                        break;
                    case 5 :
                        System.out.println("Five");
                        break;
                    case 6 :
                        System.out.println("Six");
                        break;
                    case 7 :
                        System.out.println("Seven");
                        break;
                    case 8 :
                        System.out.println("Eight");
                        break;
                    case 9 :
                        System.out.println("Nine");
                        break;
                    default:
                        break;
            }
            number2 = number2 / 10;
            if ( number2 < 1 ){
                break;
            }
        }
        if ( getDigitCount(number) > getDigitCount(reverse(number)) ){
            int difference = getDigitCount(number) - getDigitCount(reverse(number));
//            System.out.println("The difference is: " + difference);
            for (int i = 1; i <= difference; i++){
                System.out.println("Zero");
            }

        }

    }


    public static int reverse ( int number ) {
        int reverse = 0;
        int lastDigit;
        while (true) {
            if ((number < 10) && (number > -10)){
                reverse += number;
                break;
            }
            lastDigit = number % 10;
            reverse += lastDigit;
            number = number / 10;
            reverse *= 10;

        }
//        System.out.println("Reverse is " + reverse);
        return reverse;
    }

    public static int getDigitCount ( int number ){
        if ( number < 0 ) {
            return -1;
        }
        int digitCount = 0;
        int lastDigit;

        while (true) {
            if ( number < 10 ){
                digitCount +=1;
                break;
            }
            lastDigit = number % 10;
            number = number / 10;
            digitCount += 1;

        }
//        System.out.println("The number has " + digitCount + " digits.");
        return digitCount;

    }



}
