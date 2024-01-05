//JAVA PROGRAM TO DEMOSTATE WIDENINIG OF TYPE CASTING
import java.io.*;
class Test
{
public static void main(String args[])
{ 
double i=100.245;
//WIDENING TYPE CASTING
short j=(short)i;
int k=(int)i;
System.out.println("ORIGINAL VALUE BEFORE CASTING:"+i);
System.out.println("AFETR TYPE CASTING TO SHORT:"+j);
System.out.println("after type casting for int:"+k);
}
}
