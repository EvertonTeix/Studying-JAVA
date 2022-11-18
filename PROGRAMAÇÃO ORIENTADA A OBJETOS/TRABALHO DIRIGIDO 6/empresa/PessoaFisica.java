package empresa;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Objects;

public class PessoaFisica extends Pessoa{
	
	private String CPF;
	private Calendar dataNascimento;
	
	
	@Override
	public int hashCode() {
		return Objects.hash(CPF);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PessoaFisica other = (PessoaFisica) obj;
		return Objects.equals(CPF, other.CPF);
	}

	@Override
	public String toString() {
		
		SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
		String dataEmText = formatador.format(this.getDataNascimento().getTime());
		
		return "PessoaFisica [ Nome = " + this.getNome() +  " CPF =" + CPF + ", Data de nascimento =" + dataEmText + "]";
	}

	@Override
	public boolean validarDocumento() {
		
		if(getCPF().length() == 14) {
			return true;
		} else
		return false;
	}

	@Override
	public int calcularIdade() {
		
		Calendar data1 = Calendar.getInstance();

		int i = data1.get(Calendar.YEAR) - this.dataNascimento.get(Calendar.YEAR);
		
		if(data1.get(Calendar.YEAR) < this.dataNascimento.get(Calendar.MONTH) || (data1.get(Calendar.MONTH) == this.dataNascimento.get(Calendar.MONTH)) && ((data1.get(Calendar.DAY_OF_MONTH) < this.dataNascimento.get(Calendar.DAY_OF_MONTH)))){
				
			return i - 1;
		}
				
		return i;
	}
	
	public String getCPF() {
		return CPF;
	}

	public void setCPF(String cPF) {
		CPF = cPF;
	}

	public Calendar getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Calendar dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

}
