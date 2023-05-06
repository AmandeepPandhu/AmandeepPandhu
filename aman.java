import java.util.*;
Class sample
{
int a,b;
void getdata ()
{
a=45;
b=35;
}
void show ()
{
System.out.println(a+b);
}
}
class aman
{
public static void main(String args[])
{
sample s=new sample();
s.getdata();
s.show();
}
}

Constructor

class aman
{
aman()={System.out.println("chak manne wala");
}
public static void main(String args[])
{
aman b=new aman();
}
}
