import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 10; i++) System.out.println("Bright IT Career");

        int num = 1;
        while (num <= 20) {
            System.out.print(num + " ");
            num++;
        }
        System.out.println();

        int a = 10, b = 20;
        System.out.println(a == b ? "Equal" : "Not Equal");

        System.out.print("Odd: ");
        for (int i = 1; i <= 20; i += 2) System.out.print(i + " ");
        System.out.print("\nEven: ");
        for (int i = 2; i <= 20; i += 2) System.out.print(i + " ");
        System.out.println();

        System.out.println("Enter three numbers: ");
        int x = sc.nextInt(), y = sc.nextInt(), z = sc.nextInt();
        System.out.println("Largest: " + Math.max(x, Math.max(y, z)));

        int evenNum = 10;
        while (evenNum <= 20) {
            System.out.print(evenNum + " ");
            evenNum += 2;
        }
        System.out.println();

        int doNum = 1;
        do {
            System.out.print(doNum + " ");
            doNum++;
        } while (doNum <= 10);
        System.out.println();

        System.out.println("Enter a number to check Armstrong: ");
        int armNum = sc.nextInt(), temp = armNum, sum = 0, digits;
        while (temp > 0) {
            digits = temp % 10;
            sum += digits * digits * digits;
            temp /= 10;
        }
        System.out.println(armNum == sum ? "Armstrong" : "Not Armstrong");

        System.out.println("Enter a number to check Prime: ");
        int primeNum = sc.nextInt(), flag = 0;
        if (primeNum > 1) {
            for (int i = 2; i <= primeNum / 2; i++) {
                if (primeNum % i == 0) {
                    flag = 1;
                    break;
                }
            }
        }
        System.out.println(flag == 0 ? "Prime" : "Not Prime");

        System.out.println("Enter a number to check Palindrome: ");
        int palNum = sc.nextInt(), rev = 0, palTemp = palNum;
        while (palTemp > 0) {
            rev = rev * 10 + palTemp % 10;
            palTemp /= 10;
        }
        System.out.println(palNum == rev ? "Palindrome" : "Not Palindrome");

        System.out.println("Enter a number to check Even/Odd using switch: ");
        int checkNum = sc.nextInt();
        switch (checkNum % 2) {
            case 0 -> System.out.println("Even");
            default -> System.out.println("Odd");
        }

        System.out.println("Enter M/F to check Gender: ");
        char gender = sc.next().charAt(0);
        switch (Character.toUpperCase(gender)) {
            case 'M' -> System.out.println("Male");
            case 'F' -> System.out.println("Female");
            default -> System.out.println("Invalid Input");
        }
        sc.close();
    }
}