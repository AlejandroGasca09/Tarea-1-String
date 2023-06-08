package org.example.vista;

import javax.swing.*;
import java.awt.*;

public class VentanaGeneroMusical extends JFrame {

    private JLabel lblId;
    private JLabel lblGenero;
    private JLabel lblArtista;
    private JLabel lblAlbum;
    private JLabel lblPais;
    private JLabel lblUrl;
    private JLabel imaGenMus;
    private JTextField txtId;
    private JTextField txtGenero;
    private JTextField txtArtista;
    private JTextField txtAlbum;
    private JTextField txtPais;
    private JTextField txtUrl;
    private JButton btnAgregar;
    private JButton btnCargar;
    private JButton btnElminar;
    private JButton btnActualizar;
    private JTable tblGeneroMusical;
    private JScrollPane scroll;
    private GridLayout layout;
    private JPanel panel1; // Se mostraran los campos a llenar
    private JPanel panel2; // Se cargaran los datos a la base de datos
    private JPanel panel3; // Se mostrara la imagen
    private JPanel panel4; // Botones de eliminar y actualizar

    public JLabel getLblId() {
        return lblId;
    }

    public void setLblId(JLabel lblId) {
        this.lblId = lblId;
    }

    public JLabel getLblGenero() {
        return lblGenero;
    }

    public void setLblGenero(JLabel lblGenero) {
        this.lblGenero = lblGenero;
    }

    public JLabel getLblArtista() {
        return lblArtista;
    }

    public void setLblArtista(JLabel lblArtista) {
        this.lblArtista = lblArtista;
    }

    public JLabel getLblAlbum() {
        return lblAlbum;
    }

    public void setLblAlbum(JLabel lblAlbum) {
        this.lblAlbum = lblAlbum;
    }

    public JLabel getLblPais() {
        return lblPais;
    }

    public void setLblPais(JLabel lblPais) {
        this.lblPais = lblPais;
    }

    public JLabel getLblUrl() {
        return lblUrl;
    }

    public void setLblUrl(JLabel lblUrl) {
        this.lblUrl = lblUrl;
    }

    public JLabel getImaGenMus() {
        return imaGenMus;
    }

    public void setImaGenMus(JLabel imaGenMus) {
        this.imaGenMus = imaGenMus;
    }

    public JTextField getTxtId() {
        return txtId;
    }

    public void setTxtId(JTextField txtId) {
        this.txtId = txtId;
    }

    public JTextField getTxtGenero() {
        return txtGenero;
    }

    public void setTxtGenero(JTextField txtGenero) {
        this.txtGenero = txtGenero;
    }

    public JTextField getTxtArtista() {
        return txtArtista;
    }

    public void setTxtArtista(JTextField txtArtista) {
        this.txtArtista = txtArtista;
    }

    public JTextField getTxtAlbum() {
        return txtAlbum;
    }

    public void setTxtAlbum(JTextField txtAlbum) {
        this.txtAlbum = txtAlbum;
    }

    public JTextField getTxtPais() {
        return txtPais;
    }

    public void setTxtPais(JTextField txtPais) {
        this.txtPais = txtPais;
    }

    public JTextField getTxtUrl() {
        return txtUrl;
    }

    public void setTxtUrl(JTextField txtUrl) {
        this.txtUrl = txtUrl;
    }

    public JButton getBtnAgregar() {
        return btnAgregar;
    }

    public void setBtnAgregar(JButton btnAgregar) {
        this.btnAgregar = btnAgregar;
    }

    public JButton getBtnCargar() {
        return btnCargar;
    }

    public void setBtnCargar(JButton btnCargar) {
        this.btnCargar = btnCargar;
    }

    public JButton getBtnElminar() {
        return btnElminar;
    }

    public void setBtnElminar(JButton btnElminar) {
        this.btnElminar = btnElminar;
    }

    public JButton getBtnActualizar() {
        return btnActualizar;
    }

