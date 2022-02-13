//package practiceforneobis.week1;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.InputMismatchException;
//import java.util.Scanner;
//
//public class Week1 {
//    public static void main(String[] args) throws InputMismatchException {


//        Scanner in = new Scanner(System.in); // Banknotes
//        int N = in.nextInt();
//        System.out.println(N);
//        System.out.print((N / 100) + " nota(s) de R$ 100,00\n");
//        N -= (N / 100) * 100;
//        System.out.print((N / 50) + " nota(s) de R$ 50,00\n");
//        N -= (N / 50) * 50;
//        System.out.print((N / 20) + " nota(s) de R$ 20,00\n");
//        N -= (N / 20) * 20;
//        System.out.print((N / 10) + " nota(s) de R$ 10,00\n");
//        N -= (N / 10) * 10;
//        System.out.print((N / 5) + " nota(s) de R$ 5,00\n");
//        N -= (N / 5) * 5;
//        System.out.print((N / 2) + " nota(s) de R$ 2,00\n");
//        N -= (N / 2) * 2;
//        System.out.print((N / 1) + " nota(s) de R$ 1,00\n");
//        in.close();


        //   Scanner sc = new Scanner(System.in); // Banknotes and coins
//        double db = sc.nextDouble();
//        int a =  (int)(Math.round((db - (int)db)* 100));
//        int N = (int) db ;
//        System.out.print("NOTAS:\n");
//        System.out.print((N/100)+ " nota(s) de R$ 100.00\n");
//        N-=(N/100)*100;
//        System.out.print((N/50)+ " nota(s) de R$ 50.00\n");
//        N-=(N/50)*50;
//        System.out.print((N/20)+ " nota(s) de R$ 20.00\n");
//        N-=(N/20)*20;
//        System.out.print((N/10)+ " nota(s) de R$ 10.00\n");
//        N-=(N/10)*10;
//        System.out.print((N/5)+ " nota(s) de R$ 5.00\n");
//        N-=(N/5)*5;
//        System.out.print((N/2)+ " nota(s) de R$ 2.00\n");
//        N-=(N/2)*2;
//        System.out.print("MOEDAS:\n");
//        System.out.print((N/1)+ " moeda(s) de R$ 1.00\n");
//        N = a;
//        System.out.print((N/50)+ " moeda(s) de R$ 0.50\n");
//        N-=(N/50)*50;
//        System.out.print((N/25)+ " moeda(s) de R$ 0.25\n");
//        N-=(N/25)*25;
//        System.out.print((N/10)+ " moeda(s) de R$ 0.10\n");
//        N-=(N/10)*10;
//        System.out.print((N/5)+ " moeda(s) de R$ 0.05\n");
//        N-=(N/5)*5;
//        System.out.print((N)+ " moeda(s) de R$ 0.01\n");
//        N -= (N);
//        sc.close();


