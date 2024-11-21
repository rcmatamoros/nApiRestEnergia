package hn.unah.poo.electricenergy.servicio;

import hn.unah.poo.electricenergy.modelo.TiposResidencia;

@Service
public class TiposResidenciaServicio {

    @Autowired
    private TiposResidenciaRepositorio trRepositorio;

    private ModelMapper modelMapper;

    public String createTResidencia(TiposResidenciaDTO nvoResindencia) {
        if (this.trRepositorio.existsById(nvoResindencia.getIdTipoResidencia())) {
            return " ya existe";

        }
        modelMapper = new ModelMapper();

        TiposResidencia trBd = this.modelMapper.map(nvoResindencia, TiposResidencia.class);
        this.trRepositorio.save(trBd);

        return "Save exitosamengte";
    }
}

/*
 * Con base en lo anterior deberá crear los siguientes métodos:
 * a. Método para crear tipos de residencias
 * Parámetros: Json request {“descripción”:”descripción”, “precioKw” : 5.467}
 * Deberá insertar 3 tipos: residencial, 4.56. bodega, 8.98, edificio, 5.48.
 */
