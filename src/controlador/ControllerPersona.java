/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.awt.Dimension;
import java.sql.Connection;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDesktopPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import modelo.Persona;
import modelo.PersonaJpaController;
import modelo.exceptions.NonexistentEntityException;
import proyecto_producto.ManagerFactory;
import vista.interna.ViewPersona;

/**
 *
 * @author chris
 */
public class ControllerPersona {

    ViewPersona vista;
    ManagerFactory manager;
    PersonaJpaController modeloPersona;
    Persona persona;
    ModeloTablaPersona modeloTabla;
    JDesktopPane escritorio;
    ListSelectionModel listaPersonaModel;

    public ControllerPersona(ViewPersona vista, ManagerFactory manager, PersonaJpaController modeloPersona, JDesktopPane escritorio) {
        this.vista = vista;
        this.manager = manager;
        this.modeloPersona = modeloPersona;
        this.escritorio = escritorio;
        if (ControllerAdministrador.vistaPersona == null) {
            ControllerAdministrador.vistaPersona = new ViewPersona();
            this.vista = ControllerAdministrador.vistaPersona;
            this.escritorio.add(this.vista);
            cargarDatosPersonaTbl();
            //Para centar la vista en la ventana
            Dimension desktopSize = this.escritorio.getSize();
            Dimension FrameSize = this.vista.getSize();
            this.vista.setLocation((desktopSize.width - FrameSize.width) / 2, (desktopSize.height - FrameSize.height) / 2);
            this.vista.getBtnBorrar().setEnabled(false);
            this.vista.getBtnActualizar().setEnabled(false);
            ControllerAdministrador.vistaPersona.show();
            controlEvento();
        } else {
            ControllerAdministrador.vistaPersona.show();
        }
    }

    public void cargarDatosPersonaTbl() {
        this.modeloTabla = new ModeloTablaPersona();
        this.modeloTabla.setFilas(modeloPersona.findPersonaEntities());
        this.vista.getTblPersona().setModel(modeloTabla);
    }

