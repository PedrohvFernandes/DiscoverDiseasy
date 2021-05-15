/**
 * A classe Doenca irá armazenar o nome e descrição de todas as doenças 
 * e permite os administradores inserirem informações sobre elas, criada na data 14/05/2021
 *
 */
package Doenca;

import java.util.ArrayList;
import java.util.List;

public class Doenca {

	private String nomeDoenca;
	private String descricaoDoenca;

	private List<Doenca> doencas = new ArrayList<>();

	public Doenca(String nomeDoenca, String descricaoDoenca) {

		this.nomeDoenca = nomeDoenca;
		this.descricaoDoenca = descricaoDoenca;

	}

	/**
	 * Aqui os adminitradores poderão inserir informações de uma doença
	 * 
	 * @param doenca
	 */
	public void inserirDoenca(Doenca doenca) {

	}

}
