package ec.edu.espe.exam.form1.model;

import java.security.Timestamp;


import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;
import lombok.NoArgsConstructor;




@Data
@NoArgsConstructor
@Entity
@Table(name = "GDC_ESPACIO_HISTORIAL")
public class GdcEspacioHistorial {

    @EmbeddedId
    private Integer codeEsapcioHistorial;

    @Column(name = "COD_ESPACIO", nullable = false)
    private Integer codEspacio;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name ="FECHA",nullable = false)
    private Timestamp fecha;

    @Column(name = "ACCION", length = 8, nullable = false)
    private String accion;

    @Column(name = "USERNAME", length = 32, nullable = false)
    private String userName;

    @Column(name = "DESCRIPCION", length = 128, nullable = false)
    private String descripcion;

    public GdcEspacioHistorial(Integer codeEsapcioHistorial) {
        this.codeEsapcioHistorial = codeEsapcioHistorial;
    }

    @ManyToOne
    @JoinColumn(name = "COD_ESPACIO", referencedColumnName = "COD_ESPACIO", insertable = false, updatable = false);
    private GdcEspacio gdcEspacio;

    
}
