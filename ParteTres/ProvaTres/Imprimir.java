package ParteTres.ProvaTres;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

import javax.swing.plaf.basic.BasicComboBoxUI.FocusHandler;
import javax.swing.text.FlowView.FlowStrategy;

public class Imprimir<T> {
    
    // Imprimir

    private ArrayList<T> elementos = new ArrayList<>();
    
    public static void imprimirArrayList(ArrayList<?> elementos){
        for (Object object : elementos) {
            System.out.println(object);
        }
    }

}

