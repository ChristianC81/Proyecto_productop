/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package vista.interna;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author chris
 */
public class ViewPersona extends javax.swing.JInternalFrame {

    /**
     * Creates new form ViewPersona
     */
    public ViewPersona() {
        initComponents();
    }

    public JButton getBtn() {
        return btnReporteGeneral;
    }

    public void setBtn(JButton btn) {
        this.btnReporteGeneral = btn;
    }

    public JButton getBtnActualizar() {
        return btnActualizar;
    }

    public void setBtnActualizar(JButton btnActualizar) {
        this.btnActualizar = btnActualizar;
    }

    public JButton getBtnBorrar() {
        return btnBorrar;
    }

    public void setBtnBorrar(JButton btnBorrar) {
        this.btnBorrar = btnBorrar;
    }

    public JButton getBtnBuscar() {
        return btnBuscar;
    }

    public void setBtnBuscar(JButton btnBuscar) {
        this.btnBuscar = btnBuscar;
    }

    public JButton getBtnCancelar() {
        return btnCancelar;
    }

    public void setBtnCancelar(JButton btnCancelar) {
        this.btnCancelar = btnCancelar;
    }

    public JButton getBtnCrear() {
        return btnCrear;
    }

    public void setBtnCrear(JButton btnCrear) {
        this.btnCrear = btnCrear;
    }

    public JButton getBtnReporteGeneral() {
        return btnReporteGeneral;
    }

    public void setBtnReporteGeneral(JButton btnReporteGeneral) {
        this.btnReporteGeneral = btnReporteGeneral;
    }

    public JButton getBtnReporteInd() {
        return btnReporteInd;
    }

    public void setBtnReporteInd(JButton btnReporteInd) {
        this.btnReporteInd = btnReporteInd;
    }

    public JButton getBtnLimpiar() {
        return btnLimpiar;
    }

    public void setBtnLimpiar(JButton btnLimpiar) {
        this.btnLimpiar = btnLimpiar;
    }

    public JButton getBtnLimpiarBus() {
        return btnLimpiarBus;
    }

    public void setBtnLimpiarBus(JButton btnLimpiarBus) {
        this.btnLimpiarBus = btnLimpiarBus;
    }

    public JCheckBox getChkbxMostrarTodos() {
        return chkbxMostrarTodos;
    }

    public void setChkbxMostrarTodos(JCheckBox chkbxMostrarTodos) {
        this.chkbxMostrarTodos = chkbxMostrarTodos;
    }

    public JPanel getPnAdministrarPersona() {
        return pnAdministrarPersona;
    }

    public void setPnAdministrarPersona(JPanel pnAdministrarPersona) {
        this.pnAdministrarPersona = pnAdministrarPersona;
    }

    public JPanel getPnListaPersonas() {
        return pnListaPersonas;
    }

    public void setPnListaPersonas(JPanel pnListaPersonas) {
        this.pnListaPersonas = pnListaPersonas;
    }

    public JPanel getPnOpcionesBusqueda() {
        return pnOpcionesBusqueda;
    }

    public void setPnOpcionesBusqueda(JPanel pnOpcionesBusqueda) {
        this.pnOpcionesBusqueda = pnOpcionesBusqueda;
    }

    public JPanel getPnlPersona() {
        return pnlPersona;
    }

    public void setPnlPersona(JPanel pnlPersona) {
        this.pnlPersona = pnlPersona;
    }

    public JSeparator getSpt10() {
        return spt10;
    }

    public void setSpt10(JSeparator spt10) {
        this.spt10 = spt10;
    }

    public JTable getTblPersona() {
        return tblPersona;
    }

    public void setTblPersona(JTable tblPersona) {
        this.tblPersona = tblPersona;
    }

    public JTextField getTxtApellidos() {
        return txtApellidos;
    }

    public void setTxtApellidos(JTextField txtApellidos) {
        this.txtApellidos = txtApellidos;
    }

    public JTextField getTxtCedula() {
        return txtCedula;
    }

    public void setTxtCedula(JTextField txtCedula) {
        this.txtCedula = txtCedula;
    }

    public JTextField getTxtCelular() {
        return txtCelular;
    }

    public void setTxtCelular(JTextField txtCelular) {
        this.txtCelular = txtCelular;
    }

    public JTextField getTxtCorreo() {
        return txtCorreo;
    }

    public void setTxtCorreo(JTextField txtCorreo) {
        this.txtCorreo = txtCorreo;
    }

    public JTextField getTxtCriterio() {
        return txtCriterio;
    }

    public void setTxtCriterio(JTextField txtCriterio) {
        this.txtCriterio = txtCriterio;
    }

    public JTextField getTxtDireccion() {
        return txtDireccion;
    }

