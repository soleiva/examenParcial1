package ec.edu.espe.exam.form1.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.Data;

@Data
@Embeddable

public class SegUsuarioEspacioPk {
    @Column(name = "COD_ESPACIO", nullable = false)
    private Integer codEspacio;
    @Column(name = "COD_USER", nullable = false)
    private Integer codUser;
}
