import java.util.Scanner;

public class Calc {
    public static void main(String[] args) throws Exception {
        int menu1 = 0;
        int menu2 = 0;
        

        while (menu1 != 1){

         Scanner sc1 = new Scanner(System.in);

            
            System.out.print("Qual operação deseja realizar? \n1-- Soma \n2-- Subtração \n3-- Divisão\n4-- Mutiplicação \n5-- Sair \n");
            menu2 = sc1.nextInt();

            switch (menu2){

                    case 1:
                    double num1,num2, result;

                    System.out.println("Digite o primeiro numero: ");
                    num1 = sc1.nextDouble();

                    System.out.println(num1 + " +    =   \n  \n Digite o segundo numero:" );
                    num2 = sc1.nextDouble();

                    result = num1 + num2;

                    System.out.println(num1 + " + " + num2 + " = " + result );
                    break;

                case 2:
                    num1 = 0;
                    num2 = 0;
                    result = 0;

                    System.out.println("Digite o primeiro numero: ");
                    num1 = sc1.nextDouble();

                    System.out.println(num1 + " -    =   \n  \n Digite o segundo numero:" );
                    num2 = sc1.nextDouble();

                    result = num1 - num2;

                    System.out.println(num1 + " - " + num2 + " = " + result );
                    break;
                
                case 3:
                    num1 = 0;
                    num2 = 0;
                    result = 0;

                    System.out.println("Digite o primeiro numero: ");
                    num1 = sc1.nextDouble();

                    System.out.println(num1 + " /    =   \n  \n Digite o segundo numero:" );
                    num2 = sc1.nextDouble();

                    result = num1 / num2;
                    System.out.println(num1 + " / " + num2 + " = " + result );
                    break;
         
                case 4:
                    num1 = 0;
                    num2 = 0;
                    result = 0;

                    System.out.println("Digite o primeiro numero: ");
                    num1 = sc1.nextDouble();

                    System.out.println(num1 + " *    =   \n  \n Digite o segundo numero:" );
                    num2 = sc1.nextDouble();

                    result = num1 * num2;
                    System.out.println(num1 + " * " + num2 + " = " + result );
                    break;
                
                case 5:
                    System.out.println("Programa Encerrado");
                    menu1 = 1;
                    break;
                    
                default:
                    System.out.println("Valor invalido");
                    break;
            }
            

        }


    }

}

