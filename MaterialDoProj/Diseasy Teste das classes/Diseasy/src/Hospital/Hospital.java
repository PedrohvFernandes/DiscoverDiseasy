	/**
	 *Esta classe ira armazenar todos os hospitais no banco de dados, criada nada
	 *data 14/05/21 
	 * 
	 */
package Hospital;
import java.util.ArrayList;
import java.util.List;

public class Hospital {
	
	private String nomeHospital;
	
	private String descricaoHospital;

	private String imagemMapa;

	private String telefoneHospital;

	private String emailsHospital;

	private List<Hospital> hospitais;

	public Hospital(String nomeHospital, String descricaoHospital, String imagemMapa, String telefoneHospital, String emailsHospital) {
		
		this.nomeHospital = nomeHospital;
		this.descricaoHospital = descricaoHospital;
		this.imagemMapa = imagemMapa;
		this.telefoneHospital = telefoneHospital;
		this.emailsHospital = emailsHospital;
		this.hospitais = new ArrayList<>();
		
	}
	
	public String getNomeHospital() {
		return nomeHospital;
	}
	
	public void setNomeHospital(String nomeHospital) {
		this.nomeHospital = nomeHospital;
	}

	public String getDescricaoHospital() {
		return descricaoHospital;
	}



	public void setDescricaoHospital(String descricaoHospital) {
		this.descricaoHospital = descricaoHospital;
	}



	public String getImagemMapa() {
		return imagemMapa;
	}



	public void setImagemMapa(String imagemMapa) {
		this.imagemMapa = imagemMapa;
	}



	public String getTelefoneHospital() {
		return telefoneHospital;
	}



	public void setTelefoneHospital(String telefoneHospital) {
		this.telefoneHospital = telefoneHospital;
	}



	public String getEmailsHospital() {
		return emailsHospital;
	}



	public void setEmailsHospital(String emailsHospital) {
		this.emailsHospital = emailsHospital;
	}



	public List<Hospital> getHospitais() {
		return hospitais;
	}



	public void setHospitais(List<Hospital> hospitais) {
		this.hospitais = hospitais;
	}



	@Override
	public String toString() {
		return "Hospital [descricaoHospital=" + descricaoHospital + ", imagemMapa=" + imagemMapa + ", telefoneHospital="
				+ telefoneHospital + ", emailsHospital=" + emailsHospital +"]";
	}


	/**
	 * Este metodo ira inserir hospital no banco de dados
	 * @param hospital
	 */
	public void iserirHospital(Hospital hospital) {

	}

}
