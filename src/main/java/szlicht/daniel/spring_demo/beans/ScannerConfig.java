package szlicht.daniel.spring_demo.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class ScannerConfig { // klasa ktorej zadaniem jest odpowiednio skonfigurować obiekt bilioteki i dać do puli beanów springa (Spring Context)

    //ta adnotacja zadziała analogicznie do adnotacji komponent ale utworzy obiekt i doda do puli przez tą metodę
    @Bean
    public Scanner provideScanner() {
        return new Scanner(System.in);
    }

}
