package hn.unah.poo.electricenergy.controller;

import hn.unah.poo.electricenergy.dtos.AbonadoDTO;
import hn.unah.poo.electricenergy.servicio.AbonadoServicio;

@RestController
@RequestMapping("/api/abonado")
public class AbonadoController {

    @Autowired
    private AbonadoServicio aServicio;

    @PostMapping("/crear/nuevo")
    public createAbonado(@RequestBody AbonadoDTO entity) {
        return  aServicio.createAbonado(entity);
        
    }

    // no lo pide pero lo haremos por RequestParam
    @GetMapping("/obtener/dni")
    public Optional<AbandonadoDTO> obtenerAbonadoById(@RequestParam(name = "dni") String dni) {
        return aServicio.obtenerAbonadoById(dni);

    }

    // Sera por la url
    @DeleteMapping("/delete/dni/{dni}")
    public String deleteAbonado(@PathVariable(name = "dni") String dni) {
        return aServicio.deleteAbonado(dni);
    }

}
