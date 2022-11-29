package ec.edu.espe.exam.form1.model;

import java.security.Timestamp;

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
@Table(name = "SEG_USER")
public class SegUser {

    @EmbeddedId
    private Integer codUser;

    @Column(name = "USERNAME", length = 32, nullable = false)
    private String userName;
    @Column(name = "NAME", length = 128, nullable = false)
    private String name;
    @Column(name = "EMAIL", length = 128, nullable = false)
    private String email;
    @Column(name = "STATUS", length = 3, nullable = false)
    private String status;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name ="CREATION_DATE",nullable = false)
    private Timestamp creationDate;
    public SegUser(Integer codUser) {
        this.codUser = codUser;
    }

    
}
