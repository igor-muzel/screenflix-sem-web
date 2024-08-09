package br.com.projeto.screenflix;

import br.com.projeto.screenflix.model.SeriesData;
import br.com.projeto.screenflix.service.ApiConsumption;
import br.com.projeto.screenflix.service.ConvertsData;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ScreenflixApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ScreenflixApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		var consumption = new ApiConsumption();
		var json = consumption.getData("https://www.omdbapi.com/?t=Gilmore+girls&apikey=3d9b35cf");
		System.out.println(json);

		ConvertsData convert = new ConvertsData();
		SeriesData data = convert.getData(json, SeriesData.class);
		System.out.println(data);

	}
}
