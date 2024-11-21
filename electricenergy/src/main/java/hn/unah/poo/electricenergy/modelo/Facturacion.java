package hn.unah.poo.electricenergy.modelo;

@Setter
@Getter
@NoArgsCosntructor
@AllArgsConstructor

@Entity
@Table(name = "facturacion")
public class Facturacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    // @JoinColumn()
    private int value;
    // llave en abonado, relacion de tipo
    private Sring dni;

   // @Column(name = "fechafacturacion")
    private LocalDate fechaFacturacion;
    private double kwsConsumidos;
    private double totalFacturacion;

    private Abonado abonado;
}
