public class WrapperExample2
{
public static void main(String args[])
{
byte b=10;
short s=20;
int i=30;
long l=40;
float f=50.0F;
double d=60.0D;
char c='a';
boolean b2=true;
Byte byteobj=b;
Short shortobj=s;
Integer intobj=i;
Long longobj=l;
Float floatobj=f;
Double doubleobj=d;
Character charobj=c;
Boolean boolobj=b2;
//CONVERTING object TYPES INTO premitivedatatype
byte bytevalue=byteobj;
short shortvalue=shortobj;
int intvalue=intobj;
long longvalue=longobj;
float floatvalue=floatobj;
double doublevalue=doubleobj; 
char charvalue=charobj;
boolean boolvalue=boolobj;
System.out.println("------printing premitive values---");
System.out.println("byte value:"+bytevalue);
System.out.println("short value:"+shortvalue);
System.out.println("int value:"+intvalue);
System.out.println("long value:"+longvalue);
System.out.println("float value:"+floatvalue);
System.out.println("double value:"+doublevalue);
System.out.println("char value:"+charvalue);
System.out.println("bool value:"+boolvalue);
}  
}
