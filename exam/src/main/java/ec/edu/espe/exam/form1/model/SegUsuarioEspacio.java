package ec.edu.espe.exam.form1.model;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;

public class SegUsuarioEspacio {

    @EmbeddedId
    private SegUsuarioEspacioPk pk;

    @Column(name = "ROL", length = 3, nullable = false)
    private String rol;
    @Column(name = "ESTADO", length = 3, nullable = false)
    private String estado;
    public SegUsuarioEspacio(SegUsuarioEspacioPk pk) {
        this.pk = pk;
    }

    @ManyToOne
    @JoinColumns({
        @JoinColumn(name = "COD_ESPACIO", referencedColumnName = "COD_ESPACIO", insertable = false, updatable = false),
        @JoinColumn(name = "COD_USER", referencedColumnName = "COD_USER", insertable = false, updatable = false),
})
    private GdcEspacio gdcEspacio;

    
    
}
