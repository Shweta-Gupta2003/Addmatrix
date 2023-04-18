import java.util.*;
class Add
{
int i,j;
void getdata()
{
int m[][]=new int[2][2];
int m1[][]=new int[2][2];
int m2[][]=new int[2][2];
for(i=0;i<2;i++)
{
for(j=0;j<2;j++)
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter matrix1:");
m1[i][j]=sc.nextInt();
}
}

for(i=0;i<2;i++)
{
for(j=0;j<2;j++)
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter matrix2:");
m2[i][j]=sc.nextInt();
}
}

for(i=0;i<2;i++)
{
for(j=0;j<2;j++)
{
m[i][j]=m1[i][j]+m2[i][j];
System.out.print(m[i][j]+" ");
}
}

}
}
class Matrix1
{
public static void main(String args[])
{
Add a=new Add();
a.getdata();
}
}