    public void controlEvento() {
        this.vista.getBtnCrear().addActionListener(l -> guardarPersona());
        this.vista.getBtnActualizar().addActionListener(l -> editarPersona());
        this.vista.getBtnBorrar().addActionListener(l -> eliminarPersona());
        this.vista.getBtnReporteInd().addActionListener(l -> reporteIndividual());
        this.vista.getBtnReporteGeneral().addActionListener(l -> reporteGeneral());
        this.vista.getBtnLimpiar().addActionListener(l -> limpiarC());
        this.vista.getBtnLimpiarBus().addActionListener(l -> limpiarB());
        this.vista.getBtnCancelar().addActionListener(l -> cancelar());
        this.vista.getTblPersona().setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        listaPersonaModel = this.vista.getTblPersona().getSelectionModel();
        listaPersonaModel.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if (!e.getValueIsAdjusting()) {
                    personaSeleccionada();
                }
            }
        });
        this.vista.getBtnBuscar().addActionListener(l -> buscarPersona());
        this.vista.getChkbxMostrarTodos().addActionListener(l -> mostrarTodos());
    }

    public void personaSeleccionada() {
        if (this.vista.getTblPersona().getSelectedRow() != -1) {
            persona = modeloTabla.getFilas().get(this.vista.getTblPersona().getSelectedRow());
            this.vista.getTxtNombres().setText(persona.getNombre());
            this.vista.getTxtApellidos().setText(persona.getApellido());
            this.vista.getTxtCedula().setText(persona.getCedula());
            this.vista.getTxtCelular().setText(persona.getCelular());
            this.vista.getTxtCorreo().setText(persona.getCorreo());
            this.vista.getTxtDireccion().setText(persona.getDireccion());
            //Acceso de Botones
            this.vista.getBtnCrear().setEnabled(false);
            this.vista.getBtnBorrar().setEnabled(true);
            this.vista.getBtnActualizar().setEnabled(true);

        }
    }

    //llamar
    public void reporteGeneral() {
        Resouces.imprimirReeporte(ManagerFactory.getConnection(manager.getEntityManagerFactory().createEntityManager()), "/reportes/Personas.jasper", new HashMap());
    }

    public void reporteIndividual() {
        if (persona != null) {
            Map parametros = new HashMap<>();
            parametros.put("id", persona.getIdpersona());
            Resouces.imprimirReeporte(ManagerFactory.getConnection(manager.getEntityManagerFactory().createEntityManager()), "/reportes/ReporteIndividual.jasper", parametros);
        } else {
            Resouces.warning("!Persona no Seleccionada!", "Seleccione una persona");
        }
    }

    public void guardarPersona() {
        persona = new Persona();
        if (validacionesCamposPersona() == true) {
            persona.setNombre(this.vista.getTxtNombres().getText());
            persona.setApellido(this.vista.getTxtApellidos().getText());
            persona.setCedula(this.vista.getTxtCedula().getText());
            persona.setCelular(this.vista.getTxtCelular().getText());
            persona.setCorreo(this.vista.getTxtCorreo().getText());
            persona.setDireccion(this.vista.getTxtDireccion().getText());
            modeloPersona.create(persona);
            cargarDatosPersonaTbl();
            Resouces.success("!Persona Creada!", " Se ha creado con exito \n Persona con Nombre: " + persona.getNombre());
            limpiarC();
        } else {
            Resouces.error("Error en el Proceso", " No se creo con exito D:");
        }
    }

    public void editarPersona() {
        if (persona != null) {
            try {
                if (validacionesCamposPersona() == true) {
                    persona.setNombre(this.vista.getTxtNombres().getText());
                    persona.setApellido(this.vista.getTxtApellidos().getText());
                    persona.setCedula(this.vista.getTxtCedula().getText());
                    persona.setCelular(this.vista.getTxtCelular().getText());
                    persona.setCorreo(this.vista.getTxtCorreo().getText());
                    persona.setDireccion(this.vista.getTxtDireccion().getText());

                    modeloPersona.edit(persona);
                    modeloTabla.eliminar(persona);
                    modeloTabla.actualizar(persona);
                    Resouces.success("!Persona Editada!", " Se ha editado con exito \n Persona con Nombre: " + persona.getNombre());
                    limpiarC();
                }
            } catch (Exception ex) {
                Logger.getLogger(ControllerPersona.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

    public void eliminarPersona() {
        if (persona != null) {
            try {
                modeloPersona.destroy(persona.getIdpersona());
                modeloTabla.eliminar(persona);
                Resouces.success("!Persona Eliminada!", " Se ha eliminado con exito \n Persona con Nombre: " + persona.getNombre());
                cargarDatosPersonaTbl();
                limpiarC();
            } catch (NonexistentEntityException ex) {
                Logger.getLogger(ControllerPersona.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public void mostrarTodos() {
        if (this.vista.getChkbxMostrarTodos().isSelected()) {
            cargarDatosPersonaTbl();
        } else {
            buscarPersona();
        }
    }

    public void buscarPersona() {
        if (!this.vista.getTxtCriterio().getText().isEmpty()) {
            modeloTabla.setFilas(modeloPersona.buscarPersona(this.vista.getTxtCriterio().getText()));
            modeloTabla.fireTableDataChanged();
        } else {
            limpiarB();
        }
    }

    public void limpiarC() {
        this.vista.getTxtNombres().setText("");
        this.vista.getTxtApellidos().setText("");
        this.vista.getTxtCedula().setText("");
        this.vista.getTxtCelular().setText("");
        this.vista.getTxtCorreo().setText("");
        this.vista.getTxtDireccion().setText("");

        //Acciones de Botones
        this.vista.getBtnCrear().setEnabled(true);
        this.vista.getBtnBorrar().setEnabled(false);
        this.vista.getBtnActualizar().setEnabled(false);

//Limpiar Seleccion de Tabla
        this.vista.getTblPersona().clearSelection();
    }

    public void limpiarB() {
        this.vista.getTxtCriterio().setText("");
        modeloTabla.setFilas(modeloPersona.findPersonaEntities());
        modeloTabla.fireTableDataChanged();
    }

    public void cancelar() {
        this.vista.hide();
    }

    public boolean validacionesCamposPersona() {
        Validaciones validar = new Validaciones();
        boolean validado = false;
        if (!this.vista.getTxtNombres().getText().isEmpty()) {
            if (validar.ValidarTextoConEspacio(this.vista.getTxtNombres().getText())) {
                this.vista.getLblNombresE().setText("");
                if (!this.vista.getTxtApellidos().getText().isEmpty()) {
                    if (validar.ValidarTextoConEspacio(this.vista.getTxtApellidos().getText())) {
                        this.vista.getLblApellidosE().setText("");
                        //segunda  valid
                        if (!this.vista.getTxtCedula().getText().isEmpty()) {
                            if (validar.validarCedula(this.vista.getTxtCedula().getText())) {
                                this.vista.getLblCedulaE().setText("");
                                //Segunda valid
                                if (!this.vista.getTxtCelular().getText().isEmpty()) {
                                    if (validar.validarCelu(this.vista.getTxtCelular().getText())) {
                                        this.vista.getLblCelularE().setText("");
                                        //Segunda valid
                                        if (!this.vista.getTxtCorreo().getText().isEmpty()) {
                                            if (validar.validarEmail(this.vista.getTxtCorreo().getText())) {
                                                this.vista.getLblCorreoE().setText("");
                                                //Segunda valid
                                                if (!this.vista.getTxtDireccion().getText().isEmpty()) {
                                                    if (validar.validarDirec(this.vista.getTxtDireccion().getText())) {
                                                        //Segunda valid
                                                        this.vista.getLblDireccionE().setText("");
                                                        validado = true;
                                                    } else {
                                                        this.vista.getLblDireccionE().setText("* Direccion Invalida");
                                                    }
                                                } else {
                                                    this.vista.getLblDireccionE().setText("* Campo de Direccion Vacio");
                                                }
                                            } else {
                                                this.vista.getLblCorreoE().setText("* Correo Electronico Invalida");
                                            }
                                        } else {
                                            this.vista.getLblCorreoE().setText("* Campo del Correo Electronico Vacio");
                                        }
                                    } else {
                                        this.vista.getLblCelularE().setText("* Celular Invalida");
                                    }
                                } else {
                                    this.vista.getLblCelularE().setText("* Campo del Celular Vacio");
                                    this.vista.getLblNombresE().setText("");
                                }
                            } else {
                                this.vista.getLblCedulaE().setText("* Cedula Invalida");

                            }
                        } else {
                            this.vista.getLblCedulaE().setText("* Campo de la Cedula Vacio");

                        }
                    } else {
                        this.vista.getLblApellidosE().setText("* Apellido Invalido");
                    }
                } else {
                    this.vista.getLblApellidosE().setText("* Campo de Apellidos Vacio");

                }
            } else {
                this.vista.getLblNombresE().setText("* Nombre Invalido");
            }
        } else {
            this.vista.getLblNombresE().setText("* Campo de Nombres Vacio");
        }
        if (validado == false) {
            // Resouces.error("Error en el Proceso", " No se edito con exito D:");
        }
        return validado;
    }
}
