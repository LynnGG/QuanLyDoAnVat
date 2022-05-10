/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Member;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.MouseListener;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author ACER
 */
public class giaoDienDao {
    private JPanel root;
    private String kinSelected = "";

    private List<danhmuc> listItem = null;

    giaoDienDao(JPanel jPanel) {
        this.root = jPanel;
    }

    void setView() {
        kinSelected = "TraSua";
        root.removeAll();
        root.setLayout(new BorderLayout());
        root.add(new giaoDienTraSua());
        root.validate();
        root.repaint();

    }

    public void setEvent(List<danhmuc> listItem) {
        this.listItem = listItem;
        for (danhmuc i : listItem) {
            i.getJlb().addMouseListener(new LabelEvent(i.getKinds(), i.getJpn(), i.getJlb()));
        }
    }
    
    class LabelEvent implements MouseListener {

        private JPanel node;
        private String kind;
        private JPanel ipnItem;
        private JLabel jblItem;

        public LabelEvent(String kind, JPanel ipnItem, JLabel jblItem) {
            this.kind = kind;
            this.ipnItem = ipnItem;
            this.jblItem = jblItem;
        }

        @Override
        public void mouseClicked(java.awt.event.MouseEvent me) {
            switch (kind) {
                case "TraSua":
                    node = new giaoDienTraSua();
                    break;
                case "DoAn":
                    node = new giaoDienDoAn();
                    break;
                case "TranChau":
                    node = new giaoDienTranChau();
                    break;
                default:
                    node = new giaoDienTraSua();
                    break;
            }

            root.removeAll();
            root.setLayout(new BorderLayout());
            root.add(node);
            root.validate();
            root.repaint();

        }

        @Override
        public void mousePressed(java.awt.event.MouseEvent me) {
            kinSelected = kind;
        }

        @Override
        public void mouseReleased(java.awt.event.MouseEvent me) {
            //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void mouseEntered(java.awt.event.MouseEvent me) {

        }

        @Override
        public void mouseExited(java.awt.event.MouseEvent me) {
            if (!kinSelected.equalsIgnoreCase(kind)) {

            }
        }

        private void setChangeBackground(String kind) {
            for (danhmuc item : listItem) {
                if (item.getKinds().equalsIgnoreCase(kind)) {
                    item.getJlb().setBackground(Color.yellow);
                    item.getJpn().setBackground(Color.BLUE);
                } else {
                    item.getJlb().setBackground(Color.yellow);
                    item.getJpn().setBackground(Color.BLUE);
                }
            }
        }
    }
}
