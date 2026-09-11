package nazarudin_pertemuan2;

import java.awt.EventQueue;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;

/**
 * JFrame Form sederhana untuk tugas Latihan 2.
 *
 * @author nazarudin
 */
public class nazarudin_Latihan2 extends javax.swing.JFrame {

    public nazarudin_Latihan2() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        headerLabel = new javax.swing.JLabel();
        instructionLabel = new javax.swing.JLabel();
        namaLabel = new javax.swing.JLabel();
        namaTextField = new javax.swing.JTextField();
        tampilkanButton = new javax.swing.JButton();
        bersihkanButton = new javax.swing.JButton();
        outputLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("Latihan 2 - JFrame Form");
        setResizable(false);

        mainPanel.setBackground(new java.awt.Color(245, 248, 252));
        mainPanel.setBorder(javax.swing.BorderFactory.createEmptyBorder(24, 30, 24, 30));

        headerLabel.setFont(new java.awt.Font("SansSerif", 1, 22));
        headerLabel.setForeground(new java.awt.Color(31, 78, 121));
        headerLabel.setText("JFrame Form Latihan 2");

        instructionLabel.setForeground(new java.awt.Color(80, 80, 80));
        instructionLabel.setText("Contoh form sederhana menggunakan Java Swing");

        namaLabel.setText("Nama:");

        namaTextField.setColumns(20);

        tampilkanButton.setText("Tampilkan");
        tampilkanButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tampilkanButtonActionPerformed(evt);
            }
        });

        bersihkanButton.setText("Bersihkan");
        bersihkanButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bersihkanButtonActionPerformed(evt);
            }
        });

        outputLabel.setForeground(new java.awt.Color(31, 78, 121));
        outputLabel.setText("Output akan tampil di sini.");

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(headerLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(instructionLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(namaLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(namaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(tampilkanButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bersihkanButton))
                    .addComponent(outputLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addComponent(headerLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(instructionLabel)
                .addGap(24, 24, 24)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(namaLabel)
                    .addComponent(namaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tampilkanButton)
                    .addComponent(bersihkanButton))
                .addGap(24, 24, 24)
                .addComponent(outputLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>

    private void tampilkanButtonActionPerformed(java.awt.event.ActionEvent evt) {
        String nama = namaTextField.getText().trim();

        if (nama.isEmpty()) {
            JOptionPane.showMessageDialog(this,
                    "Silakan isi nama terlebih dahulu.",
                    "Informasi",
                    JOptionPane.INFORMATION_MESSAGE);
            namaTextField.requestFocusInWindow();
            return;
        }

        outputLabel.setText("Halo, " + nama + "! Selamat belajar JFrame Form.");
    }

    private void bersihkanButtonActionPerformed(java.awt.event.ActionEvent evt) {
        namaTextField.setText("");
        outputLabel.setText("Output akan tampil di sini.");
        namaTextField.requestFocusInWindow();
    }

    public static void main(String args[]) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new nazarudin_Latihan2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify
    private javax.swing.JButton bersihkanButton;
    private javax.swing.JLabel headerLabel;
    private javax.swing.JLabel instructionLabel;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JLabel namaLabel;
    private javax.swing.JTextField namaTextField;
    private javax.swing.JLabel outputLabel;
    private javax.swing.JButton tampilkanButton;
    // End of variables declaration
}
