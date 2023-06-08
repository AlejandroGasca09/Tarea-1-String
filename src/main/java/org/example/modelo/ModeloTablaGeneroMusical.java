package org.example.modelo;

import org.example.persistencia.ConexionSingleton;
import org.example.persistencia.GeneroMusicalDAO;

import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

public class ModeloTablaGeneroMusical implements TableModel {
    public static final int COLUMNS = 6;
    private ArrayList<GeneroMusical>datos;
    private GeneroMusicalDAO gmDAO;

    public ModeloTablaGeneroMusical() {
        gmDAO = new GeneroMusicalDAO();
        datos = new ArrayList<>();
    }

    public ModeloTablaGeneroMusical(ArrayList<GeneroMusical> datos) {
        this.datos = datos;
        gmDAO = new GeneroMusicalDAO();
    }

    @Override
    public int getRowCount() {
        return datos.size();
    }

    @Override
    public int getColumnCount() {
        return COLUMNS;
    }

    @Override
    public String getColumnName(int rowIndex) {
        switch (rowIndex){
            case 0:
                return "Id";
            case 1:
                return "Genero";
            case 2:
                return "Artista";
            case 3:
                return "Album";
            case 4:
                return "Pais";
            case 5:
                return "URL";

        }
        return null;
    }

    @Override
    public Class<?> getColumnClass(int rowIndex) {
        switch (rowIndex){
            case 0:
                return Integer.class;
            case 1:
                return String.class;
            case 2:
                return String.class;
            case 3:
                return String.class;
            case 4:
                return String.class;
            case 5:
                return String.class;
        }
        return null;
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return true;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        GeneroMusical tmp = datos.get(rowIndex);
        switch (columnIndex){
            case 0:
                return tmp.getId();
            case 1:
                return tmp.getGenero();
            case 2:
                return tmp.getArtista();
            case 3:
                return tmp.getAlbum();
            case 4:
                return tmp.getPais();
            case 5:
                return tmp.getPais();
        }
        return null;
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        switch (columnIndex){
            case 0:
                //datos.get(rowIndex).setId();
                break;
            case 1:
                datos.get(rowIndex).setGenero((String)aValue);
            case 2:
                datos.get(rowIndex).setArtista((String)aValue);
            case 3:
                datos.get(rowIndex).setAlbum((String)aValue);
            case 4:
                datos.get(rowIndex).setPais((String)aValue);
            case 5:
                datos.get(rowIndex).setUrl((String)aValue);
                break;
            default:
                System.out.println("No se modifica nada");
        }

    }

    @Override
    public void addTableModelListener(TableModelListener l) {

    }

    @Override
    public void removeTableModelListener(TableModelListener l) {

    }
    public void cargarDatos(){
        try{
            ArrayList<GeneroMusical> tirar = gmDAO.obtenerTodo();
            System.out.println(tirar);
            datos = gmDAO.obtenerTodo();
        }catch (SQLException sqle){
            System.out.println(sqle.getMessage());
        }
    }
    public  boolean agregarGenero(GeneroMusical generoMusical){
        boolean resultado = false;
        try{
            if (gmDAO.insertar(generoMusical)){
                datos.add(generoMusical);
                resultado= true;
            }else{
                resultado = false;
            }
        }catch (SQLException sqle){
            System.out.println(sqle.getMessage());
        }
        return resultado;
    }
    public GeneroMusical getGeneroAtIndex(int idx){
        return  datos.get(idx);

    }
    public boolean actualizargenero(GeneroMusical generoMusical) {
        try {
            return gmDAO.update(generoMusical);
        } catch (SQLException sqle) {
            System.out.println(sqle.getMessage());
            return false;
        }
    }

    public boolean eliminargenero(String id) {
        try {
            String sqlDelete = "DELETE FROM generomusical WHERE id = ? ;";
            int rowCount = 0;
            PreparedStatement pstm = ConexionSingleton.getInstance("GeneroMusicalDB.db").getConnection().prepareStatement(sqlDelete);
            pstm.setInt(1, Integer.parseInt(id));
            rowCount = pstm.executeUpdate();

            return rowCount > 0;
        } catch (SQLException sqle) {
            System.out.println(sqle.getMessage());
            return false;
        }
    }
}
