	/**
	 *Esta classe ira armazenar todos os hospitais no banco de dados, criada nada
	 *data 14/05/21 
	 * 
	 */
package Hospital;
import java.util.ArrayList;
import java.util.List;

public class Hospital {

	private String descricaoHospital;

	private String imagemMapa;

	private String telefoneHospital;

	private String emailsHospital;

	private List<Hospital> hospitais;

	public Hospital(String descricaoHospital, String imagemMapa, String telefoneHospital, String emailsHospital) {
		
		this.descricaoHospital = descricaoHospital;
		this.imagemMapa = imagemMapa;
		this.telefoneHospital = telefoneHospital;
		this.emailsHospital = emailsHospital;
		this.hospitais = new ArrayList<>();
		
	}


	/**
	 * Este metodo ira inserir hospital no banco de dados
	 * @param hospital
	 */
	public void iserirHospital(Hospital hospital) {

	}

}
