import java.util.Scanner;

class Larger{
    
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter the first number: ");
    int num1 = input.nextInt();

    System.out.print("Enter the second number: ");
    int num2 = input.nextInt();

    if(num1>num2){
        System.out.println(num1+" is larger than "+num2);
    }
    else{
        System.out.println(num2+" is larger than "+num1);
    }

    input.close();
    
    }
}