package hn.unah.poo.electricenergy.controller;

import hn.unah.poo.electricenergy.servicio.TiposResidenciaServicio;

@RestController
@RequestMapping("/api/residencia")
public class TiposResidencia {

    @Autowired
    private TiposResidenciaServicio trServicio;

    @PostMapping("/crear/nuevo")
    public String createTResidencia(@RequestBody TiposResidenciaDTO entity) {
        return trServicio.createTResidencia(entity);
    }
}
