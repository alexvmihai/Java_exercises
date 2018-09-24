package com.tutorials;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.SimpleFormatter;

public class Main {

    public static void main(String[] args) {
	// write your code here

//        int position = calculateHighScorePosition(1500);
//        displayHighScorePosition("Fred", position);
//
//        position = calculateHighScorePosition(900);
//        displayHighScorePosition("Tim", position);
//
//        position = calculateHighScorePosition(400);
//        displayHighScorePosition("Tony", position);
//
//        position = calculateHighScorePosition(50);
//        displayHighScorePosition("Nick", position);
//
//        MegaBytesConverter.printMegaBytesAndKiloBytes(1024);

//        System.out.println(BarkingDog.bark(true, 1));
//        System.out.println(BarkingDog.bark(false, 2));
//        System.out.println(BarkingDog.bark(true, 8));
//        System.out.println(BarkingDog.bark(true, -1));
//
//        System.out.println(LeapYear.isLeapYear(-1600));
//        System.out.println(LeapYear.isLeapYear(1600));
//        System.out.println(LeapYear.isLeapYear(2017));
//        System.out.println(LeapYear.isLeapYear(2300));

//        System.out.println(DecimalComparator.areEqualByThreeDecimalPlaces(-3.1756, -3.175));
//        System.out.println(DecimalComparator.areEqualByThreeDecimalPlaces(3.175232, 3.1763232));
//        System.out.println(DecimalComparator.areEqualByThreeDecimalPlaces(3.0, 3.0));


//        System.out.println(EqualSumChecker.hasEqualSum(1,1,1));
//        System.out.println(EqualSumChecker.hasEqualSum(1,1,2));
//        System.out.println(EqualSumChecker.hasEqualSum(1,-1,0));

//        System.out.println(TeenNumberChecker.hasTeen(9, 99, 19));
//        System.out.println(TeenNumberChecker.hasTeen(23, 15, 42));
//        System.out.println(TeenNumberChecker.hasTeen(22, 23, 34));

//        calcFeetAndInchesToCentimeters(3, 11);
//        calcFeetAndInchesToCentimeters(250);

//        System.out.println(getDurationString(62, 9));
//        System.out.println(getDurationString(48690));

//        MinutesToYearsDaysCalculator.printYearsAndDays(525600);
//        MinutesToYearsDaysCalculator.printYearsAndDays(1051200);
//
//        MinutesToYearsDaysCalculator.printYearsAndDays(5759);

//        IntEqualityPrinter.printEqual(1, 1, 1);
//        IntEqualityPrinter.printEqual(1, 1, 2);
//        IntEqualityPrinter.printEqual(-1, -1, -1);
//        IntEqualityPrinter.printEqual(1, 2, 3);

//        System.out.println(PlayingCat.isCatPlaying(true, 10));
//        System.out.println(PlayingCat.isCatPlaying(false, 36));
//        System.out.println(PlayingCat.isCatPlaying(false, 35));


//        char lit = 'A';
//        switch(lit){
//            case 'A':
//                System.out.println("Value was A");
//                break;
//
//            case 'B':
//                System.out.println("Value was B");
//                break;
//
//            case 'C':
//                System.out.println("Value was C");
//                break;
//
//            case 'D':
//                System.out.println("Value was D");
//                break;
//
//            case 'E':
//                System.out.println("Value was E");
//                break;
//
//            default:
//                System.out.println("Not found !");
//                break;
//        }

//        DayOfTheWeekChallenge.printDayOfTheWeek(1);
//
//        NumberInWord.printNumberInWord(3);
//        NumberInWord.printNumberInWord(2);
//        NumberInWord.printNumberInWord(20);
//        NumberInWord.printNumberInWord(5);

//        NumberOfDaysInMonth.getDaysInMonth(1, 2020);
//        NumberOfDaysInMonth.getDaysInMonth(2, 2020);
//        NumberOfDaysInMonth.getDaysInMonth(2, 2018);
//        NumberOfDaysInMonth.getDaysInMonth(-1, 2020);
//        NumberOfDaysInMonth.getDaysInMonth(1, -2020);
//
//        for(int i=2; i<9; i++){
//            System.out.println("10,000 at " + i + "% interest = " + String.format("%.2f", calculateInterest(10000.0, i)));
//        }
//
//        for(int i=8; i>1; i--){
//            System.out.println("10,000 at " + i + "% interest = " + String.format("%.2f", calculateInterest(10000.0, i)));
//        }

//        int numbers = 0;
//        for (int j=3; j<99; j++){
//            if(numbers == 10){
//                break;
//            } else if (isPrime(j)){
//                System.out.println("Prime number: " + j);
//                numbers++;
//
//            }
//        }

//        int count = 0;
//        int sum = 0;
//        for(int i=1; i<=1000; i++){
//            if((i % 3 == 0) && (i % 5 == 0)){
//                System.out.println("The number is: " + i);
//                count++;
//                sum+=i;
//                if(count == 5){
//                    System.out.println("The sum of the numbers is: " + sum);
//                    break;
//                }
//            }
//        }


//        System.out.println(SumOddRange.sumOdd(1, 100));
//        System.out.println(SumOddRange.sumOdd(-1, 100));
//        System.out.println(SumOddRange.sumOdd(100, 100));
//        System.out.println(SumOddRange.sumOdd(100, -100));
//        System.out.println(SumOddRange.sumOdd(100, 1000));

//
//        System.out.println(isEvenNumber(3));
//        System.out.println(isEvenNumber(2));
//        System.out.println(isEvenNumber(10));
//        System.out.println(isEvenNumber(11));
//
//        int number = 4;
//        int finishNumber = 20;
//        int total = 0;
//
//        while (number <= finishNumber){
//            number++;
//            if(!isEvenNumber(number)){
//                continue;
//            }
//
//            System.out.println("Even number " + number);
//            total++;
//            if(total >= 5){
//                break;
//            }
//        }
//
//        System.out.println("Total even numbers: " + total);


//        DigitSumChallenge.sumDigits(451231232);

//        NumberPalindrome.isPalindrome(12321);

//        FirstLastDigitSum.sumFirstAndLastDigit(52231236);

//        EvenDigitSum.getEvenDigitSum(12342);

//        SharedDigit.hasSharedDigit(12, 90);

//        LastDigitChecker.hasSameLastDigit(121, 123, 323);


//        GreatestCommonDivisor.getGreatestCommonDivisor(81, 153);


//        FactorPrinter.printFactors(32);

//        PerfectNumber.isPerfectNumber(5);
//
//        NumberToWords.numberToWords(1000);
//        System.out.println(NumberToWords.reverse(-2521));

//        System.out.println(NumberToWords.reverse(2345));

//        NumberToWords.getDigitCount(231);

//        System.out.println(FlourPacker.canPack(1,0, 4));
//        System.out.println(FlourPacker.canPack(1,0, 5));
//        System.out.println(FlourPacker.canPack(0,5, 4));
//        System.out.println(FlourPacker.canPack(2,2, 12));
//        System.out.println(FlourPacker.canPack(-3,2, 12));
//        System.out.println(FlourPacker.canPack(2,1, 5));
//        System.out.println(FlourPacker.canPack(2,10, 18));
//        System.out.println(FlourPacker.canPack(6,2, 17));

//        LargestPrime.isPrime(41);
//
//        System.out.println(LargestPrime.getLargestPrime(21));
//        System.out.println(LargestPrime.getLargestPrime(217));
//        System.out.println(LargestPrime.getLargestPrime(0));
//        System.out.println(LargestPrime.getLargestPrime(45));
//        System.out.println(LargestPrime.getLargestPrime(-1));
//        System.out.println(LargestPrime.getLargestPrime(2));

        DiagonalStar.printSquareStar(20);







    }








