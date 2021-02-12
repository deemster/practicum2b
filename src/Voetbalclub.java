public class Voetbalclub {
    private String Naam;
    private int aantalGewonnen;
    private int aantalGelijk;
    private int aantalVerloren;


    public void verwerkResultaat(char ch) {
        if (ch == 'w')
            aantalGewonnen = aantalGewonnen + 1;
        else if (ch == 'g')
            aantalGelijk = aantalGelijk + 1;
        else if (ch == 'v')
            aantalVerloren = aantalVerloren + 1;
        else {
            System.out.println(ch + " kan niet als optie worden ingevoerd, kies een andere optie.");
        }
    }
    public Voetbalclub(String naam){
        if (naam.equals("")) {
            naam = "FC";
        }
        this.Naam = naam;
    }

    public String getNaam() {
        return this.Naam;
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
