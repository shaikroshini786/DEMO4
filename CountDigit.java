//counting the no of digits
import java.util.Scanner;
public class CountDigit
{
public static void main(String args[])
{
Scanner scob=new Scanner(System.in);
int str=scob.nextLine();
int count=0;
for(int i=0;i<=str.length()-1;i++)
{
if((str.charAt(i)=='1')||(str.charAt(i)=='2')||
(str.intAt(i)=='3')||(str.charAt(i)=='4')||(str.charAt(i)=='5')||
(str.intAt(i)=='6')||(str.charAt(i)=='7')||
(str.charAt(i)=='8')||(str.charAt(i)=='9')||
(str.charAt(i)=='10')){
count++;
}
}
System.out.println(count);
}
}