package br.com.projeto.screenflix;

import br.com.projeto.screenflix.model.DataSeries;
import br.com.projeto.screenflix.service.ConsumeApi;
import br.com.projeto.screenflix.service.ConvertData;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class ScreenflixApplication implements CommandLineRunner {
	/*
	* 1 - constroi a classe para consumir a API, e fazer com que o metodo da classe retorne um json
	* 2- Modelar um record para que realize o mapeamento da API (DataSeries)
	* 3- IConvertData eh uma interface de um método genérico "<T>" que pega um formato json e uma classe generica "<T>" que posteriormente
	* irá realizar a conversao
	* 4 - implementa a interface (3) e chama a classe ObjectMapper que realiza o mapeamento (lendo o valor json e da Classe genérica)
	* */
	private Integer option = 1;
	String msg = "Digite 1 para continuar ou 0 para sair: ";

	public static void main(String[] args) {
		SpringApplication.run(ScreenflixApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Scanner enter = new Scanner(System.in);

		while (option == 1) {
		ConsumeApi consumeApi = new ConsumeApi();
		var json = consumeApi.obterDados();
		ConvertData data = new ConvertData();
		DataSeries dataSerie = data.getData(json, DataSeries.class);


			System.out.println(dataSerie);

			System.out.println(msg);
			option = enter.nextInt();
			enter.nextLine();

			if(option != 1){
				System.out.println("Saindo...");
				break;
			}
		}


	}
}
