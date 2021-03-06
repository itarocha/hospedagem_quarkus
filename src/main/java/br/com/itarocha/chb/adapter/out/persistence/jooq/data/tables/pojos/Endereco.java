/*
 * This file is generated by jOOQ.
 */
package br.com.itarocha.chb.adapter.out.persistence.jooq.data.tables.pojos;


import java.io.Serializable;
import java.time.LocalDateTime;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Endereco implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long          id;
    private String        bairro;
    private String        cep;
    private String        cidade;
    private String        complemento;
    private Double        latitude;
    private String        logradouro;
    private Double        longitude;
    private Integer       numero;
    private String        uf;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private Long          createdBy;
    private Long          updatedBy;

    public Endereco() {}

    public Endereco(Endereco value) {
        this.id = value.id;
        this.bairro = value.bairro;
        this.cep = value.cep;
        this.cidade = value.cidade;
        this.complemento = value.complemento;
        this.latitude = value.latitude;
        this.logradouro = value.logradouro;
        this.longitude = value.longitude;
        this.numero = value.numero;
        this.uf = value.uf;
        this.createdAt = value.createdAt;
        this.updatedAt = value.updatedAt;
        this.createdBy = value.createdBy;
        this.updatedBy = value.updatedBy;
    }

    public Endereco(
        Long          id,
        String        bairro,
        String        cep,
        String        cidade,
        String        complemento,
        Double        latitude,
        String        logradouro,
        Double        longitude,
        Integer       numero,
        String        uf,
        LocalDateTime createdAt,
        LocalDateTime updatedAt,
        Long          createdBy,
        Long          updatedBy
    ) {
        this.id = id;
        this.bairro = bairro;
        this.cep = cep;
        this.cidade = cidade;
        this.complemento = complemento;
        this.latitude = latitude;
        this.logradouro = logradouro;
        this.longitude = longitude;
        this.numero = numero;
        this.uf = uf;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.createdBy = createdBy;
        this.updatedBy = updatedBy;
    }

    /**
     * Getter for <code>endereco.id</code>.
     */
    public Long getId() {
        return this.id;
    }

    /**
     * Setter for <code>endereco.id</code>.
     */
    public Endereco setId(Long id) {
        this.id = id;
        return this;
    }

    /**
     * Getter for <code>endereco.bairro</code>.
     */
    public String getBairro() {
        return this.bairro;
    }

    /**
     * Setter for <code>endereco.bairro</code>.
     */
    public Endereco setBairro(String bairro) {
        this.bairro = bairro;
        return this;
    }

    /**
     * Getter for <code>endereco.cep</code>.
     */
    public String getCep() {
        return this.cep;
    }

    /**
     * Setter for <code>endereco.cep</code>.
     */
    public Endereco setCep(String cep) {
        this.cep = cep;
        return this;
    }

    /**
     * Getter for <code>endereco.cidade</code>.
     */
    public String getCidade() {
        return this.cidade;
    }

    /**
     * Setter for <code>endereco.cidade</code>.
     */
    public Endereco setCidade(String cidade) {
        this.cidade = cidade;
        return this;
    }

    /**
     * Getter for <code>endereco.complemento</code>.
     */
    public String getComplemento() {
        return this.complemento;
    }

    /**
     * Setter for <code>endereco.complemento</code>.
     */
    public Endereco setComplemento(String complemento) {
        this.complemento = complemento;
        return this;
    }

    /**
     * Getter for <code>endereco.latitude</code>.
     */
    public Double getLatitude() {
        return this.latitude;
    }

    /**
     * Setter for <code>endereco.latitude</code>.
     */
    public Endereco setLatitude(Double latitude) {
        this.latitude = latitude;
        return this;
    }

    /**
     * Getter for <code>endereco.logradouro</code>.
     */
    public String getLogradouro() {
        return this.logradouro;
    }

    /**
     * Setter for <code>endereco.logradouro</code>.
     */
    public Endereco setLogradouro(String logradouro) {
        this.logradouro = logradouro;
        return this;
    }

    /**
     * Getter for <code>endereco.longitude</code>.
     */
    public Double getLongitude() {
        return this.longitude;
    }

    /**
     * Setter for <code>endereco.longitude</code>.
     */
    public Endereco setLongitude(Double longitude) {
        this.longitude = longitude;
        return this;
    }

    /**
     * Getter for <code>endereco.numero</code>.
     */
    public Integer getNumero() {
        return this.numero;
    }

    /**
     * Setter for <code>endereco.numero</code>.
     */
    public Endereco setNumero(Integer numero) {
        this.numero = numero;
        return this;
    }

    /**
     * Getter for <code>endereco.uf</code>.
     */
    public String getUf() {
        return this.uf;
    }

    /**
     * Setter for <code>endereco.uf</code>.
     */
    public Endereco setUf(String uf) {
        this.uf = uf;
        return this;
    }

    /**
     * Getter for <code>endereco.created_at</code>.
     */
    public LocalDateTime getCreatedAt() {
        return this.createdAt;
    }

    /**
     * Setter for <code>endereco.created_at</code>.
     */
    public Endereco setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * Getter for <code>endereco.updated_at</code>.
     */
    public LocalDateTime getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * Setter for <code>endereco.updated_at</code>.
     */
    public Endereco setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * Getter for <code>endereco.created_by</code>.
     */
    public Long getCreatedBy() {
        return this.createdBy;
    }

    /**
     * Setter for <code>endereco.created_by</code>.
     */
    public Endereco setCreatedBy(Long createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     * Getter for <code>endereco.updated_by</code>.
     */
    public Long getUpdatedBy() {
        return this.updatedBy;
    }

    /**
     * Setter for <code>endereco.updated_by</code>.
     */
    public Endereco setUpdatedBy(Long updatedBy) {
        this.updatedBy = updatedBy;
        return this;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final Endereco other = (Endereco) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        }
        else if (!id.equals(other.id))
            return false;
        if (bairro == null) {
            if (other.bairro != null)
                return false;
        }
        else if (!bairro.equals(other.bairro))
            return false;
        if (cep == null) {
            if (other.cep != null)
                return false;
        }
        else if (!cep.equals(other.cep))
            return false;
        if (cidade == null) {
            if (other.cidade != null)
                return false;
        }
        else if (!cidade.equals(other.cidade))
            return false;
        if (complemento == null) {
            if (other.complemento != null)
                return false;
        }
        else if (!complemento.equals(other.complemento))
            return false;
        if (latitude == null) {
            if (other.latitude != null)
                return false;
        }
        else if (!latitude.equals(other.latitude))
            return false;
        if (logradouro == null) {
            if (other.logradouro != null)
                return false;
        }
        else if (!logradouro.equals(other.logradouro))
            return false;
        if (longitude == null) {
            if (other.longitude != null)
                return false;
        }
        else if (!longitude.equals(other.longitude))
            return false;
        if (numero == null) {
            if (other.numero != null)
                return false;
        }
        else if (!numero.equals(other.numero))
            return false;
        if (uf == null) {
            if (other.uf != null)
                return false;
        }
        else if (!uf.equals(other.uf))
            return false;
        if (createdAt == null) {
            if (other.createdAt != null)
                return false;
        }
        else if (!createdAt.equals(other.createdAt))
            return false;
        if (updatedAt == null) {
            if (other.updatedAt != null)
                return false;
        }
        else if (!updatedAt.equals(other.updatedAt))
            return false;
        if (createdBy == null) {
            if (other.createdBy != null)
                return false;
        }
        else if (!createdBy.equals(other.createdBy))
            return false;
        if (updatedBy == null) {
            if (other.updatedBy != null)
                return false;
        }
        else if (!updatedBy.equals(other.updatedBy))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.id == null) ? 0 : this.id.hashCode());
        result = prime * result + ((this.bairro == null) ? 0 : this.bairro.hashCode());
        result = prime * result + ((this.cep == null) ? 0 : this.cep.hashCode());
        result = prime * result + ((this.cidade == null) ? 0 : this.cidade.hashCode());
        result = prime * result + ((this.complemento == null) ? 0 : this.complemento.hashCode());
        result = prime * result + ((this.latitude == null) ? 0 : this.latitude.hashCode());
        result = prime * result + ((this.logradouro == null) ? 0 : this.logradouro.hashCode());
        result = prime * result + ((this.longitude == null) ? 0 : this.longitude.hashCode());
        result = prime * result + ((this.numero == null) ? 0 : this.numero.hashCode());
        result = prime * result + ((this.uf == null) ? 0 : this.uf.hashCode());
        result = prime * result + ((this.createdAt == null) ? 0 : this.createdAt.hashCode());
        result = prime * result + ((this.updatedAt == null) ? 0 : this.updatedAt.hashCode());
        result = prime * result + ((this.createdBy == null) ? 0 : this.createdBy.hashCode());
        result = prime * result + ((this.updatedBy == null) ? 0 : this.updatedBy.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Endereco (");

        sb.append(id);
        sb.append(", ").append(bairro);
        sb.append(", ").append(cep);
        sb.append(", ").append(cidade);
        sb.append(", ").append(complemento);
        sb.append(", ").append(latitude);
        sb.append(", ").append(logradouro);
        sb.append(", ").append(longitude);
        sb.append(", ").append(numero);
        sb.append(", ").append(uf);
        sb.append(", ").append(createdAt);
        sb.append(", ").append(updatedAt);
        sb.append(", ").append(createdBy);
        sb.append(", ").append(updatedBy);

        sb.append(")");
        return sb.toString();
    }
}
