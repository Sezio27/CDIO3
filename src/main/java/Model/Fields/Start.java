package Model.Fields;

import gui_fields.GUI_Field;
import gui_fields.GUI_Start;

import java.awt.*;

public class Start extends Field {
    int receiveMoney;

    public Start(int recieveMoney){
        super ("START");
        this.receiveMoney=recieveMoney;
    }

    @Override
    public GUI_Field toGui() {
        return new GUI_Start(super.getName(),"Modtag 2M", "Modtag 2M", Color.red, Color.BLACK);
    }

    @Override
    public String action() {
        return "";
    }
}