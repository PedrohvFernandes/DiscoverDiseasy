/** 
 * A classe Mensagens ir� armazenar as mensagens pr�-definidas e as descri��es contidas
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
	 * Este m�todo disponibiliza para o usu�rio todas as mensagens 
	 * pr�-definidas na aba do professor
	 * @param mensagem
	 */
	public void inserirMensagem(Mensagens mensagem) {

	}

}
