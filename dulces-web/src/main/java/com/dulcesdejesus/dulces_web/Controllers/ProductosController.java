package com.dulcesdejesus.dulces_web.Controllers;
import java.util.List;
import java.util.Arrays;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProductosController {

    @GetMapping("/productos")
    public String productos(Model model) {
        // Datos para la página de productos
        List<Producto> productos = Arrays.asList(
            new Producto("Torta de Chocolate", "https://tse3.mm.bing.net/th?id=OIP.qPeHonOCakuZKVWwI7ytpAHaEK&pid=Api", "Deliciosa torta de chocolate con cobertura de fudge y decoraciones artesanales.", "S/ 50.00"),
            new Producto("Torta de Fresas", "https://tse4.mm.bing.net/th?id=OIP.fDEU141UIcEPRIucvmnhnAHaHa&pid=Api", "Torta esponjosa con capas de crema y fresas frescas. Ideal para celebraciones especiales.", "S/ 60.00"),
            new Producto("Torta de Vainilla", "https://tse3.mm.bing.net/th?id=OIP.7ddgmWxqyxtpqneBELZWaAHaE8&pid=Api", "Clásica torta de vainilla con relleno de crema pastelera y un toque de frutas.", "S/ 45.00"),
            new Producto("Queque de Limón", "https://tse2.mm.bing.net/th?id=OIP.KPKvQLn8aQ9Cei9yv1eTxQHaGq&pid=Api", "Queque suave y esponjoso con un delicado sabor a limón. Perfecto para la hora del té.", "S/ 25.00"),
            new Producto("Queque de Naranja", "https://tse4.mm.bing.net/th?id=OIP.BjEHmlNe_lkWKzh7rnQqaQHaEe&pid=Api", "Delicioso queque con esencia natural de naranja y glaseado cítrico.", "S/ 28.00"),
            new Producto("Queque de Zanahoria", "https://tse3.mm.bing.net/th?id=OIP.CHToDPQhD6loON3g6XWAvwHaE6&pid=Api", "Queque húmedo de zanahoria con nueces y un toque de canela.", "S/ 30.00"),
            new Producto("Empanada de Atún", "https://tse1.mm.bing.net/th?id=OIP.U6Q1xOH7sGswf3SZSdbNtAHaE7&pid=Api", "Empanada rellena de atún fresco, cebolla y especias. Masa crujiente y dorada.", "S/ 8.00"),
            new Producto("Empanada de Carne", "https://tse1.mm.bing.net/th?id=OIP.2YVS7I4vqB72mvvt_S8MzQHaEK&pid=Api", "Rellena de carne sazonada con hierbas y vegetales. Un clásico que nunca falla.", "S/ 10.00"),
            new Producto("Empanada de Queso", "https://tse1.mm.bing.net/th?id=OIP.5qnl_EyVBN7tDpcSj6shcwHaD4&pid=Api", "Deliciosa empanada con abundante queso derretido en su interior.", "S/ 7.00"),
            new Producto("Pastel de Frutas", "https://bing.com/th?id=OSK.eb23d1ef8305fcdf50cbd6d56aff860b", "Pastel artesanal con frutas frescas, perfecto para ocasiones especiales.", "S/ 55.00"),
            new Producto("Brownies de Chocolate", "https://kitchenfair.com.mx/wp-content/uploads/2017/07/receta_brownies_1280x854.jpg", "Intensos y húmedos brownies de chocolate con trozos de nuez.", "S/ 20.00 (6 unidades)"),
            new Producto("Galletas Artesanales", "https://image.freepik.com/foto-gratis/galletas-artesanales_95678-228.jpg", "Crujientes galletas hechas a mano, con chispas de chocolate y avena.", "S/ 15.00 (12 unidades)")
        );
          // Datos para el menú de navegación
          List<MenuItem> menuItems = Arrays.asList(
            new MenuItem("Inicio", "/"),
            new MenuItem("Productos", "/productos"),
            new MenuItem("Contacto", "/contacto"),
            new MenuItem("Nosotros", "/nosotros")
        );
        model.addAttribute("menuItems", menuItems);
        model.addAttribute("productos", productos);
        model.addAttribute("currentPage", "productos");
        
        return "productos";
    }
    public class Producto {
    private String nombre;
    private String imagen;
    private String descripcion;
    private String precio;

    public Producto(String nombre, String imagen, String descripcion, String precio) {
        this.nombre = nombre;
        this.imagen = imagen;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    // Getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }
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