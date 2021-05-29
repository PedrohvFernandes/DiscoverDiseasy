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

	public String getNomeDoenca() {
		return nomeDoenca;
	}

	public void setNomeDoenca(String nomeDoenca) {
		this.nomeDoenca = nomeDoenca;
	}

	public String getDescricaoDoenca() {
		return descricaoDoenca;
	}

	public void setDescricaoDoenca(String descricaoDoenca) {
		this.descricaoDoenca = descricaoDoenca;
	}

	public List<Doenca> getDoencas() {
		return doencas;
	}

	public void setDoencas(List<Doenca> doencas) {
		this.doencas = doencas;
	}

	@Override
	public String toString() {
		return "Doenca [nomeDoenca=" + nomeDoenca + ", descricaoDoenca=" + descricaoDoenca +"]";
	}

	/**
	 * Aqui os adminitradores poderão inserir informações de uma doença
	 * 
	 * @param doenca
	 */
	public void inserirDoenca(Doenca doenca) {

	}

}
