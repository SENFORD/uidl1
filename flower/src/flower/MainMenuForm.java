package flower;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MainMenuForm extends JFrame {
	private JTextField textField;
    public MainMenuForm() {
        setTitle("Flower Shop Management System");
        setSize(550, 550);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JPanel panel = new JPanel();

        JButton addFlowerButton = new JButton("Add Flower");
        addFlowerButton.setBackground(new Color(34, 139, 34));
        addFlowerButton.setFont(new Font("Tahoma", Font.BOLD, 15));
        addFlowerButton.setBounds(175, 162, 167, 33);
        JButton manageOrdersButton = new JButton("Manage Orders");
        manageOrdersButton.setBackground(new Color(34, 139, 34));
        manageOrdersButton.setFont(new Font("Tahoma", Font.BOLD, 15));
        manageOrdersButton.setBounds(175, 205, 167, 33);
        JButton generateReportsButton = new JButton("Generate Reports");
        generateReportsButton.setBackground(new Color(34, 139, 34));
        generateReportsButton.setFont(new Font("Tahoma", Font.BOLD, 15));
        generateReportsButton.setBounds(167, 248, 182, 33);
        JButton exitButton = new JButton("Exit");
        exitButton.setBackground(new Color(34, 139, 34));
        exitButton.setFont(new Font("Tahoma", Font.BOLD, 20));
        exitButton.setBounds(201, 291, 117, 33);
        panel.setLayout(null);

        panel.add(addFlowerButton);
        panel.add(manageOrdersButton);
        panel.add(generateReportsButton);
        panel.add(exitButton);

        getContentPane().add(panel);
        
        JLabel lblNewLabel = new JLabel("New label");
        lblNewLabel.setIcon(new ImageIcon("C:\\Users\\senfo\\Downloads\\Free Watercolor Flower Frame Image.jpeg"));
        lblNewLabel.setBounds(0, 0, 536, 513);
        panel.add(lblNewLabel);
        
        textField = new JTextField();
        textField.setBounds(0, 0, 2, 19);
        panel.add(textField);
        textField.setColumns(10);

        addFlowerButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new AddFlowerForm().setVisible(true);
            }
        });

        manageOrdersButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new ManageOrdersForm().setVisible(true);
            }
        });

        generateReportsButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new GenerateReportsForm().setVisible(true);
            }
        });

        exitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new MainMenuForm().setVisible(true);
            }
        });
    }
}
