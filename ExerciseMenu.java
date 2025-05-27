import java.util.Scanner;

public class ExerciseMenu {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            printMenu();
            System.out.print("Enter your choice (0 to exit): ");
            int choice = -1;
            if(sc.hasNextInt()) {
                choice = sc.nextInt();
                sc.nextLine(); // consume newline
            } else {
                System.out.println("Invalid input! Please enter a number.");
                sc.nextLine();
                continue;
            }

            if (choice == 0) {
                System.out.println("Exiting program. Goodbye!");
                break;
            }

            switch (choice) {
                case 1: printHelloWorld(); break;
                case 2: addTwoNumbers(); break;
                case 3: calculateAverage(); break;
                case 4: checkEvenOdd(); break;
                case 5: findLargestNumber(); break;
                case 6: swapTwoNumbers(); break;
                case 7: checkLeapYear(); break;
                case 8: printMultiplicationTable(); break;
                case 9: calculatePower(); break;
                case 10: celsiusToFahrenheit(); break;
                case 11: fibonacciSeries(); break;
                case 12: factorialCalculation(); break;
                case 13: palindromeChecker(); break;
                case 14: reverseString(); break;
                case 15: largestOfThree(); break;
                case 16: primeChecker(); break;
                case 17: sumOfDigits(); break;
                case 18: countVowels(); break;
                case 19: printPattern(); break;
                case 20: simpleInterestCalculator(); break;
                case 21: decimalToBinary(); break;
                case 22: binaryToDecimal(); break;
                case 23: gcdCalculation(); break;
                case 24: lcmCalculation(); break;
                case 25: countWordsInString(); break;
                case 26: swapWithoutTemp(); break;
                case 27: armstrongNumberCheck(); break;
                case 28: printReverseNumber(); break;
                case 29: calculateCompoundInterest(); break;
                case 30: findSecondLargest(); break;
                case 31: countCharacterFrequency(); break;
                case 32: checkAnagram(); break;
                case 33: removeDuplicatesFromArray(); break;
                case 34: mergeTwoArrays(); break;
                case 35: bubbleSort(); break;
                case 36: insertionSort(); break;
                case 37: linearSearch(); break;
                case 38: binarySearch(); break;
                case 39: sumOfArrayElements(); break;
                case 40: transposeMatrix(); break;
                case 41: multiplyMatrices(); break;
                default:
                    System.out.println("Invalid choice. Please choose between 0 and 41.");
            }
        }
        sc.close();
    }

    static void printMenu() {
        System.out.println("\n====== Exercise Menu ======");
        for (int i = 1; i <= 41; i++) {
            System.out.println(i + ". " + getExerciseName(i));
        }
        System.out.println("0. Exit");
    }

    static String getExerciseName(int n) {
        switch (n) {
            case 1: return "Print Hello World";
            case 2: return "Add Two Numbers";
            case 3: return "Calculate Average of Three Numbers";
            case 4: return "Check Even or Odd";
            case 5: return "Find Largest of Two Numbers";
            case 6: return "Swap Two Numbers";
            case 7: return "Check Leap Year";
            case 8: return "Print Multiplication Table";
            case 9: return "Calculate Power";
            case 10: return "Convert Celsius to Fahrenheit";
            case 11: return "Fibonacci Series";
            case 12: return "Factorial Calculation";
            case 13: return "Palindrome Checker";
            case 14: return "Reverse a String";
            case 15: return "Find Largest of Three Numbers";
            case 16: return "Check Prime Number";
            case 17: return "Sum of Digits";
            case 18: return "Count Vowels in String";
            case 19: return "Print Pattern (Triangle)";
            case 20: return "Simple Interest Calculator";
            case 21: return "Decimal to Binary Conversion";
            case 22: return "Binary to Decimal Conversion";
            case 23: return "GCD Calculation";
            case 24: return "LCM Calculation";
            case 25: return "Count Words in a String";
            case 26: return "Swap Two Numbers without Temp Variable";
            case 27: return "Check Armstrong Number";
            case 28: return "Print Reverse of a Number";
            case 29: return "Calculate Compound Interest";
            case 30: return "Find Second Largest in Array";
            case 31: return "Count Character Frequency in String";
            case 32: return "Check Anagram";
            case 33: return "Remove Duplicates from Array";
            case 34: return "Merge Two Arrays";
            case 35: return "Bubble Sort";
            case 36: return "Insertion Sort";
            case 37: return "Linear Search";
            case 38: return "Binary Search";
            case 39: return "Sum of Array Elements";
            case 40: return "Transpose of a Matrix";
            case 41: return "Multiply Two Matrices";
            default: return "Unknown Exercise";
        }
    }

    // Exercise 1
    static void printHelloWorld() {
        System.out.println("Hello World");
    }

    // Exercise 2
    static void addTwoNumbers() {
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        sc.nextLine();
        System.out.println("Sum = " + (a + b));
    }

    // Exercise 3
    static void calculateAverage() {
        System.out.print("Enter three numbers separated by space: ");
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        sc.nextLine();
        double avg = (a + b + c) / 3.0;
        System.out.println("Average = " + avg);
    }

    // Exercise 4
    static void checkEvenOdd() {
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        sc.nextLine();
        if (num % 2 == 0)
            System.out.println(num + " is Even");
        else
            System.out.println(num + " is Odd");
    }

    // Exercise 5
    static void findLargestNumber() {
        System.out.print("Enter two numbers separated by space: ");
        int a = sc.nextInt(), b = sc.nextInt();
        sc.nextLine();
        if (a > b)
            System.out.println(a + " is largest");
        else if (b > a)
            System.out.println(b + " is largest");
        else
            System.out.println("Both numbers are equal");
    }

    // Exercise 6
    static void swapTwoNumbers() {
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        sc.nextLine();
        System.out.println("Before swapping: a = " + a + ", b = " + b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After swapping: a = " + a + ", b = " + b);
    }

    // Exercise 7
    static void checkLeapYear() {
        System.out.print("Enter year: ");
        int year = sc.nextInt();
        sc.nextLine();
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
            System.out.println(year + " is a Leap Year.");
        else
            System.out.println(year + " is not a Leap Year.");
    }

    // Exercise 8
    static void printMultiplicationTable() {
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        sc.nextLine();
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }

    // Exercise 9
    static void calculatePower() {
        System.out.print("Enter base number: ");
        double base = sc.nextDouble();
        System.out.print("Enter exponent: ");
        int exp = sc.nextInt();
        sc.nextLine();
        System.out.println(base + " raised to power " + exp + " = " + Math.pow(base, exp));
    }

    // Exercise 10
    static void celsiusToFahrenheit() {
        System.out.print("Enter Celsius temperature: ");
        double c = sc.nextDouble();
        sc.nextLine();
        double f = (c * 9 / 5) + 32;
        System.out.println(c + " °C = " + f + " °F");
    }

    // Exercise 11
    static void fibonacciSeries() {
        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();
        sc.nextLine();
        int a = 0, b = 1;
        System.out.print("Fibonacci Series: ");
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
        System.out.println();
    }

    // Exercise 12
    static void factorialCalculation() {
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        sc.nextLine();
        long fact = 1;
        for (int i = 2; i <= num; i++) fact *= i;
        System.out.println("Factorial of " + num + " = " + fact);
    }

    // Exercise 13
    static void palindromeChecker() {
        System.out.print("Enter string: ");
        String str = sc.nextLine();
        String rev = new StringBuilder(str).reverse().toString();
        if (str.equalsIgnoreCase(rev))
            System.out.println(str + " is a palindrome.");
        else
            System.out.println(str + " is not a palindrome.");
    }

    // Exercise 14
    static void reverseString() {
        System.out.print("Enter string: ");
        String str = sc.nextLine();
        String rev = new StringBuilder(str).reverse().toString();
        System.out.println("Reversed string: " + rev);
    }

    // Exercise 15
    static void largestOfThree() {
        System.out.print("Enter three numbers: ");
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        sc.nextLine();
        int max = Math.max(a, Math.max(b, c));
        System.out.println("Largest number is: " + max);
    }

    // Exercise 16
    static void primeChecker() {
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        sc.nextLine();
        if (num <= 1) {
            System.out.println(num + " is not prime.");
            return;
        }
        boolean prime = true;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                prime = false;
                break;
            }
        }
        if (prime)
            System.out.println(num + " is a prime number.");
        else
            System.out.println(num + " is not a prime number.");
    }

    // Exercise 17
    static void sumOfDigits() {
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        sc.nextLine();
        int sum = 0;
        while (num != 0) {
            sum += num % 10;
            num /= 10;
        }
        System.out.println("Sum of digits = " + sum);
    }

    // Exercise 18
    static void countVowels() {
        System.out.print("Enter a string: ");
        String str = sc.nextLine().toLowerCase();
        int count = 0;
        for (char ch : str.toCharArray()) {
            if ("aeiou".indexOf(ch) != -1)
                count++;
        }
        System.out.println("Number of vowels: " + count);
    }

    // Exercise 19
    static void printPattern() {
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        sc.nextLine();
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) System.out.print("* ");
            System.out.println();
        }
    }

    // Exercise 20
    static void simpleInterestCalculator() {
        System.out.print("Enter principal: ");
        double p = sc.nextDouble();
        System.out.print("Enter rate (%): ");
        double r = sc.nextDouble();
        System.out.print("Enter time (years): ");
        double t = sc.nextDouble();
        sc.nextLine();
        double si = (p * r * t) / 100;
        System.out.println("Simple Interest = " + si);
    }

    // Exercise 21 - Decimal to Binary
    static void decimalToBinary() {
        System.out.print("Enter decimal number: ");
        int num = sc.nextInt();
        sc.nextLine();
        String bin = Integer.toBinaryString(num);
        System.out.println("Binary: " + bin);
    }

    // Exercise 22 - Binary to Decimal
    static void binaryToDecimal() {
        System.out.print("Enter binary number: ");
        String bin = sc.nextLine();
        try {
            int dec = Integer.parseInt(bin, 2);
            System.out.println("Decimal: " + dec);
        } catch (NumberFormatException e) {
            System.out.println("Invalid binary number.");
        }
    }

    // Exercise 23 - GCD Calculation
    static void gcdCalculation() {
        System.out.print("Enter two numbers: ");
        int a = sc.nextInt(), b = sc.nextInt();
        sc.nextLine();
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        System.out.println("GCD = " + a);
    }

    // Exercise 24 - LCM Calculation
    static void lcmCalculation() {
        System.out.print("Enter two numbers: ");
        int a = sc.nextInt(), b = sc.nextInt();
        sc.nextLine();
        int gcd = gcd(a, b);
        int lcm = (a * b) / gcd;
        System.out.println("LCM = " + lcm);
    }

    static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // Exercise 25 - Count words in string
    static void countWordsInString() {
        System.out.print("Enter a string: ");
        String str = sc.nextLine().trim();
        if (str.isEmpty()) {
            System.out.println("Number of words: 0");
            return;
        }
        String[] words = str.split("\\s+");
        System.out.println("Number of words: " + words.length);
    }

    // Exercise 26 - Swap two numbers without temp
    static void swapWithoutTemp() {
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        sc.nextLine();
        System.out.println("Before swapping: a = " + a + ", b = " + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After swapping: a = " + a + ", b = " + b);
    }

    // Exercise 27 - Armstrong number check
    static void armstrongNumberCheck() {
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        sc.nextLine();
        int sum = 0, temp = num;
        int digits = String.valueOf(num).length();
        while (temp != 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, digits);
            temp /= 10;
        }
        if (sum == num)
            System.out.println(num + " is an Armstrong number.");
        else
            System.out.println(num + " is not an Armstrong number.");
    }

    // Exercise 28 - Print reverse of a number
    static void printReverseNumber() {
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        sc.nextLine();
        int rev = 0;
        while (num != 0) {
            rev = rev * 10 + (num % 10);
            num /= 10;
        }
        System.out.println("Reversed number: " + rev);
    }

    // Exercise 29 - Compound Interest Calculation
    static void calculateCompoundInterest() {
        System.out.print("Enter principal amount: ");
        double p = sc.nextDouble();
        System.out.print("Enter rate of interest (%): ");
        double r = sc.nextDouble();
        System.out.print("Enter time (years): ");
        double t = sc.nextDouble();
        System.out.print("Enter number of times interest compounded per year: ");
        double n = sc.nextDouble();
        sc.nextLine();
        double amount = p * Math.pow(1 + (r / 100) / n, n * t);
        double ci = amount - p;
        System.out.println("Compound Interest = " + ci);
    }

    // Exercise 30 - Find second largest element in array
    static void findSecondLargest() {
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        sc.nextLine();
        if (n < 2) {
            System.out.println("Array must have at least two elements.");
            return;
        }
        int[] arr = new int[n];
        System.out.print("Enter " + n + " elements: ");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        sc.nextLine();

        int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE;
        for (int val : arr) {
            if (val > first) {
                second = first;
                first = val;
            } else if (val > second && val != first) {
                second = val;
            }
        }
        if (second == Integer.MIN_VALUE)
            System.out.println("There is no second largest element.");
        else
            System.out.println("Second largest element: " + second);
    }

    // Exercise 31 - Count character frequency in string
    static void countCharacterFrequency() {
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        int[] freq = new int[256];
        for (char ch : str.toCharArray()) freq[ch]++;
        System.out.println("Character frequencies:");
        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0)
                System.out.println((char) i + ": " + freq[i]);
        }
    }

    // Exercise 32 - Check Anagram
    static void checkAnagram() {
        System.out.print("Enter first string: ");
        String s1 = sc.nextLine().replaceAll("\\s+", "").toLowerCase();
        System.out.print("Enter second string: ");
        String s2 = sc.nextLine().replaceAll("\\s+", "").toLowerCase();
        if (s1.length() != s2.length()) {
            System.out.println("Strings are not anagrams.");
            return;
        }
        int[] count = new int[256];
        for (char c : s1.toCharArray()) count[c]++;
        for (char c : s2.toCharArray()) count[c]--;
        for (int val : count) {
            if (val != 0) {
                System.out.println("Strings are not anagrams.");
                return;
            }
        }
        System.out.println("Strings are anagrams.");
    }

    // Exercise 33 - Remove duplicates from array
    static void removeDuplicatesFromArray() {
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        sc.nextLine();
        int[] arr = new int[n];
        System.out.print("Enter " + n + " elements: ");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        sc.nextLine();

        int[] temp = new int[n];
        int j = 0;
        for (int i = 0; i < n; i++) {
            boolean found = false;
            for (int k = 0; k < j; k++) {
                if (arr[i] == temp[k]) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                temp[j++] = arr[i];
            }
        }
        System.out.print("Array after removing duplicates: ");
        for (int i = 0; i < j; i++) System.out.print(temp[i] + " ");
        System.out.println();
    }

    // Exercise 34 - Merge two arrays
    static void mergeTwoArrays() {
        System.out.print("Enter size of first array: ");
        int n1 = sc.nextInt();
        System.out.print("Enter size of second array: ");
        int n2 = sc.nextInt();
        sc.nextLine();
        int[] arr1 = new int[n1];
        int[] arr2 = new int[n2];
        System.out.print("Enter elements of first array: ");
        for (int i = 0; i < n1; i++) arr1[i] = sc.nextInt();
        System.out.print("Enter elements of second array: ");
        for (int i = 0; i < n2; i++) arr2[i] = sc.nextInt();
        sc.nextLine();

        int[] merged = new int[n1 + n2];
        System.arraycopy(arr1, 0, merged, 0, n1);
        System.arraycopy(arr2, 0, merged, n1, n2);

        System.out.print("Merged array: ");
        for (int val : merged) System.out.print(val + " ");
        System.out.println();
    }

    // Exercise 35 - Bubble Sort
    static void bubbleSort() {
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        sc.nextLine();
        int[] arr = new int[n];
        System.out.print("Enter elements: ");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i -1; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j]; arr[j] = arr[j+1]; arr[j+1] = temp;
                }
            }
        }
        System.out.print("Sorted array: ");
        for (int val : arr) System.out.print(val + " ");
        System.out.println();
    }

    // Exercise 36 - Insertion Sort
    static void insertionSort() {
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        sc.nextLine();
        int[] arr = new int[n];
        System.out.print("Enter elements: ");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i-1;
            while (j >= 0 && arr[j] > key) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
        System.out.print("Sorted array: ");
        for (int val : arr) System.out.print(val + " ");
        System.out.println();
    }

    // Exercise 37 - Linear Search
    static void linearSearch() {
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        sc.nextLine();
        int[] arr = new int[n];
        System.out.print("Enter elements: ");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter element to search: ");
        int key = sc.nextInt();
        sc.nextLine();

        int index = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] == key) {
                index = i;
                break;
            }
        }
        if (index == -1)
            System.out.println(key + " not found in array.");
        else
            System.out.println(key + " found at index " + index);
    }

    // Exercise 38 - Binary Search (array must be sorted)
    static void binarySearch() {
        System.out.print("Enter size of sorted array: ");
        int n = sc.nextInt();
        sc.nextLine();
        int[] arr = new int[n];
        System.out.print("Enter sorted elements: ");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter element to search: ");
        int key = sc.nextInt();
        sc.nextLine();

        int low = 0, high = n - 1, mid, index = -1;
        while (low <= high) {
            mid = (low + high) / 2;
            if (arr[mid] == key) {
                index = mid;
                break;
            } else if (arr[mid] < key)
                low = mid + 1;
            else
                high = mid - 1;
        }
        if (index == -1)
            System.out.println(key + " not found.");
        else
            System.out.println(key + " found at index " + index);
    }

    // Exercise 39 - Sum of array elements
    static void sumOfArrayElements() {
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        sc.nextLine();
        int[] arr = new int[n];
        System.out.print("Enter elements: ");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        sc.nextLine();

        int sum = 0;
        for (int val : arr) sum += val;
        System.out.println("Sum of array elements: " + sum);
    }

    // Exercise 40 - Factorial of a number
    static void factorial() {
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        sc.nextLine();
        long fact = 1;
        for (int i = 1; i <= n; i++) fact *= i;
        System.out.println("Factorial of " + n + " = " + fact);
    }

    // Exercise 41 - Fibonacci series
    static void fibonacciSeries() {
        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();
        sc.nextLine();
        int a = 0, b = 1;
        System.out.print("Fibonacci series: ");
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            int c = a + b;
            a = b;
            b = c;
        }
        System.out.println();
    }

}
