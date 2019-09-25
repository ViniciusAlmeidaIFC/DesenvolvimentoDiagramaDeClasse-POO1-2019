package votacao;

public class Voto {

	protected Votacao votacao;
	
	public Voto() {
		votacao = new Votacao();
	}

	public Votacao getVotacao() {
		return votacao;
	}

	public void setVotacao(Votacao votacao) {
		this.votacao = votacao;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Voto [votacao=");
		builder.append(votacao);
		builder.append("]");
		return builder.toString();
	}
	
}
