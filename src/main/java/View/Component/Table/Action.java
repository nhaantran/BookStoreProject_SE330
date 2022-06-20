
package View.Component.Table;

import Model.Book.Book;
import Model.Book.BookDao;
import View.Tab.UpdateBook;
import Model.Customer.Customer;
import Model.Customer.CustomerDao;
import Model.Discount.Discount;
import Model.Discount.DiscountDao;
import View.Home;
import View.Tab.UpdateCustomer;
import View.Tab.UpdateDiscount;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author nhaantran
 */
public class Action extends javax.swing.JPanel {

    private Book book = new Book();
    private Customer customer = new Customer();
    private Discount discount = new Discount();
    
    private BookDao bkd = new BookDao();
    private CustomerDao ctmd = new CustomerDao();
    private DiscountDao dcd = new DiscountDao();
    public Action(ModelAction data) {
        initComponents();
        setOpaque(false);
        Home screen = new Home();
        btnedit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                int response = JOptionPane.showConfirmDialog(screen, "Are you sure?",
                        "Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                if (response == JOptionPane.YES_OPTION) {
                    if (data.getmodel().getClass() == book.getClass()) {
                        book = (Book) data.getmodel();
                        UpdateBook udb = new UpdateBook(screen, book);
                        udb.setVisible(true);

                    }
                    if (data.getmodel().getClass() == discount.getClass()) {
                        discount = (Discount) data.getmodel();
                        UpdateDiscount udd = new UpdateDiscount(screen, discount);
                        udd.setVisible(true);

                    }
                    if (data.getmodel().getClass() == customer.getClass()) {
                        customer = (Customer) data.getmodel();
                        UpdateCustomer udd = new UpdateCustomer(screen, customer);
                        udd.setVisible(true);
                    }
                }

            }
        });
        btndelete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                
                int response = JOptionPane.showConfirmDialog(screen, "Are you sure?",
                        "Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                if (response == JOptionPane.YES_OPTION) {
                    if (data.getmodel().getClass() == book.getClass()) {
                        book = (Book) data.getmodel();
                        bkd.delete(book);
                    }
                    if (data.getmodel().getClass() == discount.getClass()) {
                        discount = (Discount) data.getmodel();
                        dcd.delete(discount);
                    }
                    if (data.getmodel().getClass() == customer.getClass()) {
                        customer = (Customer) data.getmodel();
                        ctmd.delete(customer);
                    }
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnedit, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btndelete, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(8, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private View.Component.Button btndelete;
    private View.Component.Button btnedit;
    // End of variables declaration//GEN-END:variables
}
