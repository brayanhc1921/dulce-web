package com.dulcesdejesus.dulces_web.Controllers;

import java.util.List;
import java.util.Arrays;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NosotrosController {

    @GetMapping("/nosotros")
    public String nosotros(Model model) {
        // Datos para el menú de navegación
        List<MenuItem> menuItems = Arrays.asList(
            new MenuItem("Inicio", "/"),
            new MenuItem("Productos", "/productos"),
            new MenuItem("Contacto", "/contacto"),
            new MenuItem("Nosotros", "/nosotros")
        );

        model.addAttribute("menuItems", menuItems);
        model.addAttribute("currentPage", "nosotros");

        return "nosotros";
    }
    public class MenuItem {
        private String texto;
        private String url;
    
        public MenuItem(String texto, String url) {
            this.texto = texto;
            this.url = url;
        }
    
        // Getters y setters...
        public String getTexto() {
            return texto;
        }
    
        public void setTexto(String texto) {
            this.texto = texto;
        }
    
        public String getUrl() {
            return url;
        }
    
        public void setUrl(String url) {
            this.url = url;
        }
    }
}