package pekan7_2511533007;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.border.EmptyBorder;

public class InsertionSortGUI_2511533007 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private int[] array_3007;
	private JLabel[] labelArray_3007;
	private JButton stepButton_3007, resetButton_3007, setButton_3007;
	private JTextField inputField_3007;
	private JPanel panelArray_3007;
	private JTextArea stepArea_3007;
	
	private int i = 1, j;
	private boolean sorting_3007 = false;
	private int stepCount_3007 = 1;
	
	public InsertionSortGUI_2511533007() {
		setTitle("Insertion Sort Langkah per Langkah");
		setSize(750, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(new BorderLayout());
		
		// Panel input
		JPanel inputPanel_3007 = new JPanel(new FlowLayout());
		inputField_3007 = new JTextField(30);
		setButton_3007 = new JButton("Set Array");
		inputPanel_3007.add(new JLabel ("Masukkan angka (pisahkan dengan koma):"));
		inputPanel_3007.add(inputField_3007);
		inputPanel_3007.add(setButton_3007);
		
		// Panel array visual
		panelArray_3007 = new JPanel();
		panelArray_3007.setLayout(new FlowLayout());
		
		// Panel kontrol
		JPanel controlPanel_3007 = new JPanel();
		stepButton_3007 = new JButton("Langkah Selanjutnya");
		resetButton_3007 = new JButton("Reset");
		stepButton_3007.setEnabled(false);
		controlPanel_3007.add(stepButton_3007);
		controlPanel_3007.add(resetButton_3007);
		
		// Area teks untuk log langkah-langkah
		stepArea_3007 = new JTextArea(8, 60);
		stepArea_3007.setEditable(false);
		stepArea_3007.setFont(new Font("Monospaced", Font.PLAIN, 14));
		JScrollPane scrollPane_3007 = new JScrollPane(stepArea_3007);
		
		// Tambahkan panel ke frame
		add(inputPanel_3007, BorderLayout.NORTH);
		add(panelArray_3007, BorderLayout.CENTER);
		add(controlPanel_3007, BorderLayout.SOUTH);
		add(scrollPane_3007, BorderLayout.EAST);
		
		// Event Set Array
		setButton_3007.addActionListener(e -> setArrayFromInput());
		
		// Event Langkah Selanjutnya
		stepButton_3007.addActionListener(e -> performStep_3007());
		
		// Event Reset
		resetButton_3007.addActionListener(e -> reset_3007());
	}
		
	private void setArrayFromInput() {
		String text_3007 = inputField_3007.getText().trim();
		if (text_3007.isEmpty()) return;
		String [] parts = text_3007.split(",");
		array_3007 = new int[parts.length];
		try {
			for (int k = 0; k < parts.length; k++) {
				array_3007[k] = Integer.parseInt(parts[k].trim());
			} 
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(this, "Masukkan hanya angka yang dipisahkan " 
					+ "dengan koma!", "Error", JOptionPane.ERROR_MESSAGE);
			return;
		}
		i = 1;
		stepCount_3007 = 1;
		sorting_3007 = true;
		stepButton_3007.setEnabled(true);
		stepArea_3007.setText("");
		panelArray_3007.removeAll();
		labelArray_3007 = new JLabel[array_3007.length];
		for (int k = 0; k < array_3007.length; k++) {
			labelArray_3007[k] = new JLabel(String.valueOf(array_3007[k]));
			labelArray_3007[k].setFont(new Font("Arial", Font.BOLD,24));
			labelArray_3007[k].setBorder(BorderFactory.createLineBorder(Color.BLACK));
			labelArray_3007[k].setPreferredSize(new Dimension(50, 50));
			labelArray_3007[k].setHorizontalAlignment(SwingConstants.CENTER);
			panelArray_3007.add(labelArray_3007[k]);
		}
		panelArray_3007.revalidate();
		panelArray_3007.repaint();
	}
	
	private void performStep_3007() {
	    if (i < array_3007.length && sorting_3007) {
	        int key_3007 = array_3007[i];
	        j = i - 1;

	        StringBuilder stepLog_3007 = new StringBuilder();
	        stepLog_3007.append("Langkah ").append(stepCount_3007).
	        append(": Memasukkan ").append(key_3007).append("\n");

	        while (j >= 0 && array_3007[j] > key_3007) {
	            array_3007[j + 1] = array_3007[j];
	            j--;
	        }
	        array_3007[j + 1] = key_3007;

	        updateLabels_3007();
	        stepLog_3007.append("Hasil: ").append(arrayToString_3007(array_3007)).append("\n\n");
	        stepArea_3007.append(stepLog_3007.toString());

	        i++;
	        stepCount_3007++;

	        if (i == array_3007.length) {
	            sorting_3007 = false;
	            stepButton_3007.setEnabled(false);
	            JOptionPane.showMessageDialog(this, "Sorting selesai!");
	        }
	    }
	}
	
	private void updateLabels_3007() {
	    for (int k = 0; k < array_3007.length; k++) {
	        labelArray_3007[k].setText(String.valueOf(array_3007[k]));
	    }
	}
	
	private void reset_3007() {
	    inputField_3007.setText("");
	    panelArray_3007.removeAll();
	    panelArray_3007.revalidate();
	    panelArray_3007.repaint();
	    stepArea_3007.setText("");
	    stepButton_3007.setEnabled(false);
	    sorting_3007 = false;
	    i = 1;
	    stepCount_3007 = 1;
	}
	
	private String arrayToString_3007(int[] arr) {
	    StringBuilder sb_3007 = new StringBuilder();
	    for (int k = 0; k < arr.length; k++) {
	        sb_3007.append(arr[k]);
	        if (k < arr.length - 1) sb_3007.append(", ");
	    }
	    return sb_3007.toString();
	}
	
	public static void main(String[] args) {
	    SwingUtilities.invokeLater(() -> {
	        InsertionSortGUI_2511533007 gui = new InsertionSortGUI_2511533007();
	        gui.setVisible(true);
	    });
	}
}