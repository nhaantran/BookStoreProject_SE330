
package View.Component.Table.Shopping;
import View.Component.Table.ModelAction;
import View.Tab.Shopping;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author nhaantran
 */
public class Action_Shopping extends javax.swing.JPanel {

 
    Shopping screen = new Shopping();
    public Action_Shopping(ModelAction data) {
        initComponents();
        setOpaque(false);
        screen.setTextlblamount("0");
        btnedit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                int current_ammount = Integer.valueOf(screen.getTextlblamount());
                if(current_ammount > 0){
                    screen.setTextlblamount(String.valueOf(1+current_ammount));
                }
            }
        });
        btndelete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                int current_ammount = Integer.valueOf(screen.getTextlblamount());
                if(current_ammount > 0){
                    screen.setTextlblamount(String.valueOf(current_ammount-1));
                }
            }
        });
    }

    
    
    @Override
    protected void paintComponent(Graphics grphcs) {
        super.paintComponent(grphcs);
        grphcs.setColor(new Color(30, 30, 30, 50));
     //   grphcs.drawLine(0, getHeight() - 1, getWidth(), getHeight() - 1);
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btndelete = new View.Component.Button();
        btnedit = new View.Component.Button();

        setBackground(new java.awt.Color(204, 204, 204));

        btndelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/delete.png"))); // NOI18N

        btnedit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/pencil.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnedit, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btndelete, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnedit, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btndelete, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(8, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private View.Component.Button btndelete;
    private View.Component.Button btnedit;
    // End of variables declaration//GEN-END:variables
}
