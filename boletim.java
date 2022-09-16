//Victor Eduardo 3-52

package sogopro;

public class boletim {

	public static void main(String[] args) {
		
		professor a2 = new professor();
		a2.nomeP = "alex";
		
		
		
		aluno a1 = new aluno();
			a1.nome = "Victor Eduardo";
			a1.disciplina = "Teste de SoftWare";
			a1.nota1 = 5.8f;
			a1.nota2 = 8.3f;
			a1.nota3 = 9.0f;
			a1.nota4 = 10.0f;
			a1.media = (a1.nota1 + a1.nota2 + a1.nota3 + a1.nota4)/4;
		
			System.out.println(a1.nome + " teve media de "+ a1.media + " da disciplina " +a1.disciplina+ " do professor " +a2.nomeP );
	}
}
