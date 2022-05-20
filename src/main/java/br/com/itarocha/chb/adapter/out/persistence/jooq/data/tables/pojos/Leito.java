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
public class Leito implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long          id;
    private Integer       numero;
    private Long          quartoId;
    private Long          situacaoLeitoId;
    private Long          tipoLeitoId;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private Long          createdBy;
    private Long          updatedBy;

    public Leito() {}

    public Leito(Leito value) {
        this.id = value.id;
        this.numero = value.numero;
        this.quartoId = value.quartoId;
        this.situacaoLeitoId = value.situacaoLeitoId;
        this.tipoLeitoId = value.tipoLeitoId;
        this.createdAt = value.createdAt;
        this.updatedAt = value.updatedAt;
        this.createdBy = value.createdBy;
        this.updatedBy = value.updatedBy;
    }

    public Leito(
        Long          id,
        Integer       numero,
        Long          quartoId,
        Long          situacaoLeitoId,
        Long          tipoLeitoId,
        LocalDateTime createdAt,
        LocalDateTime updatedAt,
        Long          createdBy,
        Long          updatedBy
    ) {
        this.id = id;
        this.numero = numero;
        this.quartoId = quartoId;
        this.situacaoLeitoId = situacaoLeitoId;
        this.tipoLeitoId = tipoLeitoId;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.createdBy = createdBy;
        this.updatedBy = updatedBy;
    }

    /**
     * Getter for <code>leito.id</code>.
     */
    public Long getId() {
        return this.id;
    }

    /**
     * Setter for <code>leito.id</code>.
     */
    public Leito setId(Long id) {
        this.id = id;
        return this;
    }

    /**
     * Getter for <code>leito.numero</code>.
     */
    public Integer getNumero() {
        return this.numero;
    }

    /**
     * Setter for <code>leito.numero</code>.
     */
    public Leito setNumero(Integer numero) {
        this.numero = numero;
        return this;
    }

    /**
     * Getter for <code>leito.quarto_id</code>.
     */
    public Long getQuartoId() {
        return this.quartoId;
    }

    /**
     * Setter for <code>leito.quarto_id</code>.
     */
    public Leito setQuartoId(Long quartoId) {
        this.quartoId = quartoId;
        return this;
    }

    /**
     * Getter for <code>leito.situacao_leito_id</code>.
     */
    public Long getSituacaoLeitoId() {
        return this.situacaoLeitoId;
    }

    /**
     * Setter for <code>leito.situacao_leito_id</code>.
     */
    public Leito setSituacaoLeitoId(Long situacaoLeitoId) {
        this.situacaoLeitoId = situacaoLeitoId;
        return this;
    }

    /**
     * Getter for <code>leito.tipo_leito_id</code>.
     */
    public Long getTipoLeitoId() {
        return this.tipoLeitoId;
    }

    /**
     * Setter for <code>leito.tipo_leito_id</code>.
     */
    public Leito setTipoLeitoId(Long tipoLeitoId) {
        this.tipoLeitoId = tipoLeitoId;
        return this;
    }

    /**
     * Getter for <code>leito.created_at</code>.
     */
    public LocalDateTime getCreatedAt() {
        return this.createdAt;
    }

    /**
     * Setter for <code>leito.created_at</code>.
     */
    public Leito setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * Getter for <code>leito.updated_at</code>.
     */
    public LocalDateTime getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * Setter for <code>leito.updated_at</code>.
     */
    public Leito setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * Getter for <code>leito.created_by</code>.
     */
    public Long getCreatedBy() {
        return this.createdBy;
    }

    /**
     * Setter for <code>leito.created_by</code>.
     */
    public Leito setCreatedBy(Long createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     * Getter for <code>leito.updated_by</code>.
     */
    public Long getUpdatedBy() {
        return this.updatedBy;
    }

    /**
     * Setter for <code>leito.updated_by</code>.
     */
    public Leito setUpdatedBy(Long updatedBy) {
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
        final Leito other = (Leito) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        }
        else if (!id.equals(other.id))
            return false;
        if (numero == null) {
            if (other.numero != null)
                return false;
        }
        else if (!numero.equals(other.numero))
            return false;
        if (quartoId == null) {
            if (other.quartoId != null)
                return false;
        }
        else if (!quartoId.equals(other.quartoId))
            return false;
        if (situacaoLeitoId == null) {
            if (other.situacaoLeitoId != null)
                return false;
        }
        else if (!situacaoLeitoId.equals(other.situacaoLeitoId))
            return false;
        if (tipoLeitoId == null) {
            if (other.tipoLeitoId != null)
                return false;
        }
        else if (!tipoLeitoId.equals(other.tipoLeitoId))
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
        result = prime * result + ((this.numero == null) ? 0 : this.numero.hashCode());
        result = prime * result + ((this.quartoId == null) ? 0 : this.quartoId.hashCode());
        result = prime * result + ((this.situacaoLeitoId == null) ? 0 : this.situacaoLeitoId.hashCode());
        result = prime * result + ((this.tipoLeitoId == null) ? 0 : this.tipoLeitoId.hashCode());
        result = prime * result + ((this.createdAt == null) ? 0 : this.createdAt.hashCode());
        result = prime * result + ((this.updatedAt == null) ? 0 : this.updatedAt.hashCode());
        result = prime * result + ((this.createdBy == null) ? 0 : this.createdBy.hashCode());
        result = prime * result + ((this.updatedBy == null) ? 0 : this.updatedBy.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Leito (");

        sb.append(id);
        sb.append(", ").append(numero);
        sb.append(", ").append(quartoId);
        sb.append(", ").append(situacaoLeitoId);
        sb.append(", ").append(tipoLeitoId);
        sb.append(", ").append(createdAt);
        sb.append(", ").append(updatedAt);
        sb.append(", ").append(createdBy);
        sb.append(", ").append(updatedBy);

        sb.append(")");
        return sb.toString();
    }
}
