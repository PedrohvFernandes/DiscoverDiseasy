/**
 * A classe Doenca ir� armazenar o nome e descri��o de todas as doen�as 
 * e permite os administradores inserirem informa��es sobre elas, criada na data 14/05/2021
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
	 * Aqui os adminitradores poder�o inserir informa��es de uma doen�a
	 * 
	 * @param doenca
	 */
	public void inserirDoenca(Doenca doenca) {

	}

}
