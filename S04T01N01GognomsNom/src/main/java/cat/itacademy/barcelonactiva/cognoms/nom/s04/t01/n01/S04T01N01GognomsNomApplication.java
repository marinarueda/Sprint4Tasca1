package cat.itacademy.barcelonactiva.cognoms.nom.s04.t01.n01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;


@SpringBootApplication
public class S04T01N01GognomsNomApplication {

	public static void main(String[] args) {
		SpringApplication.run(S04T01N01GognomsNomApplication.class, args);
        llamarUrls();
    }
    
    public static void llamarUrls() {
        String baseUrl = "http://localhost:9000";

        RestTemplate restTemplate = new RestTemplate();
        
        // Llamada al método saluda utilizando el parámetro de consulta "nom"
        ResponseEntity<String> response1 = restTemplate.getForEntity(baseUrl + "/HelloWorld?nom=John", String.class);
        if (response1 != null) {
            System.out.println(response1.getBody());
        } else {
            System.out.println("La respuesta 1 es nula.");
        }

        // Llamada al método saluda sin proporcionar el parámetro de consulta "nom"
        ResponseEntity<String> response2 = restTemplate.getForEntity(baseUrl + "/HelloWorld", String.class);
        if (response2 != null) {
            System.out.println(response2.getBody());
        } else {
            System.out.println("La respuesta 2 es nula.");
        }

        // Llamada al método saluda2 utilizando la ruta de URL como variable de ruta
        ResponseEntity<String> response3 = restTemplate.getForEntity(baseUrl + "/HelloWorld2/Mary", String.class);
        if (response3 != null) {
            System.out.println(response3.getBody());
        } else {
            System.out.println("La respuesta 3 es nula.");
        }

        // Llamada al método saluda2 sin proporcionar la variable de ruta "nom"
        ResponseEntity<String> response4 = restTemplate.getForEntity(baseUrl + "/HelloWorld2", String.class);
        if (response4 != null) {
            System.out.println(response4.getBody());
        } else {
            System.out.println("La respuesta 4 es nula.");
        }
    }
}
  