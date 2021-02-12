public class Voetbalclub {
    private String Naam;
    private int aantalGewonnen;
    private int aantalGelijk;
    private int aantalVerloren;


    public void verwerkResultaat(char ch) {
        if (ch == 'w')
            aantalGewonnen = aantalGewonnen + 1;
        if (ch == 'g')
            aantalGelijk = aantalGelijk + 1;
        if (ch == 'v')
            aantalVerloren = aantalVerloren + 1;
    }
    public Voetbalclub(String naam){
        this.Naam = naam;
    }

    public int aantalGespeeld() {
        return aantalGewonnen + aantalGelijk + aantalVerloren;
    }
    public int aantalPunten(){
       int aantalGewonnen = (this.aantalGewonnen * 3);
        return aantalGewonnen + this.aantalGelijk;
    }
    public String toString(){
        return this.Naam + " " + this.aantalGespeeld() + " " + this.aantalGewonnen + " " + this.aantalGelijk + " " + this.aantalVerloren + " " + this.aantalPunten();

    }

}
