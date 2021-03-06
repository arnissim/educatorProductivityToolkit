package com.arcologydesigns.Views;

import com.arcologydesigns.DataStructures.BST;
import com.arcologydesigns.GoogleIntegration.SpreadsheetIntegration;
import com.arcologydesigns.ept.schoolItems.DataContainer;
import com.arcologydesigns.ept.users.Student;

import javax.swing.*;
import javax.swing.border.TitledBorder;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.net.URL;

import static java.awt.event.ActionEvent.*;

/**
 * EducatorMainForm created by Borislav S. on 7/11/2015 @ 9:57 PM.
 */
public class EducatorMainForm extends JFrame {
   private char userType;
   private ImageIcon img;
   private JPanel educatorMainPanel;
   private JLabel userIdLabel;
   private JButton importDataButton;
   private JPanel mainContentPanel;
   private JPanel userIdPanel;
   private JLabel helpText1;
   private JLabel helpText2;
   private JTextField assignmentsTextField;
   private JTextField classesTextField;
   private JTextField studentsTextField;
   private JTextField instructorsTextField;
   private JLabel helpText3;
   private JLabel instructorsLabel;
   private JLabel studentsLabel;
   private JLabel classesLabel;
   private JLabel assignmentsLabel;
   private String imgUrl;
   private JPopupMenu pmenu;
   private boolean isDataImported;

   {
// GUI initializer generated by IntelliJ IDEA GUI Designer
// >>> IMPORTANT!! <<<
// DO NOT EDIT OR ADD ANY CODE HERE!
      $$$setupUI$$$();
   }

