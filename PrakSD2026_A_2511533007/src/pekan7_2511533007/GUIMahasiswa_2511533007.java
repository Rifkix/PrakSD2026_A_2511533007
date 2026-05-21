package pekan7_2511533007;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;

public class GUIMahasiswa_2511533007 extends JFrame {

    private static final long serialVersionUID = 1L;
    private JTextField inputNama_3007, inputNim_3007, inputProdi_3007;
    private JButton btnTambah_3007, btnMulaiSort_3007, btnLangkah_3007, btnReset_3007;
    private JComboBox<String> comboSort_3007;
    private JPanel panelArray_3007;
    private JLabel[] labelArray_3007;
    private JTextArea stepArea_3007;
    private ArrayList<Mahasiswa_2511533007> dataAwal_3007;
    private ArrayList<Mahasiswa_2511533007> dataProses_3007;
    private int i_3007 = 0;
    private int stepCount_3007 = 1;
    private boolean sorting_3007 = false;
    private String tipeSort_3007 = "";

    public GUIMahasiswa_2511533007() {
        setTitle("Visualisasi Sorting Mahasiswa");
        setSize(900, 550);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout(10, 10));

        dataAwal_3007 = new ArrayList<>();

        JPanel panelUtara_3007 = new JPanel(new GridLayout(4, 2, 5, 5));
        panelUtara_3007.setBorder(BorderFactory.createTitledBorder("Input Data Mahasiswa"));

        panelUtara_3007.add(new JLabel(" Nama Mahasiswa:"));
        inputNama_3007 = new JTextField();
        panelUtara_3007.add(inputNama_3007);

        panelUtara_3007.add(new JLabel(" NIM Mahasiswa:"));
        inputNim_3007 = new JTextField();
        panelUtara_3007.add(inputNim_3007);

        panelUtara_3007.add(new JLabel(" Program Studi:"));
        inputProdi_3007 = new JTextField();
        panelUtara_3007.add(inputProdi_3007);

        btnTambah_3007 = new JButton("Tambah Data ke Array");
        panelUtara_3007.add(new JLabel("")); // Spacer
        panelUtara_3007.add(btnTambah_3007);

        panelArray_3007 = new JPanel();
        panelArray_3007.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
        panelArray_3007.setBorder(BorderFactory.createTitledBorder("Visualisasi Array"));

        JScrollPane scrollVisual_3007 = new JScrollPane(panelArray_3007);
        scrollVisual_3007.setPreferredSize(new Dimension(500, 150));

        stepArea_3007 = new JTextArea(15, 30);
        stepArea_3007.setEditable(false);
        stepArea_3007.setFont(new Font("Monospaced", Font.PLAIN, 13));
        JScrollPane scrollText_3007 = new JScrollPane(stepArea_3007);
        scrollText_3007.setBorder(BorderFactory.createTitledBorder("Log Langkah Sorting"));

        JPanel panelKontrol_3007 = new JPanel(new FlowLayout());
        
        String[] pilihanAlgoritma_3007 = {"Insertion Sort", "Selection Sort", "Bubble Sort"};
        comboSort_3007 = new JComboBox<>(pilihanAlgoritma_3007);
        
        btnMulaiSort_3007 = new JButton("Mulai Sorting");
        btnLangkah_3007 = new JButton("Langkah Selanjutnya");
        btnLangkah_3007.setEnabled(false);
        btnReset_3007 = new JButton("Reset Data");

        panelKontrol_3007.add(new JLabel("Pilih Algoritma:"));
        panelKontrol_3007.add(comboSort_3007);
        panelKontrol_3007.add(btnMulaiSort_3007);
        panelKontrol_3007.add(btnLangkah_3007);
        panelKontrol_3007.add(btnReset_3007);

        // Menambahkan panel ke frame
        add(panelUtara_3007, BorderLayout.NORTH);
        add(scrollVisual_3007, BorderLayout.CENTER);
        add(scrollText_3007, BorderLayout.EAST);
        add(panelKontrol_3007, BorderLayout.SOUTH);

