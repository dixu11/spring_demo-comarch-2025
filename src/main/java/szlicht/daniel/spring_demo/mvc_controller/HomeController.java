package szlicht.daniel.spring_demo.mvc_controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

//kontroler to wyspecjalizowany komponent kótóry pozwala serwować enpointy (punkty wejścia do serwera odpowiadajace na metody http)
@Controller
public class HomeController {

    @GetMapping("/")
    public String showPage() { //zwracanie widoku - ModelAndView - pełny obiekt lub w skrócie nazwa widoku bez rozszerzenia pliku
        System.out.println("Przyszło zapytanie o stronę domową");
        return "index"; //szuka takiego widoku w folderze templates
    }
}
