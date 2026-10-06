import java.util.Scanner;
import java.util.ArrayList;

public class L6E05 {
public static void main(String[] args) {

int[] vetor = new int[20];
ArrayList<Integer> pares  = new ArrayList<>();
ArrayList<Integer> impares = new ArrayList<>();
     
Scanner veja = new Scanner(System.in);
     
System.out.println("Digite 20 números:");
     
for (int x = 0; x < vetor.length; x++) {
vetor[x] = veja.nextInt();
         
if(vetor[x] % 2 == 0) {
pares.add(vetor[x]);
}
         
if(vetor[x] % 2 == 1) {
impares.add(vetor[x]);
}
}
     
System.out.println("Números digitados:");
for (int x = 0; x < vetor.length; x++) {
System.out.println(vetor[x]); }
        
System.out.println("Números pares:");
for(int x = 0; x < pares.size(); x++) {
System.out.println(pares.get(x)); }
                
System.out.println("Números ímpares:");
for (int x = 0; x < impares.size(); x++) {
System.out.println(impares.get(x)); }
     
veja.close();
    
}
}

