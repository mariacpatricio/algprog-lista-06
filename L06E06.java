import java.util.Scanner;

public class L6E06 {
public static void main(String[] args) {
    
double[][] matriz = new double[10][4];
double[] media = new double[10];
int alunos = 0;
    
Scanner veja = new Scanner(System.in);
    
for (int x = 0; x < matriz.length; x++ ) {
        
double soma = 0;
        
for (int y = 0; y < matriz[x].length; y++) {
System.out.println("Digite a nota do aluno " + (x+1) + " da prova " + (y+1) + ":");
matriz[x][y] = veja.nextDouble();
soma = soma + matriz[x][y]; }
            
media[x] = soma / 4;
}
    
    
for(int x = 0; x < media.length; x++) {
    if (media[x] >= 7) {
    alunos++;
}
}
    
System.out.println("Alunos com média superior ou igual a 7: " + alunos);
    
veja.close();
}
}
