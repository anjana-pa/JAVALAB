import java.util.Scanner;
class InvalidUserException extends Exception{
public InvalidUserException(String msg){
super(msg);
}
}
public class Authentication {
public static void main(String[]args){
Scanner sc= new Scanner(System.in);
System.out.println("Enter username:");
String username= sc.nextLine();
System.out.println("password:");
String password=sc.nextLine();
try{
if(username.length()<8)
throw new InvalidUserException("Invalid user name,username must be greater than 7 characters!");
else if (!password.equals("anjana@2000")){
throw new InvalidUserException("Incorrect password,Enter correct password!");
}
else{
System.out.println("Login succesfull");
}
}
catch(InvalidUserException e){
e.printStackTrace ();
}
}
}
