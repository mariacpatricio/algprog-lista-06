import java.util.Scanner;

public class L6E04 {
public static void main(String[] args) {

char[] vetor = new char[10];
int consoantes = 0;
     
Scanner veja = new Scanner(System.in);
     
System.out.println("Digite 10 caracteres:");
     
for(int x = 0; x < vetor.length; x++) {
vetor[x] = Character.toLowerCase(veja.next().charAt(0));
         
if (vetor[x] != 'a' && vetor[x] != 'e' && vetor[x] != 'i' && vetor[x] != 'o' && vetor[x] != 'u'){
consoantes++; }

     
System.out.println("Quantidade de consoantes: " + consoantes);
System.out.println("Consoantes digitadas:");
    
for(int x = 0; x < vetor.length; x++) {
    if (vetor[x] != 'a' && vetor[x] != 'e' && vetor[x] != 'i' && vetor[x] != 'o' && vetor[x] != 'u'){
System.out.println(vetor[x]); }

}
veja.close();

}
}
}

