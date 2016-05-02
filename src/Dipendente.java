
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author svilupposw
 */
public class Dipendente extends Persona {
    private Date dataAssunzione;
    private int ferieMaturate;
    private int ferieGodute;
    private String matricola;

    public Date getDataAssunzione() {
        return dataAssunzione;
    }

    public void setDataAssunzione(Date dataAssunzione) {
        this.dataAssunzione = dataAssunzione;
    }

    public int getFerieMaturate() {
        return ferieMaturate;
    }

    public void setFerieMaturate(int ferieMaturate) {
        this.ferieMaturate = ferieMaturate;
    }

    public int getFerieGodute() {
        return ferieGodute;
    }

    public void setFerieGodute(int ferieGodute) {
        this.ferieGodute = ferieGodute;
    }

    public String getMatricola() {
        return matricola;
    }

    public void setMatricola(String matricola) {
        this.matricola = matricola;
    }
}