   /**
    * Method generated by IntelliJ IDEA GUI Designer
    * >>> IMPORTANT!! <<<
    * DO NOT edit this method OR call it in your code!
    *
    * @noinspection ALL
    */
   private void $$$setupUI$$$() {
      educatorMainPanel = new JPanel();
      educatorMainPanel.setLayout(new com.intellij.uiDesigner.core.GridLayoutManager(6, 4, new Insets(0, 0, 0, 0), -1, -1));
      educatorMainPanel.setBackground(new Color(-14596236));
      educatorMainPanel.setEnabled(true);
      final com.intellij.uiDesigner.core.Spacer spacer1 = new com.intellij.uiDesigner.core.Spacer();
      educatorMainPanel.add(spacer1, new com.intellij.uiDesigner.core.GridConstraints(0, 1, 1, 2, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, 1, null, null, null, 0, false));
      final com.intellij.uiDesigner.core.Spacer spacer2 = new com.intellij.uiDesigner.core.Spacer();
      educatorMainPanel.add(spacer2, new com.intellij.uiDesigner.core.GridConstraints(0, 0, 5, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_VERTICAL, 1, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, new Dimension(25, -1), new Dimension(25, -1), null, 0, false));
      final com.intellij.uiDesigner.core.Spacer spacer3 = new com.intellij.uiDesigner.core.Spacer();
      educatorMainPanel.add(spacer3, new com.intellij.uiDesigner.core.GridConstraints(5, 1, 1, 2, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, 1, null, null, null, 0, false));
      final com.intellij.uiDesigner.core.Spacer spacer4 = new com.intellij.uiDesigner.core.Spacer();
      educatorMainPanel.add(spacer4, new com.intellij.uiDesigner.core.GridConstraints(0, 3, 5, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_VERTICAL, 1, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, new Dimension(25, -1), new Dimension(25, -1), null, 0, false));
      mainContentPanel = new JPanel();
      mainContentPanel.setLayout(new com.intellij.uiDesigner.core.GridLayoutManager(5, 4, new Insets(0, 0, 0, 0), -1, -1));
      mainContentPanel.setBackground(new Color(-14596236));
      mainContentPanel.setEnabled(true);
      educatorMainPanel.add(mainContentPanel, new com.intellij.uiDesigner.core.GridConstraints(4, 1, 1, 2, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_BOTH, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, null, new Dimension(-1, 1100), null, 0, false));
      instructorsLabel = new JLabel();
      instructorsLabel.setFont(new Font(instructorsLabel.getFont().getName(), instructorsLabel.getFont().getStyle(), 18));
      instructorsLabel.setForeground(new Color(-1));
      instructorsLabel.setText("Instructors URL: ");
      instructorsLabel.setToolTipText("URL pointing to Instructors data sheet");
      mainContentPanel.add(instructorsLabel, new com.intellij.uiDesigner.core.GridConstraints(0, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_SOUTHEAST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
      studentsLabel = new JLabel();
      studentsLabel.setFont(new Font(studentsLabel.getFont().getName(), studentsLabel.getFont().getStyle(), 18));
      studentsLabel.setForeground(new Color(-1));
      studentsLabel.setText("Students URL: ");
      studentsLabel.setToolTipText("URL pointing to Students data sheet");
      mainContentPanel.add(studentsLabel, new com.intellij.uiDesigner.core.GridConstraints(1, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_NORTHEAST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
      classesLabel = new JLabel();
      classesLabel.setFont(new Font(classesLabel.getFont().getName(), classesLabel.getFont().getStyle(), 18));
      classesLabel.setForeground(new Color(-1));
      classesLabel.setText("Classes URL: ");
      classesLabel.setToolTipText("URL pointing to Classes data sheet");
      mainContentPanel.add(classesLabel, new com.intellij.uiDesigner.core.GridConstraints(2, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_NORTHEAST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
      assignmentsLabel = new JLabel();
      assignmentsLabel.setFont(new Font(assignmentsLabel.getFont().getName(), assignmentsLabel.getFont().getStyle(), 18));
      assignmentsLabel.setForeground(new Color(-1));
      assignmentsLabel.setText("Assignments URL:");
      assignmentsLabel.setToolTipText("URL pointing to Assignments data sheet");
      mainContentPanel.add(assignmentsLabel, new com.intellij.uiDesigner.core.GridConstraints(3, 0, 2, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_NORTHEAST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
      final com.intellij.uiDesigner.core.Spacer spacer5 = new com.intellij.uiDesigner.core.Spacer();
      mainContentPanel.add(spacer5, new com.intellij.uiDesigner.core.GridConstraints(4, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_VERTICAL, 1, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, null, null, null, 0, false));
      importDataButton = new JButton();
      importDataButton.setBackground(new Color(-44282));
      importDataButton.setFont(new Font(importDataButton.getFont().getName(), Font.BOLD, 20));
      importDataButton.setForeground(new Color(-1));
      importDataButton.setHorizontalAlignment(2);
      importDataButton.setText("Import Class Data ");
      mainContentPanel.add(importDataButton, new com.intellij.uiDesigner.core.GridConstraints(3, 2, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_NORTHWEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
      final com.intellij.uiDesigner.core.Spacer spacer6 = new com.intellij.uiDesigner.core.Spacer();
      mainContentPanel.add(spacer6, new com.intellij.uiDesigner.core.GridConstraints(3, 3, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, 1, new Dimension(500, -1), new Dimension(500, -1), null, 0, false));
      instructorsTextField = new JTextField();
      instructorsTextField.setText("https://docs.google.com/spreadsheets/d/1uJVvxDvBN-pvjwuSWcTjdmX9DePW0a3y1JByMMIzpIM/pub?gid=390144314&single=true&output=csv");
      instructorsTextField.setToolTipText("URL pointing to Instructors data sheet");
      mainContentPanel.add(instructorsTextField, new com.intellij.uiDesigner.core.GridConstraints(0, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_SOUTHWEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(650, -1), null, 0, false));
      studentsTextField = new JTextField();
      studentsTextField.setText("https://docs.google.com/spreadsheets/d/1uJVvxDvBN-pvjwuSWcTjdmX9DePW0a3y1JByMMIzpIM/pub?gid=678753428&single=true&output=csv");
      studentsTextField.setToolTipText("URL pointing to Students data sheet");
      mainContentPanel.add(studentsTextField, new com.intellij.uiDesigner.core.GridConstraints(1, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_NORTHWEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(650, -1), null, 0, false));
      classesTextField = new JTextField();
      classesTextField.setText("https://docs.google.com/spreadsheets/d/1uJVvxDvBN-pvjwuSWcTjdmX9DePW0a3y1JByMMIzpIM/pub?gid=2084154255&single=true&output=csv");
      classesTextField.setToolTipText("URL pointing to Classes data sheet");
      mainContentPanel.add(classesTextField, new com.intellij.uiDesigner.core.GridConstraints(2, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_NORTHWEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(650, -1), null, 0, false));
      assignmentsTextField = new JTextField();
      assignmentsTextField.setText("https://docs.google.com/spreadsheets/d/1uJVvxDvBN-pvjwuSWcTjdmX9DePW0a3y1JByMMIzpIM/pub?gid=851848807&single=true&output=csv");
      assignmentsTextField.setToolTipText("URL pointing to Assignments data sheet");
      mainContentPanel.add(assignmentsTextField, new com.intellij.uiDesigner.core.GridConstraints(3, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_NORTHWEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(650, -1), null, 0, false));
      final JPanel panel1 = new JPanel();
      panel1.setLayout(new com.intellij.uiDesigner.core.GridLayoutManager(3, 1, new Insets(0, 0, 0, 0), -1, -1));
      panel1.setBackground(new Color(-14596236));
      educatorMainPanel.add(panel1, new com.intellij.uiDesigner.core.GridConstraints(1, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_BOTH, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
      helpText1 = new JLabel();
      helpText1.setFont(new Font(helpText1.getFont().getName(), helpText1.getFont().getStyle(), 12));
      helpText1.setForeground(new Color(-1));
      helpText1.setText("- If using online sources, you must use Google Spreadsheet and set visibility to public. ");
      panel1.add(helpText1, new com.intellij.uiDesigner.core.GridConstraints(0, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
      helpText2 = new JLabel();
      helpText2.setFont(new Font(helpText2.getFont().getName(), helpText2.getFont().getStyle(), 12));
      helpText2.setForeground(new Color(-1));
      helpText2.setText("- The spreadsheet format must be the same as outlined in the README. ");
      panel1.add(helpText2, new com.intellij.uiDesigner.core.GridConstraints(1, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
      helpText3 = new JLabel();
      helpText3.setFont(new Font(helpText3.getFont().getName(), helpText3.getFont().getStyle(), 12));
      helpText3.setForeground(new Color(-1));
      helpText3.setText("- The values must be in a comma separated format (i.e., CSV file)");
      panel1.add(helpText3, new com.intellij.uiDesigner.core.GridConstraints(2, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
      userIdPanel = new JPanel();
      userIdPanel.setLayout(new com.intellij.uiDesigner.core.GridLayoutManager(1, 1, new Insets(0, 0, 0, 0), -1, -1));
      userIdPanel.setBackground(new Color(-14596236));
      userIdPanel.setEnabled(true);
      userIdPanel.setForeground(new Color(-1));
      educatorMainPanel.add(userIdPanel, new com.intellij.uiDesigner.core.GridConstraints(1, 2, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_NORTHEAST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, new Dimension(100, 50), new Dimension(100, 50), null, 0, false));
      userIdPanel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "USER ID:", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.ABOVE_TOP, new Font(userIdPanel.getFont().getName(), Font.BOLD, 14), new Color(-1)));
      userIdLabel = new JLabel();
      userIdLabel.setFont(new Font(userIdLabel.getFont().getName(), Font.BOLD, 14));
      userIdLabel.setForeground(new Color(-1));
      userIdLabel.setText("USER");
      userIdPanel.add(userIdLabel, new com.intellij.uiDesigner.core.GridConstraints(0, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 2, false));
      final com.intellij.uiDesigner.core.Spacer spacer7 = new com.intellij.uiDesigner.core.Spacer();
      educatorMainPanel.add(spacer7, new com.intellij.uiDesigner.core.GridConstraints(2, 1, 2, 2, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_VERTICAL, 1, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, new Dimension(-1, 150), new Dimension(-1, 150), null, 0, false));
   }

   /**
    * @noinspection ALL
    */
   public JComponent $$$getRootComponent$$$() {
      return educatorMainPanel;
   }

   /**
    * MenuItemAction class serves to create a menu item with a label, a visual icon, and a mnemonic.
    * Mnemonics offer a way to use the keyboard to navigate the menu hierarchy, increasing the accessibility of programs.
    */
   private class MenuItemAction extends AbstractAction {

      public MenuItemAction(String text, Icon icon, Integer mnemonic) {
         super(text);

         putValue(SMALL_ICON, icon);
         putValue(MNEMONIC_KEY, mnemonic);
      }

      @Override
      public void actionPerformed(ActionEvent e) {
         System.out.println(e.getActionCommand());
      }
   }

   public EducatorMainForm(char userType) {
      educatorMainPanel.setSize(300, 300);
      //setLocationRelativeTo(null);

      switch (userType) {
         case 'S':
            imgUrl = "images/educator_logo_student.jpg";
            this.userType = userType;
            break;
         case 'I':
            imgUrl = "images/educator_logo_instructor.jpg";
            this.userType = userType;
            break;
         case 'G':
            imgUrl = "images/educator_logo_guest.jpg";
            this.userType = userType;
            break;
         default:
            imgUrl = "images/educator_logo_guest.jpg";
            System.out.print("Invalid user type.");
            break;
      }

      createAndShowGUI();
      createPopupMenu();
      createMenuBar();


      importDataButton.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent event) {
            try {
               SpreadsheetIntegration loadClassData = new SpreadsheetIntegration(getClassesTextField(), 'C');
               SpreadsheetIntegration loadAssignmentData = new SpreadsheetIntegration(getAssignmentsTextField(), 'A');
               SpreadsheetIntegration loadStudentData = new SpreadsheetIntegration(getStudentsTextField(), 'S');
               SpreadsheetIntegration loadInstructorData = new SpreadsheetIntegration(getInstructorsTextField(), 'I');
               isDataImported = true;
            } catch (IOException e) {
               e.printStackTrace();
            }
         }
      });
   }

   private void createAndShowGUI() {

      // Set title and default close operation
      setTitle("Educator Productivity Toolkit - EPT v0.1");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


      // Set a background for JFrame
      ClassLoader cldr = this.getClass().getClassLoader();

      URL imageURL = cldr.getResource(imgUrl);
      if (imageURL != null) {
         img = new ImageIcon(imageURL);
      }

      setContentPane(new JLabel(img));

      // Set some layout, say FlowLayout
      setLayout(new FlowLayout());

      // Set the background, black with 125 as alpha value. This is less transparent
      if (educatorMainPanel != null) {

         // Set some size to the panels
         educatorMainPanel.setPreferredSize(new Dimension(1920, 600));
         //p2.setPreferredSize(new Dimension(250,150));

         // Add the panels to the JFrame
         add(educatorMainPanel);
      }

      // Set the size of the JFrame and make it visible
      setExtendedState(JFrame.MAXIMIZED_BOTH);  // set to full screen
      setVisible(true);
   } // end createAndShowGUI()

   /**
    * This method creates a right-click context menu for the application.
    */
   private void createPopupMenu() {

      pmenu = new JPopupMenu();

      JMenuItem maxMi = new JMenuItem("Maximize");
      maxMi.setOpaque(true);

      maxMi.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
            if (getExtendedState() != JFrame.MAXIMIZED_BOTH) {
               setExtendedState(JFrame.MAXIMIZED_BOTH);
            }
         }
      });

      pmenu.add(maxMi);

      JMenuItem quitMi = new JMenuItem("Quit");
      quitMi.setOpaque(true);
      quitMi.setBackground(Color.CYAN);
      quitMi.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
            System.exit(0);
         }
      });

      /**
       * Lambda expression alternative to above function:
       * quitMi.addActionListener((e) -> { System.exit(0); });
       * Only available in Java 8
       * */

      pmenu.add(quitMi);

      /**
       * Listen for a right-click event (Button3) and get the coordinates to display the popup menu
       * */
      addMouseListener(new MouseAdapter() {
         @Override
         public void mouseReleased(MouseEvent e) {
            if (e.getButton() == MouseEvent.BUTTON3) {
               pmenu.show(e.getComponent(), e.getX(), e.getY());
            }
         }
      });
   }

   private void createMenuBar() {
      //Icons for File menu
      Icon iconNew = UIManager.getIcon("FileChooser.newFolderIcon");
      Icon iconSave = UIManager.getIcon("FileView.floppyDriveIcon");
      Icon iconOpen = UIManager.getIcon("Tree.timeFactor");
      Icon iconExit = UIManager.getIcon("InternalFrame.closeIcon");

      //Icons for Options menu item in Tools menu
      Icon iconOptions = UIManager.getIcon("FileChooser.detailsViewIcon");

      //Icons for documentation menu item in Help menu
      Icon iconHelp = UIManager.getIcon("OptionPane.questionIcon");

      //create a menu bar for the application
      JMenuBar menubar = new JMenuBar();

      JMenu fileMenu = new JMenu("File");
      fileMenu.setMnemonic(KeyEvent.VK_F);
      //Menu items for File menu
      JMenuItem newMi = new JMenuItem(new MenuItemAction("New", iconNew, KeyEvent.VK_N));
      JMenuItem openMi = new JMenuItem(new MenuItemAction("Open", iconOpen, KeyEvent.VK_O));
      final JMenuItem saveMi = new JMenuItem(new MenuItemAction("Save", iconSave, KeyEvent.VK_S));
      JMenuItem exitMi = new JMenuItem("Exit", iconExit);

      exitMi.setMnemonic(KeyEvent.VK_E);
      exitMi.setToolTipText("Exit application");
      exitMi.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_W, CTRL_MASK));

      exitMi.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent event) {
            System.exit(0);
         }
      });

      fileMenu.add(newMi);
      fileMenu.add(openMi);
      fileMenu.add(saveMi);
      fileMenu.addSeparator();
      fileMenu.add(exitMi);

      JMenu toolsMenu = new JMenu("Tools");
      //Menu items for Tools menu
      JMenuItem optionsMi = new JMenuItem(new MenuItemAction("Options", iconOptions, KeyEvent.VK_O));
      JMenuItem nimbusMi = new JMenuItem(new MenuItemAction("Nimbus LaF", null, null));
      JMenuItem metalMi = new JMenuItem(new MenuItemAction("Metal LaF", null, null));
      JMenuItem systemMi = new JMenuItem(new MenuItemAction("System LaF", null, null));

      toolsMenu.add(optionsMi);
      toolsMenu.add(nimbusMi);
      toolsMenu.add(metalMi);
      toolsMenu.add(systemMi);

      JMenu helpMenu = new JMenu("Help");
      //Menu items for Help menu
      JMenuItem documentationMi = new JMenuItem(new MenuItemAction("Documentation", iconHelp, KeyEvent.VK_H));
      documentationMi.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
            try {
               Desktop.getDesktop().browse(new URL("https://github.com/62696e617279/educatorProductivityToolkit/blob/master/README.md").toURI());
            } catch (Exception err) {
               err.printStackTrace();
               JOptionPane.showMessageDialog(getParent(),
                       "Something went wrong and the README page cannot display!\n" +
                               "Please navigate to https://github.com/62696e617279/educatorProductivityToolkit/blob/master/README.md manually.",
                       "Cannot open browser!",
                       JOptionPane.ERROR_MESSAGE);
            }
         }
      });

