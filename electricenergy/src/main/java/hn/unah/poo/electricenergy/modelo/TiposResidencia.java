package hn.unah.poo.electricenergy.modelo;

import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name = "tiposresidencia")
public class TiposResidencia {

    // residencia solo puede tener un abonado
    // abonado puede tener varias residencias
    @Id
   // @Column(name = "idtiporesidencia")
    private int idTipoResidencia;
    private String descripcion;
    private double precioKw;

    private Abonado abonado;
}
