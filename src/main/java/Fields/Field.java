package Fields;

import gui_fields.GUI_Field;
import spil.Player;
/* Arv er en fundamental objekt-orienteret designteknik, der bruges til at skabe og organisere genanvendelige klasser.
En abstrakt klasse repræsenterer et generelt koncept i et klassehierarki. En abstrakt klasse kan ikke instansieres.
Hvis alle fieldklasser har en landOnField metode der gør noget forskelligt,
så kan child klasserne override metoden fra parent klassen,
hvor de alle har den samme signatur som i parent klassen, men de har så hver især en anderledes body, hvor de gør noget forskelligt.
*/
public abstract class Field {

    String name;

    public Field(String name){
        this.name=name;
    }

    abstract public GUI_Field toGui();

    public String getName() {
        return name;
    }

    abstract public String action();


}
