/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package vista.interna;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author chris
 */
public class ViewUsuario extends javax.swing.JInternalFrame {

    /**
     * Creates new form ViewPersona
     */
    public ViewUsuario() {
        initComponents();
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

    public JComboBox<String> getCbxIdPersona() {
        return cbxIdPersona;
    }

    public void setCbxIdPersona(JComboBox<String> cbxIdPersona) {
        this.cbxIdPersona = cbxIdPersona;
    }

    public JCheckBox getChkbxMostrarTodos() {
        return chkbxMostrarTodos;
    }

    public void setChkbxMostrarTodos(JCheckBox chkbxMostrarTodos) {
        this.chkbxMostrarTodos = chkbxMostrarTodos;
    }

    public JScrollPane getjScrollPane1() {
        return jScrollPane1;
    }

    public void setjScrollPane1(JScrollPane jScrollPane1) {
        this.jScrollPane1 = jScrollPane1;
    }

    public JPanel getPnAdministrarUsuario() {
        return pnAdministrarUsuario;
    }

    public void setPnAdministrarUsuario(JPanel pnAdministrarUsuario) {
        this.pnAdministrarUsuario = pnAdministrarUsuario;
    }

    public JPanel getPnListaUsuarios() {
        return pnListaUsuarios;
    }

    public void setPnListaUsuarios(JPanel pnListaUsuarios) {
        this.pnListaUsuarios = pnListaUsuarios;
    }

    public JPanel getPnOpcionesBusqueda() {
        return pnOpcionesBusqueda;
    }

    public void setPnOpcionesBusqueda(JPanel pnOpcionesBusqueda) {
        this.pnOpcionesBusqueda = pnOpcionesBusqueda;
    }

    public JPanel getPnlUsuario() {
        return pnlUsuario;
    }

    public void setPnlUsuario(JPanel pnlUsuario) {
        this.pnlUsuario = pnlUsuario;
    }

    public JTable getTblUsuario() {
        return tblUsuario;
    }

    public void setTblUsuario(JTable tblUsuario) {
        this.tblUsuario = tblUsuario;
    }

    public JPasswordField getTxtContrasenia() {
        return txtContrasenia;
    }

    public void setTxtContrasenia(JPasswordField txtContrasenia) {
        this.txtContrasenia = txtContrasenia;
    }

    public JTextField getTxtCriterio() {
        return txtCriterio;
    }

    public void setTxtCriterio(JTextField txtCriterio) {
        this.txtCriterio = txtCriterio;
    }

    public JTextField getTxtUsuario() {
        return txtUsuario;
    }

    public void setTxtUsuario(JTextField txtUsuario) {
        this.txtUsuario = txtUsuario;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlUsuario = new javax.swing.JPanel();
        pnAdministrarUsuario = new javax.swing.JPanel();
        txtUsuario = new javax.swing.JTextField();
        spt10 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        spt16 = new javax.swing.JSeparator();
        btnCrear = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        cbxIdPersona = new javax.swing.JComboBox<>();
        txtContrasenia = new javax.swing.JPasswordField();
        pnOpcionesBusqueda = new javax.swing.JPanel();
        txtCriterio = new javax.swing.JTextField();
        spt11 = new javax.swing.JSeparator();
        jLabel17 = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        btnLimpiarBus = new javax.swing.JButton();
        chkbxMostrarTodos = new javax.swing.JCheckBox();
        pnListaUsuarios = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblUsuario = new javax.swing.JTable();
        btnReporteInd = new javax.swing.JButton();
        btnReporteGeneral = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        setIconifiable(true);

        pnlUsuario.setBackground(new java.awt.Color(255, 255, 255));

        pnAdministrarUsuario.setBackground(new java.awt.Color(255, 255, 255));
        pnAdministrarUsuario.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Administrar Usuario", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(0, 0, 0))); // NOI18N
        pnAdministrarUsuario.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtUsuario.setBackground(new java.awt.Color(255, 255, 255));
        txtUsuario.setFont(new java.awt.Font("Segoe UI Semibold", 0, 13)); // NOI18N
        txtUsuario.setForeground(new java.awt.Color(0, 0, 0));
        txtUsuario.setBorder(null);
        txtUsuario.setOpaque(true);
        txtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioActionPerformed(evt);
            }
        });
        pnAdministrarUsuario.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 278, -1));
        pnAdministrarUsuario.add(spt10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 278, 10));

        jLabel7.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Usuario:");
        pnAdministrarUsuario.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        jLabel9.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Id de Persona:");
        pnAdministrarUsuario.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, -1));

        jLabel8.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Clave:");
        pnAdministrarUsuario.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));
        pnAdministrarUsuario.add(spt16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 278, 10));

        btnCrear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/image/icon-save.png"))); // NOI18N
        btnCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearActionPerformed(evt);
            }
        });
        pnAdministrarUsuario.add(btnCrear, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, -1, -1));

        btnActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/image/icon-actualizar.png"))); // NOI18N
        pnAdministrarUsuario.add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 360, -1, -1));

        btnBorrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/image/icon-delete.png"))); // NOI18N
        pnAdministrarUsuario.add(btnBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 360, -1, -1));

        btnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/image/icon-clear.png"))); // NOI18N
        pnAdministrarUsuario.add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 360, -1, -1));

        cbxIdPersona.setBackground(new java.awt.Color(255, 255, 255));
        cbxIdPersona.setForeground(new java.awt.Color(0, 0, 0));
        cbxIdPersona.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione el Id de Persona" }));
        cbxIdPersona.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnAdministrarUsuario.add(cbxIdPersona, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 280, -1));

        txtContrasenia.setBackground(new java.awt.Color(255, 255, 255));
        txtContrasenia.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        txtContrasenia.setForeground(new java.awt.Color(0, 0, 0));
        txtContrasenia.setBorder(null);
        txtContrasenia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContraseniaActionPerformed(evt);
            }
        });
        pnAdministrarUsuario.add(txtContrasenia, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 260, 20));

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

        pnListaUsuarios.setBackground(new java.awt.Color(255, 255, 255));
        pnListaUsuarios.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Listas de Usuarios", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(0, 0, 0))); // NOI18N

        tblUsuario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Usuario", "Id de Persona"
            }
        ));
        jScrollPane1.setViewportView(tblUsuario);

        btnReporteInd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/image/icon-printer.png"))); // NOI18N

        btnReporteGeneral.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/image/printed.png"))); // NOI18N

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/image/cross.gif"))); // NOI18N
        btnCancelar.setText("Cancelar");

        javax.swing.GroupLayout pnListaUsuariosLayout = new javax.swing.GroupLayout(pnListaUsuarios);
        pnListaUsuarios.setLayout(pnListaUsuariosLayout);
        pnListaUsuariosLayout.setHorizontalGroup(
            pnListaUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnListaUsuariosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(pnListaUsuariosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnReporteInd)
                .addGap(34, 34, 34)
                .addComponent(btnReporteGeneral)
                .addGap(39, 39, 39)
                .addComponent(btnCancelar)
                .addGap(36, 36, 36))
        );
        pnListaUsuariosLayout.setVerticalGroup(
            pnListaUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnListaUsuariosLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 253, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(pnListaUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnReporteInd, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnReporteGeneral, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(17, 17, 17))
        );

        javax.swing.GroupLayout pnlUsuarioLayout = new javax.swing.GroupLayout(pnlUsuario);
        pnlUsuario.setLayout(pnlUsuarioLayout);
        pnlUsuarioLayout.setHorizontalGroup(
            pnlUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlUsuarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnAdministrarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnListaUsuarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnOpcionesBusqueda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlUsuarioLayout.setVerticalGroup(
            pnlUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlUsuarioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(pnAdministrarUsuario, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlUsuarioLayout.createSequentialGroup()
                        .addComponent(pnOpcionesBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(pnListaUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(pnlUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioActionPerformed

    private void txtContraseniaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContraseniaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContraseniaActionPerformed


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
    private javax.swing.JComboBox<String> cbxIdPersona;
    private javax.swing.JCheckBox chkbxMostrarTodos;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel pnAdministrarUsuario;
    private javax.swing.JPanel pnListaUsuarios;
    private javax.swing.JPanel pnOpcionesBusqueda;
    private javax.swing.JPanel pnlUsuario;
    private javax.swing.JSeparator spt10;
    private javax.swing.JSeparator spt11;
    private javax.swing.JSeparator spt16;
    private javax.swing.JTable tblUsuario;
    private javax.swing.JPasswordField txtContrasenia;
    private javax.swing.JTextField txtCriterio;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables

    public Object getTblProducto() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
