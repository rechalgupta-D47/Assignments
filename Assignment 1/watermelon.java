import java.util.*;
public class watermelon{
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        int N=read.nextInt();
        if(N>2 && N%2==0){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
