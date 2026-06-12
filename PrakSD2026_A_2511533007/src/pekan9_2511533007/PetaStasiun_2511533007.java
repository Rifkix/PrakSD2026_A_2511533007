package pekan9_2511533007;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;

public class PetaStasiun_2511533007 extends JFrame {

    private static final long serialVersionUID = 1L;
    
    // Inisialisasi Komponen GUI
    private JComboBox<String> cbAwal_3007;
    private JComboBox<String> cbTujuan_3007;
    private JButton btnBfs_3007, btnDfs_3007, btnReset_3007;
    private JTextArea txtGraph_3007;
    private JTextArea txtHasil_3007;
    
    // Inisialisasi struktur data
    private Map<String, List<String>> graph_3007 = new LinkedHashMap<>();

    public PetaStasiun_2511533007() {
        // Setup Frame
        setTitle("Pencarian Jalur BFS & DFS Stasiun Kereta Api");
        setSize(850, 450);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        JPanel inputPanel_3007 = new JPanel(new FlowLayout());
        inputPanel_3007.add(new JLabel("Lokasi Awal:"));
        
        String[] stasiun_3007 = {"padang", "padang pariaman", "bukittinggi", "payakumbuh", "pasa baru", "ulak karang", "tunggul hitam", "pauh", "limau manih", "unand"};
        cbAwal_3007 = new JComboBox<>(stasiun_3007);
        inputPanel_3007.add(cbAwal_3007);

        inputPanel_3007.add(new JLabel("   Lokasi Tujuan:"));
        cbTujuan_3007 = new JComboBox<>(stasiun_3007);
        inputPanel_3007.add(cbTujuan_3007);

        JPanel panelGraph_3007 = new JPanel(new BorderLayout());
        panelGraph_3007.setBorder(BorderFactory.createTitledBorder("Visualisasi Graph Stasiun"));
        txtGraph_3007 = new JTextArea();
        txtGraph_3007.setEditable(false);
        txtGraph_3007.setFont(new Font("Monospaced", Font.PLAIN, 12));
        txtGraph_3007.setBackground(new Color(245, 245, 245));
        JScrollPane scrollGraph_3007 = new JScrollPane(txtGraph_3007);
        panelGraph_3007.add(scrollGraph_3007, BorderLayout.CENTER);

        JPanel panelHasil_3007 = new JPanel(new BorderLayout());
        panelHasil_3007.setBorder(BorderFactory.createTitledBorder("Log Pencarian Jalur"));
        txtHasil_3007 = new JTextArea(15, 35);
        txtHasil_3007.setEditable(false);
        txtHasil_3007.setFont(new Font("Monospaced", Font.PLAIN, 13));
        JScrollPane scrollHasil_3007 = new JScrollPane(txtHasil_3007);
        panelHasil_3007.add(scrollHasil_3007, BorderLayout.CENTER);

        JPanel controlPanel_3007 = new JPanel(new FlowLayout());
        btnBfs_3007 = new JButton("Gunakan BFS");
        btnBfs_3007.setBackground(new Color(144, 238, 144));
        
        btnDfs_3007 = new JButton("Gunakan DFS");
        btnDfs_3007.setBackground(new Color(255, 204, 102));
        
        btnReset_3007 = new JButton("Reset Form");
        btnReset_3007.setBackground(new Color(255, 102, 102));

        controlPanel_3007.add(btnBfs_3007);
        controlPanel_3007.add(btnDfs_3007);
        controlPanel_3007.add(btnReset_3007);

        add(inputPanel_3007, BorderLayout.NORTH);
        add(panelGraph_3007, BorderLayout.CENTER);
        add(panelHasil_3007, BorderLayout.EAST);
        add(controlPanel_3007, BorderLayout.SOUTH);

        // Inisialisasi Graph & Event
        initGraph_3007();
        displayGraph_3007();

        // Event Listener
        btnBfs_3007.addActionListener(e -> BFS_3007());
        btnDfs_3007.addActionListener(e -> DFS_3007());
        btnReset_3007.addActionListener(e -> resetGraph_3007());
    }

    private void initGraph_3007() {
        // Inisialisasi node 
        String[] nodes_3007 = {"padang", "padang pariaman", "bukittinggi", "payakumbuh", "pasa baru", "ulak karang", "tunggul hitam", "pauh", "limau manih", "unand"};
        for (String n_3007 : nodes_3007) {
            graph_3007.put(n_3007, new ArrayList<>());
        }
        
        addEdge_3007("padang", "ulak karang");
        addEdge_3007("ulak karang", "tunggul hitam");
        addEdge_3007("pasa baru", "pauh");
        addEdge_3007("pauh", "limau manih");
        addEdge_3007("unand", "padang pariaman");
        addEdge_3007("padang pariaman", "bukittinggi");
        addEdge_3007("bukittinggi", "payakumbuh");
        addEdge_3007("padang", "pasa baru");
        addEdge_3007("pasa baru", "unand");
        addEdge_3007("ulak karang", "pauh");
        addEdge_3007("pauh", "padang pariaman");
        addEdge_3007("tunggul hitam", "limau manih");
        addEdge_3007("limau manih", "bukittinggi");
        addEdge_3007("pasa baru", "ulak karang");
        addEdge_3007("pauh", "bukittinggi");
    }

