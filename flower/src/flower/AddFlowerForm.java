package flower;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AddFlowerForm extends JFrame {
    public AddFlowerForm() {
        setTitle("Add Flower");
        setSize(550, 550);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();

        JLabel nameLabel = new JLabel("Name:");
        nameLabel.setForeground(new Color(0, 100, 0));
        nameLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
        nameLabel.setBounds(135, 176, 102, 36);
        JTextField nameField = new JTextField();
        nameField.setBounds(247, 179, 153, 36);
        JLabel priceLabel = new JLabel("Price:");
        priceLabel.setForeground(new Color(0, 100, 0));
        priceLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
        priceLabel.setBounds(135, 222, 102, 36);
        JTextField priceField = new JTextField();
        priceField.setBounds(247, 225, 79, 36);
        JButton addButton = new JButton("Add");
        addButton.setBackground(new Color(34, 139, 34));
        addButton.setFont(new Font("Tahoma", Font.BOLD, 18));
        addButton.setBounds(193, 289, 122, 36);
        panel.setLayout(null);

        panel.add(nameLabel);
        panel.add(nameField);
        panel.add(priceLabel);
        panel.add(priceField);
        panel.add(addButton);

        getContentPane().add(panel);
        
        JLabel lblNewLabel = new JLabel("New label");
        lblNewLabel.setIcon(new ImageIcon("C:\\Users\\senfo\\Downloads\\Free Watercolor Flower Frame Image.jpeg"));
        lblNewLabel.setBounds(0, 0, 536, 513);
        panel.add(lblNewLabel);

        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Add functionality to add flower here
                String name = nameField.getText();
                double price = Double.parseDouble(priceField.getText());
                // Implement logic to add flower
                JOptionPane.showMessageDialog(null, "Flower added: " + name + " Price: $" + price);
            }
        });
    }
}
