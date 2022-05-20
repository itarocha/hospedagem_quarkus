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
public class TipoLeito implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long          id;
    private String        descricao;
    private Integer       quantidadeCamas;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private Long          createdBy;
    private Long          updatedBy;

    public TipoLeito() {}

    public TipoLeito(TipoLeito value) {
        this.id = value.id;
        this.descricao = value.descricao;
        this.quantidadeCamas = value.quantidadeCamas;
        this.createdAt = value.createdAt;
        this.updatedAt = value.updatedAt;
        this.createdBy = value.createdBy;
        this.updatedBy = value.updatedBy;
    }

    public TipoLeito(
        Long          id,
        String        descricao,
        Integer       quantidadeCamas,
        LocalDateTime createdAt,
        LocalDateTime updatedAt,
        Long          createdBy,
        Long          updatedBy
    ) {
        this.id = id;
        this.descricao = descricao;
        this.quantidadeCamas = quantidadeCamas;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.createdBy = createdBy;
        this.updatedBy = updatedBy;
    }

    /**
     * Getter for <code>tipo_leito.id</code>.
     */
    public Long getId() {
        return this.id;
    }

    /**
     * Setter for <code>tipo_leito.id</code>.
     */
    public TipoLeito setId(Long id) {
        this.id = id;
        return this;
    }

    /**
     * Getter for <code>tipo_leito.descricao</code>.
     */
    public String getDescricao() {
        return this.descricao;
    }

    /**
     * Setter for <code>tipo_leito.descricao</code>.
     */
    public TipoLeito setDescricao(String descricao) {
        this.descricao = descricao;
        return this;
    }

    /**
     * Getter for <code>tipo_leito.quantidade_camas</code>.
     */
    public Integer getQuantidadeCamas() {
        return this.quantidadeCamas;
    }

    /**
     * Setter for <code>tipo_leito.quantidade_camas</code>.
     */
    public TipoLeito setQuantidadeCamas(Integer quantidadeCamas) {
        this.quantidadeCamas = quantidadeCamas;
        return this;
    }

    /**
     * Getter for <code>tipo_leito.created_at</code>.
     */
    public LocalDateTime getCreatedAt() {
        return this.createdAt;
    }

    /**
     * Setter for <code>tipo_leito.created_at</code>.
     */
    public TipoLeito setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * Getter for <code>tipo_leito.updated_at</code>.
     */
    public LocalDateTime getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * Setter for <code>tipo_leito.updated_at</code>.
     */
    public TipoLeito setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * Getter for <code>tipo_leito.created_by</code>.
     */
    public Long getCreatedBy() {
        return this.createdBy;
    }

    /**
     * Setter for <code>tipo_leito.created_by</code>.
     */
    public TipoLeito setCreatedBy(Long createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     * Getter for <code>tipo_leito.updated_by</code>.
     */
    public Long getUpdatedBy() {
        return this.updatedBy;
    }

    /**
     * Setter for <code>tipo_leito.updated_by</code>.
     */
    public TipoLeito setUpdatedBy(Long updatedBy) {
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
        final TipoLeito other = (TipoLeito) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        }
        else if (!id.equals(other.id))
            return false;
        if (descricao == null) {
            if (other.descricao != null)
                return false;
        }
        else if (!descricao.equals(other.descricao))
            return false;
        if (quantidadeCamas == null) {
            if (other.quantidadeCamas != null)
                return false;
        }
        else if (!quantidadeCamas.equals(other.quantidadeCamas))
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
        result = prime * result + ((this.descricao == null) ? 0 : this.descricao.hashCode());
        result = prime * result + ((this.quantidadeCamas == null) ? 0 : this.quantidadeCamas.hashCode());
        result = prime * result + ((this.createdAt == null) ? 0 : this.createdAt.hashCode());
        result = prime * result + ((this.updatedAt == null) ? 0 : this.updatedAt.hashCode());
        result = prime * result + ((this.createdBy == null) ? 0 : this.createdBy.hashCode());
        result = prime * result + ((this.updatedBy == null) ? 0 : this.updatedBy.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("TipoLeito (");

        sb.append(id);
        sb.append(", ").append(descricao);
        sb.append(", ").append(quantidadeCamas);
        sb.append(", ").append(createdAt);
        sb.append(", ").append(updatedAt);
        sb.append(", ").append(createdBy);
        sb.append(", ").append(updatedBy);

        sb.append(")");
        return sb.toString();
    }
}