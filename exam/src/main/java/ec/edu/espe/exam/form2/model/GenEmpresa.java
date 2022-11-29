package ec.edu.espe.exam.form2.model;

import java.math.BigDecimal;

import javax.persistence.*;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "GEN_EMPRESA")
public class GenEmpresa {
    @EmbeddedId
    private Integer cod_empresa;

    private String nombre;
    @Column(name = "COD_LOGOTIPO_EMPRESA", scale = 8, precision = 2, nullable = false)
    private BigDecimal codLogotipoEmpresa;
    @Column(name = "COD_LOGOTIPO_REPORTE", scale = 8, precision = 2, nullable = false)
    private BigDecimal codLogotipoReporte;
    public GenEmpresa(Integer cod_empresa) {
        this.cod_empresa = cod_empresa;
    }

    
    
}
