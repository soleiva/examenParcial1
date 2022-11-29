package ec.edu.espe.exam.form1.model;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "GDC_ESPACIO")
public class GdcEspacio {

    @EmbeddedId
    private Integer codespacio;

    @Column(name ="NOMBRE",length = 128, nullable = false)
    private String nombre;

    @Column(name ="DESCRIPCION",length = 500, nullable = false)
    private String descripcion;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name ="FECHA_CREACION",nullable = false)
    private Timestamp fechaCreacion;

    @Column(name ="VISIBILIDAD",length = 3, nullable = false)
    private String visibilidad;

    public GdcEspacio(Integer codespacio) {
        this.codespacio = codespacio;
    }

    
}
