package Patterns;

import java.util.Scanner;

public class AllPatterns {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("For Square pattern : ");
        int sqr = sc.nextInt();
        for (int i = 0; i < sqr - 1; i++) {
            for (int j = 0; j < sqr; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.print("For Hallow Pattern : ");
        int hal = sc.nextInt();
        for (int i = 1; i <= hal - 1; i++) {
            for (int j = 1; j <= hal; j++) {
                if (j == 1 || j == hal || i == 1 || i == (hal - 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        System.out.print("For half Pyramid : ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("For Inverted half Pyramid : ");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("For rotated inverted half pyramid : ");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("Inverted pyramid with number :");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

        System.out.println("Floyds triangle :");
        int count = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print((count++) + " ");
            }
            System.out.println();
        }

        System.out.println("0 1 Triangle : ");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if (((i + j) % 2) == 0)
                    System.out.print("1 ");
                else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }

        System.out.println("HomeWork : 1 ");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < n - i + 1; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("HomeWork : 2 ");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < n - i + 1; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

        System.out.println("Homework : 3 ");
        for (int i = 1; i <= n; i++) {

            //spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            //part-1
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }

            //part-2
            for (int j = 2; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

        System.out.print("Enter val for Rhombus : ");
        n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }

            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int i = 4; i >= 1; i--) {

            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }

            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("Butterfly pattern : ");
        for (int i = 1; i <= n; i++) {

            //part 1
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            for (int j = 1; j <= (n * 2 - (2 * i)); j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        for (int i = 5; i >= 1; i--) {

            //part 1
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            for (int j = 1; j <= (n * 2 - (2 * i)); j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
