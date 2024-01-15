package ro.uvt.info.designpatternslab2023.difexample;

import ro.uvt.info.designpatternslab2023.difexample.ClientComponent; // Replace with the actual package name of your ClientComponent
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


    @RestController
    public class Controller {
        private final ClientComponent clientComponent;

        @Autowired
        public Controller(ClientComponent clientComponent) {
            this.clientComponent = clientComponent;
        }

        @GetMapping("/")
        public String sayHello() {
            return "Hello from ClientComponent = " + clientComponent.toString();
        }
    }

