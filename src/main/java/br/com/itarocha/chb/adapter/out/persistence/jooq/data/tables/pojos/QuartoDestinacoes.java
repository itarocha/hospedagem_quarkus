/*
 * This file is generated by jOOQ.
 */
package br.com.itarocha.chb.adapter.out.persistence.jooq.data.tables.pojos;


import java.io.Serializable;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class QuartoDestinacoes implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long quartoId;
    private Long destinacaoHospedagemId;

    public QuartoDestinacoes() {}

    public QuartoDestinacoes(QuartoDestinacoes value) {
        this.quartoId = value.quartoId;
        this.destinacaoHospedagemId = value.destinacaoHospedagemId;
    }

    public QuartoDestinacoes(
        Long quartoId,
        Long destinacaoHospedagemId
    ) {
        this.quartoId = quartoId;
        this.destinacaoHospedagemId = destinacaoHospedagemId;
    }

    /**
     * Getter for <code>quarto_destinacoes.quarto_id</code>.
     */
    public Long getQuartoId() {
        return this.quartoId;
    }

    /**
     * Setter for <code>quarto_destinacoes.quarto_id</code>.
     */
    public QuartoDestinacoes setQuartoId(Long quartoId) {
        this.quartoId = quartoId;
        return this;
    }

    /**
     * Getter for <code>quarto_destinacoes.destinacao_hospedagem_id</code>.
     */
    public Long getDestinacaoHospedagemId() {
        return this.destinacaoHospedagemId;
    }

    /**
     * Setter for <code>quarto_destinacoes.destinacao_hospedagem_id</code>.
     */
    public QuartoDestinacoes setDestinacaoHospedagemId(Long destinacaoHospedagemId) {
        this.destinacaoHospedagemId = destinacaoHospedagemId;
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
        final QuartoDestinacoes other = (QuartoDestinacoes) obj;
        if (quartoId == null) {
            if (other.quartoId != null)
                return false;
        }
        else if (!quartoId.equals(other.quartoId))
            return false;
        if (destinacaoHospedagemId == null) {
            if (other.destinacaoHospedagemId != null)
                return false;
        }
        else if (!destinacaoHospedagemId.equals(other.destinacaoHospedagemId))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.quartoId == null) ? 0 : this.quartoId.hashCode());
        result = prime * result + ((this.destinacaoHospedagemId == null) ? 0 : this.destinacaoHospedagemId.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("QuartoDestinacoes (");

        sb.append(quartoId);
        sb.append(", ").append(destinacaoHospedagemId);

        sb.append(")");
        return sb.toString();
    }
}