    private void addEdge_3007(String a_3007, String b_3007) {
        graph_3007.get(a_3007).add(b_3007);
        graph_3007.get(b_3007).add(a_3007);
    }

    private void displayGraph_3007() {
        txtGraph_3007.setText(
            "\n" +
            "  padang ------------------ ulak karang ---------------- tunggul hitam\n" +
            "    |                        /   |                             |\n" +
            "    |                       /    |                             |\n" +
            "  pasa baru ---------------    pauh --------------------- limau manih\n" +
            "    |                            |  \\                          |\n" +
            "    |                            |   \\                         |\n" +
            "  unand ---- padang pariaman ---- bukittinggi ----------- payakumbuh\n"
        );
    }

    // Melakukan pencarian menggunakan BFS
    private void BFS_3007() {
        search_3007(true);
    }

    // Melakukan pencarian menggunakan DFS
    private void DFS_3007() {
        search_3007(false);
    }

    // Algoritma Pencarian
    private void search_3007(boolean isBfs_3007) {
        String start_3007 = (String) cbAwal_3007.getSelectedItem();
        String goal_3007 = (String) cbTujuan_3007.getSelectedItem();

        List<String> visitedOrder_3007 = new ArrayList<>();
        Map<String, String> parent_3007 = new HashMap<>();
        boolean found_3007 = false;

        if (isBfs_3007) {
            Queue<String> queue_3007 = new LinkedList<>();
            Set<String> visited_3007 = new HashSet<>();

            queue_3007.add(start_3007);
            visited_3007.add(start_3007);

            while (!queue_3007.isEmpty()) {
                String curr_3007 = queue_3007.poll();
                visitedOrder_3007.add(curr_3007);

                if (curr_3007.equals(goal_3007)) {
                    found_3007 = true;
                    break;
                }

                for (String neighbor_3007 : graph_3007.get(curr_3007)) {
                    if (!visited_3007.contains(neighbor_3007)) {
                        visited_3007.add(neighbor_3007);
                        parent_3007.put(neighbor_3007, curr_3007);
                        queue_3007.add(neighbor_3007);
                    }
                }
            }
        } else {
            Stack<String> stack_3007 = new Stack<>();
            Set<String> visited_3007 = new HashSet<>();

            stack_3007.push(start_3007);

            while (!stack_3007.isEmpty()) {
                String curr_3007 = stack_3007.pop();

                if (!visited_3007.contains(curr_3007)) {
                    visited_3007.add(curr_3007);
                    visitedOrder_3007.add(curr_3007);

                    if (curr_3007.equals(goal_3007)) {
                        found_3007 = true;
                        break;
                    }

                    // Reverse agar DFS konsisten dengan urutan input visual kiri-kanan
                    List<String> neighbors_3007 = new ArrayList<>(graph_3007.get(curr_3007));
                    Collections.reverse(neighbors_3007);

                    for (String neighbor_3007 : neighbors_3007) {
                        if (!visited_3007.contains(neighbor_3007)) {
                            stack_3007.push(neighbor_3007);
                            if (!parent_3007.containsKey(neighbor_3007)) {
                                parent_3007.put(neighbor_3007, curr_3007);
                            }
                        }
                    }
                }
            }
        }

        displayPath_3007(start_3007, goal_3007, parent_3007, visitedOrder_3007, found_3007, isBfs_3007 ? "BFS" : "DFS");
    }

    // Menampilkan Jalur yang Ditemukan
    private void displayPath_3007(String start_3007, String goal_3007, Map<String, String> parent_3007, 
                                  List<String> visitedOrder_3007, boolean found_3007, String method_3007) {
        StringBuilder pathLog_3007 = new StringBuilder();
        
        if (found_3007) {
            List<String> route_3007 = new ArrayList<>();
            String step_3007 = goal_3007;
            while (step_3007 != null) {
                route_3007.add(step_3007);
                step_3007 = parent_3007.get(step_3007);
            }
            Collections.reverse(route_3007);
            pathLog_3007.append(String.join(" -> ", route_3007));
        } else {
            pathLog_3007.append("Jalur tidak ditemukan!");
        }

        txtHasil_3007.setText("");
        txtHasil_3007.append("Metode Pencarian   : " + method_3007 + "\n");
        txtHasil_3007.append("Lokasi Awal        : " + start_3007 + "\n");
        txtHasil_3007.append("Lokasi Tujuan      : " + goal_3007 + "\n");
        txtHasil_3007.append("-----------------------------------\n");
        txtHasil_3007.append("Jalur (Path)       : \n" + pathLog_3007.toString() + "\n\n");
        txtHasil_3007.append("Urutan Node Dikunjungi : \n" + String.join(", ", visitedOrder_3007) + "\n\n");
        txtHasil_3007.append("Jumlah Node Eksplorasi : " + visitedOrder_3007.size() + "\n");
    }

    // Mengembalikan Kondisi Form ke Awal
    private void resetGraph_3007() {
        cbAwal_3007.setSelectedIndex(0);
        cbTujuan_3007.setSelectedIndex(0);
        txtHasil_3007.setText("");
    }

    // Eksekusi GUI
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            PetaStasiun_2511533007 gui_3007 = new PetaStasiun_2511533007();
            gui_3007.setVisible(true);
        });
    }
}