    public void setBtnActualizar(JButton btnActualizar) {
        this.btnActualizar = btnActualizar;
    }

    public JTable getTblGeneroMusical() {
        return tblGeneroMusical;
    }

    public void setTblGeneroMusical(JTable tblGeneroMusical) {
        this.tblGeneroMusical = tblGeneroMusical;
    }

    public JScrollPane getScroll() {
        return scroll;
    }

    public void setScroll(JScrollPane scroll) {
        this.scroll = scroll;
    }

    @Override
    public GridLayout getLayout() {
        return layout;
    }

    public void setLayout(GridLayout layout) {
        this.layout = layout;
    }

    public JPanel getPanel1() {
        return panel1;
    }

    public void setPanel1(JPanel panel1) {
        this.panel1 = panel1;
    }

    public JPanel getPanel2() {
        return panel2;
    }

    public void setPanel2(JPanel panel2) {
        this.panel2 = panel2;
    }

    public JPanel getPanel3() {
        return panel3;
    }

    public void setPanel3(JPanel panel3) {
        this.panel3 = panel3;
    }

    public JPanel getPanel4() {
        return panel4;
    }

    public void setPanel4(JPanel panel4) {
        this.panel4 = panel4;
    }
    //Limpiar los campos para vuelvan a ser utilizados
    public void limpiar() {
        txtGenero.setText("");
        txtArtista.setText("");
        txtAlbum.setText("");
        txtPais.setText("");
        txtUrl.setText("");
    }

    public VentanaGeneroMusical(String title) throws HeadlessException {
        super(title);
        this.setSize(800,800);
        layout = new GridLayout(2,2);
        this.getContentPane().setLayout(layout);

        //Panel1
        panel1 = new JPanel(new FlowLayout());
        panel1.setBackground(new Color(200, 233, 239));
        lblId = new JLabel("Id: ");
        lblGenero = new JLabel("Genero: ");
        lblArtista = new JLabel("Artista: ");
        lblAlbum = new JLabel("Album: ");
        lblPais = new JLabel("Pais: ");
        lblUrl = new JLabel("URL: ");
        txtId = new JTextField(3);
        txtId.setText("0");
        txtId.setEnabled(false);
        txtGenero = new JTextField(10);
        txtArtista = new JTextField(10);
        txtAlbum = new JTextField(10);
        txtPais = new JTextField(10);
        txtUrl = new JTextField(15);
        btnAgregar = new JButton("Agregar");
        panel1.add(lblId);
        panel1.add(txtId);
        panel1.add(lblGenero);
        panel1.add(txtGenero);
        panel1.add(lblArtista);
        panel1.add(txtArtista);
        panel1.add(lblAlbum);
        panel1.add(txtAlbum);
        panel1.add(lblPais);
        panel1.add(txtPais);
        panel1.add(lblUrl);
        panel1.add(txtUrl);
        panel1.add(btnAgregar);

        //Panel2
        panel2 = new JPanel(new FlowLayout());
        panel2.setBackground(new Color(154, 234, 224));
        btnCargar = new JButton("Cargar");
        panel2.add(btnCargar);
        tblGeneroMusical = new JTable();
        scroll = new JScrollPane(tblGeneroMusical);
        panel2.add(scroll);

        //Panel3
        panel3 = new JPanel(new FlowLayout());
        panel3.setBackground(new Color(111, 208, 218));
        imaGenMus = new JLabel("   ");
        panel3.add(imaGenMus);

        //Panel4
        panel4 = new JPanel(new FlowLayout());
        panel4.setBackground(new Color(116, 175, 227));
        btnElminar = new JButton("Eliminar");
        panel4.add(btnElminar);
        btnActualizar = new JButton("Actualizar");
        panel4.add(btnActualizar);


        this.getContentPane().add(panel1, 0);
        this.getContentPane().add(panel2, 1);
        this.getContentPane().add(panel3, 2);
        this.getContentPane().add(panel4, 3);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);

    }
}
