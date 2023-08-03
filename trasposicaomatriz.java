import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TransposicaoMatriz {
	public static void main (String []args) {
		//Declaração de variaveis
		
		BufferedReader leitor = new BufferedReader(
								new InputStreamReader(
									System.in));
		
		int [][] matriz = new int [2][3];
		int [][] transposta = new int [3][2];
								
		//Entrada de Dados
		
		try {
			for (int i = 0 ; i < matriz.length ; i++) {
				for (int j=0 ; j < matriz [i].length ; j++) {
					System.out.print("matriz[" + i + "," + j + "] = ");
					matriz[i][j] = Integer.parseInt(leitor.readLine());
				}
			}
		} catch (Exception erro ) {
			System.out.println(erro);
		}
		
		//Processamento 
		for (int i = 0 ; i < matriz.length ; i++) {
			for (int j=0 ; j < matriz[i].length ; j++) {
				transposta[j][i] = matriz [i][j];
			}			
	}
		//Saída de dados
		for (int i = 0 ; i < matriz.length ; i++) {
			for (int j=0 ; j < matriz [i].length ; j++) {
				System.out.print(matriz [i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println();
		for (int i = 0 ; i < transposta.length ; i++) {
			for (int j=0 ; j < transposta[i].length ; j++) {
				System.out.print(transposta [i][j] + "\t");
}		System.out.println();
}
	}
}
