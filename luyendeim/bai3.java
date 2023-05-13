package luyendeim;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class bai3 {
    public static void main(String[] args) throws FileNotFoundException {
        String url = "D:\\CTDLvaTT\\FindThe3rdLargestNumber\\src\\luyendeim\\input.txt";
        FileInputStream fileInputStream = new FileInputStream(url);
        Scanner sc = new Scanner(fileInputStream);
        int[] dxk = {-2,-2,-1,1,2,2,1,-1};
        int[] dyk = {-1,1,2,2,1,-1,-2,-2};
        int T =sc.nextInt();
        for (int t = 1; t <= T; t++) {
            int m = sc.nextInt();
            int n = sc.nextInt();
            int[][] a = new int[m][n];
            int[][] nk=new int[2][999000];
            // duyet
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    a[i][j]=sc.nextInt();
                }
            }
            //
//            for (int i = 0; i < m; i++) {
//                for (int j = 0; j < n; j++) {
//                    System.out.print(a[i][j]+" ");
//                }
//                System.out.println();
//            }

            int k =0;
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (a[i][j]==2){
                        nk[0][k]=i;
                        nk[1][k]=j;
                        k++;
                    }
                }
            }
            // set knight
            int res =0;
            for (int i = 0; i < k; i++) {
                int xK = nk[0][i];
                int yK = nk[1][i];
                for (int j = 0; j < 8; j++) {
                    int nx = xK+dxk[j];
                    int ny = yK+dyk[j];
                    if (nx<0||nx>=n||ny<0||ny>=n){
                        continue;
                    }
                    if (a[nx][ny]==1){
                        res++;
                        a[nx][ny]=-1;
                    }
                }
            }
            System.out.println("#"+t+" "+res);
        }
    }
}
//5
//8 8
//1 1 0 1 1 0 2 1
//1 0 0 0 1 0 0 1
//0 0 0 0 1 1 0 0
//1 1 0 2 0 0 1 0
//0 0 0 0 1 1 0 0
//0 1 0 1 1 1 1 0
//0 2 0 1 1 0 1 1
//1 0 0 1 0 1 0 1
//
//8 8
//0 0 1 1 1 0 1 1
//0 2 0 1 1 0 0 0
//0 0 1 1 1 2 0 1
//1 1 1 0 1 0 0 0
//0 0 1 1 1 0 1 0
//1 2 1 1 1 1 1 0
//0 1 0 1 1 1 0 1
//0 1 0 0 1 2 1 1
//
//8 8
//1 1 0 0 0 0 1 0
//1 1 0 2 0 0 0 1
//0 0 1 0 0 1 1 1
//0 0 1 1 0 2 0 0
//0 0 1 0 1 1 1 1
//0 2 0 0 0 1 1 0
//1 0 1 0 1 1 1 1
//1 1 1 2 1 1 1 0
//
//15 15
//0 0 0 1 1 1 0 0 1 0 0 0 1 2 1
//1 1 1 1 0 1 1 1 1 0 1 0 0 0 1
//0 1 1 1 2 0 0 1 0 0 0 0 0 0 1
//1 1 0 0 1 0 1 0 0 0 1 1 0 0 1
//1 0 1 1 0 1 1 1 0 0 0 0 0 0 0
//1 1 0 1 1 0 0 2 0 0 1 1 1 1 0
//1 1 1 1 0 0 0 0 0 0 1 1 0 0 0
//1 0 0 1 1 1 0 0 1 1 1 0 0 1 0
//1 1 0 1 0 0 0 0 1 0 1 1 1 1 0
//0 1 0 0 0 1 0 1 0 0 1 0 1 0 0
//2 0 1 0 0 0 1 0 1 1 1 0 0 1 0
//0 0 0 0 1 1 0 1 0 1 1 1 0 1 1
//0 1 1 2 1 1 1 0 1 0 1 0 1 1 1
//0 0 0 1 1 1 0 0 0 1 1 1 1 1 1
//0 1 1 0 1 1 0 0 1 1 2 1 1 1 0
//
//15 15
//1 0 1 0 0 1 1 2 1 1 0 0 0 0 0
//1 0 1 1 1 0 1 1 1 1 0 0 1 0 0
//0 0 1 1 0 0 1 0 1 0 0 1 1 1 0
//1 0 1 0 0 0 1 0 0 1 1 1 0 1 0
//1 1 0 0 0 1 1 0 0 2 0 0 0 0 1
//1 1 1 1 1 1 1 0 1 1 0 0 1 1 1
//2 1 0 1 0 1 0 0 0 1 1 0 1 0 0
//1 1 0 1 0 1 1 1 0 1 1 1 0 1 1
//1 1 1 0 0 1 1 1 1 0 0 0 0 1 1
//0 1 1 0 1 1 1 1 1 1 0 0 0 1 1
//1 0 1 0 0 0 0 1 0 0 1 1 0 0 0
//0 1 0 1 1 0 0 0 0 0 1 1 1 1 1
//0 0 1 0 1 0 1 0 1 0 0 1 1 1 1
//1 0 1 1 0 1 1 1 0 0 0 0 1 1 0
//1 0 0 0 0 1 2 0 0 1 1 0 1 0 0
