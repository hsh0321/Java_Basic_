package Swing_Xml_Parsing;

import java.awt.*;
import java.io.IOException;

import javax.swing.*;

public class NewsMain {
    JFrame f;
    JButton b, link;
    JList li;
    JTextArea ta;
    INewsDAO dao;
    JScrollPane scroll;

    public NewsMain() {
        dao = new NewsDAOSAXImpl();
        createGUI();
        addEvent();
        showList();
    }

    public void createGUI() {
        f = new JFrame("NewsList");
        JPanel p = new JPanel();
        b = new JButton("News List 호출");
        li = new JList();
        ta = new JTextArea("");
        ta.setLineWrap(true);
        p.setLayout(new BorderLayout());
        p.add(b, "North");
        scroll = new JScrollPane();
        scroll.setViewportView(li);
        p.add(scroll);
        f.setLayout(new GridLayout(3, 1, 5, 5));
        f.add(p);
        f.add(ta);
        link = new JButton("link 이동");
        f.add(link, "South");
        f.setSize(500, 500);
        f.setVisible(true);

    }

    public void addEvent() {
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // actionPerformed
        b.addActionListener(e -> showList());
        // valueChanged


        li.addListSelectionListener(e -> {
            News n = (News) li.getSelectedValue();
            if (li.getValueIsAdjusting()) {
                ta.setText(n.getDesc());
            }
        });

        link.addActionListener(r -> {
            Runtime exe = Runtime.getRuntime();
            try {
                News n = (News) li.getSelectedValue();
                exe.exec(new String[]{"/usr/bin/open", "-a", "/Applications/Google Chrome.app", n.getLink().trim()});
                System.out.println(n.getLink());
            } catch (IOException e1) {
                e1.printStackTrace();
            }
        });

    }

    public void showList() {
        java.util.List<News> datas = dao.getNewsList("http://rss.etnews.com/Section902.xml");
        li.removeAll();

        // scroll = new JScrollPane(li);
        li.setListData(datas.toArray());

    }

    public static void main(String[] args) {
        new NewsMain();
    }

}