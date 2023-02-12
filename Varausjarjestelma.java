import java.util.ArrayList;
public class Varausjarjestelma {
    private ArrayList<Asiakas> asiakkaat;
    private ArrayList<Esiintyjat> esiintyjat;
    private Juhla juhla;
    private ArrayList<Varaus> varaukset;

    public ArrayList<Asiakas> getAsiakas() {
        return asiakkaat;
    }

    public ArrayList<Esiintyjat> getEsiintyjat() {
        return esiintyjat;
    }

    public Juhla getJuhla() {
        return juhla;
    }

    public ArrayList<Varaus> getVaraus() {
        return varaukset;
    }

    public Varausjarjestelma(ArrayList<Asiakas> asiakkaat, ArrayList<Esiintyjat> esiintyjat, Juhla juhla, ArrayList<Varaus> varaukset) {
        this.asiakkaat = asiakkaat;
        this.esiintyjat = esiintyjat;
        this.juhla = juhla;
        this.varaukset = varaukset;
    }
}
