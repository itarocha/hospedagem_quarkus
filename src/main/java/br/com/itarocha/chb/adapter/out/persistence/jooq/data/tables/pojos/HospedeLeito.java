/*
 * This file is generated by jOOQ.
 */
package br.com.itarocha.chb.adapter.out.persistence.jooq.data.tables.pojos;


import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class HospedeLeito implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long          id;
    private LocalDate     dataEntrada;
    private Long          hospedeId;
    private Long          leitoId;
    private Long          quartoId;
    private LocalDate     dataSaida;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private Long          createdBy;
    private Long          updatedBy;

    public HospedeLeito() {}

    public HospedeLeito(HospedeLeito value) {
        this.id = value.id;
        this.dataEntrada = value.dataEntrada;
        this.hospedeId = value.hospedeId;
        this.leitoId = value.leitoId;
        this.quartoId = value.quartoId;
        this.dataSaida = value.dataSaida;
        this.createdAt = value.createdAt;
        this.updatedAt = value.updatedAt;
        this.createdBy = value.createdBy;
        this.updatedBy = value.updatedBy;
    }

    public HospedeLeito(
        Long          id,
        LocalDate     dataEntrada,
        Long          hospedeId,
        Long          leitoId,
        Long          quartoId,
        LocalDate     dataSaida,
        LocalDateTime createdAt,
        LocalDateTime updatedAt,
        Long          createdBy,
        Long          updatedBy
    ) {
        this.id = id;
        this.dataEntrada = dataEntrada;
        this.hospedeId = hospedeId;
        this.leitoId = leitoId;
        this.quartoId = quartoId;
        this.dataSaida = dataSaida;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.createdBy = createdBy;
        this.updatedBy = updatedBy;
    }

    /**
     * Getter for <code>hospede_leito.id</code>.
     */
    public Long getId() {
        return this.id;
    }

    /**
     * Setter for <code>hospede_leito.id</code>.
     */
    public HospedeLeito setId(Long id) {
        this.id = id;
        return this;
    }

    /**
     * Getter for <code>hospede_leito.data_entrada</code>.
     */
    public LocalDate getDataEntrada() {
        return this.dataEntrada;
    }

    /**
     * Setter for <code>hospede_leito.data_entrada</code>.
     */
    public HospedeLeito setDataEntrada(LocalDate dataEntrada) {
        this.dataEntrada = dataEntrada;
        return this;
    }

    /**
     * Getter for <code>hospede_leito.hospede_id</code>.
     */
    public Long getHospedeId() {
        return this.hospedeId;
    }

    /**
     * Setter for <code>hospede_leito.hospede_id</code>.
     */
    public HospedeLeito setHospedeId(Long hospedeId) {
        this.hospedeId = hospedeId;
        return this;
    }

    /**
     * Getter for <code>hospede_leito.leito_id</code>.
     */
    public Long getLeitoId() {
        return this.leitoId;
    }

    /**
     * Setter for <code>hospede_leito.leito_id</code>.
     */
    public HospedeLeito setLeitoId(Long leitoId) {
        this.leitoId = leitoId;
        return this;
    }

    /**
     * Getter for <code>hospede_leito.quarto_id</code>.
     */
    public Long getQuartoId() {
        return this.quartoId;
    }

    /**
     * Setter for <code>hospede_leito.quarto_id</code>.
     */
    public HospedeLeito setQuartoId(Long quartoId) {
        this.quartoId = quartoId;
        return this;
    }

    /**
     * Getter for <code>hospede_leito.data_saida</code>.
     */
    public LocalDate getDataSaida() {
        return this.dataSaida;
    }

    /**
     * Setter for <code>hospede_leito.data_saida</code>.
     */
    public HospedeLeito setDataSaida(LocalDate dataSaida) {
        this.dataSaida = dataSaida;
        return this;
    }

    /**
     * Getter for <code>hospede_leito.created_at</code>.
     */
    public LocalDateTime getCreatedAt() {
        return this.createdAt;
    }

    /**
     * Setter for <code>hospede_leito.created_at</code>.
     */
    public HospedeLeito setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * Getter for <code>hospede_leito.updated_at</code>.
     */
    public LocalDateTime getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * Setter for <code>hospede_leito.updated_at</code>.
     */
    public HospedeLeito setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * Getter for <code>hospede_leito.created_by</code>.
     */
    public Long getCreatedBy() {
        return this.createdBy;
    }

    /**
     * Setter for <code>hospede_leito.created_by</code>.
     */
    public HospedeLeito setCreatedBy(Long createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     * Getter for <code>hospede_leito.updated_by</code>.
     */
    public Long getUpdatedBy() {
        return this.updatedBy;
    }

    /**
     * Setter for <code>hospede_leito.updated_by</code>.
     */
    public HospedeLeito setUpdatedBy(Long updatedBy) {
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
        final HospedeLeito other = (HospedeLeito) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        }
        else if (!id.equals(other.id))
            return false;
        if (dataEntrada == null) {
            if (other.dataEntrada != null)
                return false;
        }
        else if (!dataEntrada.equals(other.dataEntrada))
            return false;
        if (hospedeId == null) {
            if (other.hospedeId != null)
                return false;
        }
        else if (!hospedeId.equals(other.hospedeId))
            return false;
        if (leitoId == null) {
            if (other.leitoId != null)
                return false;
        }
        else if (!leitoId.equals(other.leitoId))
            return false;
        if (quartoId == null) {
            if (other.quartoId != null)
                return false;
        }
        else if (!quartoId.equals(other.quartoId))
            return false;
        if (dataSaida == null) {
            if (other.dataSaida != null)
                return false;
        }
        else if (!dataSaida.equals(other.dataSaida))
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
        result = prime * result + ((this.dataEntrada == null) ? 0 : this.dataEntrada.hashCode());
        result = prime * result + ((this.hospedeId == null) ? 0 : this.hospedeId.hashCode());
        result = prime * result + ((this.leitoId == null) ? 0 : this.leitoId.hashCode());
        result = prime * result + ((this.quartoId == null) ? 0 : this.quartoId.hashCode());
        result = prime * result + ((this.dataSaida == null) ? 0 : this.dataSaida.hashCode());
        result = prime * result + ((this.createdAt == null) ? 0 : this.createdAt.hashCode());
        result = prime * result + ((this.updatedAt == null) ? 0 : this.updatedAt.hashCode());
        result = prime * result + ((this.createdBy == null) ? 0 : this.createdBy.hashCode());
        result = prime * result + ((this.updatedBy == null) ? 0 : this.updatedBy.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("HospedeLeito (");

        sb.append(id);
        sb.append(", ").append(dataEntrada);
        sb.append(", ").append(hospedeId);
        sb.append(", ").append(leitoId);
        sb.append(", ").append(quartoId);
        sb.append(", ").append(dataSaida);
        sb.append(", ").append(createdAt);
        sb.append(", ").append(updatedAt);
        sb.append(", ").append(createdBy);
        sb.append(", ").append(updatedBy);

        sb.append(")");
        return sb.toString();
    }
}