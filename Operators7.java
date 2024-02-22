import java.util.*;
class Operators7{
        public static void main(String[] args){
                Scanner Sc=new Scanner(System.in);
                int A,B,C,Ans;
                System.out.println("enter first number :");
                A=Sc.nextInt();
                System.out.println("enter second number :");
                B=Sc.nextInt();
		System.out.println("enter third number :");
                C=Sc.nextInt();
		Ans=A+B*C+(A-B);
 
                System.out.println("Ans = "+Ans);

        }

}
