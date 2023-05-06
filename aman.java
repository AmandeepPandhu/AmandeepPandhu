
class in java
import java.util.*;
class aman
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
import java.util.*;
class aman
{
aman()={System.out.println("chak manne wala");
}
public static void main(String args[])
{
aman b=new aman();
}
}

facterial in c
#include<stdio.h>
void main()
{
int c,a,p;
p=1;
printf("enter value");
scanf("%d",&c);
for(a=1;a<=c;a++)
{
p=p×a;
}
printf("%d",&p);
getch();
}

swap in c
#include<stdio.h>
void main()
{
int a,b,c;
printf("enter a value");
scanf("%d",&a);
printf("enter b value");
scanf("%d",&b);
c=a;
a=b;
b=c;
printf("/n a value=%d",a);
printf("/n b value=%d",b);
getch();
}