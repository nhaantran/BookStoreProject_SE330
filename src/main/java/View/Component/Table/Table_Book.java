/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View.Component.Table;

/**
 *
 * @author nhaantran
 */
import Model.Book.Book;
import Model.Book.BookDao;
import java.awt.Color;
import java.awt.Component;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellEditor;

public class Table_Book extends JTable {

    public Table_Book() {
        setShowHorizontalLines(true);
        setGridColor(new Color(230, 230, 230));
        setRowHeight(40);
        getTableHeader().setReorderingAllowed(false);
        getTableHeader().setDefaultRenderer(new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable jtable, Object o, boolean bln, boolean bln1, int i, int i1) {
                TableHeader header = new TableHeader(o + "");
                if (i1 == 14) {
                    header.setHorizontalAlignment(JLabel.CENTER);
                }
                return header;
            }
        });
        setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable jtable, Object o, boolean selected, boolean focus, int i, int i1) {
                if (o instanceof ModelAction book){
                    Action cell = new Action(book);
                    if (selected) {
                        cell.setBackground(new Color(239, 244, 255));
                    } else {
                        cell.setBackground(Color.WHITE);
                    }
                    return cell;
                } else {
                    Component com = super.getTableCellRendererComponent(jtable, o, selected, focus, i, i1);
                    com.setBackground(Color.WHITE);
                    setBorder(noFocusBorder);
                    if (selected) {
                        com.setForeground(Color.BLACK);
                        com.setBackground(new Color(239, 244, 255));
                    } else {
                        com.setBackground(Color.WHITE);
                    }
                    return com;
                }
            }
        });

    }

    @Override
    public TableCellEditor getCellEditor(int row, int col) {
        if (col == 13) {
            return new TableCellAction();
        } else {
            return super.getCellEditor(row, col);
        }
    }

    public void addRow(Object[] row) {
        DefaultTableModel model = (DefaultTableModel) getModel();
        model.addRow(row);
    }

    public void ScrollBarFix(JScrollPane scroll) {
        scroll.getViewport().setBackground(Color.WHITE);
        scroll.setVerticalScrollBar(new ScrollBarCustom());
        JPanel p = new JPanel();
        p.setOpaque(false);
        scroll.setCorner(JScrollPane.UPPER_RIGHT_CORNER, p);
        scroll.setBorder(new EmptyBorder(5, 10, 5, 10));
    }

    public void loadDatatoTable(ArrayList<Book> list){
        try{
            for(Book s : list){
                this.addRow(new Object[]{
                    s.getID(),s.getName(), s.getDescription(),s.getSupplier(),s.getAuthor(),s.getPublisher(),s.getEdition(),
                    s.getType(),s.getBookCover(), s.getReleaseDate(), s.getNumPages(), s.getPrice(), s.getAmount(),new ModelAction<Book>(s)
                });   
            }
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
