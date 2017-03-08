
import DataBase.DbOperations;
import beans.RopaMemberBean;
import java.awt.Point;
import java.awt.Toolkit;
import java.io.File;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.WindowConstants;
import javax.swing.table.DefaultTableModel;
import pdf.PDFGenerator;



/**
 *
 * @author Laksh
 */
public class MainProgramme extends javax.swing.JFrame {
    
    UpdateEntryFrame updateEntryFrame;
    NewEntryFrame newEntry;
    private String mouseClickedRow;
    
    public MainProgramme() {
        initComponents();
        
         Toolkit tk = Toolkit.getDefaultToolkit();
        int x_size = 1350;
        int y_size=700;
        this.setSize(x_size,y_size);
        this.setLocationRelativeTo(null);  
       // loginFieldsPanel.setVisible(false);   
        
        //newEntry.setVisible(false);
        
       // DefaultTableModel model = (DefaultTableModel) dataTable.getModel();
      //  model.addRow(rowData);
        fillTable();
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        Tab = new javax.swing.JTabbedPane();
        dataBasePanel = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        dataBaseNewEntryButton = new javax.swing.JButton();
        dataBaseDeleteEntryButton = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        dataTable = new javax.swing.JTable();
        filterPanel = new javax.swing.JPanel();
        filterYearButon = new com.toedter.calendar.JYearChooser();
        jLabel1 = new javax.swing.JLabel();
        filteredResultText = new javax.swing.JTextField();
        exportPDFButton = new javax.swing.JButton();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        dataBaseNewEntryButton.setText("New Entry");
        dataBaseNewEntryButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dataBaseNewEntryButtonActionPerformed(evt);
            }
        });

        dataBaseDeleteEntryButton.setText("Delete Entry");
        dataBaseDeleteEntryButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dataBaseDeleteEntryButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(dataBaseNewEntryButton, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(dataBaseDeleteEntryButton, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dataBaseDeleteEntryButton, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dataBaseNewEntryButton, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        dataTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Entry", "ID", "Name", "Year", "Member", "Position", "Address", "Mobile", "Home", "Job", "Work Place", "Email", "Date of Birth", "NIC", "Notes"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        dataTable.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        dataTable.setColumnSelectionAllowed(true);
        dataTable.getTableHeader().setReorderingAllowed(false);
        dataTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dataTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(dataTable);
        dataTable.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        if (dataTable.getColumnModel().getColumnCount() > 0) {
            dataTable.getColumnModel().getColumn(0).setPreferredWidth(30);
            dataTable.getColumnModel().getColumn(1).setPreferredWidth(30);
            dataTable.getColumnModel().getColumn(2).setPreferredWidth(300);
            dataTable.getColumnModel().getColumn(3).setPreferredWidth(50);
            dataTable.getColumnModel().getColumn(4).setMinWidth(40);
            dataTable.getColumnModel().getColumn(4).setPreferredWidth(60);
            dataTable.getColumnModel().getColumn(5).setPreferredWidth(90);
            dataTable.getColumnModel().getColumn(6).setPreferredWidth(150);
            dataTable.getColumnModel().getColumn(9).setPreferredWidth(150);
            dataTable.getColumnModel().getColumn(10).setPreferredWidth(150);
            dataTable.getColumnModel().getColumn(11).setPreferredWidth(150);
        }

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 786, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 390, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout dataBasePanelLayout = new javax.swing.GroupLayout(dataBasePanel);
        dataBasePanel.setLayout(dataBasePanelLayout);
        dataBasePanelLayout.setHorizontalGroup(
            dataBasePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dataBasePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(dataBasePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        dataBasePanelLayout.setVerticalGroup(
            dataBasePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dataBasePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        Tab.addTab("Data Base", dataBasePanel);

        jLabel1.setText("Year");

        exportPDFButton.setText("Export PDF");
        exportPDFButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exportPDFButtonMouseClicked(evt);
            }
        });
        exportPDFButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exportPDFButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout filterPanelLayout = new javax.swing.GroupLayout(filterPanel);
        filterPanel.setLayout(filterPanelLayout);
        filterPanelLayout.setHorizontalGroup(
            filterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(filterPanelLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(filterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(filteredResultText)
                    .addGroup(filterPanelLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(filterYearButon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(93, 93, 93)
                        .addComponent(exportPDFButton, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(213, 481, Short.MAX_VALUE))
        );
        filterPanelLayout.setVerticalGroup(
            filterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(filterPanelLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(filterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(filterYearButon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(exportPDFButton, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(67, 67, 67)
                .addComponent(filteredResultText, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(275, Short.MAX_VALUE))
        );

        Tab.addTab("Export", filterPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Tab)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Tab))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void dataBaseDeleteEntryButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dataBaseDeleteEntryButtonActionPerformed
        DbOperations.deleteEntryFromDb(mouseClickedRow);
        fillTable();
    }//GEN-LAST:event_dataBaseDeleteEntryButtonActionPerformed

    private void exportPDFButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exportPDFButtonActionPerformed
    // TODO add your handling code here:
    }//GEN-LAST:event_exportPDFButtonActionPerformed

    private void dataBaseNewEntryButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dataBaseNewEntryButtonActionPerformed
        newEntry = new NewEntryFrame();
        
        //newEntry.clearFields();
        newEntry.setVisible(true);
        newEntry.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        newEntry = null;
        
    }//GEN-LAST:event_dataBaseNewEntryButtonActionPerformed

    private void dataTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dataTableMouseClicked
        
        
        
        //int index = dataTable.getSelectedRow();
        //TableModel model = dataTable.getModel();
        
        Point p = evt.getPoint();
        int row = dataTable.rowAtPoint(p);
        mouseClickedRow = dataTable.getValueAt(row, 0).toString();
        
        
        if (evt.getClickCount() == 2) {
            updateEntryFrame = new UpdateEntryFrame();
            updateEntryFrame.setVisible(true);
            updateEntryFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            //updateEntryFrame.clearFields();
            //updateEntryFrame.setVisible(true);
            try {
                updateEntryFrame.fillUpdateField(DbOperations.getSpecificEntry(mouseClickedRow));
            } catch (ParseException ex) {
                Logger.getLogger(MainProgramme.class.getName()).log(Level.SEVERE, null, ex);
            }
            //updateEntryFrame.clearFields();
            
            //System.out.println("Double clicked"+index+"  "+clickID);
        }
           
        
//        String nameInTable = model.getValueAt(index, 0).toString();
//        String firstName = model.getValueAt(index, 1).toString();
//        String lastName = model.getValueAt(index, 2).toString();
//        String age = model.getValueAt(index, 3).toString();
        /*
        updateEntryFrame.setVisible(true);
        updateEntryFrame.pack();
        updateEntryFrame.setLocationRelativeTo(null);
        updateEntryFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        updateEntryFrame.jTextField_Id.setText(id);
        updateEntryFrame.jTextField_FirstName.setText(firstName);
        updateEntryFrame.jTextField_LastName.setText(lastName);
        updateEntryFrame.jTextField_Age.setText(age);
        */
        
        updateEntryFrame =null;
    }//GEN-LAST:event_dataTableMouseClicked

    private void exportPDFButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exportPDFButtonMouseClicked
       
        PDFGenerator pdf = new PDFGenerator();
        JFileChooser chooser = new JFileChooser();
        try{
        chooser.showSaveDialog(null);
        File f = chooser.getSelectedFile();
        String filename = f.getAbsolutePath();
        
        filteredResultText.setText(filename);
        String year =Integer.toString(filterYearButon.getValue());
        pdf.generatePDF(DbOperations.getEntryFromDbForYear(year),filename);
        }
        catch(Exception e){
            System.out.println("Exception in Export");
        }
    }//GEN-LAST:event_exportPDFButtonMouseClicked
   
    
      
    public static void fillTable(){
        
        ArrayList<RopaMemberBean> list;
        list = DbOperations.getEntryFromDb();
        DefaultTableModel model = (DefaultTableModel) dataTable.getModel();
        model.setRowCount(0);
        for(int i = 0;i<list.size();i++){
            String member = "";
            String position = "";
            
            if(list.get(i).isMember() == true){
                member = "Member";}
            else{
                member = "No";
            }
            switch (list.get(i).getPosition()){
                case "0": position = "Senior Prefect";
                break;
                case "1": position = "Head Prefect";
                break;
                case "2": position = "DHP";
                break;
                case "3": position = "Prefect";
                break;
            }
            
            Object[] rowData = {list.get(i).getId(),list.get(i).getMembershipID(),list.get(i).getFullName(),list.get(i).getSeniorYear(),member,position,list.get(i).getAddress(),list.get(i).getMobile(),list.get(i).getResidence(),list.get(i).getJobTitle(),list.get(i).getWorkPlace(),list.get(i).getEmail(),list.get(i).getBirthDay(),list.get(i).getNic(),list.get(i).getOther()};
            
            model.addRow(rowData);
            
        }



        }
    
    public static void main(String args[]) {
        
        
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainProgramme().setVisible(true);
                
            }
        });
        

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane Tab;
    private javax.swing.JButton dataBaseDeleteEntryButton;
    private javax.swing.JButton dataBaseNewEntryButton;
    private javax.swing.JPanel dataBasePanel;
    private static javax.swing.JTable dataTable;
    private javax.swing.JButton exportPDFButton;
    private javax.swing.JPanel filterPanel;
    private com.toedter.calendar.JYearChooser filterYearButon;
    private javax.swing.JTextField filteredResultText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables


}
