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
        var hospital = new Hospital("O Sistema �nico de Sa�de, o SUS, � formado pelo conjunto de todas as a��es e servi�os de sa�de prestados por �rg�os e institui��es p�blicas federais, estaduais e municipais, da administra��o direta e indireta e das funda��es mantidas pelo Poder P�blico.", "sus.png", "(61) 3315.6136", "sic@saude.gov.br");

        System.out.println(hospital + "\n");

        //Adicionando mensagens no sistema
        var meConteMais = new Mensagens("Me conte mais!");

        System.out.println(meConteMais + "\n");

        //Adicionando doenca no sistema
        var dengue = new Doenca("Dengue", "Doença viral transmitida por mosquitos que ocorre em areas tropicais e subtropicais.");

        


	}

}