package org.example;

import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;
import java.util.ArrayList;

public class ModeloTablaJuego implements TableModel {
    ArrayList<Videojuego> datos;
    public static final int COLS = 6;

    public ModeloTablaJuego(ArrayList<Videojuego> datos) {

        this.datos = datos;
    }

    @Override
    public int getRowCount() {
        return datos.size();
    }

    @Override
    public int getColumnCount() {
        return COLS;
    }

    @Override
    public String getColumnName(int i) {
        String columnName = "";
        switch (i) {
            case 0:
                columnName = "Id. ";
                break;
            case 1:
                columnName = "Nombre";
                break;
            case 2:
                columnName = "Genero";
                break;
            case 3:
                columnName = "Peso en Gb";
                break;
            case 4:
                columnName = "Plataforma";
                break;
            case 5:
                columnName = "Desarrolador";
                break;

        }
        return columnName;
    }

    @Override
    public Class<?> getColumnClass(int i) {
        switch (i){
            case 0:
                return Integer.class;
            case 1:
                return String.class;
            case 2:
                return String.class;
            case 3:
                return Double.class;
            case 4:
                return String.class;
            case 5:
                return String.class;
        }
        return null;
    }

    @Override
    public boolean isCellEditable(int i, int i1) {
        return false;
    }

    @Override
    public Object getValueAt(int i, int i1) {
        Videojuego tmp= datos.get(i);
        switch (i1){
            case 0:
                return tmp.getId();
            case 1:
                return tmp.getNombre();
            case 2:
                return tmp.getGenero();
            case 3:
                return tmp.getPesoenGb();
            case 4:
                return tmp.getPlataforma();
            case 5:
                return tmp.getDesarrollador();
        }
        return null;
    }

    @Override
    public void setValueAt(Object o, int i, int i1) {

    }

    @Override
    public void addTableModelListener(TableModelListener tableModelListener) {

    }

    @Override
    public void removeTableModelListener(TableModelListener tableModelListener) {

    }
    public void agregarJuego(Videojuego juego){
        this.datos.add(juego);
    }
}
