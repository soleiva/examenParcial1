package ec.edu.espe.exam.form2.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class TesCategoriaInstrumentoPK {
    @Column(name = "COD_EMPRESA", nullable = false)
    private Integer codEmpresa;
    @Column(name = "COD_CATEGORIA_INSTRUMENTO", nullable = false)
    private String codCategoriaInstrumento;
}
