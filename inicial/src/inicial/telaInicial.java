/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package inicial;

import javax.swing.JPanel;
import java.awt.Color;

public class telaInicial extends javax.swing.JFrame {

    /**
     * Creates new form telaInicial
     */
    public telaInicial() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        header = new javax.swing.JPanel();
        iconmin = new javax.swing.JPanel();
        closeButton = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        buttonMax = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        menu = new javax.swing.JPanel();
        MenuIcons = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        hideMenuBlock = new javax.swing.JPanel();
        hideMenu = new javax.swing.JLabel();
        divisoryMenu = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        menuhide = new javax.swing.JPanel();
        dashboard = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        header.setBackground(new java.awt.Color(0, 0, 51));
        header.setPreferredSize(new java.awt.Dimension(800, 50));
        header.setLayout(new java.awt.BorderLayout());

        iconmin.setBackground(new java.awt.Color(0, 0, 51));
        iconmin.setPreferredSize(new java.awt.Dimension(150, 50));
        iconmin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        closeButton.setBackground(new java.awt.Color(0, 0, 51));
        closeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeButtonMouseClicked(evt);
            }
        });
        closeButton.setLayout(new java.awt.BorderLayout());

        jLabel1.setBackground(new java.awt.Color(0, 0, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/cross.png"))); // NOI18N
        jLabel1.setToolTipText("");
        jLabel1.setAlignmentX(10.0F);
        jLabel1.setAlignmentY(0.0F);
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel1MouseExited(evt);
            }
        });
        closeButton.add(jLabel1, java.awt.BorderLayout.CENTER);

        iconmin.add(closeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 0, 50, 50));

        buttonMax.setBackground(new java.awt.Color(0, 0, 51));
        buttonMax.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonMaxMouseClicked(evt);
            }
        });
        buttonMax.setLayout(new java.awt.BorderLayout());

        jLabel2.setBackground(new java.awt.Color(0, 0, 51));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/expand.png"))); // NOI18N
        jLabel2.setToolTipText("");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel2MouseExited(evt);
            }
        });
        buttonMax.add(jLabel2, java.awt.BorderLayout.CENTER);

        iconmin.add(buttonMax, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 50, 50));

        header.add(iconmin, java.awt.BorderLayout.LINE_END);

        getContentPane().add(header, java.awt.BorderLayout.PAGE_START);

        menu.setBackground(new java.awt.Color(255, 255, 255));
        menu.setPreferredSize(new java.awt.Dimension(270, 450));
        menu.setLayout(new java.awt.BorderLayout());

        MenuIcons.setBackground(new java.awt.Color(0, 0, 51));
        MenuIcons.setPreferredSize(new java.awt.Dimension(50, 350));
        MenuIcons.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 51));
        jPanel1.setPreferredSize(new java.awt.Dimension(50, 10));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        MenuIcons.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 3));

        hideMenuBlock.setBackground(new java.awt.Color(0, 0, 51));
        hideMenuBlock.setLayout(new java.awt.BorderLayout());

        hideMenu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hideMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/before.png"))); // NOI18N
        hideMenuBlock.add(hideMenu, java.awt.BorderLayout.CENTER);

        MenuIcons.add(hideMenuBlock, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 3, 50, 50));

        divisoryMenu.setBackground(new java.awt.Color(0, 0, 51));
        divisoryMenu.setPreferredSize(new java.awt.Dimension(50, 10));

        javax.swing.GroupLayout divisoryMenuLayout = new javax.swing.GroupLayout(divisoryMenu);
        divisoryMenu.setLayout(divisoryMenuLayout);
        divisoryMenuLayout.setHorizontalGroup(
            divisoryMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        divisoryMenuLayout.setVerticalGroup(
            divisoryMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        MenuIcons.add(divisoryMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 53, 50, 3));

        jPanel4.setBackground(new java.awt.Color(0, 0, 51));
        jPanel4.setLayout(new java.awt.BorderLayout());

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/configuration.png"))); // NOI18N
        jPanel4.add(jLabel4, java.awt.BorderLayout.CENTER);

        MenuIcons.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 53, 50, 50));

        menu.add(MenuIcons, java.awt.BorderLayout.LINE_START);

        menuhide.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout menuhideLayout = new javax.swing.GroupLayout(menuhide);
        menuhide.setLayout(menuhideLayout);
        menuhideLayout.setHorizontalGroup(
            menuhideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 220, Short.MAX_VALUE)
        );
        menuhideLayout.setVerticalGroup(
            menuhideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 350, Short.MAX_VALUE)
        );

        menu.add(menuhide, java.awt.BorderLayout.CENTER);

        getContentPane().add(menu, java.awt.BorderLayout.LINE_START);

        dashboard.setBackground(new java.awt.Color(102, 102, 102));

        javax.swing.GroupLayout dashboardLayout = new javax.swing.GroupLayout(dashboard);
        dashboard.setLayout(dashboardLayout);
        dashboardLayout.setHorizontalGroup(
            dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 530, Short.MAX_VALUE)
        );
        dashboardLayout.setVerticalGroup(
            dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 350, Short.MAX_VALUE)
        );

        getContentPane().add(dashboard, java.awt.BorderLayout.CENTER);

        setSize(new java.awt.Dimension(800, 400));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void changecolor(JPanel hover, Color rand) {
        hover.setBackground(rand);
    }


    private void jLabel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseEntered
        changecolor(closeButton, new Color(25, 29, 74));
    }//GEN-LAST:event_jLabel1MouseEntered

    private void jLabel1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseExited
        changecolor(closeButton, new Color(5, 10, 46));
    }//GEN-LAST:event_jLabel1MouseExited

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked

        System.exit(0);
    }//GEN-LAST:event_jLabel1MouseClicked

   

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        if (this.getExtendedState() != telaInicial.MAXIMIZED_BOTH) {
            this.setExtendedState(telaInicial.MAXIMIZED_BOTH);
        } else {
            this.setExtendedState(telaInicial.NORMAL);
        }
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseEntered
        changecolor(buttonMax, new Color(25, 29, 74));
    }//GEN-LAST:event_jLabel2MouseEntered

    private void jLabel2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseExited
        changecolor(buttonMax, new Color(5, 10, 46));
    }//GEN-LAST:event_jLabel2MouseExited

    private void closeButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeButtonMouseClicked
        System.exit(0);
    }//GEN-LAST:event_closeButtonMouseClicked

    private void buttonMaxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonMaxMouseClicked
          if (this.getExtendedState() != telaInicial.MAXIMIZED_BOTH) {
            this.setExtendedState(telaInicial.MAXIMIZED_BOTH);
        } else {
            this.setExtendedState(telaInicial.NORMAL);
        }
    }//GEN-LAST:event_buttonMaxMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(telaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(telaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(telaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(telaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new telaInicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel MenuIcons;
    private javax.swing.JPanel buttonMax;
    private javax.swing.JPanel closeButton;
    private javax.swing.JPanel dashboard;
    private javax.swing.JPanel divisoryMenu;
    private javax.swing.JPanel header;
    private javax.swing.JLabel hideMenu;
    private javax.swing.JPanel hideMenuBlock;
    private javax.swing.JPanel iconmin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel menu;
    private javax.swing.JPanel menuhide;
    // End of variables declaration//GEN-END:variables
}
