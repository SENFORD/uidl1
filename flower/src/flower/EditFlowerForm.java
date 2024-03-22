package flower;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class EditFlowerForm extends JFrame {
    public EditFlowerForm() {
        setTitle("Edit Flower");
        setSize(550, 550);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();

        JLabel nameLabel = new JLabel("Name:");
        nameLabel.setForeground(new Color(0, 100, 0));
        nameLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
        nameLabel.setBounds(138, 187, 72, 32);
        JTextField nameField = new JTextField();
        nameField.setBounds(220, 187, 163, 32);
        JLabel priceLabel = new JLabel("Price:");
        priceLabel.setForeground(new Color(0, 100, 0));
        priceLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
        priceLabel.setBounds(138, 229, 72, 32);
        JTextField priceField = new JTextField();
        priceField.setBounds(218, 232, 72, 32);
        JButton saveButton = new JButton("Save");
        saveButton.setBackground(new Color(34, 139, 34));
        saveButton.setFont(new Font("Tahoma", Font.BOLD, 18));
        saveButton.setBounds(205, 293, 114, 42);
        panel.setLayout(null);

        panel.add(nameLabel);
        panel.add(nameField);
        panel.add(priceLabel);
        panel.add(priceField);
        panel.add(saveButton);

        getContentPane().add(panel);
        
        JLabel lblNewLabel = new JLabel("New label");
        lblNewLabel.setIcon(new ImageIcon("C:\\Users\\senfo\\Downloads\\Free Watercolor Flower Frame Image.jpeg"));
        lblNewLabel.setBounds(0, 0, 536, 513);
        panel.add(lblNewLabel);

        saveButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Add functionality to save edited flower details here
                String name = nameField.getText();
                double price = Double.parseDouble(priceField.getText());
                // Implement logic to save edited flower details
                JOptionPane.showMessageDialog(null, "Flower details saved: " + name + " Price: $" + price);
            }
        });
    }
}