    public static boolean isEvenNumber (int number){
        while (number % 2 == 0){
            return true;
        } return false;
    }





    public static boolean isPrime(int n){
        if(n == 1){
            return false;
        }

        for(int i=2; i<=n/2; i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }

    public static double calculateInterest(double amount, double interestRate){
        return(amount * (interestRate/100));
    }



    public static void displayHighScorePosition(String name, int position) {
        System.out.println(name + " managed to get into position " + position + " on the high score table.");
    }

    public static int calculateHighScorePosition(int score) {
        if (score > 1000) {
            return 1;
        } else if (score > 500 ) {
            return 2;
        } else if (score > 100 ) {
            return 3;
        }
        return 4;
    }

    public static double calcFeetAndInchesToCentimeters (double feet, double inches){
        if ((feet <0) || (inches <0) || (inches > 12)){
            return -1;
        } else {
            double cm = feet * 12 * 2.54 + inches * 2.54;
            System.out.println(feet + " feet and " + inches + " inches equals: " + cm + " cm.");
            return cm;
        }
    }

    public static double calcFeetAndInchesToCentimeters (double inches){
        if (inches <0) {
            return -1;
        } else {
            double foot = inches / 12;
            System.out.println("There are " + foot + " feet in " + inches + " inches.");
            return foot;
        }
    }


    public static String getDurationString ( int minutes, int seconds ){
        int hours = 0;
        if ( minutes < 0 || seconds < 0 || seconds > 59){
            return null;
        }

        hours = minutes / 60;
        minutes = minutes % 60;

        if (hours < 10 || minutes < 10 || seconds < 10 ){
            String duration = "0" + hours + "h " + "0" + minutes + "m " + "0" + seconds +"s";
            return duration;
        }
        String duration = hours + "h " + minutes + "m " + seconds +"s";
        return duration;
    }

    public static String getDurationString ( int seconds ){
        int minutes;
        if ( seconds < 0 ) {
            return null;
        }
        minutes = seconds / 60 ;
        seconds = seconds % 60 ;

        return getDurationString(minutes, seconds);
    }













}
