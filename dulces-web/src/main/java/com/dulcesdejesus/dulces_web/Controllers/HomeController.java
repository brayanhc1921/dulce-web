package com.dulcesdejesus.dulces_web.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.Arrays;
import java.util.List;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(Model model) {
        // Datos para el carrusel
        List<CarouselItem> carouselItems = Arrays.asList(
            new CarouselItem("torta.jpg", "Torta especial"),
            new CarouselItem("empanadas.jpg", "Empanadas artesanales"),
            new CarouselItem("pie-manzana.jpg", "Pie de manzana")
        );
        
        // Productos destacados
        List<Producto> productosDestacados = Arrays.asList(
            new Producto("Cupcake", "cupcake.jpg", "Delicioso y esponjoso"),
            new Producto("Tarta de Frutas", "tarta-frutas.jpg", "Fresca y dulce"),
            new Producto("Pastel de Chocolate", "pastel-chocolate.jpg", "Clásico irresistible")
        );
        
        // Menú de navegación
        List<MenuItem> menuItems = Arrays.asList(
            new MenuItem("Inicio", "/", "inicio"),
            new MenuItem("Productos", "/productos", "productos"),
            new MenuItem("Contacto", "/contacto", "contacto"),
            new MenuItem("Nosotros", "/nosotros", "nosotros")
        );

        model.addAttribute("carouselItems", carouselItems);
        model.addAttribute("productosDestacados", productosDestacados);
        model.addAttribute("menuItems", menuItems);
        model.addAttribute("currentPage", "inicio");
        
        return "index";
    }

    // Clases de apoyo
    private static class CarouselItem {
        private String imagen;
        private String altText;
        public CarouselItem(String imagen, String altText) {
            this.imagen = imagen;
            this.altText = altText;
        }
    
        // Getters
        public String getImagen() {
            return imagen;
        }
    
        public String getAltText() {
            return altText;
        }
    }
    
    

    private static class Producto {
        private String nombre;
        private String imagen;
        private String descripcion;
        public Producto(String nombre, String imagen, String descripcion) {
            this.nombre = nombre;
            this.imagen = imagen;
            this.descripcion = descripcion;
        }
    
        // Getters
        public String getNombre() {
            return nombre;
        }
    
        public String getImagen() {
            return imagen;
        }
    
        public String getDescripcion() {
            return descripcion;
        }
    }
    

    private static class MenuItem {
        private String texto;
        private String url;
        private String paginaKey;
        public MenuItem(String texto, String url, String paginaKey) {
            this.texto = texto;
            this.url = url;
            this.paginaKey = paginaKey;
        }
    
        // Getters
        public String getTexto() {
            return texto;
        }
    
        public String getUrl() {
            return url;
        }
    
        public String getPaginaKey() {
            return paginaKey;
        }
    }
    }
