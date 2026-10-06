import java.util.Scanner;

public class L6E7 {
    public static void main(String[] args) {
        
int[] numeros = new int[5];
double soma = 0;
double mult = 1;
    
Scanner veja = new Scanner(System.in);
    
System.out.println("Digite 5 números: ");
    
for (int x = 0; x < numeros.length; x++) {
    numeros[x] = leia.nextInt();
    soma = soma + numeros[x];
    mult = mult * numeros[x];
}
    
System.out.println("Números digitados:");
for(int x = 0; x < numeros.length; x++) {
System.out.println(numeros[x]);
}
    
System.out.println("Soma dos números: " + soma);
System.out.println("Multiplicação dos números: " + mult);
     
veja.close();

}
}