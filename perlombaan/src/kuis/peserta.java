/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuis;
import kuis.inter.animasi;
import kuis.inter.surat;
/**
 *
 * @author USER
 */
public class peserta implements surat,animasi{

    double ac,kon,krea,sinema;
    double ss,is,kreati,pkb;

    public peserta(double ac, double kon, double krea, double sinema, double ss, double is, double kreati, double pkb) {
        this.ac = ac;
        this.kon = kon;
        this.krea = krea;
        this.sinema = sinema;
        this.ss = ss;
        this.is = is;
        this.kreati = kreati;
        this.pkb = pkb;
    }

    peserta(double ac, double kon, double krea, double sinema) {
        this.ac = ac;
        this.kon = kon;
        this.krea = krea;
        this.sinema = sinema;
    }
    

    public double getAc() {
        return ac;
    }

    public void setAc(double ac) {
        this.ac = ac;
    }

    public double getKon() {
        return kon;
    }

    public void setKon(double kon) {
        this.kon = kon;
    }

    public double getKrea() {
        return krea;
    }

    public void setKrea(double krea) {
        this.krea = krea;
    }

    public double getSinema() {
        return sinema;
    }

    public void setSinema(double sinema) {
        this.sinema = sinema;
    }

    public double getSs() {
        return ss;
    }

    public void setSs(double ss) {
        this.ss = ss;
    }

    public double getIs() {
        return is;
    }

    public void setIs(double is) {
        this.is = is;
    }

    public double getKreati() {
        return kreati;
    }

    public void setKreati(double kreati) {
        this.kreati = kreati;
    }

    public double getPkb() {
        return pkb;
    }

    public void setPkb(double pkb) {
        this.pkb = pkb;
    }

       
    
    @Override
    public double struktur() {
        return ((10/100)*ss);
    }

    @Override
    public double isisuraat() {
        return ((40/100)*is);
        
    }

    @Override
    public double kreatifitas() {
        return ((30/100)*kreati);
    }

    @Override
    public double penerapan() {
        return ((20/100)*pkb);
    }

    @Override
    public double alurcerita() {
        return ((15/100)*ac);
    }

    @Override
    public double konten() {
        return ((35/100)*kon);
    }

    @Override
    public double kreativitas() {
       return ((35/100)*krea);
    }

    @Override
    public double sinematografi() {
       return ((15/100)*sinema);
    }
    
}
