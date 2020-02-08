import java.util.Scanner;
import java.io.*;

class Solution4{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int x=0;
        for(int j=0,k=0;j<n && k<=n-1;j++,k++){
            x=(int)Math.pow(2,k)*b + x;
             System.out.print(a+x+" ");
        }
        System.out.println();
        }
        
    }
}

