import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

public class Cafe extends JFrame {

    public Cafe() {
        initComponents();
    }

    public static void main(String[] args) {
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException
                | UnsupportedLookAndFeelException ex) {
            Logger.getLogger(Cafe.class.getName()).log(Level.SEVERE, null, ex);
        }
        EventQueue.invokeLater(() -> new Cafe().setVisible(true));
    }

    private void initComponents() {
        JPanel NamePanel = new JPanel();
        JLabel jLabel1 = new JLabel();
        JLabel jLabel2 = new JLabel();
        JPanel DrinksPanel = new JPanel();
        TeaCB = new JCheckBox();
        CoffeeCB = new JCheckBox();
        CappuccinoCB = new JCheckBox();
        ColdCoffeeCB = new JCheckBox();
        IcedTeaCB = new JCheckBox();
        TeaJTF = new JTextField();
        CoffeeJTF = new JTextField();
        CappuccinoJTF = new JTextField();
        ColdCoffeeJTF = new JTextField();
        IcedTeaJTF = new JTextField();
        JLabel jLabel9 = new JLabel();
        JLabel jLabel10 = new JLabel();
        JLabel jLabel11 = new JLabel();
        JPanel TaxPanel = new JPanel();
        JLabel jLabel6 = new JLabel();
        JLabel jLabel7 = new JLabel();
        JLabel jLabel8 = new JLabel();
        TaxJTF = new JTextField();
        SubTotalJTF = new JTextField();
        TotalJTF = new JTextField();
        JPanel CostPanel = new JPanel();
        JLabel jLabel3 = new JLabel();
        JLabel jLabel4 = new JLabel();
        JLabel jLabel5 = new JLabel();
        TotalDrinksJTF = new JTextField();
        TotalCakesJTF = new JTextField();
        ServiceChargesJTF = new JTextField();
        JPanel CakesPanel = new JPanel();
        CupCakeCB = new JCheckBox();
        CheeseCB = new JCheckBox();
        StrawberryCB = new JCheckBox();
        AngelCB = new JCheckBox();
        ChocolateCB = new JCheckBox();
        RedVelvetCB = new JCheckBox();
        CupCakeJTF = new JTextField();
        StrawberryCakeJTF = new JTextField();
        AngelCakeJTF = new JTextField();
        CheeseCakeJTF = new JTextField();
        ChocolateCakeJTF = new JTextField();
        RedVelvetCakeJTF = new JTextField();
        JLabel jLabel14 = new JLabel();
        JLabel jLabel12 = new JLabel();
        JLabel jLabel13 = new JLabel();
        JPanel ButtonsPanel = new JPanel();

        JButton TotalBtn = new JButton();
        JButton ReceiptBtn = new JButton();
        JButton ResetBtn = new JButton();
        JButton ExitBtn = new JButton();
        JButton PrintReceiptBtn = new JButton();
        JButton TotalProfitBtn = new JButton();

        JPanel BillPanel = new JPanel();
        JScrollPane jScrollPane1 = new JScrollPane();

        jTextArea1 = new JTextArea();
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        NamePanel.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 6));
        jLabel1.setFont(new Font("Wide Latin", Font.BOLD | Font.ITALIC, 48)); // NOI18N
        jLabel1.setText("ITACHI'S CAFE");
        GroupLayout NamePanelLayout = new GroupLayout(NamePanel);
        NamePanel.setLayout(NamePanelLayout);
        NamePanelLayout.setHorizontalGroup(
                NamePanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(NamePanelLayout.createSequentialGroup()
                                .addGap(138, 138, 138)
                                .addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 745, GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50)
                                .addComponent(jLabel2)
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
        NamePanelLayout.setVerticalGroup(
                NamePanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(NamePanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(NamePanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
                                                Short.MAX_VALUE)
                                        .addComponent(jLabel2))
                                .addContainerGap()));
        DrinksPanel.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 4));
        TeaCB.setFont(new Font("SansSerif", Font.BOLD, 14)); // NOI18N
        TeaCB.setText("Tea                   $10");
        TeaCB.addActionListener(evt -> TeaCBActionPerformed());
        CoffeeCB.setFont(new Font("SansSerif", Font.BOLD, 14)); // NOI18N
        CoffeeCB.setText("Coffe                $15");
        CoffeeCB.addActionListener(evt -> CoffeeCBActionPerformed());
        CappuccinoCB.setFont(new Font("SansSerif", Font.BOLD, 14)); // NOI18N
        CappuccinoCB.setText("Cappuccino     $20");
        CappuccinoCB.addActionListener(evt -> CappuccinoCBActionPerformed());
        ColdCoffeeCB.setFont(new Font("SansSerif", Font.BOLD, 14)); // NOI18N
        ColdCoffeeCB.setText("Cold Coffee     $20");
        ColdCoffeeCB.addActionListener(evt -> ColdCoffeeCBActionPerformed());
        IcedTeaCB.setFont(new Font("SansSerif", Font.BOLD, 14)); // NOI18N
        IcedTeaCB.setText("Ice Tea             $20");
        IcedTeaCB.addActionListener(evt -> IcedTeaCBActionPerformed());
        TeaJTF.setHorizontalAlignment(JTextField.CENTER);
        TeaJTF.setText("0");
        CoffeeJTF.setHorizontalAlignment(JTextField.CENTER);
        CoffeeJTF.setText("0");
        CappuccinoJTF.setHorizontalAlignment(JTextField.CENTER);
        CappuccinoJTF.setText("0");
        ColdCoffeeJTF.setHorizontalAlignment(JTextField.CENTER);
        ColdCoffeeJTF.setText("0");
        IcedTeaJTF.setHorizontalAlignment(JTextField.CENTER);
        IcedTeaJTF.setText("0");
        jLabel9.setFont(new Font("SansSerif", Font.BOLD, 14)); // NOI18N
        jLabel9.setText("Menu");
        jLabel10.setFont(new Font("SansSerif", Font.BOLD, 14)); // NOI18N
        jLabel10.setText("Price");
        jLabel11.setFont(new Font("SansSerif", Font.BOLD, 14)); // NOI18N
        jLabel11.setText("Quantity");
        GroupLayout DrinksPanelLayout = new GroupLayout(DrinksPanel);
        DrinksPanel.setLayout(DrinksPanelLayout);
        DrinksPanelLayout.setHorizontalGroup(
                DrinksPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(DrinksPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(DrinksPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(DrinksPanelLayout.createSequentialGroup()
                                                .addComponent(jLabel9)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED,
                                                        GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel10)
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel11)
                                                .addContainerGap())
                                        .addGroup(DrinksPanelLayout.createSequentialGroup()
                                                .addGroup(DrinksPanelLayout
                                                        .createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addComponent(TeaCB)
                                                        .addComponent(CoffeeCB)
                                                        .addComponent(CappuccinoCB)
                                                        .addComponent(ColdCoffeeCB)
                                                        .addComponent(IcedTeaCB))
                                                .addGap(18, 18, 18)
                                                .addGroup(DrinksPanelLayout
                                                        .createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(TeaJTF, GroupLayout.DEFAULT_SIZE, 100,
                                                                Short.MAX_VALUE)
                                                        .addComponent(CoffeeJTF)
                                                        .addComponent(CappuccinoJTF)
                                                        .addComponent(ColdCoffeeJTF)
                                                        .addComponent(IcedTeaJTF))
                                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))));
        DrinksPanelLayout.setVerticalGroup(
                DrinksPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(DrinksPanelLayout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addGroup(DrinksPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel11)
                                        .addComponent(jLabel10)
                                        .addComponent(jLabel9))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(DrinksPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(TeaCB)
                                        .addComponent(TeaJTF, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
                                                GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(DrinksPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(CoffeeCB)
                                        .addComponent(CoffeeJTF, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
                                                GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(DrinksPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(CappuccinoCB)
                                        .addComponent(CappuccinoJTF, GroupLayout.PREFERRED_SIZE,
                                                GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(DrinksPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(ColdCoffeeCB)
                                        .addComponent(ColdCoffeeJTF, GroupLayout.PREFERRED_SIZE,
                                                GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(DrinksPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(IcedTeaCB)
                                        .addComponent(IcedTeaJTF, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
                                                GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(50, Short.MAX_VALUE)));

        TaxPanel.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 4));
        jLabel6.setFont(new Font("SansSerif", Font.BOLD, 18)); // NOI18N
        jLabel6.setText("Tax");
        jLabel7.setFont(new Font("SansSerif", Font.BOLD, 18)); // NOI18N
        jLabel7.setText("Sub Total");
        jLabel8.setFont(new Font("SansSerif", Font.BOLD, 18)); // NOI18N
        jLabel8.setText("Total");
        TaxJTF.setHorizontalAlignment(JTextField.CENTER);
        TaxJTF.setText("0");
        TaxJTF.addActionListener(this::TaxJTFActionPerformed);
        SubTotalJTF.setHorizontalAlignment(JTextField.CENTER);
        SubTotalJTF.setText("0");
        TotalJTF.setHorizontalAlignment(JTextField.CENTER);
        TotalJTF.setText("0");
        GroupLayout TaxPanelLayout = new GroupLayout(TaxPanel);
        TaxPanel.setLayout(TaxPanelLayout);
        TaxPanelLayout.setHorizontalGroup(
                TaxPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(TaxPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(TaxPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel6)
                                        .addComponent(jLabel7)
                                        .addComponent(jLabel8))
                                .addGap(67, 67, 67)
                                .addGroup(TaxPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(TotalJTF, GroupLayout.PREFERRED_SIZE, 95,
                                                GroupLayout.PREFERRED_SIZE)
                                        .addComponent(SubTotalJTF, GroupLayout.PREFERRED_SIZE, 95,
                                                GroupLayout.PREFERRED_SIZE)
                                        .addComponent(TaxJTF, GroupLayout.PREFERRED_SIZE, 95,
                                                GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(36, Short.MAX_VALUE)));
        TaxPanelLayout.setVerticalGroup(
                TaxPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(TaxPanelLayout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addGroup(TaxPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel6)
                                        .addComponent(TaxJTF, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
                                                GroupLayout.PREFERRED_SIZE))
                                .addGap(35, 35, 35)
                                .addGroup(TaxPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel7)
                                        .addComponent(SubTotalJTF, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
                                                GroupLayout.PREFERRED_SIZE))
                                .addGap(44, 44, 44)
                                .addGroup(TaxPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel8)
                                        .addComponent(TotalJTF, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
                                                GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

        CostPanel.setBorder(new LineBorder(new Color(0, 0, 0), 4, true));
        jLabel3.setFont(new Font("SansSerif", Font.BOLD, 18)); // NOI18N
        jLabel3.setText("Cost of Drink");
        jLabel4.setFont(new Font("SansSerif", Font.BOLD, 18)); // NOI18N
        jLabel4.setText("Cost of Cakes");
        jLabel5.setFont(new Font("SansSerif", Font.BOLD, 18)); // NOI18N
        jLabel5.setText("Service Charges");
        TotalDrinksJTF.setHorizontalAlignment(JTextField.CENTER);
        TotalDrinksJTF.setText("0");
        TotalCakesJTF.setHorizontalAlignment(JTextField.CENTER);
        TotalCakesJTF.setText("0");
        ServiceChargesJTF.setHorizontalAlignment(JTextField.CENTER);
        ServiceChargesJTF.setText("10");
        GroupLayout CostPanelLayout = new GroupLayout(CostPanel);
        CostPanel.setLayout(CostPanelLayout);
        CostPanelLayout.setHorizontalGroup(
                CostPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(CostPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(CostPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(CostPanelLayout.createSequentialGroup()
                                                .addGroup(CostPanelLayout
                                                        .createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(jLabel3, GroupLayout.DEFAULT_SIZE,
                                                                GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jLabel4, GroupLayout.DEFAULT_SIZE, 128,
                                                                Short.MAX_VALUE))
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED,
                                                        GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(CostPanelLayout
                                                        .createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addComponent(TotalDrinksJTF, GroupLayout.Alignment.TRAILING,
                                                                GroupLayout.PREFERRED_SIZE, 77,
                                                                GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(TotalCakesJTF, GroupLayout.Alignment.TRAILING,
                                                                GroupLayout.PREFERRED_SIZE, 77,
                                                                GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(CostPanelLayout.createSequentialGroup()
                                                .addComponent(jLabel5, GroupLayout.PREFERRED_SIZE, 153,
                                                        GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 8,
                                                        Short.MAX_VALUE)
                                                .addComponent(ServiceChargesJTF, GroupLayout.PREFERRED_SIZE, 77,
                                                        GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap()));
        CostPanelLayout.setVerticalGroup(
                CostPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(CostPanelLayout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addGroup(CostPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel3)
                                        .addComponent(TotalDrinksJTF, GroupLayout.PREFERRED_SIZE,
                                                GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGap(30, 30, 30)
                                .addGroup(CostPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel4)
                                        .addComponent(TotalCakesJTF, GroupLayout.PREFERRED_SIZE,
                                                GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGap(40, 40, 40)
                                .addGroup(CostPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel5)
                                        .addComponent(ServiceChargesJTF, GroupLayout.PREFERRED_SIZE,
                                                GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

        CakesPanel.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 4));
        CupCakeCB.setFont(new Font("SansSerif", Font.BOLD, 14)); // NOI18N
        CupCakeCB.setText("CupCake              $20");
        CupCakeCB.addActionListener(this::CupCakeCBActionPerformed);
        CheeseCB.setFont(new Font("SansSerif", Font.BOLD, 14)); // NOI18N
        CheeseCB.setText("CheeseCake        $30");
        CheeseCB.addActionListener(this::CheeseCBActionPerformed);
        StrawberryCB.setFont(new Font("SansSerif", Font.BOLD, 14)); // NOI18N
        StrawberryCB.setText("StrawberryCake   $35");
        StrawberryCB.addActionListener(this::StrawberryCBActionPerformed);
        AngelCB.setFont(new Font("SansSerif", Font.BOLD, 14)); // NOI18N
        AngelCB.setText("AngelCake            $30");
        AngelCB.addActionListener(this::AngelCBActionPerformed);
        ChocolateCB.setFont(new Font("SansSerif", Font.BOLD, 14)); // NOI18N
        ChocolateCB.setText("ChocolateCake    $35");
        ChocolateCB.setActionCommand("");
        ChocolateCB.addActionListener(this::ChocolateCBActionPerformed);
        RedVelvetCB.setFont(new Font("SansSerif", Font.BOLD, 14)); // NOI18N
        RedVelvetCB.setText("Red-VelvetCake   $30");
        RedVelvetCB.addActionListener(this::RedVelvetCBActionPerformed);
        CupCakeJTF.setHorizontalAlignment(JTextField.CENTER);
        CupCakeJTF.setText("0");

        StrawberryCakeJTF.setHorizontalAlignment(JTextField.CENTER);
        StrawberryCakeJTF.setText("0");

        AngelCakeJTF.setHorizontalAlignment(JTextField.CENTER);
        AngelCakeJTF.setText("0");
        CheeseCakeJTF.setHorizontalAlignment(JTextField.CENTER);
        CheeseCakeJTF.setText("0");
        ChocolateCakeJTF.setHorizontalAlignment(JTextField.CENTER);
        ChocolateCakeJTF.setText("0");
        RedVelvetCakeJTF.setHorizontalAlignment(JTextField.CENTER);
        RedVelvetCakeJTF.setText("0");
        jLabel14.setFont(new Font("SansSerif", Font.BOLD, 14)); // NOI18N
        jLabel14.setText("Menu");
        jLabel12.setFont(new Font("SansSerif", Font.BOLD, 14)); // NOI18N
        jLabel12.setText("Quantity");
        jLabel13.setFont(new Font("SansSerif", Font.BOLD, 14)); // NOI18N
        jLabel13.setText("Price");
        GroupLayout CakesPanelLayout = new GroupLayout(CakesPanel);
        CakesPanel.setLayout(CakesPanelLayout);
        CakesPanelLayout.setHorizontalGroup(
                CakesPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(CakesPanelLayout.createSequentialGroup()
                                .addGroup(CakesPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                        .addComponent(StrawberryCB, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
                                                Short.MAX_VALUE)
                                        .addComponent(CheeseCB, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
                                                Short.MAX_VALUE)
                                        .addComponent(CupCakeCB, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
                                                Short.MAX_VALUE)
                                        .addComponent(AngelCB, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
                                                Short.MAX_VALUE)
                                        .addComponent(ChocolateCB, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
                                                Short.MAX_VALUE)
                                        .addComponent(RedVelvetCB, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
                                                Short.MAX_VALUE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                                .addGroup(CakesPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(GroupLayout.Alignment.TRAILING, CakesPanelLayout
                                                .createSequentialGroup()
                                                .addGroup(CakesPanelLayout
                                                        .createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addComponent(CupCakeJTF, GroupLayout.PREFERRED_SIZE, 77,
                                                                GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(StrawberryCakeJTF, GroupLayout.PREFERRED_SIZE, 77,
                                                                GroupLayout.PREFERRED_SIZE))
                                                .addGap(49, 49, 49))
                                        .addGroup(CakesPanelLayout.createSequentialGroup()
                                                .addGroup(CakesPanelLayout
                                                        .createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(CheeseCakeJTF, GroupLayout.DEFAULT_SIZE, 77,
                                                                Short.MAX_VALUE)
                                                        .addComponent(AngelCakeJTF)
                                                        .addComponent(ChocolateCakeJTF)
                                                        .addComponent(RedVelvetCakeJTF))
                                                .addGap(28, 28, 28))))
                        .addGroup(GroupLayout.Alignment.TRAILING, CakesPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel14)
                                .addGap(69, 69, 69)
                                .addComponent(jLabel13)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE,
                                        Short.MAX_VALUE)
                                .addComponent(jLabel12)
                                .addGap(49, 49, 49)));
        CakesPanelLayout.setVerticalGroup(
                CakesPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, CakesPanelLayout.createSequentialGroup()
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(CakesPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel13)
                                        .addComponent(jLabel12)
                                        .addComponent(jLabel14))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(CakesPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(CupCakeCB)
                                        .addComponent(CupCakeJTF, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
                                                GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(CakesPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(CheeseCB)
                                        .addComponent(CheeseCakeJTF, GroupLayout.PREFERRED_SIZE,
                                                GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(CakesPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(StrawberryCB)
                                        .addComponent(StrawberryCakeJTF, GroupLayout.PREFERRED_SIZE,
                                                GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(CakesPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(AngelCB)
                                        .addComponent(AngelCakeJTF, GroupLayout.PREFERRED_SIZE,
                                                GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(CakesPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(ChocolateCB)
                                        .addComponent(ChocolateCakeJTF, GroupLayout.PREFERRED_SIZE,
                                                GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(CakesPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(RedVelvetCB)
                                        .addComponent(RedVelvetCakeJTF, GroupLayout.PREFERRED_SIZE,
                                                GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addContainerGap()));
        // ButtonsPanel.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0),
        // 4));
        // TotalBtn.setText("Total");
        // TotalBtn.addActionListener(evt -> TotalBtnActionPerformed());
        // ReceiptBtn.setText("Receipt");
        // ReceiptBtn.addActionListener(evt -> ReceiptBtnActionPerformed());
        // ResetBtn.setText("Reset");
        // ResetBtn.addActionListener(evt -> ResetBtnActionPerformed());
        // ExitBtn.setText("Exit");
        // ExitBtn.addActionListener(evt -> ExitBtnActionPerformed());
        // PrintReceiptBtn.setText("Print Receipt");
        // PrintReceiptBtn.addActionListener(evt -> PrintReceiptBtnActionPerformed());
        // TotalProfitBtn.setText("Today's Total");
        // TotalProfitBtn.addActionListener(evt -> TotalProfitBtnActionPerformed());
        // GroupLayout ButtonsPanelLayout = new GroupLayout(ButtonsPanel);
        // ButtonsPanel.setLayout(ButtonsPanelLayout);
        // ButtonsPanelLayout.setHorizontalGroup(
        // ButtonsPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
        // .addGroup(ButtonsPanelLayout.createSequentialGroup()
        // .addContainerGap()
        // .addGroup(ButtonsPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
        // .addComponent(TotalBtn, GroupLayout.PREFERRED_SIZE, 92,
        // GroupLayout.PREFERRED_SIZE)
        // .addComponent(ExitBtn, GroupLayout.PREFERRED_SIZE, 92,
        // GroupLayout.PREFERRED_SIZE)
        // .addComponent(ResetBtn, GroupLayout.PREFERRED_SIZE, 92,
        // GroupLayout.PREFERRED_SIZE)
        // .addComponent(ReceiptBtn, GroupLayout.PREFERRED_SIZE, 92,
        // GroupLayout.PREFERRED_SIZE)
        // .addComponent(PrintReceiptBtn, GroupLayout.PREFERRED_SIZE, 120,
        // GroupLayout.PREFERRED_SIZE) // Added Print Receipt button
        // .addComponent(TotalProfitBtn, GroupLayout.PREFERRED_SIZE, 120,
        // GroupLayout.PREFERRED_SIZE)) // Added Today's Total Profit button
        // .addContainerGap(32, Short.MAX_VALUE))
        // );
        // ButtonsPanelLayout.setVerticalGroup(
        // ButtonsPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
        // .addGroup(ButtonsPanelLayout.createSequentialGroup()
        // .addGap(22, 22, 22)
        // .addComponent(TotalBtn, GroupLayout.PREFERRED_SIZE, 25,
        // GroupLayout.PREFERRED_SIZE)
        // .addGap(18, 18, 18)
        // .addComponent(ReceiptBtn, GroupLayout.PREFERRED_SIZE, 25,
        // GroupLayout.PREFERRED_SIZE)
        // .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
        // .addComponent(ResetBtn, GroupLayout.PREFERRED_SIZE, 25,
        // GroupLayout.PREFERRED_SIZE)
        // .addGap(27, 27, 27)
        // .addComponent(ExitBtn)
        // .addGap(18, 18, 18)
        // .addComponent(PrintReceiptBtn) // Added Print Receipt button
        // .addGap(18, 18, 18)
        // .addComponent(TotalProfitBtn) // Added Today's Total Profit button
        // .addGap(25, 25, 25))
        // );
        ButtonsPanel.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 4));
        TotalBtn.setText("Total");
        TotalBtn.addActionListener(evt -> TotalBtnActionPerformed());
        ReceiptBtn.setText("Receipt");
        ReceiptBtn.addActionListener(evt -> ReceiptBtnActionPerformed());
        ResetBtn.setText("Reset");
        ResetBtn.addActionListener(evt -> ResetBtnActionPerformed());
        ExitBtn.setText("Exit");
        ExitBtn.addActionListener(evt -> ExitBtnActionPerformed());
        PrintReceiptBtn.setText("Print Receipt");
        PrintReceiptBtn.addActionListener(evt -> PrintReceiptBtnActionPerformed());
        TotalProfitBtn.setText("Today's Total");
        TotalProfitBtn.addActionListener(evt -> TotalProfitBtnActionPerformed());

        Dimension buttonSize = new Dimension(120, 25);
        TotalBtn.setPreferredSize(buttonSize);
        ReceiptBtn.setPreferredSize(buttonSize);
        ResetBtn.setPreferredSize(buttonSize);
        ExitBtn.setPreferredSize(buttonSize);
        PrintReceiptBtn.setPreferredSize(buttonSize);
        TotalProfitBtn.setPreferredSize(buttonSize);

        GroupLayout ButtonsPanelLayout = new GroupLayout(ButtonsPanel);
        ButtonsPanel.setLayout(ButtonsPanelLayout);
        ButtonsPanelLayout.setHorizontalGroup(
                ButtonsPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(ButtonsPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(ButtonsPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(TotalBtn, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
                                                GroupLayout.PREFERRED_SIZE)
                                        .addComponent(ReceiptBtn, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
                                                GroupLayout.PREFERRED_SIZE)
                                        .addComponent(ResetBtn, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
                                                GroupLayout.PREFERRED_SIZE)
                                        .addComponent(ExitBtn, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
                                                GroupLayout.PREFERRED_SIZE)
                                        .addComponent(PrintReceiptBtn, GroupLayout.PREFERRED_SIZE,
                                                GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(TotalProfitBtn, GroupLayout.PREFERRED_SIZE,
                                                GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(32, Short.MAX_VALUE)));
        ButtonsPanelLayout.setVerticalGroup(
                ButtonsPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(ButtonsPanelLayout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(TotalBtn, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
                                        GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(ReceiptBtn, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
                                        GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                                .addComponent(ResetBtn, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
                                        GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(ExitBtn, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
                                        GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(PrintReceiptBtn, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
                                        GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(TotalProfitBtn, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
                                        GroupLayout.PREFERRED_SIZE)
                                .addGap(25, 25, 25)));

        BillPanel.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 4));
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        GroupLayout BillPanelLayout = new GroupLayout(BillPanel);
        BillPanel.setLayout(BillPanelLayout);
        BillPanelLayout.setHorizontalGroup(
                BillPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane1, GroupLayout.DEFAULT_SIZE, 334, Short.MAX_VALUE));
        BillPanelLayout.setVerticalGroup(
                BillPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane1));

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(NamePanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(DrinksPanel, GroupLayout.PREFERRED_SIZE,
                                                        GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(CakesPanel, GroupLayout.PREFERRED_SIZE,
                                                        GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(CostPanel, GroupLayout.PREFERRED_SIZE,
                                                        GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                .addGap(25, 25, 25)
                                                .addComponent(TaxPanel, GroupLayout.PREFERRED_SIZE,
                                                        GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(ButtonsPanel, GroupLayout.PREFERRED_SIZE,
                                                        GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BillPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
                                        GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(NamePanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
                                        GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(CakesPanel, GroupLayout.PREFERRED_SIZE,
                                                                        GroupLayout.DEFAULT_SIZE,
                                                                        GroupLayout.PREFERRED_SIZE)
                                                                .addGap(0, 1, Short.MAX_VALUE))
                                                        .addComponent(DrinksPanel, GroupLayout.DEFAULT_SIZE,
                                                                GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(
                                                        layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                                .addComponent(TaxPanel, GroupLayout.DEFAULT_SIZE,
                                                                        GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(CostPanel, GroupLayout.DEFAULT_SIZE,
                                                                        GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(ButtonsPanel, GroupLayout.DEFAULT_SIZE,
                                                                        GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                        .addComponent(BillPanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
                                                Short.MAX_VALUE))
                                .addContainerGap(34, Short.MAX_VALUE)));
        pack();
    }

    private void updateTotalDrinks() {
        double[] costs = { 10, 15, 20, 20, 20 };
        JTextField[] textFields = { TeaJTF, CoffeeJTF, CappuccinoJTF, ColdCoffeeJTF, IcedTeaJTF };
        JCheckBox[] checkBoxes = { TeaCB, CoffeeCB, CappuccinoCB, ColdCoffeeCB, IcedTeaCB };

        double total = 0;
        for (int i = 0; i < checkBoxes.length; i++) {
            if (checkBoxes[i].isSelected()) {
                double Tno = Double.parseDouble(textFields[i].getText());
                double cost = costs[i];
                total += Tno * cost;
            }
        }
        TotalDrinksJTF.setText(String.format("%.2f", total));
    }

    private void TeaCBActionPerformed() {
        updateTotalDrinks();
    }

    private void CoffeeCBActionPerformed() {
        updateTotalDrinks();
    }

    private void CappuccinoCBActionPerformed() {
        updateTotalDrinks();
    }

    private void ColdCoffeeCBActionPerformed() {
        updateTotalDrinks();
    }

    private void IcedTeaCBActionPerformed() {
        updateTotalDrinks();
    }

    private void TotalBtnActionPerformed() {
        double CD = Double.parseDouble(TotalDrinksJTF.getText());
        double CC = Double.parseDouble(TotalCakesJTF.getText());
        double tax = (CC + CD) % 12;
        TaxJTF.setText(tax + "");
        SubTotalJTF.setText(CC + CD + "");
        TotalJTF.setText((tax + CD + CC + 10) + "");
    }

    private void ResetBtnActionPerformed() {
        TeaJTF.setText("0");
        CoffeeJTF.setText("0");
        CappuccinoJTF.setText("0");
        ColdCoffeeJTF.setText("0");
        IcedTeaJTF.setText("0");
        TotalDrinksJTF.setText("0");
        TotalCakesJTF.setText("0");
        ServiceChargesJTF.setText("10");
        CupCakeJTF.setText("0");
        StrawberryCakeJTF.setText("0");
        AngelCakeJTF.setText("0");
        CheeseCakeJTF.setText("0");
        SubTotalJTF.setText("0");
        TotalJTF.setText("0");
        ChocolateCakeJTF.setText("0");
        RedVelvetCakeJTF.setText("0");
        TaxJTF.setText("0");
        jTextArea1.setText(null);
        TeaCB.setSelected(false);
        CoffeeCB.setSelected(false);
        CappuccinoCB.setSelected(false);
        ColdCoffeeCB.setSelected(false);
        ColdCoffeeCB.setSelected(false);
        IcedTeaCB.setSelected(false);
        CupCakeCB.setSelected(false);
        CheeseCB.setSelected(false);
        StrawberryCB.setSelected(false);
        AngelCB.setSelected(false);
        ChocolateCB.setSelected(false);
        RedVelvetCB.setSelected(false);
    }

    private void ExitBtnActionPerformed() {
        System.exit(0);
    }

    private void ReceiptBtnActionPerformed() {
        try {
            double[] drink = {
                    Double.parseDouble(TeaJTF.getText()),
                    Double.parseDouble(CoffeeJTF.getText()),
                    Double.parseDouble(CappuccinoJTF.getText()),
                    Double.parseDouble(ColdCoffeeJTF.getText()),
                    Double.parseDouble(IcedTeaJTF.getText())
            };
            double[] cake = {
                    Double.parseDouble(CupCakeJTF.getText()),
                    Double.parseDouble(CheeseCakeJTF.getText()),
                    Double.parseDouble(StrawberryCakeJTF.getText()),
                    Double.parseDouble(AngelCakeJTF.getText()),
                    Double.parseDouble(ChocolateCakeJTF.getText()),
                    Double.parseDouble(RedVelvetCakeJTF.getText())
            };
            double tax = Double.parseDouble(TaxJTF.getText());
            double subtotal = Double.parseDouble(SubTotalJTF.getText());
            double total = Double.parseDouble(TotalJTF.getText());

            StringBuilder billDetails = new StringBuilder();
            billDetails.append("\t\nYour Bill\n\n");
            appendItemsToBill(billDetails, drink,
                    new String[] { "Tea", "Coffee", "Cappuccino", "Cold Coffee", "Iced Tea" },
                    new double[] { 10, 15, 20, 20, 20 });
            appendItemsToBill(billDetails, cake, new String[] { "CupCake", "CheeseCake", "StrawberryCake", "AngelCake",
                    "ChocolateCake", "Red-VelvetCake" }, new double[] { 20, 30, 35, 30, 35, 30 });
            billDetails.append("=============================================\n")
                    .append("  Tax:\t\t\t").append(String.format("%.2f", tax)).append("\n")
                    .append("  Service Charges:\t\t").append("10.00").append("\n")
                    .append("  SubTotal:\t\t\t").append(String.format("%.2f", subtotal)).append("\n")
                    .append("  Total:\t\t\t").append(String.format("%.2f", total)).append("\n\n\n")
                    .append("\tTHANK YOU");

            jTextArea1.setText(billDetails.toString());
            saveBillToFile();
        } catch (NumberFormatException e) {
            jTextArea1.setText("Error generating receipt. Please check input values.");
        }
    }

    private void PrintReceiptBtnActionPerformed() {
        try {
            String homeDirectory = System.getProperty("user.home");
            String downloadsDirectory = homeDirectory + File.separator + "Downloads" + File.separator;

            String os = System.getProperty("os.name").toLowerCase();
            if (os.contains("win")) {
                downloadsDirectory = homeDirectory + "\\Downloads\\";
            }
            String filename = downloadsDirectory + "receipt.pdf";
            try (FileOutputStream outputStream = new FileOutputStream(filename)) {
                Document pdf = new Document();
                PdfWriter.getInstance(pdf, outputStream);
                pdf.open();

                String text = jTextArea1.getText();
                pdf.add(new Paragraph(text));

                pdf.close();
                Desktop.getDesktop().open(new File(filename));
            } catch (Exception e) {
                e.printStackTrace();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private void saveBillToFile() {
        try {
            String homeDirectory = System.getProperty("user.home");
            String downloadsDirectory = "";
            String os = System.getProperty("os.name").toLowerCase();
            if (os.contains("win")) {
                downloadsDirectory = homeDirectory + "\\Downloads\\";
            }
            BufferedWriter writer = new BufferedWriter(new FileWriter(downloadsDirectory + "bill.txt", true));
            double total = Double.parseDouble(TotalJTF.getText());
            writer.write(String.format("%.2f", total) + "\n");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void TotalProfitBtnActionPerformed() {
        try {
            String homeDirectory = System.getProperty("user.home");
            String downloadsDirectory = "";
            String os = System.getProperty("os.name").toLowerCase();
            if (os.contains("win")) {
                downloadsDirectory = homeDirectory + "\\Downloads\\";
            }
            BufferedReader reader = new BufferedReader(new FileReader(downloadsDirectory + "bill.txt"));
            double total = 0.0;
            String line;
            while ((line = reader.readLine()) != null) {
                total += Double.parseDouble(line);
            }
            reader.close();
            JOptionPane.showMessageDialog(null, "Total: " + total, "Total", JOptionPane.INFORMATION_MESSAGE);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error reading total from file", "Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
    }

    private void appendItemsToBill(StringBuilder billDetails, double[] items, String[] itemNames, double[] itemPrices) {
        for (int i = 0; i < items.length; i++) {
            double itemTotal = items[i] * itemPrices[i];
            if (items[i] > 0) {
                billDetails.append("  ").append(itemNames[i]).append(":\t\t\t").append(String.format("%.2f", itemTotal))
                        .append("\n");
            }
        }
    }

    private void updateTotalCakes() {
        double[] costs = { 20, 30, 35, 30, 35, 30 };
        JTextField[] textFields = { CupCakeJTF, CheeseCakeJTF, StrawberryCakeJTF, AngelCakeJTF, ChocolateCakeJTF,
                RedVelvetCakeJTF };
        JCheckBox[] checkBoxes = { CupCakeCB, CheeseCB, StrawberryCB, AngelCB, ChocolateCB, RedVelvetCB };

        double total = 0;
        for (int i = 0; i < checkBoxes.length; i++) {
            if (checkBoxes[i].isSelected()) {
                double Tno = Double.parseDouble(textFields[i].getText());
                double cost = costs[i];
                total += Tno * cost;
            }
        }
        TotalCakesJTF.setText(String.format("%.2f", total));
    }

    private void CupCakeCBActionPerformed(ActionEvent evt) {
        updateTotalCakes();
    }

    private void CheeseCBActionPerformed(ActionEvent evt) {
        updateTotalCakes();
    }

    private void StrawberryCBActionPerformed(ActionEvent evt) {
        updateTotalCakes();
    }

    private void AngelCBActionPerformed(ActionEvent evt) {
        updateTotalCakes();
    }

    private void ChocolateCBActionPerformed(ActionEvent evt) {
        updateTotalCakes();
    }

    private void RedVelvetCBActionPerformed(ActionEvent evt) {
        updateTotalCakes();
    }

    private void TaxJTFActionPerformed(ActionEvent evt) {
    }

    private JCheckBox TeaCB, CoffeeCB, CappuccinoCB, CupCakeCB, CheeseCB, StrawberryCB, AngelCB, ColdCoffeeCB,
            ChocolateCB, RedVelvetCB, IcedTeaCB;

    private JTextArea jTextArea1;

    private JTextField TeaJTF, CoffeeJTF, CappuccinoJTF, ColdCoffeeJTF, IcedTeaJTF;

    private JTextField CupCakeJTF, CheeseCakeJTF, StrawberryCakeJTF, AngelCakeJTF, ChocolateCakeJTF, RedVelvetCakeJTF;

    private JTextField TotalDrinksJTF, TotalCakesJTF, ServiceChargesJTF;

    private JTextField TaxJTF, SubTotalJTF, TotalJTF;
}
