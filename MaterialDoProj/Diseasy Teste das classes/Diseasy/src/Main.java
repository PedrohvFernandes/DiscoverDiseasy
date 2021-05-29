import java.time.LocalDate;

import Doenca.Doenca;
import Hospital.Hospital;
import Mensagens.Mensagens;
import Usuario.Usuario;

public class Main {
	public static void main(String[] args) {

        //Criando usuario no sistema
		LocalDate nascimentoUser = LocalDate.of(2002, 05, 27);

		var user = new Usuario("Josue", "JosueMartins@gmail.com", nascimentoUser, "123456");

		System.out.println(user + "\n");
		
        //Alterando o dado do usuario
        user.setEmailUsuario("JosueMartinsBeda@gmail.com");
        System.out.println(user + "\n");

        //Adcionando hospital no sistema
        var hospital = new Hospital("SUS ","Sistema Único de Saúde é a denominação do sistema público de saúde brasileiro criado pela Constituição Federal de 1988 pelo texto elaborado durante a Assembleia Nacional Constituinte de 1987-1988 na sua 267ª. sessão no dia 17 de maio de 1988.", "sus.png", "(61) 3315.6136", "sic@saude.gov.br");

        System.out.println(hospital + "\n");

        //Adicionando mensagens no sistema
        var meConteMais = new Mensagens("Me conte mais!");

        System.out.println(meConteMais + "\n");

        //Adicionando doenca no sistema
        var dengue = new Doenca("Dengue", "DoenÃ§a viral transmitida por mosquitos que ocorre em areas tropicais e subtropicais.");

        System.out.println(dengue + "\n");

        

	}

}