package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.



import java.util.Scanner;


public class Main {
    public int addNumbers(int a, int b) {
        return a+b;
    }
    public int subNumbers(int a, int b) {
        return a-b;
    }
    public int mulNumbers(int a, int b) {
        return a*b;
    }
    public double divNumbers(int a, int b) {
        double num=1e9;
        if(b==0) {
            return num;
        }
        return (double)a/b;
    }




    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Main calculator = new Main();
        System.out.println("----****----");
        System.out.println("Calculator");
        System.out.println("----****----");




        int ch=5;

        do{
            System.out.println("Enter operation:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");
            ch=sc.nextInt();
            int a, b, ans;

            switch(ch){
                case 1:
                    System.out.println("Enter two numbers: ");
                    a=sc.nextInt();
                    b=sc.nextInt();
                    ans = calculator.addNumbers(a, b);
                    System.out.println("Answer: " + ans);
                    break;

                case 2:
                    System.out.println("Enter two numbers: ");
                    a=sc.nextInt();
                    b=sc.nextInt();
                    ans = calculator.subNumbers(a, b);
                    System.out.println("Answer: " + ans);
                    break;

                case 3:
                    System.out.println("Enter two numbers: ");
                    a=sc.nextInt();
                    b=sc.nextInt();
                    ans = calculator.mulNumbers(a, b);
                    System.out.println("Answer: " + ans);
                    break;

                case 4:
                    System.out.println("Enter two numbers: ");
                    a=sc.nextInt();
                    b=sc.nextInt();
                    double x = calculator.divNumbers(a, b);
                    if(x==1e9){
                        System.out.println("Invalid Input By User");
                    }
                    else{
                        System.out.println("Answer: " + x);
                    }
                    break;

                case 5:
                    System.out.println("Successful Exit!");
                    break;

                default:
                    System.out.println("Invalid Choice! Sorry");
            }
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
            System.out.println();
        } while(ch!=5);
        sc.close();
    }
}