package Examen1.Examen1.controller;

//Imports a utoilizar
import Examen1.Examen1.domain.Farmacia;
import Examen1.Examen1.service.FarmaciaService; 
import lombok.extern.slf4j.Slf4j; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.stereotype.Controller; 
import org.springframework.ui.Model; 
import org.springframework.web.bind.annotation.GetMapping; 
import org.springframework.web.bind.annotation.PostMapping; 
import org.springframework.web.bind.annotation.RequestMapping; 
import org.springframework.web.bind.annotation.RequestParam; 
import org.springframework.web.bind.annotation.PathVariable; 
import org.springframework.web.multipart.MultipartFile;

@Controller 
@Slf4j 
@RequestMapping("/medicamentos")

public class FarmaciaController {
    
    @Autowired 
    private FarmaciaService farmaciaService; 

    //Mapea las solicitudes GET a "/medicamentos/listado".
    @GetMapping("/listado") 
    
    //Define el método inicio que recibe un Model.
    public String inicio(Model model) { 
        //Obtiene una lista de medicamentos del servicio.
        var medicamentosNuevo = farmaciaService.getFarmacias(false); 
        //Registra la cantidad de medicamentos obtenidos.
        log.info("Cantidad de medicamentos: " + medicamentosNuevo.size()); 
        //Agrega la lista de medicamentos al modelo.
        model.addAttribute("medicamentos", medicamentosNuevo); 
        //Agrega la cantidad total de medicamentos al modelo.
        model.addAttribute("totalmedicamentos", medicamentosNuevo.size()); 
        //Retorna el nombre de la vista "medicamentos/listado".
        return "categoria/listado"; 
    }

}

