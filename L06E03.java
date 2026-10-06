import java.util.Scanner;
public class L06E03 {
    public static void main(String[] args) {
double[] vetor = new double[4];
double soma = 0;
     
Scanner veja = new Scanner(System.in);
     
System.out.println("Digite 4 notas:");
     
for(int x = 0; x < vetor.length; x++) {
vetor[x] = veja.nextDouble();
soma = soma + vetor[x];
}
     
double media = soma / 4;
     
System.out.println("As notas são: ");
     
for(int x = 0; x < vetor.length; x++) {
System.out.println(vetor[x]);
}
     
System.out.println("A média é: " + media);
        
veja.close();  
   
}
}