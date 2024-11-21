package hn.unah.poo.electricenergy.modelo;

import lombok.Setter;
import lombok.Getter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name = "abonado")

public class Abonado {
    @Id
    private String dni;

    private String nombre;
    private String apellido;
    private String telefono;

    // la llave foranea aqui

    // private int idTipoResidencia;

    private Facturacion facturacion;

    private TiposResidencia tiposResidencia;
}
