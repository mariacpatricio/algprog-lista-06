import java.util.Scanner;
public class L06E01 {
    public static void main(String[] args) {
     
int[] vetor = new int[5];
     
Scanner leia = new Scanner(System.in);
     
System.out.println("Digite 5 números:");
     
for(int x = 0; x < vetor.length; x++) {
vetor[x] = leia.nextInt();
}
     
System.out.println("Números escolhidos:");
    
for(int x = 0; x < vetor.length; x++) {
System.out.println(vetor[x]);
}
    
leia.close();
}
}