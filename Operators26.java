import java.util.*;
class Operators26{
        public static void main(String[] args){
                Scanner Sc=new Scanner(System.in);
                int A,B;
                System.out.println("enter first number :");
                A=Sc.nextInt();
                System.out.println("enter second number :");
                B=Sc.nextInt();
                System.out.println((A%2==0 || B%2!=0) ? A:B );


        }

}
