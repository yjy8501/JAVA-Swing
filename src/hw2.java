import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class hw2 extends JFrame {

    public JButton btn = new JButton("Action");
    Container c = getContentPane();

    public hw2() {
        setTitle("이벤트 리스너 연습");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        c.setLayout(null);

        btn.setSize(85, 35);
        btn.setLocation(100, 100);
        btn.addActionListener(new btn_Action());
        c.add(btn);
        c.addMouseListener(new mouse_Action());
        c.addKeyListener(new Key_Action());
        c.addMouseWheelListener(new mouse_WheelAction());

        setSize(500, 500);
        setVisible(true);
        c.setFocusable(true);
        c.requestFocus();
    }

    public static void main(String[] args) {
        new hw2();

    }

    class mouse_Action extends MouseAdapter {
        @Override
        public void mousePressed(MouseEvent e) {
            super.mousePressed(e);

            int x = e.getX();
            int y = e.getY();
            btn.setLocation(x, y);


        }

    }

    class btn_Action implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            JButton btn = (JButton)e.getSource();
            if(btn.getText().equals("Action"))
                btn.setText("액션");
            else
                btn.setText("Action");

            setVisible(true);
            c.setFocusable(true);
            c.requestFocus();

        }
    }

    class mouse_WheelAction extends MouseAdapter {
        @Override
        public void mouseWheelMoved(MouseWheelEvent e) {
            super.mouseWheelMoved(e);
            int n = e.getWheelRotation();

            if(n < 0) {

                btn.setSize(btn.getSize().width + 10, btn.getSize().height + 10);
                btn.setText("위로 스크롤");
                btn.setFont(new Font("돋움", Font.PLAIN, btn.getFont().getSize() + 1));


            }
            else {

                btn.setSize(btn.getSize().width - 10, btn.getSize().height - 10);
                btn.setText("아래로 스크롤");
                btn.setFont(new Font("돋움", Font.PLAIN, btn.getFont().getSize() - 1));
            }
        }
    }


    class Key_Action extends KeyAdapter {
        public void keyPressed(KeyEvent e) {
            int keyCode = e.getKeyCode();
            Container c = (Container) e.getSource();

            btn.setText(KeyEvent.getKeyText(keyCode));

            if(keyCode == KeyEvent.VK_RIGHT)
                c.setBackground(Color.YELLOW);
            else if(keyCode == KeyEvent.VK_LEFT)
                c.setBackground(Color.blue);
            else if(keyCode == KeyEvent.VK_UP)
                c.setBackground(Color.red);
            else if(keyCode == KeyEvent.VK_DOWN)
                c.setBackground(Color.green);

            switch (keyCode) {
                case KeyEvent.VK_UP:
                    btn.setLocation(btn.getX(), btn.getY() - 10);
                    break;

                case KeyEvent.VK_DOWN:
                    btn.setLocation(btn.getX(), btn.getY() + 10);
                    break;

                case KeyEvent.VK_RIGHT:
                    btn.setLocation(btn.getX() + 10, btn.getY());
                    break;

                case KeyEvent.VK_LEFT:
                    btn.setLocation(btn.getX() - 10, btn.getY());
                    break;
            }

        }

    }

}