//        Scanner sc = new Scanner(System.in); // Triangle
//        String str = sc.nextLine();
//        String[] sRay = str.split(" ");
//        double a = Double.parseDouble(sRay[0]);
//        double b = Double.parseDouble(sRay[1]);
//        double c = Double.parseDouble(sRay[2]);
//        if (a >= b + c || b >= a + c || c >= a + b) {
//            System.out.println("NAO FORMA TRIANGULO");// Right
//        } else if (Math.pow(a, 2) == Math.pow(b, 2) + Math.pow(c, 2) || Math.pow(b, 2) == Math.pow(a, 2) + Math.pow(c, 2) || Math.pow(c, 2) == Math.pow(b, 2) + Math.pow(a, 2)) {
//            System.out.println("TRIANGULO RETANGULO");// Right
//        } else if ((Math.pow(a, 2) > (Math.pow(b, 2) + Math.pow(c, 2)) || Math.pow(b, 2) > Math.pow(a, 2) + Math.pow(c, 2) || Math.pow(c, 2) > Math.pow(b, 2) + Math.pow(a, 2)) && (a == c || b == c || a == b)) {
//
//            System.out.println("TRIANGULO OBTUSANGULO");// Right
//            System.out.println("TRIANGULO ISOSCELES");
//
//        } else if (Math.pow(a, 2) > Math.pow(b, 2) + Math.pow(c, 2) || Math.pow(b, 2) > Math.pow(a, 2) + Math.pow(c, 2) || Math.pow(c, 2) > Math.pow(b, 2) + Math.pow(a, 2)) {
//            System.out.println("TRIANGULO OBTUSANGULO");// Right
//
//        } else if ((Math.pow(a, 2) < Math.pow(b, 2) + Math.pow(c, 2)) && (a == b && a == c && b == c && b == a)) {
//            System.out.println("TRIANGULO ACUTANGULO");
//            System.out.println("TRIANGULO EQUILATERO");
//
//
//        } else if ((Math.pow(a, 2) < Math.pow(b, 2) + Math.pow(c, 2) || Math.pow(b, 2) < Math.pow(a, 2) + Math.pow(c, 2) || Math.pow(c, 2) < Math.pow(a, 2) + Math.pow(b, 2)) && a == b || b == c || c == a) {
//            System.out.println("TRIANGULO ACUTANGULO");
//            System.out.println("TRIANGULO ISOSCELES");
//
//        }else if (Math.pow(a, 2) < Math.pow(b, 2) + Math.pow(c, 2) || Math.pow(b, 2) < Math.pow(a, 2) + Math.pow(c, 2) || Math.pow(c, 2) < Math.pow(a, 2) + Math.pow(b, 2)) {
//            System.out.println("TRIANGULO ACUTANGULO");// Right
//
//        }
//
//        else if (a == b && b == c) {
//            System.out.println("TRIANGULO EQUILATERO");
//
//        } else if (a == b || c == b || a == c) {
//            System.out.println("TRIANGULO ISOSCELES");
//        }


//        Scanner sc = new Scanner(System.in); // GameTime
//        String str = sc.nextLine();
//        String[] str2 = str.split(" ");
//        int a = Integer.parseInt(str2[0]);
//        int b = Integer.parseInt(str2[1]);
//        if (a == b) {
//            System.out.println("O JOGO DUROU " + 24 + " HORA(S)");
//        } else if ((a == 12 && b > 12)) {
//            System.out.println("O JOGO DUROU " + (b - a) + " HORA(S)");
//
//        } else if ((b == 12 && a > 12)) {
//            System.out.println("O JOGO DUROU " + (a - b) + " HORA(S)");
//
//        }else if ((a > 12 && a > b) && b < 12 && b != 0 && a < 24) {
//            System.out.println("O JOGO DUROU " + (24 % a + b) + " HORA(S)");
//
//        } else if ((b > 12 && b > a) && a < 12 && a != 0) {
//            System.out.println("O JOGO DUROU " + (b - a) + " HORA(S)");
//
//        } else if ((a > 12 && a > b) && (b > 12)) {
//            System.out.println("O JOGO DUROU " + (a - b) + " HORA(S)");
//
//        } else if (a == 12) {
//            System.out.println("O JOGO DUROU " + (a + b) + " HORA(S)");
//
//        } else if (b == 12) {
//
//            System.out.println("O JOGO DUROU " + (12 - a) + " HORA(S)");
//
//        } else if (b > 12 && a > 12) {
//            System.out.println("O JOGO DUROU " + (b - a) + " HORA(S)");
//
//        } else if (a < 12 && a > b) {
//            System.out.println("O JOGO DUROU " + (a - b) + " HORA(S)");
//
//        } else if (b < 12 && b != 0 && a < 24) {
//            System.out.println("O JOGO DUROU " + (b - a) + " HORA(S)");
//
//        } else if (a == 0) {
//            System.out.println("O JOGO DUROU " + b + " HORA(S)");
//
//        } else if (b == 0) {
//            System.out.println("O JOGO DUROU " + (24 - a) + " HORA(S)");
//        }


//      double l = 1; //  Sequence IJ 4
//       for (double k = 0; k <= 2; k += 0.2) {
//
//            if (k == 1 || k == 0 || k >= 1.9) {
//                System.out.printf("I=%d J=%d%n", Math.round(k), (int) (k + l));
//                System.out.printf("I=%d J=%d%n", Math.round(k), (int) (k + l + 1));
//                System.out.printf("I=%d J=%d%n", Math.round(k), (int) (k + l + 2));
//            } else {
//                System.out.printf("I=%.1f J=%.1f%n", k, k + l);
//                System.out.printf("I=%.1f J=%.1f%n", k, k + l + 1);
//                System.out.printf("I=%.1f J=%.1f%n", k, k + l + 2);
//            }
//        }

