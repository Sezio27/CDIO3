package spil;

import Fields.*;
import gui_fields.GUI_Field;
import gui_main.GUI;

import java.awt.*;
import java.util.ArrayList;

public class GameBoard {
    private Field[] fields;
    private GUI_Field[] fieldsGUI = new GUI_Field[24];

    public GameBoard() {
        initFields();
    }

    public void initFields() {
        fields = new Field[]{
                new Start(2),
                new Street("BURGERBAREN", new Color(153,102,0), 1),
                new Street("PIZZERIAET",new Color(153,102,0), 1),
                new Chance(),
                new Street("SLIKBUTIKKEN",Color.lightGray, 1),
                new Street("ISKIOSKEN",Color.lightGray, 1),
                new Jail(),
                new Street("MUSEET",Color.pink, 2),
                new Street("BIBLIOTEKET",Color.pink, 2),
                new Chance(),
                new Street("SKATERPARKEN",Color.orange, 2),
                new Street("SWIMMINGPOOLEN",Color.orange, 2),
                new Parking(),
                new Street("SPILLEHALLEN",Color.red, 3),
                new Street("BIOGRAFEN",Color.red, 3),
                new Chance(),
                new Street("LEGETØJSBUTIKKEN",Color.yellow, 3),
                new Street("DYREHANDLEN",Color.yellow, 3),
                new GoToJail(),
                new Street("BOWLINGHALLEN",Color.green, 4),
                new Street("ZOO",Color.green, 4),
                new Chance(),
                new Street("VANDLANDET",Color.blue, 5),
                new Street("STRANDPROMENADEN",Color.blue, 5)
        };

    }

    public Field getField(int pos) {
        return fields[pos];
    }

    public Field[] getFields() {
        return fields;
    }

    public GUI_Field[] getFieldsGUI() {
        return fieldsGUI;
    }

}