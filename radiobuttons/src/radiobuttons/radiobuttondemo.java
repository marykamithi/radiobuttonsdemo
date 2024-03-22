/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package radiobuttons;

/**
 *
 * @author DELL
 */
import javax.swing.JOptionPane;

public class radiobuttondemo extends javax.swing.JFrame {
    
    public radiobuttondemo() {
        initComponents();
        // Inside the initComponents() method
       birdRadioButton.addActionListener(new java.awt.event.ActionListener() {
    public void actionPerformed(java.awt.event.ActionEvent evt) {
        birdRadioButtonActionPerformed(evt);
    }
    });

    catRadioButton.addActionListener(new java.awt.event.ActionListener() {
    public void actionPerformed(java.awt.event.ActionEvent evt) {
        catRadioButtonActionPerformed(evt);
    }
    });

    dogRadioButton.addActionListener(new java.awt.event.ActionListener() {
    public void actionPerformed(java.awt.event.ActionEvent evt) {
        dogRadioButtonActionPerformed(evt);
    }
    });

    rabbitRadioButton.addActionListener(new java.awt.event.ActionListener() {
    public void actionPerformed(java.awt.event.ActionEvent evt) {
        rabbitRadioButtonActionPerformed(evt);
    }
    });

    pigRadioButton.addActionListener(new java.awt.event.ActionListener() {
    public void actionPerformed(java.awt.event.ActionEvent evt) {
        pigRadioButtonActionPerformed(evt);
    }
    });

    }


    private void birdRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                
        JOptionPane.showMessageDialog(this, "Displaying Bird");
    }                                               

    private void catRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {                                               
        JOptionPane.showMessageDialog(this, "Displaying Cat");
    }                                              

    private void dogRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {                                               
        JOptionPane.showMessageDialog(this, "Displaying Dog");
    }                                              

    private void rabbitRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                  
        JOptionPane.showMessageDialog(this, "Displaying Rabbit");
    }                                                 

    private void pigRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {                                               
        JOptionPane.showMessageDialog(this, "Displaying Pig");
    }                           

    public static void main(String[] args) {
         try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(radiobuttondemo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new radiobuttondemo().setVisible(true);
            }
        });
    }

     
   
 

   

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        birdRadioButton = new javax.swing.JRadioButton();
        catRadioButton = new javax.swing.JRadioButton();
        dogRadioButton = new javax.swing.JRadioButton();
        rabbitRadioButton = new javax.swing.JRadioButton();
        pigRadioButton = new javax.swing.JRadioButton();
        jTextField2 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        birdRadioButton.setText("Bird");

        catRadioButton.setText("Cat");

        dogRadioButton.setText("Dog");

        rabbitRadioButton.setText("Rabbit");

        pigRadioButton.setText("pig");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dogRadioButton)
                    .addComponent(rabbitRadioButton)
                    .addComponent(pigRadioButton)
                    .addComponent(birdRadioButton)
                    .addComponent(catRadioButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 124, Short.MAX_VALUE)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(birdRadioButton)
                        .addGap(27, 27, 27)
                        .addComponent(catRadioButton)
                        .addGap(27, 27, 27)
                        .addComponent(dogRadioButton)
                        .addGap(27, 27, 27)
                        .addComponent(rabbitRadioButton)
                        .addGap(27, 27, 27)
                        .addComponent(pigRadioButton)))
                .addContainerGap(60, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

   
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton birdRadioButton;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton catRadioButton;
    private javax.swing.JRadioButton dogRadioButton;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JRadioButton pigRadioButton;
    private javax.swing.JRadioButton rabbitRadioButton;
    // End of variables declaration//GEN-END:variables
}
