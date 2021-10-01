
package vistas;
import inscripcion.*;
import java.util.*;
import javax.swing.JOptionPane;

public class CargaAlumnos extends javax.swing.JInternalFrame {

    private ArrayList<Alumno> alumnos;
    public CargaAlumnos(ArrayList<Alumno> alu) {
        initComponents();
        this.alumnos=alu;
    }
    public void limpiar(){
        tbApellidoAlumno.setText("");
        tbNombreAlumno.setText("");
        tbLegajoAlumno.setText("");
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelAlumnos = new javax.swing.JPanel();
        btnSalirAlumno = new javax.swing.JButton();
        btnNuevoAlumno = new javax.swing.JButton();
        btnGuardarAlumno = new javax.swing.JButton();
        tbApellidoAlumno = new javax.swing.JTextField();
        tbNombreAlumno = new javax.swing.JTextField();
        tbLegajoAlumno = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setClosable(true);
        setTitle("Carga de Alumnos");

        btnSalirAlumno.setText("Salir");

        btnNuevoAlumno.setText("Nuevo");
        btnNuevoAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoAlumnoActionPerformed(evt);
            }
        });

        btnGuardarAlumno.setText("Guardar");

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel2.setText("LEGAJO");

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel3.setText("NOMBRE");

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel4.setText("APELLIDO");

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setText("FORMULARIO DE ALUMNOS");
        jLabel1.setToolTipText("");

        javax.swing.GroupLayout panelAlumnosLayout = new javax.swing.GroupLayout(panelAlumnos);
        panelAlumnos.setLayout(panelAlumnosLayout);
        panelAlumnosLayout.setHorizontalGroup(
            panelAlumnosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAlumnosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelAlumnosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelAlumnosLayout.createSequentialGroup()
                        .addGroup(panelAlumnosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(28, 28, 28)
                        .addGroup(panelAlumnosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tbLegajoAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tbNombreAlumno)))
                    .addGroup(panelAlumnosLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(22, 22, 22)
                        .addGroup(panelAlumnosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(panelAlumnosLayout.createSequentialGroup()
                                .addComponent(btnGuardarAlumno, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnNuevoAlumno)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSalirAlumno))
                            .addComponent(tbApellidoAlumno))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(102, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAlumnosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(102, 102, 102))
        );
        panelAlumnosLayout.setVerticalGroup(
            panelAlumnosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAlumnosLayout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(29, 29, 29)
                .addGroup(panelAlumnosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tbLegajoAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelAlumnosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tbNombreAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelAlumnosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tbApellidoAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelAlumnosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardarAlumno)
                    .addComponent(btnNuevoAlumno)
                    .addComponent(btnSalirAlumno))
                .addGap(0, 90, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelAlumnos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelAlumnos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNuevoAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoAlumnoActionPerformed
        if("".equals(tbLegajoAlumno.getText())){
            JOptionPane.showMessageDialog(null, "Campos vacios.","ERROR", JOptionPane.ERROR_MESSAGE);
        }else{
            boolean seEncuentra = false;
            Alumno aa = new Alumno(Integer.parseInt(tbLegajoAlumno.getText()),tbNombreAlumno.getText(),tbApellidoAlumno.getText());
            if(!alumnos.isEmpty()){
                for (Alumno alumno : alumnos) {
                    if(alumno.equals(aa)){
                        seEncuentra = true;
                    }
                }
            }
            if(seEncuentra){
                JOptionPane.showMessageDialog(null, "El alumno con ese legajo ya se encuentra.","ERROR", JOptionPane.ERROR_MESSAGE);
                tbLegajoAlumno.setText("");
            }else{
                alumnos.add(aa);
                JOptionPane.showMessageDialog(null, "Alumno agregado","AGREGADO", JOptionPane.INFORMATION_MESSAGE);
                Menu m = new Menu();
                m.llamarA(alumnos);
                limpiar();
            }
        }
    }//GEN-LAST:event_btnNuevoAlumnoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardarAlumno;
    private javax.swing.JButton btnNuevoAlumno;
    private javax.swing.JButton btnSalirAlumno;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel panelAlumnos;
    private javax.swing.JTextField tbApellidoAlumno;
    private javax.swing.JTextField tbLegajoAlumno;
    private javax.swing.JTextField tbNombreAlumno;
    // End of variables declaration//GEN-END:variables
}
