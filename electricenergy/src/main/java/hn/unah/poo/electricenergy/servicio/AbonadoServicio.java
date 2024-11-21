package hn.unah.poo.electricenergy.servicio;

import hn.unah.poo.electricenergy.dtos.AbonadoDTO;
import hn.unah.poo.electricenergy.modelo.Abonado;

@Service
public class AbonadoServicio {

    // Es quien usara a Singleton

    @Autowired
    private AbonadoRepositorio aRepositorio;

    private ModelMapper modelMapper;

    // crear abonado
    public String createAbonado(AbonadoDTO nvoAbonado) {

        if (this.aRepositorio.existsById(nvoAbonado.getDni())) {
            return "Ya existe";
        }
        modelmapper = new ModelMapper();
        Abonado nvoAbonadoBd = this.modelMapper.map(nvoAbonado, Abonado.class);
        this.aRepositorio.save(nvoAbonadoBd);
        return "save con exito";
    }

    public Optional<AbonadoDTO> obtenerAbonadoById(String id) {
        modelMapper = new ModelMapper();

        Optional<Abonado> abonado = aRepositorio.findById(id);
        AbonadoDTO aboDto = this.modelMapper.map(abonado, AbonadoDTO.class);

        return Optional.ofNullable(aboDto);
    }

    public String deleteAbonado(String id) {
        if (!this.aRepositorio.existsById(id)) {
            return "No existe ";

        }
        this.aRepositorio.deleteById(id);
        return "Eliminado satisfactorio";
    }

}
// los metodos en controlador seran los mismos
// en servicio la diferencia es quien posee la logica

/*
 * Con base en lo anterior deberá crear los siguientes métodos:
 * a. Método para crear tipos de residencias
 * Parámetros: Json request {“descripción”:”descripción”, “precioKw” : 5.467}
 * Deberá insertar 3 tipos: residencial, 4.56. bodega, 8.98, edificio, 5.48.
 * 
 * b. Método crear abonados:
 * Parámetros: Json request {“abonadoId”: “0801199018499”, “nombre”:”Karla”,
 * “apellido”:”Mendoza”, “teléfono”: “999-999-99”, “idTipoResidencia”:1}
 * c. Método para obtener Abonado.
 * Parámetros: dni
 * d. Método para eliminar Abonado
 * Parámetros: dni
 * 
 * e. Método para facturar()
 * Parámetros: Json Request
 * {
 * “dni”: “0801199804965”
 * “kwConsumido” : 32.65
 * }
 * 
 * total=kwConsumidos*precioKw
 * Con lo anterior usted deberá crear un registro en la tabla facturación, la
 * fechaFacturacion la tomará del sistema y el total lo calculará multiplicando
 * los
 * kwConsumidos * precioKw el cual deberá obtener a partir del idTipoResidencia
 * del
 * abonado por el dni.
 */