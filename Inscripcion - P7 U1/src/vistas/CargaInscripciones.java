
package vistas;
import inscripcion.*;
import java.util.*;
import javax.swing.JOptionPane;

public class CargaInscripciones extends javax.swing.JInternalFrame {
    
    private ArrayList<Alumno> alumnos;
    private ArrayList<Materia> materias;
    public CargaInscripciones(ArrayList<Alumno> alu,ArrayList<Materia> mat ) {
        initComponents();
        alumnos = alu;
        materias = mat;
        if(mat.isEmpty() || alu.isEmpty()){
            cbMaterias.setEnabled(false);
            cbMaterias.addItem("Materia");
            cbAlumnos.setEnabled(false);
            cbAlumnos.addItem("Alumno");
        }else{
            for (Materia materia : mat) {
                cbMaterias.addItem(materia.getNombre());
            }
            for (Alumno alumno : alu ){
                cbAlumnos.addItem(alumno.getNombre()+" "+alumno.getApellido());
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelInscr = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnInscribir = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        cbMaterias = new javax.swing.JComboBox<>();
        cbAlumnos = new javax.swing.JComboBox<>();

        setClosable(true);
        setTitle("Realizar Inscripciones");

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setText("FORMULARIO DE INSCRIPCION");
        jLabel1.setToolTipText("");

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel2.setText("ELIJA UNA MATERIA");

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel3.setText("ELIJA UN ALUMNO");

        btnInscribir.setText("Inscribir");
        btnInscribir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInscribirActionPerformed(evt);
            }
        });

        btnSalir.setText("Salir");

        javax.swing.GroupLayout panelInscrLayout = new javax.swing.GroupLayout(panelInscr);
        panelInscr.setLayout(panelInscrLayout);
        panelInscrLayout.setHorizontalGroup(
            panelInscrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInscrLayout.createSequentialGroup()
                .addGroup(panelInscrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelInscrLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panelInscrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(panelInscrLayout.createSequentialGroup()
                                .addGap(96, 96, 96)
                                .addComponent(btnInscribir, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnSalir))
                            .addGroup(panelInscrLayout.createSequentialGroup()
                                .addGroup(panelInscrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addGap(26, 26, 26)
                                .addGroup(panelInscrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbAlumnos, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cbMaterias, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(panelInscrLayout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(jLabel1)))
                .addContainerGap(97, Short.MAX_VALUE))
        );
        panelInscrLayout.setVerticalGroup(
            panelInscrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInscrLayout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(25, 25, 25)
                .addGroup(panelInscrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cbMaterias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(panelInscrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cbAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(panelInscrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnInscribir)
                    .addComponent(btnSalir))
                .addGap(0, 88, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelInscr, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelInscr, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInscribirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInscribirActionPerformed
        if(!materias.isEmpty() && !alumnos.isEmpty()){
            String alumno = (String)cbAlumnos.getSelectedItem();
            String materia = (String)cbMaterias.getSelectedItem();
            Alumno aa = null;
            Materia mm = null;
            for (Alumno alu : alumnos) {
                if(alumno.equals(alu.getNombre()+" "+alu.getApellido())){
                    aa=alu;
                }
            }
            for (Materia mat : materias) {
                if(materia.equals(mat.getNombre())){
                    mm=mat;
                }
            }
            if(aa.agregarMateria(mm)){
                JOptionPane.showMessageDialog(null, "Inscripcion correcta","OK", JOptionPane.INFORMATION_MESSAGE);
            }else
                JOptionPane.showMessageDialog(null, "Ya se encuentra inscripto a la materia","ERROR", JOptionPane.ERROR_MESSAGE);
            
        }else{
            JOptionPane.showMessageDialog(null, "Arreglos vacios.","ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnInscribirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnInscribir;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<String> cbAlumnos;
    private javax.swing.JComboBox<String> cbMaterias;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel panelInscr;
    // End of variables declaration//GEN-END:variables
}
