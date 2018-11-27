package model;

import com.sun.prism.PixelFormat;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Emprestimo implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private Integer insc_socio;
    private PixelFormat.DataType data_emprestimo;
    private PixelFormat.DataType data_devolucao;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getInsc_socio() {
        return insc_socio;
    }

    public void setInsc_socio(Integer insc_socio) {
        this.insc_socio = insc_socio;
    }

    public PixelFormat.DataType getData_emprestimo() {
        return data_emprestimo;
    }

    public void setData_emprestimo(PixelFormat.DataType data_emprestimo) {
        this.data_emprestimo = data_emprestimo;
    }

    public PixelFormat.DataType getData_devolucao() {
        return data_devolucao;
    }

    public void setData_devolucao(PixelFormat.DataType data_devolucao) {
        this.data_devolucao = data_devolucao;
    }

    public Float getValor() {
        return valor;
    }

    public void setValor(Float valor) {
        this.valor = valor;
    }
    private Float valor;
    
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Emprestimo)) {
            return false;
        }
        Emprestimo other = (Emprestimo) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelV1.Emprestimo [ id=" + id + " ]";
    }

}
