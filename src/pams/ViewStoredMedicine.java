package pams;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.List;
import javax.swing.table.TableCellRenderer;

/**
 * ViewStoredMedicine class
 */

public class ViewStoredMedicine extends javax.swing.JFrame {

    public static JTable jTable1;

    /**
     * Creates new form ViewStoredMedicine
     */
    public ViewStoredMedicine() {
        initComponents();
        loadMedicineData();
    }

    private void loadMedicineData() {
        DatabaseHelper dbHelper = new DatabaseHelper();
        List<Object[]> data = dbHelper.getMedicineData();
    
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Name Of Medicine");
        model.addColumn("Quantity");
        model.addColumn("Initial Price");
        model.addColumn("Selling Price");
        model.addColumn("Update");
        model.addColumn("Delete");
    
        for (Object[] row : data) {
            model.addRow(new Object[]{row[0], row[1], row[2], row[3], "Edit", "Delete"});
        }
    
        jTable1.setModel(model);
        jTable1.getColumn("Update").setCellRenderer(new ButtonRenderer());
        jTable1.getColumn("Update").setCellEditor(new ButtonEditor(new JCheckBox(), "Update"));
        jTable1.getColumn("Delete").setCellRenderer(new ButtonRenderer());
        jTable1.getColumn("Delete").setCellEditor(new ButtonEditor(new JCheckBox(), "Delete"));
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        MainPanel = new javax.swing.JPanel();
        headerTitle = new javax.swing.JLabel();
        footerPanel = new javax.swing.JPanel();
        Body = new javax.swing.JPanel();
        TitleLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        MainPanel.setBackground(new java.awt.Color(153, 255, 0));

        headerTitle.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        headerTitle.setForeground(new java.awt.Color(255, 255, 255));
        headerTitle.setText("Pharmacy Store Management System");

        javax.swing.GroupLayout MainPanelLayout = new javax.swing.GroupLayout(MainPanel);
        MainPanel.setLayout(MainPanelLayout);
        MainPanelLayout.setHorizontalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addGap(186, 186, 186)
                .addComponent(headerTitle)
                .addContainerGap(328, Short.MAX_VALUE))
        );
        MainPanelLayout.setVerticalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(headerTitle)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        footerPanel.setBackground(new java.awt.Color(153, 255, 0));

        javax.swing.GroupLayout footerPanelLayout = new javax.swing.GroupLayout(footerPanel);
        footerPanel.setLayout(footerPanelLayout);
        footerPanelLayout.setHorizontalGroup(
            footerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        footerPanelLayout.setVerticalGroup(
            footerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 41, Short.MAX_VALUE)
        );

        Body.setBackground(new java.awt.Color(255, 255, 255));

        TitleLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        TitleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TitleLabel.setText("Medicine We Have on The Store");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Name Of Medicine", "Quantity", "Initial Price", "Selling Price"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jButton1.setBackground(new java.awt.Color(255, 0, 51));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout BodyLayout = new javax.swing.GroupLayout(Body);
        Body.setLayout(BodyLayout);
        BodyLayout.setHorizontalGroup(
            BodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BodyLayout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(TitleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 757, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jScrollPane1)
        );
        BodyLayout.setVerticalGroup(
            BodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BodyLayout.createSequentialGroup()
                .addGroup(BodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BodyLayout.createSequentialGroup()
                        .addComponent(TitleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(BodyLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(footerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(Body, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(MainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(MainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Body, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(footerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        this.hide();
        HomePage obj = new HomePage();
        obj.show();
    }

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
            java.util.logging.Logger.getLogger(ViewStoredMedicine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewStoredMedicine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewStoredMedicine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewStoredMedicine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewStoredMedicine().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify
    private javax.swing.JPanel Body;
    private javax.swing.JPanel MainPanel;
    private javax.swing.JLabel TitleLabel;
    private javax.swing.JPanel footerPanel;
    private javax.swing.JLabel headerTitle;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
  
    // End of variables declaration
}
class ButtonRenderer extends JButton implements TableCellRenderer {

    public ButtonRenderer() {
        setOpaque(true);
    }

    public Component getTableCellRendererComponent(JTable table, Object value,
            boolean isSelected, boolean hasFocus, int row, int column) {
        if (isSelected) {
            setForeground(table.getSelectionForeground());
            setBackground(table.getSelectionBackground());
        } else {
            setForeground(table.getForeground());
            setBackground(UIManager.getColor("Button.background"));
        }
        setText((value == null) ? "" : value.toString());
        return this;
    }
}

class ButtonEditor extends DefaultCellEditor {

    protected JButton button;

    private String label;

    private boolean isPushed;

    public ButtonEditor(JCheckBox checkBox, String action) {
        super(checkBox);
        button = new JButton();
        button.setOpaque(true);
        button.addActionListener(e -> fireEditingStopped());
        label = action;
    }

    public Component getTableCellEditorComponent(JTable table, Object value,
            boolean isSelected, int row, int column) {
        if (isSelected) {
            button.setForeground(table.getSelectionForeground());
            button.setBackground(table.getSelectionBackground());
        } else {
            button.setForeground(table.getForeground());
            button.setBackground(table.getBackground());
        }
        button.setText(label);
        isPushed = true;
        return button;
    }

    public Object getCellEditorValue() {
        if (isPushed) {
            int selectedRow = ViewStoredMedicine.jTable1.getSelectedRow();
            if (label.equals("Update")) {
                // Perform update operation using the data from the selected row
                updateRecord(selectedRow);
            } else if (label.equals("Delete")) {
                // Perform delete operation using the data from the selected row
                deleteRecord(selectedRow);
            }
        }
        isPushed = false;
        return label;
    }

    public boolean stopCellEditing() {
        isPushed = false;
        return super.stopCellEditing();
    }

    protected void fireEditingStopped() {
        super.fireEditingStopped();
    }

    private void updateRecord(int selectedRow) {
        DefaultTableModel model = (DefaultTableModel) ViewStoredMedicine.jTable1.getModel();
        Object[] rowData = getRowDataFromTableModel(model, selectedRow);
        // Perform update operation in the database using rowData
        System.out.println("Update clicked for row: " + selectedRow);
    }

    private void deleteRecord(int selectedRow) {
        DefaultTableModel model = (DefaultTableModel) ViewStoredMedicine.jTable1.getModel();
        Object[] rowData = getRowDataFromTableModel(model, selectedRow);
        // Perform delete operation in the database using rowData
        System.out.println("Delete clicked for row: " + selectedRow);
        model.removeRow(selectedRow);
    }

    private Object[] getRowDataFromTableModel(DefaultTableModel model, int row) {
        Object[] rowData = new Object[model.getColumnCount()];
        for (int i = 0; i < model.getColumnCount(); i++) {
            rowData[i] = model.getValueAt(row, i);
        }
        return rowData;
    }
}