    public void setTxtDireccion(JTextField txtDireccion) {
        this.txtDireccion = txtDireccion;
    }

    public JTextField getTxtNombres() {
        return txtNombres;
    }

    public void setTxtNombres(JTextField txtNombres) {
        this.txtNombres = txtNombres;
    }

    public JLabel getLblApellidosE() {
        return lblApellidosE;
    }

    public void setLblApellidosE(JLabel lblApellidosE) {
        this.lblApellidosE = lblApellidosE;
    }

    public JLabel getLblCedulaE() {
        return lblCedulaE;
    }

    public void setLblCedulaE(JLabel lblCedulaE) {
        this.lblCedulaE = lblCedulaE;
    }

    public JLabel getLblCelularE() {
        return lblCelularE;
    }

    public void setLblCelularE(JLabel lblCelularE) {
        this.lblCelularE = lblCelularE;
    }

    public JLabel getLblCorreoE() {
        return lblCorreoE;
    }

    public void setLblCorreoE(JLabel lblCorreoE) {
        this.lblCorreoE = lblCorreoE;
    }

    public JLabel getLblDireccionE() {
        return lblDireccionE;
    }

    public void setLblDireccionE(JLabel lblDireccionE) {
        this.lblDireccionE = lblDireccionE;
    }

    public JLabel getLblNombresE() {
        return lblNombresE;
    }

