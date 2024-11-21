package hn.unah.poo.electricenergy.controller;

import hn.unah.poo.electricenergy.dtos.FacturacionDTO;

@RestController
@RequestMapping("/api/factura")
public class FacturacionController {

    @Autowired
    private FacturacionServicio facturaServicio;

    @PostMapping("/crear/factura")
    public String facturar(@RequestBody FacturacionDTO entity) {
        return facturaServicio(entity);
    }
}
