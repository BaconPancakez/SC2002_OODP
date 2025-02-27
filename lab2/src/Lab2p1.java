package lab2.src;

import java.util.Scanner;

public class Lab2p1 {
    public static void main(String[] args)
    {
        int choice,a,b,total = 0;
        long odd;
        Scanner sc = new Scanner(System.in);
        do {
            
            System.out.println("Perform the following methods:");
            System.out.println("1: miltiplication test");
            System.out.println("2: quotient using division by subtraction");
            System.out.println("3: remainder using division by subtraction");
            System.out.println("4: count the number of digits");
            System.out.println("5: position of a digit");
            System.out.println("6: extract all odd digits");
            System.out.println("7: quit");
            choice = sc.nextInt();

            switch (choice) {
                case 1: /* add mulTest() call */
                    mulTest(sc);
                    break;
                case 2: /* add divide() call */
                    System.out.println("Input the first Value: ");
                    a = sc.nextInt();
                    System.out.println("Input the second Value: ");
                    b = sc.nextInt();
                    System.out.printf("%d/ %d = %d\n",a,b,divide(a,b));
                    break;
                case 3: /* add modulus() call */
                    System.out.println("Input the first Value: ");
                    a = sc.nextInt();
                    System.out.println("Input the second Value: ");
                    b = sc.nextInt();
                    System.out.printf("%d mod %d = %d\n",a,b,modulus(a,b));
                    break;
                case 4: /* add countDigits() call */
                    System.out.println("Input the Value: ");
                    a = sc.nextInt();
                    b = countDigit(a);
                    if(b <= 0)
                        System.out.println("Error input!!-");
                    else
                        System.out.printf("Count - %d",b);
                    break;
                case 5: /* add position() call */
                    System.out.println("Input the source: ");
                    a = sc.nextInt();
                    System.out.println("Input the target: ");
                    b = sc.nextInt();
                    System.out.printf("Position = %d\n",position(a,b));
                    break;
                case 6: /* add extractOddDigits() call */
                    System.out.println("Input the value: ");
                    odd = sc.nextLong();
                    System.out.printf("Position = %d\n",extractOddDigits(odd));
                    break;
                case 7: System.out.println("Program terminating ….");
            } 
        } while (choice < 7);
    }

    /* add method code here */
    private static void mulTest(Scanner scanner){
        int num1,num2,total,guess,count=0,n=5;
        for (int i = 0; i < n; i++) {
            num1 = (int) ((Math.random()* 9)+1);
            num2 = (int) ((Math.random()* 9)+1);
            total = num1 * num2;
            System.out.printf("How much is %d times %d? ", num1,num2);
            guess = scanner.nextInt();
            if(guess == total)
                count+=1;
            
        }
        System.out.printf("%d answers out of %d are correct\n\n",count,n);
    }

    private static int divide(int m, int n)
    {
        int count = 0;
        while( m >= n)
        {
            m = m - n;
            count += 1;
            if(m < n){
                return count;
            }
        }
        return count;
    }

    private static int modulus(int m, int n)
    {
        while(m > 0)
        {
            if(m < n)
            {
                return m;
            }
            m = m - n;
        }
        return m;
    }

    private static int countDigit(int m)
    {
        int count = 1;
        if(m <= 0)
        {
            return -1;
        }
        else
        {
            while(m >= 9)
            {
                m = m / 10;
                count += 1;
            }
            return count;
        }
    }

    private static int position(int m,int target)
    {
        int position = -1;
        int count = 0,digit;
        while(m > 0)
        {
            digit = modulus(m, 10);
            count+=1;
            if(digit == target)
            {
                position = count;
            }
            m = m / 10;
        }
        return position;
    }

    public static long extractOddDigits(long n)
    {
        long num = 0;
        int times = 1,digit;
        while(n > 0)
        {
            digit = modulus((int)n, 10);
            if(modulus(digit, 2) != 0)
            {
                num = num + (digit * times);
                times = times * 10;
            }
            n = n / 10;
        }
        return num;
    }
}



