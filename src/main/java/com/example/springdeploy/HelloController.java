package com.example.springdeploy;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class HelloController {
  @Value("${app.message}") //pilla el valor de application.properties
  String message;

  @GetMapping("/hola") // especificamos url. Si ejecutamos y buscamos http://localhost:8081/hola nos sale
  public String holaMundo() {
    System.out.println(message);
    return "Hola Mundo!!!!";
  }

  @GetMapping("/bootstrap")
  public String bootstrap() {
    return """
        <!doctype html>
        <html lang="en">
          <head>
            <meta charset="utf-8">
            <meta name="viewport" content="width=device-width, initial-scale=1">
            <title>Bootstrap demo</title>
            <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
          </head>
          <body>
            <h1>Hola mundo desde Spring Boot!</h1>
            <a class="btn btn-primary" href="https://www.google.com"> Google </a>
            <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
          </body>
        </html>
        """; // esto se puede hacer, pero no es recomendable, ya que si quisieramos cambiar
             // el
    // html tendriamos que recompilar todo java.
  }
}
