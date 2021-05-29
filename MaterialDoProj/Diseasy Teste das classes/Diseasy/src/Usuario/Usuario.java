/**
 * Classe Usuario com todos os atributos de usuario criada no dia 14/05/21
 * Empresa:Newton Paiva
 */
package Usuario;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import Configuracao.*;
import Mensagens.*;
import Doenca.*;
import Hospital.*;

public class Usuario {

	private List<Usuario> Usuarios;

	private String nomeUsuario;

	private String emailUsuario;

	private LocalDate dataDoUsuario;

	private String senhaUsuario;

	public Usuario(String nomeUsuario, String emailUsuario, LocalDate dataDoUsuario, String senhaUsuario) {
		
		this.nomeUsuario = nomeUsuario;
		this.emailUsuario = emailUsuario;
		this.dataDoUsuario = dataDoUsuario;
		this.senhaUsuario = senhaUsuario;
	}

	public List<Usuario> getUsuarios() {
		return Usuarios;
	}

	public void setUsuarios(List<Usuario> usuarios) {
		Usuarios = usuarios;
	}

	public String getNomeUsuario() {
		return nomeUsuario;
	}

	public void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}

	public String getEmailUsuario() {
		return emailUsuario;
	}

	public void setEmailUsuario(String emailUsuario) {
		this.emailUsuario = emailUsuario;
	}

	public LocalDate getDataDoUsuario() {
		return dataDoUsuario;
	}

	public void setDataDoUsuario(LocalDate dataDoUsuario) {
		this.dataDoUsuario = dataDoUsuario;
	}

	public String getSenhaUsuario() {
		return senhaUsuario;
	}

	public void setSenhaUsuario(String senhaUsuario) {
		this.senhaUsuario = senhaUsuario;
	}

	@Override
	public String toString() {
		return "Usuario [nomeUsuario=" + nomeUsuario + ", emailUsuario=" + emailUsuario
				+ ", dataDoUsuario=" + dataDoUsuario + ", senhaUsuario=" + senhaUsuario + "]";
	}

	/**
	 * Este metodo ira inserir todos os usuarios criado como objeto, persistindo no
	 * banco de dados, por enquanto esta sendo inserido na memoria no ArrayList
	 * 
	 * @param usuario
	 **/
	public void inserirUsuarios(Usuario usuario) {

	}

	/**
	 * Este metodo tera a função de logar o usuario no sistema, o usuario ira logar
	 * usando o email ou nome, passando a senha para logar.
	 * 
	 */
	public boolean logarUsuario() {

		return false;
	}

	/**
	 * Este método irá permitir que um usuário recupere a senha a partir do email
	 *
	 * @param emailUsuario
	 */
	public void esqueciSenha(String emailUsuario) {

	}

	/**
	 * O usuario irá enviar mensagens predefinidas para a IA na aba do professor que
	 * ja existem no sistema
	 * 
	 * @param mensagens
	 */
	public void enviarMensagemPredefinida(Mensagens mensagens) {

	}

	/**
	 * O usuario irá utilizar o microfone para transcrever a mensagem dita no
	 * microfone pelo usuario na aba do professor
	 * 
	 * @param mensagens
	 */
	public void audioMensagem(Mensagens mensagens) {

	}

	/**
	 * O usuario irá utilizar a barra de mensagem pra digitar a mensagem que ele
	 * quer enviar para IA na aba do professor
	 * 
	 * @param mensagens
	 */
	public void escreverMensagem(Mensagens mensagens) {

	}

	/**
	 * O usuário irá pesquisar e esoclher a doença desejada na aba professores
	 * 
	 * @param doenca
	 */
	public void pesquisarDoenca(Doenca doenca) {

	}

	/**
	 * O Usuário poderá digitar para pesquisar hospitais com base em um hospital
	 *
	 * @param hospital
	 */

	public void pesquisarHospital(Hospital hospital) {

	}


}
