import java.text.DecimalFormat;
import java.util.regex.Pattern;
import java.util.Scanner;

class Iemanja {

	static boolean verifica(String n) {
		String[] caminhos = n.split(Pattern.quote("!"));
		for(int i=0;i<caminhos.length;i++) {
			String[] cam = caminhos[i].split(Pattern.quote(","));
			for(int j=0;j<cam.length;j++) 
				if(!cam[j].equals("0")) return true;
		}
		return false;
	}

	static double media(double[] numeros) {
		double soma=0;
		double media=0;
		for(int i=0;i<numeros.length;i++) soma+=numeros[i];
		return media=soma/numeros.length;
	}

	static int numElementos(double[] numeros) {
		return numeros.length;
	}

	static double desvioPadrao(double[] numeros) {
		double dp=0;
		double media = media(numeros);
		double soma=0;
		for(int i=0;i<numeros.length;i++) soma+=Math.pow(numeros[i]-media,2);
		dp = Math.sqrt(soma/numElementos(numeros));
		return dp;
	}

	static int menorPontuacao(int[] numElementos,double[] medias,double[] dps) {
		int[] pontuacoes = new int[3];
		for(int i=0;i<3;i++) pontuacoes[i] = 0;

		//verifica medias
		double menorMedia = medias[0];
		int indM = 0;
		for(int i=1;i<medias.length;i++) 
			if(menorMedia > medias[i]) {
				menorMedia = medias[i];
				indM++;
			}
		System.out.println(indM);

		//verifica dps
		double menorDP = dps[0];
		int indD = 0;
		for(int i=1;i<dps.length;i++) 
			if(menorDP > dps[i]) {
				menorDP = dps[i];
				indD++;
			}
		System.out.println(indD);

		//verifica numElementos
		int menorNE = numElementos[0];
		int indN = 0;
		int igual = -1;
		for(int i=1;i<numElementos.length;i++) {
			if(menorNE == numElementos[i]) igual = i; 
			if(menorNE > numElementos[i]) {
				menorNE = numElementos[i];
				indN++;
			}
		}

		System.out.println(indN);

		//pontuacao
		for(int i=0;i<3;i++) {
			if(indM == i) pontuacoes[i]++;
			if(indD == i) pontuacoes[i]++;
			if(indN == i && igual == -1) pontuacoes[i]++;
			else {
				if(indN == i) {
					pontuacoes[i]++;
					pontuacoes[igual]++;
				}
			} 

		}

		int menorPontuacao = pontuacoes[0];
		int ind = 0;
		for(int i=1;i<pontuacoes.length;i++) 
			if(menorPontuacao > pontuacoes[i]) {
				menorPontuacao = pontuacoes[i];
				ind++;
			}

		//return ind;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String linha = sc.nextLine();
		while(verifica(linha)) {

			double[] medias = new double[3];
			int[] numElementos = new int[3];
			double[] dps = new double[3];

			String[] caminhos = linha.split(Pattern.quote("!"));
			for(int i=0;i<3;i++) {
				String[] cam = caminhos[i].split(Pattern.quote(","));
				double[] numeros = new double[cam.length];
				for(int j=0;j<cam.length;j++) numeros[j] = Double.parseDouble(cam[j]);
				medias[i] = media(numeros);
				numElementos[i] = numElementos(numeros);
				dps[i] = desvioPadrao(numeros);
				System.out.println(medias[i]+" "+numElementos[i]+" "+dps[i]);
			}

			menorPontuacao(numElementos,medias,dps);

			//if(menorPontuacao(numElementos,medias,dps) == 0) System.out.println("Continue pelo primeiro caminho, Iemanja!");

			//if(menorPontuacao(numElementos,medias,dps) == 1) System.out.println("Continue pelo segundo caminho, Iemanja!");

			//if(menorPontuacao(numElementos,medias,dps) == 2) System.out.println("Continue pelo terceiro caminho, Iemanja!");

			linha = sc.nextLine();

		}

		System.out.println("Bem vinda ao lar, oh rainha do mar!");

	}
}