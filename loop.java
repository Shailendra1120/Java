import java.util.Scanner;
class loop{
public static void main(String[]args){
int n;
Scanner input = new Scanner(System.in);
System.out.println("input the integer");


while((n = input.nextInt())!=0)
{
System.out.println("you enter the integer" +n);
System.out.println("input the Integer");
}
System.out.println("out of loop");
}
}

