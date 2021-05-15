/** 
 * A classe Mensagens irá armazenar as mensagens pré-definidas e as descrições contidas
 * na aba Professores, criada na data 14/05/21
 *
 */
package Mensagens;

import java.util.ArrayList;
import java.util.List;

public class Mensagens {

	private List<Mensagens> mensagensPredefinidas;

	private String descricaoMensagemPredefinida;

	public Mensagens(String descricaoMensagemPredefinida) {

		this.mensagensPredefinidas = new ArrayList<>();

		this.descricaoMensagemPredefinida = descricaoMensagemPredefinida;
	}
	
	
	/**
	 * Este método disponibiliza para o usuário todas as mensagens 
	 * pré-definidas na aba do professor
	 * @param mensagem
	 */
	public void inserirMensagem(Mensagens mensagem) {

	}

}
