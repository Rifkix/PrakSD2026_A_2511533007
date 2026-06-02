package pekan8_2511533007;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;
import java.lang.reflect.Array;

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

public class MergeSortGUI_2511533007 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private int[] array_3007;
	private JLabel[] labelArray_3007;
	private JButton stepButton_3007, resetButton_3007, setButton_3007;
	private JTextField inputField_3007;
	private JPanel panelArray_3007;
	private JTextArea stepArea_3007;
	
	private int i_3007, j_3007, k_3007;
	private boolean sorting_3007 = false;
	private int stepCount_3007 = 1;
	private java.util.Queue<int[]> mergeQueue_3007 = new java.util.LinkedList<>();
	private boolean isMerging_3007 = false;
	private int left_3007, mid_3007, right_3007;
	private int[] temp_3007;
	private boolean copying_3007 = false;
	
	public MergeSortGUI_2511533007() {
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
		String [] parts_3007 = text_3007.split(",");
		array_3007 = new int[parts_3007.length];
		try {
			for (int k_3007 = 0; k_3007 < parts_3007.length; k_3007++) {
				array_3007[k_3007] = Integer.parseInt(parts_3007[k_3007].trim());
			} 
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(this, "Masukkan hanya angka yang dipisahkan " 
					+ "dengan koma!", "Error", JOptionPane.ERROR_MESSAGE);
			return;
		}
		labelArray_3007 = new JLabel[array_3007.length];
		panelArray_3007.removeAll();
		for (int i_3007 = 0; i_3007 < array_3007.length; i_3007++) {
			labelArray_3007[i_3007] = new JLabel(String.valueOf(array_3007[i_3007]));
			labelArray_3007[i_3007].setFont(new Font("Arial", Font.BOLD,24));
			labelArray_3007[i_3007].setOpaque(true);
			labelArray_3007[i_3007].setBackground(Color.WHITE);
			labelArray_3007[i_3007].setBorder(BorderFactory.createLineBorder(Color.BLACK));
			labelArray_3007[i_3007].setPreferredSize(new Dimension(50, 50));
			labelArray_3007[i_3007].setHorizontalAlignment(SwingConstants.CENTER);
			panelArray_3007.add(labelArray_3007[i_3007]);
		}
		mergeQueue_3007.clear();
		generateMergeSteps_3007(0, array_3007.length - 1);
		stepButton_3007.setEnabled(true);
		stepArea_3007.setText("");
		stepCount_3007 = 1;
		isMerging_3007 = false;
		panelArray_3007.revalidate();
		panelArray_3007.repaint();
	}
	 private void generateMergeSteps_3007(int left_3007, int right_3007) {
		if (left_3007 < right_3007) {
			int mid_3007 = left_3007 + (right_3007 - left_3007) / 2;

			generateMergeSteps_3007(left_3007, mid_3007);
			generateMergeSteps_3007(mid_3007 + 1, right_3007);

			mergeQueue_3007.add(new int[] { left_3007, mid_3007, right_3007 });
		}
	}
	
	private void performStep_3007() {
		resetHighlights_3007();
		
		if (!isMerging_3007 && !mergeQueue_3007.isEmpty()) {
			int [] range_3007 = mergeQueue_3007.poll();
			left_3007 = range_3007[0];
			mid_3007 = range_3007[1];
			right_3007 = range_3007[2];
			temp_3007 = new int[right_3007 - left_3007 + 1];
			i_3007 = left_3007;
			j_3007 = mid_3007 + 1;
			k_3007 = 0;
			copying_3007 = false;
			isMerging_3007 = true;
			stepArea_3007.append("Langkah " + stepCount_3007++ + ": Mulai merge dari " + left_3007 + " ke " + right_3007 + "\n");
			return;
		}
		
		if (isMerging_3007 && !copying_3007) {
			if (i_3007 <= mid_3007 && j_3007 <= right_3007) {
				labelArray_3007[i_3007].setBackground(Color.CYAN);
				labelArray_3007[j_3007].setBackground(Color.CYAN);
				if (array_3007[i_3007] <= array_3007[j_3007]) {
					temp_3007[k_3007++] = array_3007[i_3007++];
				} else {
					temp_3007[k_3007++] = array_3007[j_3007++];
				}
				stepArea_3007.append("Langkah " + stepCount_3007++ + ": Bandingkan dan saling elemen\n");
				return;
			} else if (i_3007 <= mid_3007) {
				temp_3007[k_3007++] = array_3007[i_3007++];
				stepArea_3007.append("Langkah " + stepCount_3007++ + ": Salin sisa kanan\n");
				return;
			} else if (j_3007 <= right_3007) {
				temp_3007[k_3007++] = array_3007[j_3007++];
				stepArea_3007.append("Langkah " + stepCount_3007++ + ": Salin sisa kanan\n");
				return;
			} else {
				copying_3007 = true;
				k_3007 = 0;
				return;
			}
			
		}
		if (copying_3007 && k_3007 < temp_3007.length) {
			array_3007[left_3007 + k_3007] = temp_3007[k_3007];
			labelArray_3007[left_3007 + k_3007].setText(String.valueOf(temp_3007[k_3007]));
			labelArray_3007[left_3007 + k_3007].setBackground(Color.GREEN);
			k_3007++;
			stepArea_3007.append("Langkah " + stepCount_3007++ + ": Tempelkan ke array utama\n");
			return;
		}

		if (copying_3007 && k_3007 == temp_3007.length) {
			isMerging_3007 = false;
			copying_3007 = false;
		}

		if (mergeQueue_3007.isEmpty() && !isMerging_3007) {
			stepArea_3007.append("Selesai.\n");
			stepButton_3007.setEnabled(false);
			JOptionPane.showMessageDialog(this, "Merge Sort selesai!");
		}
	}

	private void resetHighlights_3007() {
		if (labelArray_3007 == null) return;
		for (JLabel label_3007 : labelArray_3007) {
			label_3007.setBackground(Color.WHITE);
		}
	}

	private void reset_3007() {
		inputField_3007.setText("");
		panelArray_3007.removeAll();
		panelArray_3007.revalidate();
		panelArray_3007.repaint();
		stepArea_3007.setText("");
		stepButton_3007.setEnabled(false);
		mergeQueue_3007.clear();
		isMerging_3007 = false;
		stepCount_3007 = 1;
	}


	private String arrayToString_3007(int[] arr_3007) {
		StringBuilder sb_3007 = new StringBuilder();
		for (int k_3007 = 0; k_3007 < arr_3007.length; k_3007++) {
			sb_3007.append(arr_3007[k_3007]);
			if (k_3007 < arr_3007.length - 1) sb_3007.append(", ");
		}
		return sb_3007.toString();
	}
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(() -> {
			MergeSortGUI_2511533007 gui_3007 = new MergeSortGUI_2511533007();
			gui_3007.setVisible(true);
		});
	}
}