        btnTambah_3007.addActionListener(e -> tambahData_3007());
        btnMulaiSort_3007.addActionListener(e -> inisialisasiSorting_3007());
        btnLangkah_3007.addActionListener(e -> performStep_3007());
        btnReset_3007.addActionListener(e -> resetSemua_3007());
    }

    private void tambahData_3007() {
        String nama_3007 = inputNama_3007.getText().trim();
        String nim_3007 = inputNim_3007.getText().trim();
        String prodi_3007 = inputProdi_3007.getText().trim();

        if (nama_3007.isEmpty() || nim_3007.isEmpty() || prodi_3007.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Lengkapi semua field input", "Peringatan", JOptionPane.WARNING_MESSAGE);
            return;
        }

        dataAwal_3007.add(new Mahasiswa_2511533007(nama_3007, nim_3007, prodi_3007));
        renderArrayAwal_3007();
        stepArea_3007.append("Ditambahkan: " + nama_3007 + "\n");

        inputNama_3007.setText("");
        inputNim_3007.setText("");
        inputProdi_3007.setText("");
        inputNama_3007.requestFocus();
    }

    private void renderArrayAwal_3007() {
        panelArray_3007.removeAll();
        labelArray_3007 = new JLabel[dataAwal_3007.size()];
        
        for (int k_3007 = 0; k_3007 < dataAwal_3007.size(); k_3007++) {
            labelArray_3007[k_3007] = new JLabel(dataAwal_3007.get(k_3007).getNama_3007());
            labelArray_3007[k_3007].setFont(new Font("Arial", Font.BOLD, 18));
            labelArray_3007[k_3007].setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
            labelArray_3007[k_3007].setPreferredSize(new Dimension(100, 50));
            labelArray_3007[k_3007].setHorizontalAlignment(SwingConstants.CENTER);
            panelArray_3007.add(labelArray_3007[k_3007]);
        }
        panelArray_3007.revalidate();
        panelArray_3007.repaint();
    }

    private void inisialisasiSorting_3007() {
        if (dataAwal_3007.size() < 2) {
            JOptionPane.showMessageDialog(this, "Minimal 2 data untuk melakukan sorting", "Peringatan", JOptionPane.WARNING_MESSAGE);
            return;
        }

        dataProses_3007 = new ArrayList<>(dataAwal_3007);
        tipeSort_3007 = (String) comboSort_3007.getSelectedItem();
        
        stepCount_3007 = 1;
        sorting_3007 = true;

        if (tipeSort_3007.equals("Insertion Sort")) {
            i_3007 = 1;
        } else {
            i_3007 = 0;
        }

        stepArea_3007.setText("=== " + tipeSort_3007.toUpperCase() + " ===\n");
        stepArea_3007.append("Data Awal: " + arrayToString_3007() + "\n\n");
        System.out.println("=== " + tipeSort_3007.toUpperCase() + " ===");

        btnMulaiSort_3007.setEnabled(false);
        btnTambah_3007.setEnabled(false);
        btnLangkah_3007.setEnabled(true);
    }

    // Method memanggil algoritma sorting
    private void performStep_3007() {
        if (!sorting_3007) return;

        if (tipeSort_3007.equals("Insertion Sort")) {
            stepInsertionSort_3007();
        } else if (tipeSort_3007.equals("Selection Sort")) {
            stepSelectionSort_3007();
        } else if (tipeSort_3007.equals("Bubble Sort")) {
            stepBubbleSort_3007();
        }
    }

    // INSERTION SORT
    private void stepInsertionSort_3007() {
        if (i_3007 < dataProses_3007.size()) {
            Mahasiswa_2511533007 key_3007 = dataProses_3007.get(i_3007);
            int j_3007 = i_3007 - 1;

            while (j_3007 >= 0 && dataProses_3007.get(j_3007).getNama_3007().compareToIgnoreCase(key_3007.getNama_3007()) > 0) {
                dataProses_3007.set(j_3007 + 1, dataProses_3007.get(j_3007));
                j_3007--;
            }
            dataProses_3007.set(j_3007 + 1, key_3007);

            catatLangkah_3007("Langkah");
            i_3007++;
            
            if (i_3007 == dataProses_3007.size()) sortingSelesai_3007();
        }
    }

    // SELECTION SORT
    private void stepSelectionSort_3007() {
        if (i_3007 < dataProses_3007.size() - 1) {
            int minIndex_3007 = i_3007;
            for (int j_3007 = i_3007 + 1; j_3007 < dataProses_3007.size(); j_3007++) {
                if (dataProses_3007.get(j_3007).getNama_3007().compareToIgnoreCase(dataProses_3007.get(minIndex_3007).getNama_3007()) < 0) {
                    minIndex_3007 = j_3007;
                }
            }
            Mahasiswa_2511533007 temp_3007 = dataProses_3007.get(i_3007);
            dataProses_3007.set(i_3007, dataProses_3007.get(minIndex_3007));
            dataProses_3007.set(minIndex_3007, temp_3007);

            catatLangkah_3007("Pass");
            i_3007++;

            if (i_3007 == dataProses_3007.size() - 1) sortingSelesai_3007();
        }
    }

    // BUBBLE SORT
    private void stepBubbleSort_3007() {
        if (i_3007 < dataProses_3007.size() - 1) {
            boolean swapped_3007 = false;
            
            for (int j_3007 = 0; j_3007 < dataProses_3007.size() - i_3007 - 1; j_3007++) {
                if (dataProses_3007.get(j_3007).getNama_3007().compareToIgnoreCase(dataProses_3007.get(j_3007 + 1).getNama_3007()) > 0) {
                    // Swap
                    Mahasiswa_2511533007 temp_3007 = dataProses_3007.get(j_3007);
                    dataProses_3007.set(j_3007, dataProses_3007.get(j_3007 + 1));
                    dataProses_3007.set(j_3007 + 1, temp_3007);
                    swapped_3007 = true;
                }
            }

            catatLangkah_3007("Pass");
            i_3007++;
            if (!swapped_3007 || i_3007 == dataProses_3007.size() - 1) {
                sortingSelesai_3007();
            }
        }
    }

    // Memperbarui visualisasi dan log langkah
    private void catatLangkah_3007(String istilahLangkah) {
        updateLabelVisual_3007();
        String hasilLangkah = istilahLangkah + " " + stepCount_3007 + " : " + arrayToString_3007();
        stepArea_3007.append(hasilLangkah + "\n");
        System.out.println(hasilLangkah);
        stepCount_3007++;
    }

    private void updateLabelVisual_3007() {
        for (int k_3007 = 0; k_3007 < dataProses_3007.size(); k_3007++) {
            labelArray_3007[k_3007].setText(dataProses_3007.get(k_3007).getNama_3007());
        }
        panelArray_3007.revalidate();
        panelArray_3007.repaint();
    }

    private void sortingSelesai_3007() {
        sorting_3007 = false;
        btnLangkah_3007.setEnabled(false);
        btnMulaiSort_3007.setEnabled(true);
        btnTambah_3007.setEnabled(true);
        
        stepArea_3007.append("\nPengurutan Selesai!\n");
        JOptionPane.showMessageDialog(this, "Proses Sorting Selesai!");
    }
    // Reset data
    private void resetSemua_3007() {
        dataAwal_3007.clear();
        panelArray_3007.removeAll();
        panelArray_3007.revalidate();
        panelArray_3007.repaint();
        stepArea_3007.setText("");
        
        btnLangkah_3007.setEnabled(false);
        btnMulaiSort_3007.setEnabled(true);
        btnTambah_3007.setEnabled(true);
        
        sorting_3007 = false;
    }

    private String arrayToString_3007() {
        StringBuilder sb_3007 = new StringBuilder();
        sb_3007.append("[");
        for (int k_3007 = 0; k_3007 < dataProses_3007.size(); k_3007++) {
            sb_3007.append(dataProses_3007.get(k_3007).getNama_3007());
            if (k_3007 < dataProses_3007.size() - 1) sb_3007.append(", ");
        }
        sb_3007.append("]");
        return sb_3007.toString();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            GUIMahasiswa_2511533007 gui_3007 = new GUIMahasiswa_2511533007();
            gui_3007.setVisible(true);
        });
    }
}