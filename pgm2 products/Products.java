import java.util.*;
import java.util.Scanner;
class Product{
int pCode,price;
String pName;
Product(int pCode,String pName,int price){
this.pCode=pCode;
this.pName=pName;
this.price=price;
}
}
class Products{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
System.out.print("enter the product code:");
int pCode=sc.nextInt();
System.out.print("enter the product name:");
String pName=sc.next();
System.out.print("enter the product price:");
int price=sc.nextInt();
Product[]ps=new Product[3];
ps[0]=new Product(pCode,pName,price);
ps[1]=new Product(001,"dove",50);
ps[2]=new Product(002,"luvit",100);
int minprice=ps[0].price;
System.out.println("\npCode\tpName\tprice");
System.out.println("\n______________________");
for(Product p:ps){
System.out.print("\n"+p.pCode+"\t"+p.pName+"\t"+p.price);
if(minprice>p.price)
{
minprice=p.price;
}
}
System.out.println("\n______________________");
System.out.println("lowest cost product");
System.out.println("\n______________________");
for(Product p:ps){
if(minprice==p.price)
{
System.out.print("\nproductcode:"+p.pCode);
System.out.print("\nproductname:"+p.pName);
System.out.print("\nproductprice:"+p.price);
}
}
}
}


