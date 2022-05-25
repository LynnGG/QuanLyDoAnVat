/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import GDAdmin.QuanLyMenu;
import GDAdmin.QuanLyThongKe;
import GDAdmin.QuanLyNhanVien;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.MouseListener;
import java.util.List;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import org.w3c.dom.events.MouseEvent;
import sun.awt.ModalityEvent;
import sun.awt.ModalityListener;

/**
 *
 * @author trant
 */
public class controllerGD {

    private JPanel root;
    private String kinSelected = "";

    private List<danhmuc> listItem = null;

    public controllerGD(JPanel jPanel) {
        this.root = jPanel;
    }

    public void setView() {
        kinSelected = "NhanVien";
        root.removeAll();
        root.setLayout(new BorderLayout());
        root.add(new QuanLyNhanVien());
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
                case "NhanVien":
                    node = new QuanLyNhanVien();
                    break;
                case "Menu":
                    node = new QuanLyMenu();
                    break;
                case "ThongKe":
                    node = new QuanLyThongKe();
                    break;
                default:
                    node = new QuanLyNhanVien();
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