    public void setLblNombresE(JLabel lblNombresE) {
        this.lblNombresE = lblNombresE;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlPersona = new javax.swing.JPanel();
        pnAdministrarPersona = new javax.swing.JPanel();
        txtNombres = new javax.swing.JTextField();
        spt10 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtApellidos = new javax.swing.JTextField();
        spt16 = new javax.swing.JSeparator();
        txtCedula = new javax.swing.JTextField();
        spt17 = new javax.swing.JSeparator();
        txtCorreo = new javax.swing.JTextField();
        spt18 = new javax.swing.JSeparator();
        txtCelular = new javax.swing.JTextField();
        spt19 = new javax.swing.JSeparator();
        txtDireccion = new javax.swing.JTextField();
        spt20 = new javax.swing.JSeparator();
        btnCrear = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        lblDireccionE = new javax.swing.JLabel();
        lblNombresE = new javax.swing.JLabel();
        lblApellidosE = new javax.swing.JLabel();
        lblCedulaE = new javax.swing.JLabel();
        lblCorreoE = new javax.swing.JLabel();
        lblCelularE = new javax.swing.JLabel();
        pnOpcionesBusqueda = new javax.swing.JPanel();
        txtCriterio = new javax.swing.JTextField();
        spt11 = new javax.swing.JSeparator();
        jLabel17 = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        btnLimpiarBus = new javax.swing.JButton();
        chkbxMostrarTodos = new javax.swing.JCheckBox();
        pnListaPersonas = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPersona = new javax.swing.JTable();
        btnReporteInd = new javax.swing.JButton();
        btnReporteGeneral = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        setIconifiable(true);

        pnlPersona.setBackground(new java.awt.Color(255, 255, 255));

        pnAdministrarPersona.setBackground(new java.awt.Color(255, 255, 255));
        pnAdministrarPersona.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Administrar Persona", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(0, 0, 0))); // NOI18N
        pnAdministrarPersona.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtNombres.setBackground(new java.awt.Color(255, 255, 255));
        txtNombres.setFont(new java.awt.Font("Segoe UI Semibold", 0, 13)); // NOI18N
        txtNombres.setForeground(new java.awt.Color(0, 0, 0));
        txtNombres.setBorder(null);
        txtNombres.setOpaque(true);
        txtNombres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombresActionPerformed(evt);
            }
        });
        pnAdministrarPersona.add(txtNombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 278, -1));
        pnAdministrarPersona.add(spt10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 278, 10));

        jLabel7.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Nombres:");
        pnAdministrarPersona.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 26, -1, -1));

        jLabel9.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Cedula:");
        pnAdministrarPersona.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 158, -1, -1));

        jLabel10.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Correo:");
        pnAdministrarPersona.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));

        jLabel11.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Celular:");
        pnAdministrarPersona.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, -1, -1));

        jLabel12.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("Dirección:");
        pnAdministrarPersona.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, -1, -1));

        jLabel8.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Apellidos:");
        pnAdministrarPersona.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 94, -1, -1));

        txtApellidos.setBackground(new java.awt.Color(255, 255, 255));
        txtApellidos.setFont(new java.awt.Font("Segoe UI Semibold", 0, 13)); // NOI18N
        txtApellidos.setForeground(new java.awt.Color(0, 0, 0));
        txtApellidos.setBorder(null);
        txtApellidos.setOpaque(true);
        txtApellidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidosActionPerformed(evt);
            }
        });
        pnAdministrarPersona.add(txtApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 278, -1));
        pnAdministrarPersona.add(spt16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 278, 10));

        txtCedula.setBackground(new java.awt.Color(255, 255, 255));
        txtCedula.setFont(new java.awt.Font("Segoe UI Semibold", 0, 13)); // NOI18N
        txtCedula.setForeground(new java.awt.Color(0, 0, 0));
        txtCedula.setBorder(null);
        txtCedula.setOpaque(true);
        txtCedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCedulaActionPerformed(evt);
            }
        });
        pnAdministrarPersona.add(txtCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 278, -1));
        pnAdministrarPersona.add(spt17, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 278, 10));

        txtCorreo.setBackground(new java.awt.Color(255, 255, 255));
        txtCorreo.setFont(new java.awt.Font("Segoe UI Semibold", 0, 13)); // NOI18N
        txtCorreo.setForeground(new java.awt.Color(0, 0, 0));
        txtCorreo.setBorder(null);
        txtCorreo.setOpaque(true);
        txtCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCorreoActionPerformed(evt);
            }
        });
        pnAdministrarPersona.add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 278, -1));
        pnAdministrarPersona.add(spt18, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 278, 10));

        txtCelular.setBackground(new java.awt.Color(255, 255, 255));
        txtCelular.setFont(new java.awt.Font("Segoe UI Semibold", 0, 13)); // NOI18N
        txtCelular.setForeground(new java.awt.Color(0, 0, 0));
        txtCelular.setBorder(null);
        txtCelular.setOpaque(true);
        txtCelular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCelularActionPerformed(evt);
            }
        });
        pnAdministrarPersona.add(txtCelular, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 278, -1));
        pnAdministrarPersona.add(spt19, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 278, 10));

        txtDireccion.setBackground(new java.awt.Color(255, 255, 255));
        txtDireccion.setFont(new java.awt.Font("Segoe UI Semibold", 0, 13)); // NOI18N
        txtDireccion.setForeground(new java.awt.Color(0, 0, 0));
        txtDireccion.setBorder(null);
        txtDireccion.setOpaque(true);
        txtDireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDireccionActionPerformed(evt);
            }
        });
        pnAdministrarPersona.add(txtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 278, -1));
        pnAdministrarPersona.add(spt20, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 278, 10));

        btnCrear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/image/icon-save.png"))); // NOI18N
        btnCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearActionPerformed(evt);
            }
        });
        pnAdministrarPersona.add(btnCrear, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 430, -1, -1));

        btnActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/image/icon-actualizar.png"))); // NOI18N
        pnAdministrarPersona.add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 430, -1, -1));

        btnBorrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/image/icon-delete.png"))); // NOI18N
        pnAdministrarPersona.add(btnBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 430, -1, -1));

        btnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/image/icon-clear.png"))); // NOI18N
        pnAdministrarPersona.add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 430, -1, -1));

        lblDireccionE.setForeground(new java.awt.Color(255, 0, 0));
        pnAdministrarPersona.add(lblDireccionE, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 220, 20));

        lblNombresE.setForeground(new java.awt.Color(255, 0, 0));
        pnAdministrarPersona.add(lblNombresE, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 220, 20));

        lblApellidosE.setForeground(new java.awt.Color(255, 0, 0));
        pnAdministrarPersona.add(lblApellidosE, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 220, 20));

        lblCedulaE.setForeground(new java.awt.Color(255, 0, 0));
        pnAdministrarPersona.add(lblCedulaE, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 220, 20));

        lblCorreoE.setForeground(new java.awt.Color(255, 0, 0));
        pnAdministrarPersona.add(lblCorreoE, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 220, 20));

        lblCelularE.setForeground(new java.awt.Color(255, 0, 0));
        pnAdministrarPersona.add(lblCelularE, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 220, 20));

        pnOpcionesBusqueda.setBackground(new java.awt.Color(255, 255, 255));
        pnOpcionesBusqueda.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Opciones de Busqueda", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(0, 0, 0))); // NOI18N

        txtCriterio.setBackground(new java.awt.Color(255, 255, 255));
        txtCriterio.setFont(new java.awt.Font("Segoe UI Semibold", 0, 13)); // NOI18N
        txtCriterio.setForeground(new java.awt.Color(0, 0, 0));
        txtCriterio.setBorder(null);
        txtCriterio.setOpaque(true);
        txtCriterio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCriterioActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 0, 0));
        jLabel17.setText("Criterio:");

        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/image/sear.png"))); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnLimpiarBus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/image/icon-clear.png"))); // NOI18N

        chkbxMostrarTodos.setForeground(new java.awt.Color(60, 63, 65));
        chkbxMostrarTodos.setText("Mostrar Todos");

        javax.swing.GroupLayout pnOpcionesBusquedaLayout = new javax.swing.GroupLayout(pnOpcionesBusqueda);
        pnOpcionesBusqueda.setLayout(pnOpcionesBusquedaLayout);
        pnOpcionesBusquedaLayout.setHorizontalGroup(
            pnOpcionesBusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnOpcionesBusquedaLayout.createSequentialGroup()
                .addGroup(pnOpcionesBusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnOpcionesBusquedaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel17))
                    .addGroup(pnOpcionesBusquedaLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(pnOpcionesBusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(spt11, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCriterio, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                        .addComponent(btnBuscar)))
                .addGap(36, 36, 36)
                .addComponent(btnLimpiarBus, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(chkbxMostrarTodos)
                .addGap(18, 18, 18))
        );
        pnOpcionesBusquedaLayout.setVerticalGroup(
            pnOpcionesBusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnOpcionesBusquedaLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(pnOpcionesBusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnOpcionesBusquedaLayout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnOpcionesBusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCriterio, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBuscar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(spt11, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnOpcionesBusquedaLayout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(btnLimpiarBus, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 17, Short.MAX_VALUE))
            .addGroup(pnOpcionesBusquedaLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(chkbxMostrarTodos)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnListaPersonas.setBackground(new java.awt.Color(255, 255, 255));
        pnListaPersonas.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Listas de Personas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(0, 0, 0))); // NOI18N

        tblPersona.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Nombres", "Apellidos", "Cedula", "Correo", "Celular", "Dirección"
            }
        ));
        jScrollPane1.setViewportView(tblPersona);

        btnReporteInd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/image/icon-printer.png"))); // NOI18N

        btnReporteGeneral.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/image/printed.png"))); // NOI18N

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/image/cross.gif"))); // NOI18N
        btnCancelar.setText("Cancelar");

        javax.swing.GroupLayout pnListaPersonasLayout = new javax.swing.GroupLayout(pnListaPersonas);
        pnListaPersonas.setLayout(pnListaPersonasLayout);
        pnListaPersonasLayout.setHorizontalGroup(
            pnListaPersonasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnListaPersonasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(pnListaPersonasLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnReporteInd)
                .addGap(34, 34, 34)
                .addComponent(btnReporteGeneral)
                .addGap(39, 39, 39)
                .addComponent(btnCancelar)
                .addGap(36, 36, 36))
        );
        pnListaPersonasLayout.setVerticalGroup(
            pnListaPersonasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnListaPersonasLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 253, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(pnListaPersonasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnReporteInd, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnReporteGeneral, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(17, 17, 17))
        );

        javax.swing.GroupLayout pnlPersonaLayout = new javax.swing.GroupLayout(pnlPersona);
        pnlPersona.setLayout(pnlPersonaLayout);
        pnlPersonaLayout.setHorizontalGroup(
            pnlPersonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPersonaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnAdministrarPersona, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlPersonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnListaPersonas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnOpcionesBusqueda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlPersonaLayout.setVerticalGroup(
            pnlPersonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPersonaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlPersonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(pnAdministrarPersona, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlPersonaLayout.createSequentialGroup()
                        .addComponent(pnOpcionesBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(pnListaPersonas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlPersona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(pnlPersona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void txtCriterioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCriterioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCriterioActionPerformed

    private void btnCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCrearActionPerformed

    private void txtDireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDireccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDireccionActionPerformed

    private void txtCelularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCelularActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCelularActionPerformed

    private void txtCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCorreoActionPerformed

    private void txtCedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCedulaActionPerformed

    private void txtApellidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellidosActionPerformed

    private void txtNombresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombresActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnCrear;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnLimpiarBus;
    private javax.swing.JButton btnReporteGeneral;
    private javax.swing.JButton btnReporteInd;
    private javax.swing.JCheckBox chkbxMostrarTodos;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblApellidosE;
    private javax.swing.JLabel lblCedulaE;
    private javax.swing.JLabel lblCelularE;
    private javax.swing.JLabel lblCorreoE;
    private javax.swing.JLabel lblDireccionE;
    private javax.swing.JLabel lblNombresE;
    private javax.swing.JPanel pnAdministrarPersona;
    private javax.swing.JPanel pnListaPersonas;
    private javax.swing.JPanel pnOpcionesBusqueda;
    private javax.swing.JPanel pnlPersona;
    private javax.swing.JSeparator spt10;
    private javax.swing.JSeparator spt11;
    private javax.swing.JSeparator spt16;
    private javax.swing.JSeparator spt17;
    private javax.swing.JSeparator spt18;
    private javax.swing.JSeparator spt19;
    private javax.swing.JSeparator spt20;
    private javax.swing.JTable tblPersona;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtCelular;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtCriterio;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtNombres;
    // End of variables declaration//GEN-END:variables
}
