import java.util.*;
public class ReverseString1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		char a[]=s.toCharArray();
		for(int i=a.length-1;i>=0;i--)
			System.out.print(a[i]);

	}

}
