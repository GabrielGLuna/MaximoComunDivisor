import java.util.Scanner;
public class MCD {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("MÁXIMO COMO UN DIVISOR");
        System.out.println("Ingrese un numero");
        int num1 = scan.nextInt();
        System.out.println("Ingrese un segundo numero");
        int num2 = scan.nextInt();
        System.out.println(" ");
       
        System.out.println(" MAXIMO COMO UN DIVISOR RECURSIVO");
        int resultado = maximocd(num1, num2);
        System.out.println("El maximo como un divisor es : "+ resultado);
        System.out.println(" ");
        int resultadoo = maximocdit(num1, num2, 1);
        System.out.println("El maximo como un divisor es : "+ resultadoo);
        System.out.println(" ");
    }

    public static int maximocd(int num1, int num2){
        
       if(num2== 0){
        
        return num1;

       }
       else{
        System.out.println("el residuo de "+ num1+" y "+num2+ " es :"+ num1 % num2);
        return maximocd(num2, num1 % num2);
        
       }
    }

    public static int maximocdit(int num1, int num2, int resultado){
        System.out.println(" MAXIMO COMO UN DIVISOR ITERATIVO");
        
        while(resultado>0){
 System.out.println("el residuo de "+ num1+" y "+num2+ " es :"+ num1 % num2);
            resultado =  num1 % num2;
            num1 = num2;
            num2 = resultado;

        }
        return num1;
    }
}