//
//
//        Scanner sc=new Scanner(System.in); // Weighted Averages
//        int a= sc.nextInt();
//        float a1;
//        float a2;
//        float a3;
//        float a4;
//
//        for( int i=0;i<a;i++){
//            a1= sc.nextFloat();
//            a2= sc.nextFloat();
//            a3= sc.nextFloat();
//
//            a4=((a1/10)*2) + ((a2/10)*3) + ((a3/10)*5);
//            System.out.printf("%.1f\n",a4);
//    }
//}


//        Scanner sc = new Scanner(System.in);// Population Increase
//        int i, j;
//        int PA, PB;
//        int T;
//        double G1, G2;
//        T = sc.nextInt();
//
//        for (i = 0; i < T; i++) {
//            j = 0;
//            PA = sc.nextInt();
//            PB = sc.nextInt();
//            G1 = sc.nextDouble();
//            G2 = sc.nextDouble();
//            while (PA <= PB) {
//                PA = (int) (PA + ((PA * G1) / 100));
//                PB = (int) (PB + ((PB * G2) / 100));
//                j++;
//                if (j > 100) {
//                    System.out.print("Mais de 1 seculo.\n");
//                    break;
//                }
//            }
//            if (j <= 100)
//                System.out.printf("%d anos.\n", j);
//        }

//        Scanner sc = new Scanner(System.in);//  Column in Array
//        float[][] arr = new float[12][12];
//        int num = sc.nextInt();
//
//        String letter = sc.next();
//        float s = 0;
//        float a = 0;
//        for (int i = 0; i < 12; i++) {
//            for (int j = 0; j < 12; j++) {
//                arr[i][j] = sc.nextFloat();
//            }
//        }
//        for (int i = 0; i < 12; i++) {
//            s += arr[i][num];
//        }
//        a = s / 12;
//        if (letter.equals("S")) {
//            System.out.printf("%.1f\n", s);
//        } else if (letter.equals("M")) {
//
//            System.out.printf("%.1f\n", a);
//        }


//        Scanner sc = new Scanner(System.in);//  Logical Sequence 2
//        String nums = sc.nextLine();
//        String[] arr = nums.split(" ");
//
//        for (int i = 1; i <= Integer.parseInt(arr[1]); i++) {
//            if (i % Integer.parseInt(arr[0]) == 0) {
//                System.out.print(i);
//                System.out.println();
//            } else if (i == Integer.parseInt(arr[1])) {
//                System.out.print(i);
//            } else if (Integer.parseInt(arr[0]) % i != 0) {
//                System.out.print(i + " ");
//            } else if (i % Integer.parseInt(arr[0]) != 0) {
//                System.out.print(i + " ");
//            }
//        }



//
//        int a; //  Grenais
//        int b;
//        int c = 0;
//        int i = 0;
//        int g = 0;
//        int d = 0;
//        int t = 0;
//        Scanner sc = new Scanner(System.in);
//        for (int j = 10; j > 5; j++) {
//            a = sc.nextInt();
//            b = sc.nextInt();
//            System.out.print("Novo grenal (1-sim 2-nao)\n");
//            c++;
//            if (a > b) {
//                i++;
//            } else if (a < b) {
//                g++;
//            } else {
//                d++;
//            }
//            t = sc.nextInt();
//
//            if (t == 1) {
//            } else {
//                break;
//            }
//        }
//
//
//        System.out.printf("%d grenais\n", c);
//        System.out.printf("Inter:%d\n", i);
//        System.out.printf("Gremio:%d\n", g);
//        System.out.printf("Empates:%d\n", d);
//
//
//        if (i > g) {
//            System.out.print("Inter venceu mais\n");
//        } else if (i < g) {
//            System.out.print("Gremio venceu mais\n");
//        } else {
//            System.out.print("Não houve vencedor\n");
//        }
//
//
//    }
//
//}
