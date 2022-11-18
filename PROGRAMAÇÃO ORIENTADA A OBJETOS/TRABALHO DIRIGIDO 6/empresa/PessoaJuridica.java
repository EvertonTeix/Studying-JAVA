package empresa;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Objects;

public class PessoaJuridica extends Pessoa{

	private String CNPJ;
	private Calendar dataCriacao;

	@Override
	public boolean validarDocumento() {

		if (getCNPJ().length() == 18) {
			return true;
		} else
			return false;
	}

	@Override
	public int calcularIdade() {
		Calendar data1 = Calendar.getInstance();

		int i = data1.get(Calendar.YEAR) - this.dataCriacao.get(Calendar.YEAR);
		
		if(data1.get(Calendar.YEAR) < this.dataCriacao.get(Calendar.MONTH) || (data1.get(Calendar.MONTH) == this.dataCriacao.get(Calendar.MONTH)) && ((data1.get(Calendar.DAY_OF_MONTH) < this.dataCriacao.get(Calendar.DAY_OF_MONTH)))){
				
			return i - 1;
		}
				
		return i;
	}
	
	
	@Override
	public int hashCode() {
		return Objects.hash(CNPJ);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PessoaJuridica other = (PessoaJuridica) obj;
		return Objects.equals(CNPJ, other.CNPJ);
	}

	@Override
	public String toString() {
		
		SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
		String dataEmText = formatador.format(this.getDataCriacao().getTime());
		
		return "PessoaJuridica [ Nome = " + this.getNome() +  " CNPJ = " + CNPJ + ", dataCriacao = " + dataEmText + "]";
	}

	public String getCNPJ() {
		return CNPJ;
	}

	public void setCNPJ(String cNPJ) {
		CNPJ = cNPJ;
	}

	public Calendar getDataCriacao() {
		return dataCriacao;
	}

	public void setDataCriacao(Calendar dataCriacao) {
		this.dataCriacao = dataCriacao;
	}

}
