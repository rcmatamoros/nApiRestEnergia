
package hn.unah.poo.electricenergy.dtos;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor

public class AbonadoDTO {

    private String dni;

    private String nombre;
    private String apellido;
    private String telefono;

    private TiposResidenciaDTO tiposResidenciaDTO;

    private FacturacionDTO facturacionDTO;
}
