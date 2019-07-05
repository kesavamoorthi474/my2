import java.io.*;
class Factorial{
    int m=1;;
    int factorial(int n){
        for(int i=1;i<=n;i++)
        {
            m=m*i;
        }
        return m;
    }
}
public class Main
{
	public static void main(String[] args)throws IOException {
	System.out.println("Factorial of a number...");
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter the limit");
	int n=Integer.parseInt(br.readLine());
	Factorial fact=new Factorial();
	System.out.println(fact.factorial(n));
	}
}