      JMenuItem aboutMi = new JMenuItem("About");
      aboutMi.setMnemonic(KeyEvent.VK_A);
      aboutMi.setToolTipText("Learn about the EPT application and access GitHub URL");
      aboutMi.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A, CTRL_MASK));
      aboutMi.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
            try {
               Desktop.getDesktop().browse(new URL("https://62696e617279.github.io/educatorProductivityToolkit/").toURI());
            } catch (Exception err) {
               err.printStackTrace();
               JOptionPane.showMessageDialog(getParent(),
                       "Something went wrong and the project page cannot display!\n" +
                               "Please navigate to https://62696e617279.github.io/educatorProductivityToolkit manually.",
                       "Cannot open browser!",
                       JOptionPane.ERROR_MESSAGE);
            }
         }
      });
      JCheckBoxMenuItem sbarMi = new JCheckBoxMenuItem("Show instructions");
      sbarMi.setMnemonic(KeyEvent.VK_S);
      sbarMi.setDisplayedMnemonicIndex(5);
      sbarMi.setSelected(true);

      helpMenu.add(sbarMi);
      helpMenu.add(documentationMi);
      helpMenu.add(aboutMi);

      JMenu information = new JMenu("Information/Details");
      JMenuItem currentUserInfo = new JMenuItem("Current User Info");
      currentUserInfo.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
            if (userType == 'S') {
               if (isDataImported) {
                  StudentInfoForm studentInfoForm = new StudentInfoForm();
                  studentInfoForm.setStudentID(userIdLabel.getText());

                  BST<Student> studentBST = DataContainer.DataContainerInst.getStudentsData();
                  Student tmpStudent = new Student();
                  tmpStudent.setUserID(userIdLabel.getText());
                  Student s = studentBST.breadthFirstSearch(tmpStudent);
                  System.out.print(s.getUserID());

                  studentInfoForm.setStudentAddress(s.getAddress());
                  studentInfoForm.setStudentEmail(s.getEmail());
                  studentInfoForm.setStudentNameLabel(s.getUserName());
                  studentInfoForm.setStudentPhone(s.getPhone());
               } else {
                  JOptionPane.showMessageDialog(getParent(),
                          "You must first import class data!\n" +
                                  "Please try again after importing data using the main page import button.",
                          "Cannot display information!!",
                          JOptionPane.WARNING_MESSAGE);
               }
            } else if (userType == 'I') {
               if (isDataImported) {
                  InstructorInfoForm instructorInfoForm = new InstructorInfoForm();
               } else {
                  JOptionPane.showMessageDialog(getParent(),
                          "You must first import class data!\n" +
                                  "Please try again after importing data using the main page import button.",
                          "Cannot display information!!",
                          JOptionPane.WARNING_MESSAGE);
               }

            }
         }
      });
      information.add(currentUserInfo);

      JMenu analytics = new JMenu("Analytics");
      JMenuItem runAnalytics = new JMenuItem("Run Analytics");
      runAnalytics.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
            if (userType != 'I') {
               JOptionPane.showMessageDialog(getParent(),
                       "You do not appear to be an instructor!\n" +
                               "Please authenticate using an instructor account and try again.",
                       "Cannot run analytics - invalid user type!",
                       JOptionPane.WARNING_MESSAGE);
            } else {
               if (isDataImported) {
                  InstructorAnalyticsReportForm.main(null);
               } else {
                  JOptionPane.showMessageDialog(getParent(),
                          "You must first import class data!\n" +
                                  "Please try again after importing data using the main page import button.",
                          "Cannot display information!!",
                          JOptionPane.WARNING_MESSAGE);
               }
            }
         }
      });
      analytics.add(runAnalytics);

      JMenu viewMenu = new JMenu("View");
      viewMenu.setMnemonic(KeyEvent.VK_V);

      optionsMi.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent event) {
            OptionsForm.main();
         }
      });

      nimbusMi.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent event) {
            OptionsForm.changeLaf(EducatorMainForm.this, "nimbus");
         }
      });

      metalMi.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent event) {
            OptionsForm.changeLaf(EducatorMainForm.this, "metal");
         }
      });

      systemMi.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent event) {
            OptionsForm.changeLaf(EducatorMainForm.this, "system");
         }
      });

      sbarMi.addItemListener(new ItemListener() {
         @Override
         public void itemStateChanged(ItemEvent e) {
            if (e.getStateChange() == ItemEvent.DESELECTED) {
               helpText1.setVisible(false);
               helpText2.setVisible(false);
               helpText3.setVisible(false);
            } else {
               helpText1.setVisible(true);
               helpText2.setVisible(true);
               helpText3.setVisible(true);
            }
         }
      });

      //add menu items to the menu bar and set the menu
      menubar.add(fileMenu);
      menubar.add(viewMenu);
      menubar.add(toolsMenu);
      menubar.add(information);
      menubar.add(analytics);
      menubar.add(Box.createHorizontalGlue());
      menubar.add(helpMenu);

      setJMenuBar(menubar);
   }

   public void setUserIdLabel(String _userIdLabel) {
      this.userIdLabel.setText(_userIdLabel);
   }

   public void setImageURL(String _imageURL) {
      imgUrl = _imageURL;
   }

   public String getAssignmentsTextField() {
      return assignmentsTextField.getText();
   }

   public String getClassesTextField() {
      return classesTextField.getText();
   }

   public String getStudentsTextField() {
      return studentsTextField.getText();
   }

   public String getInstructorsTextField() {
      return instructorsTextField.getText();
   }
} // end class EducatorMainForm
