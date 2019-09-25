package academico;

public class Professor extends Pessoa {

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Professor [toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}

	
		
}
