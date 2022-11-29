package ec.edu.espe.exam.form2.model;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;

public class TesCategoriaInstrumento {
    @EmbeddedId
    private TesCategoriaInstrumentoPK pk;
    @Column(name = "NOMBRE", length=100,nullable = false)
    private String nombre;
    @Column(name = "TIPO_RENTA", length=100,nullable = false)
    private String tipoRenta;
    
}
