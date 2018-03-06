/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gateway.view.studentaccount;

import gateway.controllers.ClassController;
import gateway.controllers.CourseController;
import gateway.controllers.StudentCoursesController;
import gateway.controllers.TimetableController;
import gateway.libraries.CurInstance;
import gateway.model.StudentCourses;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author DELL
 */
public class RegisterToNew extends javax.swing.JPanel {

    private String GradeId;
    private String studentId;
    DefaultTableModel dtmcourses;
    DefaultTableModel dtmclasses;
    DefaultTableModel dtmSelectedClasses;

    /**
     * Creates new form RegisterToNewCourrse
     */
    public RegisterToNew(String GradeId, String StudentId) {
        initComponents();
        this.GradeId = GradeId;
        this.studentId = StudentId;
        dtmcourses = (DefaultTableModel) tablCcourses.getModel();
        dtmclasses = (DefaultTableModel) tableClasses.getModel();
        dtmSelectedClasses = (DefaultTableModel) tableSelectedClasses.getModel();
        loadCourseTable();

    }

    private void loadCourseTable() {
        try {
            ArrayList<String[]> rowDatas = CourseController.getCourseForGrade(GradeId, studentId);
            for (String[] rowData : rowDatas) {
                dtmcourses.addRow(rowData);
            }
        } catch (SQLException ex) {
            Logger.getLogger(RegisterToNew.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(RegisterToNew.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablCcourses = new javax.swing.JTable();
        buttonRegisterClasses = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tableSelectedClasses = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        tableClasses = new javax.swing.JTable();
        buttonShowClasses = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        buttonRegisterClasses1 = new javax.swing.JButton();

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable2);

        setOpaque(false);

        jPanel1.setOpaque(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 153, 153));
        jLabel2.setText("REGISTER TO NEW COURSE");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 520, 30));

        tablCcourses.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Subject", "Teacher", "Course", "Monthly Fee"
            }
        ));
        jScrollPane2.setViewportView(tablCcourses);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 680, 100));

        buttonRegisterClasses.setText("Add Class");
        buttonRegisterClasses.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonRegisterClassesMouseClicked(evt);
            }
        });
        jPanel1.add(buttonRegisterClasses, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 200, 130, -1));

        tableSelectedClasses.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Course", "Class", "Day", "Time"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tableSelectedClasses);
        if (tableSelectedClasses.getColumnModel().getColumnCount() > 0) {
            tableSelectedClasses.getColumnModel().getColumn(0).setResizable(false);
            tableSelectedClasses.getColumnModel().getColumn(1).setResizable(false);
            tableSelectedClasses.getColumnModel().getColumn(2).setResizable(false);
            tableSelectedClasses.getColumnModel().getColumn(3).setResizable(false);
        }

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 680, 80));

        tableClasses.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Class", "Day", "Time"
            }
        ));
        jScrollPane4.setViewportView(tableClasses);
        if (tableClasses.getColumnModel().getColumnCount() > 0) {
            tableClasses.getColumnModel().getColumn(0).setResizable(false);
            tableClasses.getColumnModel().getColumn(1).setResizable(false);
            tableClasses.getColumnModel().getColumn(2).setResizable(false);
        }

        jPanel1.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 680, 80));

        buttonShowClasses.setText("Show Classes For");
        buttonShowClasses.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonShowClassesMouseClicked(evt);
            }
        });
        jPanel1.add(buttonShowClasses, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 110, 130, -1));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 830, 10));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 830, 10));

        buttonRegisterClasses1.setText("Register for courses");
        buttonRegisterClasses1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonRegisterClasses1MouseClicked(evt);
            }
        });
        jPanel1.add(buttonRegisterClasses1, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 280, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void buttonShowClassesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonShowClassesMouseClicked
        if(tableClasses.getRowCount() > 0){
            for(int i=0; i <= tableClasses.getRowCount(); i++){
                System.out.println("Count " +tableClasses.getRowCount());
                dtmclasses.removeRow(0);
            }
        }
        try {
            
            
            ArrayList<String[]> rowDatas = TimetableController.getClassTimes(CourseController.getCourseId(dtmcourses.getValueAt(tablCcourses.getSelectedRow(), 2).toString()));
            for (String[] rowdata : rowDatas) {
                dtmclasses.addRow(rowdata);
            }
        } catch (SQLException ex) {
            Logger.getLogger(RegisterToNew.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(RegisterToNew.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_buttonShowClassesMouseClicked

    private void buttonRegisterClassesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonRegisterClassesMouseClicked
        try {
            String courseDesc = ClassController.getCourseIdFromClassId(ClassController.getClassId(dtmclasses.getValueAt(tableClasses.getSelectedRow(), 0).toString()));
            System.out.println(courseDesc);
            boolean available = false;
            for (int i = 0; i < dtmSelectedClasses.getRowCount(); i++) {
                String CourseSelected = ClassController.getCourseIdFromClassId(ClassController.getClassId(tableSelectedClasses.getValueAt(i, 1).toString()));
                System.out.println(CourseSelected);
                if (courseDesc.equals(CourseSelected)) {
                    available = true;
                    break;
                } else {
                    available = false;
                    System.out.println("not this course");
                }
            }
            if (!available) {
                String[] row = new String[]{ClassController.getCourseIdFromClassId(ClassController.getClassId(dtmclasses.getValueAt(tableClasses.getSelectedRow(), 0).toString())), dtmclasses.getValueAt(tableClasses.getSelectedRow(), 0).toString(), dtmclasses.getValueAt(tableClasses.getSelectedRow(), 1).toString(), dtmclasses.getValueAt(tableClasses.getSelectedRow(), 2).toString()};
                dtmSelectedClasses.addRow(row);
                System.out.println("...............................................................");
            } else {
                JOptionPane.showMessageDialog(null, "Class for this course is already selected");
            }
            
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(RegisterToNew.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_buttonRegisterClassesMouseClicked

    private void buttonRegisterClasses1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonRegisterClasses1MouseClicked
        try {
            ArrayList<StudentCourses> StudentCourses = new ArrayList<>();
            for (int i = 0; i < dtmSelectedClasses.getRowCount(); i++) {
                StudentCourses studentCourse = new StudentCourses(studentId, dtmSelectedClasses.getValueAt(i, 0).toString(), ClassController.getClassId(dtmSelectedClasses.getValueAt(i, 1).toString()), CurInstance.Date());
                StudentCourses.add(studentCourse);
            }
            int res = StudentCoursesController.addStudentCourse(StudentCourses);
            if (res == dtmSelectedClasses.getRowCount()) {
                JOptionPane.showMessageDialog(null, "SuccesfullyAdded");
            } else {
                JOptionPane.showMessageDialog(null, "not Added");
            }
        } catch (SQLException ex) {
            Logger.getLogger(RegisterToNew.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(RegisterToNew.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_buttonRegisterClasses1MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonRegisterClasses;
    private javax.swing.JButton buttonRegisterClasses1;
    private javax.swing.JButton buttonShowClasses;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable tablCcourses;
    private javax.swing.JTable tableClasses;
    private javax.swing.JTable tableSelectedClasses;
    // End of variables declaration//GEN-END:variables

}