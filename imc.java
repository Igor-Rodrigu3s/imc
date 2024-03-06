import java.util.Scanner;

public class imc{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        //informar o peso
        System.out.println("Qual seu peso em kg? ");
        double peso=scanner.nextDouble();
        //informar altura
        System.out.println("Qual sua altura em metros? ");
        double altura=scanner.nextDouble();
        //calculo do IMC
        double imc=peso/(altura*altura);
        //para abaixo do peso
        if (imc<18.5){
            System.out.println("Você está abaixo do peso. ");
        }
        //para peso normal
        else if (imc<25){
            System.out.println("Você está dentro peso normal. ");
        }
        //para sobrepeso
        else if(imc<30){
            System.out.println("Você está com sobrepeso. ");
        }
        //para obesidade grau I
        else if(imc<35){
            System.out.println("Você está com obesidade grau I");
        }
        //para obesidade grau II
        else if(imc<35){
            System.out.println("Você está com obesidade grau II");
        }
        //para obesidade grau III
        else{
            System.out.println("Você está com obesidade grau III");
        }
    }
}