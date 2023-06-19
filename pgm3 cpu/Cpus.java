class Cpu {
int price = 34000;
class Processor {
int noofcores=4;
String manifacture=" inter core ";
void display ()
{
System.out.println("no: of cores:"+noofcores);
System.out.println("manifacture :"+ manifacture);
}
}
void display ()
{
Processor p = new Processor ();
p. display ();
System.out.println ("price :"+ price );
}
static class Ram {
int memory =8;
String manifacture = "corps";
void display ()
{
System.out.println ("memory:"+memory);
System.out.println ("manifacture:"+manifacture);
}} }
class Cpus{
public static void main (String[]args){
Cpu c1=new Cpu();
c1.display ();
Cpu.Ram r1=new Cpu.Ram();
r1.display ();
}}

