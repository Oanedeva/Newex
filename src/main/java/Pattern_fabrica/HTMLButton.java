package Pattern_fabrica;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HTMLButton implements Button{
    private final JPanel panel=new JPanel();
    private final JFrame frame=new JFrame();
    private JButton button;
    @Override
    public void render() {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label=new JLabel("(0^0)");
        label.setOpaque(true);
        label.setFont(new Font("Dialog",Font.BOLD,25));
        label.setHorizontalAlignment(SwingConstants.CENTER);

        panel.setLayout(new FlowLayout(FlowLayout.CENTER));
        frame.getContentPane().add(panel);
        panel.add(label);
        onClick();
        panel.add(button);

        frame.setSize(320,200);
        frame.setVisible(true);
        onClick();
    }

    @Override
    public void onClick() {
        button=new JButton("Exit");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false);
                System.exit(0);
            }
        });
    }
}
