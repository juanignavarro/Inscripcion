
package vistas;
import inscripcion.*;
import java.util.*;
import javax.swing.JOptionPane;

public class CargaMaterias extends javax.swing.JInternalFrame {
    
    private ArrayList<Materia> materias;
    public CargaMaterias(ArrayList<Materia> mat) {
        initComponents();
        this.materias=mat;
    }
    public void limpiar(){
        tbAñoMateria.setText("");
        tbCodigoMateria.setText("");
        tbNombreMateria.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelMaterias = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tbCodigoMateria = new javax.swing.JTextField();
        tbNombreMateria = new javax.swing.JTextField();
        tbAñoMateria = new javax.swing.JTextField();
        btnGuardarMateria = new javax.swing.JButton();
        btnNuevaMateria = new javax.swing.JButton();
        btnSalirMateria = new javax.swing.JButton();

        setClosable(true);
        setTitle("Carga de Materias");

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setText("FORMULARIO DE MATERIAS");
        jLabel1.setToolTipText("");

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel2.setText("CODIGO DE LA MATERIA");

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel3.setText("NOMBRE DE LA MATERIA");

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel4.setText("AÑO AL QUE PERTENECE");

        btnGuardarMateria.setText("Guardar");

        btnNuevaMateria.setText("Nuevo");
        btnNuevaMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevaMateriaActionPerformed(evt);
            }
        });

        btnSalirMateria.setText("Salir");

        javax.swing.GroupLayout panelMateriasLayout = new javax.swing.GroupLayout(panelMaterias);
        panelMaterias.setLayout(panelMateriasLayout);
        panelMateriasLayout.setHorizontalGroup(
            panelMateriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMateriasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelMateriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelMateriasLayout.createSequentialGroup()
                        .addGroup(panelMateriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(28, 28, 28)
                        .addGroup(panelMateriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tbCodigoMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tbNombreMateria)))
                    .addGroup(panelMateriasLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(22, 22, 22)
                        .addGroup(panelMateriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnGuardarMateria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tbAñoMateria))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnNuevaMateria)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSalirMateria)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(89, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMateriasLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(136, 136, 136))
        );
        panelMateriasLayout.setVerticalGroup(
            panelMateriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMateriasLayout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(29, 29, 29)
                .addGroup(panelMateriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tbCodigoMateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelMateriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tbNombreMateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelMateriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tbAñoMateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelMateriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardarMateria)
                    .addComponent(btnNuevaMateria)
                    .addComponent(btnSalirMateria))
                .addGap(0, 90, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelMaterias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelMaterias, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNuevaMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevaMateriaActionPerformed
        if("".equals(tbCodigoMateria.getText()) || "".equals(tbAñoMateria.getText())){
            JOptionPane.showMessageDialog(null, "Campos vacios.","ERROR", JOptionPane.ERROR_MESSAGE);
        }else{
            boolean seEncuentra = false;
            Materia mm = new Materia(Integer.parseInt(tbCodigoMateria.getText()),tbNombreMateria.getText(),Integer.parseInt(tbAñoMateria.getText()));
            if(!materias.isEmpty()){
                for (Materia materia : materias) {
                    if(materia.getIdMateria() == mm.getIdMateria()){
                        seEncuentra = true;
                    }
                }
            }
            if(seEncuentra){
                JOptionPane.showMessageDialog(null, "La materia con ese ID ya se encuentra.","ERROR", JOptionPane.ERROR_MESSAGE);
                tbCodigoMateria.setText("");
            }else{
                materias.add(mm);
                JOptionPane.showMessageDialog(null, "Materia guardada","AGREGADO", JOptionPane.INFORMATION_MESSAGE);
                Menu m = new Menu();
                m.llamarM(materias);
                limpiar();
            }
        }
    }//GEN-LAST:event_btnNuevaMateriaActionPerformed
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardarMateria;
    private javax.swing.JButton btnNuevaMateria;
    private javax.swing.JButton btnSalirMateria;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel panelMaterias;
    private javax.swing.JTextField tbAñoMateria;
    private javax.swing.JTextField tbCodigoMateria;
    private javax.swing.JTextField tbNombreMateria;
    // End of variables declaration//GEN-END:variables
}
