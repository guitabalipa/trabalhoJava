/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DesignTapetes;

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Guilherme
 */
public class ModeloTabelaPedido extends AbstractTableModel{

    private String[] colunas = new String[]{"Forma" , "Material", "Tamanho(m2)", "Preço"};

    private List<Tapete> lista = new ArrayList();

    
    public ModeloTabelaPedido(List<Tapete> lista){
        this.lista = lista;
    }

    public ModeloTabelaPedido(){
    }
    
    @Override
    public int getRowCount() {
        return this.lista.size();
    }

    @Override
    public int getColumnCount() {
      return this.colunas.length;
    }
    
    @Override
    public String getColumnName(int index) {
        return this.colunas[index];
    }

    @Override
    public boolean isCellEditable(int row, int column) {
        return false;
        //if(column==0)
            //return false;
        //return true;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Tapete tapete = lista.get(rowIndex);
        switch (columnIndex) {
            case 0: return tapete.getForma().getNome();
            case 1: return tapete.getMaterial().getModelo();
            case 2: return tapete.getPreco();
            default : return null;
        }
    }
    
    @Override
    public void setValueAt(Object value, int row, int col) {
        Tapete tapete = lista.get(row);
        switch (col) {
            case 0:
                tapete.setForma((Forma) value);
                break;
            case 1:
                tapete.setMaterial((Material) value);
                break;
            case 2:
                tapete.setPreco((Double) value);
                break;
            default:
        }
        this.fireTableCellUpdated(row, col);
    }

    public boolean removeTapete(Tapete tapete) {
        int linha = this.lista.indexOf(tapete);
        boolean result = this.lista.remove(tapete);
        this.fireTableRowsDeleted(linha,linha);//update JTable
        return result;
    }

    public void adicionaTapete(Tapete tapete) {
        this.lista.add(tapete);
        //this.fireTableDataChanged();
        this.fireTableRowsInserted(lista.size()-1,lista.size()-1);//update JTable
    }

    public void setListaTapete(List<Tapete> tapete) {
        this.lista = tapete;
        this.fireTableDataChanged();
        //this.fireTableRowsInserted(0,contatos.size()-1);//update JTable
    }

    public void limpaTabela() {
        int indice = lista.size()-1;
        if(indice<0)
            indice=0;
        this.lista = new ArrayList();
        this.fireTableRowsDeleted(0,indice);//update JTable
    }

    public Tapete getTapete(int linha){
        return lista.get(linha);
    }
    
    public List<Tapete> getLista(int[] indices){
        //List<Cliente> lista = new ArrayList();
        for(int i=0; i<indices.length;i++){
            lista.add(this.lista.get(indices[i]));
        }
        return lista;
    }
}
