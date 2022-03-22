package edu.mjv.school.projetofinal.model;

import java.time.LocalDateTime;

import javax.persistence.Basic;
import javax.persistence.Embeddable;

@Embeddable
public class Log {
    @Basic
    private LocalDateTime criadoEm;
    @Basic
    private LocalDateTime alteradoEm;

    public LocalDateTime getAlteradoEm() {
        return alteradoEm;
    }

    public void setAlteradoEm(LocalDateTime alteradoEm) {
        this.alteradoEm = alteradoEm;
    }

    public LocalDateTime getCriadoEm() {
        return criadoEm;
    }

    public void setCriadoEm(LocalDateTime criadoEm) {
        this.criadoEm = criadoEm;
    }
}
