
package model;

import com.sun.prism.PixelFormat;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Copias implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String cod_insc_midia;
    private String titulo;
    private String descricao;
    private String nome_diretor;
    private String artista_princ;
    private String genero;
    private PixelFormat.DataType data_arquivacao;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCod_insc_midia() {
        return cod_insc_midia;
    }

    public void setCod_insc_midia(String cod_insc_midia) {
        this.cod_insc_midia = cod_insc_midia;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getNome_diretor() {
        return nome_diretor;
    }

    public void setNome_diretor(String nome_diretor) {
        this.nome_diretor = nome_diretor;
    }

    public String getArtista_princ() {
        return artista_princ;
    }

    public void setArtista_princ(String artista_princ) {
        this.artista_princ = artista_princ;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public PixelFormat.DataType getData_arquivacao() {
        return data_arquivacao;
    }

    public void setData_arquivacao(PixelFormat.DataType data_arquivacao) {
        this.data_arquivacao = data_arquivacao;
    }
    
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Copias)) {
            return false;
        }
        Copias other = (Copias) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelV1.Copias [ id=" + id + " ]";
    }

}
