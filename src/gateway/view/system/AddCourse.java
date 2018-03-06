/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gateway.view.system;

import gateway.controllers.CourseController;
import gateway.controllers.GradeController;
import gateway.controllers.SubjectController;
import gateway.controllers.TeacherController;
import gateway.model.Course;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author DELL
 */
public class AddCourse extends javax.swing.JPanel {

    DefaultTableModel dtmAdd;
    DefaultTableModel dtmCourss;
     // public Object getCourseID;
    /**
     * Creates new form Course
     */
    public AddCourse() throws SQLException, ClassNotFoundException {
        initComponents();
        loadComboBoxes();
        dtmAdd = (DefaultTableModel) tableAdd.getModel();
        //dtmCourss=(DefaultTableModel)tableCourses.getModel();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        comboGrade = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        comboSubject = new javax.swing.JComboBox();
        comboTeacherID = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        comboTeacherName = new javax.swing.JComboBox();
        btnAd = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        txtRate = new javax.swing.JTextField();
        btnRemove = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        txtCourseFee = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtCourseId = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtCourseDesc = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtTime = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        btnAddClass = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableAdd = new javax.swing.JTable();
        btnCancel2 = new javax.swing.JButton();
        btnViewCourses = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setText("Add Course");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 64, -1));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.add(comboGrade, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 240, 140, -1));

        jLabel6.setText("Teacher's Commision");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, -1, -1));

        jPanel2.add(comboSubject, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 190, 140, -1));

        comboTeacherID.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboTeacherIDItemStateChanged(evt);
            }
        });
        jPanel2.add(comboTeacherID, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, 140, -1));

        jLabel1.setText("Teacher ID");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 64, -1));

        jLabel3.setText("Subject");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 64, -1));

        jLabel4.setText("Grade");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 64, 20));

        jLabel2.setText("Teacher");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 64, -1));

        jPanel2.add(comboTeacherName, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, 140, -1));

        btnAd.setText("Add Course");
        btnAd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdActionPerformed(evt);
            }
        });
        jPanel2.add(btnAd, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 90, -1, -1));

        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });
        jPanel2.add(btnCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 240, -1, -1));

        txtRate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRateActionPerformed(evt);
            }
        });
        jPanel2.add(txtRate, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 320, 110, -1));

        btnRemove.setText("Remove Course");
        btnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveActionPerformed(evt);
            }
        });
        jPanel2.add(btnRemove, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 160, -1, -1));

        jLabel12.setText("Course fee");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, -1, -1));
        jPanel2.add(txtCourseFee, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 280, 140, -1));

        jLabel7.setText("Course ");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, -1));
        jPanel2.add(txtCourseId, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, 140, -1));

        jLabel8.setText("%");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 320, 20, 20));
        jPanel2.add(txtCourseDesc, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, 140, -1));

        jLabel9.setText("Course ID");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        jLabel10.setText("Time Duration");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, -1, -1));

        txtTime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTimeActionPerformed(evt);
            }
        });
        jPanel2.add(txtTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 360, 90, -1));

        jLabel11.setText("months");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 360, 40, 20));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 420, 400));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 450, 1080, 10));

        btnAddClass.setText("Add Class");
        btnAddClass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddClassActionPerformed(evt);
            }
        });
        jPanel1.add(btnAddClass, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 480, -1, -1));

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        jPanel1.add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 420, -1, -1));

        tableAdd.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Corse ID", "Course", "Teacher's ID", "Teacher", "Subject", "Grade", "Monthly Fee", "Teacher Comission", "Time Duration"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tableAdd);
        if (tableAdd.getColumnModel().getColumnCount() > 0) {
            tableAdd.getColumnModel().getColumn(0).setResizable(false);
            tableAdd.getColumnModel().getColumn(1).setResizable(false);
            tableAdd.getColumnModel().getColumn(2).setResizable(false);
            tableAdd.getColumnModel().getColumn(3).setResizable(false);
            tableAdd.getColumnModel().getColumn(4).setResizable(false);
            tableAdd.getColumnModel().getColumn(5).setResizable(false);
            tableAdd.getColumnModel().getColumn(6).setResizable(false);
            tableAdd.getColumnModel().getColumn(7).setResizable(false);
            tableAdd.getColumnModel().getColumn(8).setResizable(false);
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 60, 640, 340));

        btnCancel2.setText("Cancel");
        btnCancel2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancel2ActionPerformed(evt);
            }
        });
        jPanel1.add(btnCancel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 420, -1, -1));

        btnViewCourses.setText("View Courses");
        jPanel1.add(btnViewCourses, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 480, -1, -1));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 530));
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        try {
            txtCourseFee.setText("");
            txtCourseId.setText("");
            txtRate.setText("");
            txtCourseDesc.setText("");
            txtTime.setText("");

            loadComboBoxes();
        } catch (SQLException ex) {
            Logger.getLogger(AddCourse.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AddCourse.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnAddClassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddClassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAddClassActionPerformed

    private void btnAdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdActionPerformed
        String courseId = txtCourseId.getText();
        String Course = txtCourseDesc.getText();
        String grade = comboGrade.getSelectedItem().toString();
        String subject = comboSubject.getSelectedItem().toString();
        String teacherId = comboTeacherID.getSelectedItem().toString();
        String teacherName = comboTeacherName.getSelectedItem().toString();
        int fee = Integer.parseInt(txtCourseFee.getText());
        int Rate = Integer.parseInt(txtRate.getText());
        int time = Integer.parseInt(txtTime.getText());
        Object[] rowData = {courseId, Course, teacherId, teacherName, subject, grade, fee, Rate, time};
        dtmAdd.addRow(rowData);

    }//GEN-LAST:event_btnAdActionPerformed

    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed

        dtmAdd.removeRow(tableAdd.getSelectedRow());

    }//GEN-LAST:event_btnRemoveActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed

        ArrayList<Course> courses = new ArrayList<>();

        try {
            for (int i = 0; i < dtmAdd.getRowCount(); i++) {

                String courseId = dtmAdd.getValueAt(i, 0).toString();
                String Course = dtmAdd.getValueAt(i, 1).toString();
                String teacherId = dtmAdd.getValueAt(i, 2).toString();
                String subject = SubjectController.getSubjectId(dtmAdd.getValueAt(i, 4).toString());
                String grade = GradeController.getGradeId(dtmAdd.getValueAt(i, 5).toString());
                int fee = Integer.parseInt(dtmAdd.getValueAt(i, 6).toString());
                int Rate = Integer.parseInt(dtmAdd.getValueAt(i, 7).toString());
                int time = Integer.parseInt(dtmAdd.getValueAt(i, 8).toString());
                Course course = new Course(courseId, Course, teacherId, subject, grade, fee, Rate, time);
                courses.add(course);

            }
            CourseController.addCourse(courses);
            tableAdd.removeAll();
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(AddCourse.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_btnSaveActionPerformed

    private void txtRateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRateActionPerformed

    private void btnCancel2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancel2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCancel2ActionPerformed

    private void comboTeacherIDItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboTeacherIDItemStateChanged

    }//GEN-LAST:event_comboTeacherIDItemStateChanged

    private void txtTimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTimeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTimeActionPerformed
    private void loadComboBoxes() throws SQLException, ClassNotFoundException {
        teacherID();
        teacherName();
        subject();
        grade();

    }

    private void teacherID() throws SQLException, ClassNotFoundException {
        ArrayList<String[]> teacherIDs = TeacherController.getTeacherID();
        for (String[] teacherID : teacherIDs) {
            comboTeacherID.addItem(teacherID);

        }
    }

    private void teacherName() throws SQLException, ClassNotFoundException {
        ArrayList<String[]> teacherNames = TeacherController.getTeacherName();
        for (String[] teacherName : teacherNames) {
            comboTeacherName.addItem(teacherName);

        }
    }

    private void subject() throws SQLException, ClassNotFoundException {
        ArrayList<String[]> teacherIDs = SubjectController.getSubject();
        for (String[] teacherID : teacherIDs) {
            comboTeacherID.addItem(teacherID);
            //comboTeacherID2.addItem(teacherID);
        }
    }

    private void grade() throws SQLException, ClassNotFoundException {
        ArrayList<String[]> teacherIDs = GradeController.getGrade();
        for (String[] teacherID : teacherIDs) {
            comboTeacherID.addItem(teacherID);
            // comboTeacherID2.addItem(teacherID);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAd;
    private javax.swing.JButton btnAddClass;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnCancel2;
    private javax.swing.JButton btnRemove;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnViewCourses;
    private javax.swing.JComboBox comboGrade;
    private javax.swing.JComboBox comboSubject;
    private javax.swing.JComboBox comboTeacherID;
    private javax.swing.JComboBox comboTeacherName;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable tableAdd;
    private javax.swing.JTextField txtCourseDesc;
    private javax.swing.JTextField txtCourseFee;
    private javax.swing.JTextField txtCourseId;
    private javax.swing.JTextField txtRate;
    private javax.swing.JTextField txtTime;
    // End of variables declaration//GEN-END:variables
}