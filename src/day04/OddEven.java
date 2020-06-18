package day04;


import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        int a[]=new int[8];
        int i,oddNum = 0,evenNum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入8个整数：");
        for(i=0;i<8;i++) {
            a[i] = scanner.nextInt();
        }
        for(i=0;i<8;i++) {
            if(a[i]%2==0){
                evenNum++;
            }else {
                oddNum++;
            }
        }
        int odd[] = new int[oddNum];
        int even[] = new int[evenNum];
        output(a,even,odd);
    }
    public static void output(int a[],int b[],int c[]) {
        int i, evenNum = 0, oddNum = 0, evenN = 0, oddN = 0;
        int d[] = new int[8];
        for (i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                b[evenNum] = a[i];
                evenNum++;
            } else {
                c[oddNum] = a[i];
                oddNum++;
            }
        }
        i = 0;evenNum--;oddNum--;
        while(evenN<b.length&&oddN<c.length) {

            if (i % 2 != 0) {
                d[i++] = b[evenN++];
            } else {
                d[i++] = c[oddN++];
            }
        }
            if (b.length < c.length) {
                for (; oddN < c.length; oddN++) {
                    d[i++] = c[oddN];
                }
            } else {
                for (; evenN <b.length; evenN++) {
                    d[i++] = b[evenN];
                }
            }
        for(i=0;i<8;i++) {
            System.out.print(d[i]+"\t");
        }
    }
}
