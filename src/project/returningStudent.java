package project;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Jpanel01 extends JPanel {

    private ImageIcon image = new ImageIcon("src/project/resource/Return_Shine.jpg");
    private JLabel ssul = new JLabel("<html>안녕 내 이름은 꽃길만이야,,,!! 길고 긴 군생활을 마치고 드디어 복학하게 되었어!!<br/>" +
            "앞으로 어떤 설레는 일들이 내 앞에 있을까!!!</html>",JLabel.CENTER);

    private JButton select_one = new JButton("\"꼬르륵,,,, 배가 고프네 오랜만에 학식 먹으러 가볼까,,??\" (학식을 먹으러 간다)");
    private JButton select_two = new JButton("\"오랜만에 학부방으로 가보자!! 혹시 친구들이 있을지도,,,??\" (학부방으로 간다)");
    private returningStudent c;

    public Jpanel01 (returningStudent c) {

        this.c = c;

        setLayout(null);

        image = imageSetSize(image, 400, 170);
        JLabel imageLabel = new JLabel(image);

        add(imageLabel);
        add(ssul);
        add(select_one);
        add(select_two);

        select_one.addActionListener(new btn_panel01_1());
        select_two.addActionListener(new btn_panel01_2());

        imageLabel.setSize(350,150);
        imageLabel.setLocation(200,80);

        ssul.setSize(700,100);
        ssul.setFont(new Font("돋움", Font.PLAIN, 15));
        ssul.setLocation(50, 250);

        select_one.setSize(500,30);
        select_one.setLocation(150, 350);

        select_two.setSize(500,30);
        select_two.setLocation(150, 390);

    }

    class btn_panel01_1 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {

            c.change("Jpanel01_1");

        }
    }

    class btn_panel01_2 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {

            c.change("Jpanel02");

        }
    }

    public ImageIcon imageSetSize(ImageIcon icon, int h, int w) {
        Image ximg = icon.getImage();
        Image yimg = ximg.getScaledInstance(h, w, Image.SCALE_SMOOTH);
        ImageIcon xyimg = new ImageIcon(yimg);
        return xyimg;
    }
}

class Jpanel01_1 extends JPanel {

    private ImageIcon image = new ImageIcon("src/project/resource/Restaurant.jpg");
    private JLabel ssul = new JLabel("<html>오랜만에 학식당에 오니까 안보이던 메뉴도 많네,,,,, 어떤걸 먹어야할까,,,<br/>\n" +
            "아앗,,,, 저기 보이는 저 사람은,,,??</html>",JLabel.CENTER);

    private JButton select_one = new JButton("\"어디서 많이 본듯한 여성에게 말을 걸어본다.\"");
    private JButton select_two = new JButton("\"어디서 많이 본듯한 남성에게 말을 걸어본다.\"");
    private JButton select_three = new JButton("\"처음 본듯한 여성에게 말을 걸어본다.\"");
    private returningStudent c;

    public Jpanel01_1 (returningStudent c) {

        this.c = c;

        setLayout(null);

        image = imageSetSize(image, 400, 170);
        JLabel imageLabel = new JLabel(image);

        add(imageLabel);
        add(ssul);
        add(select_one);
        add(select_two);
        add(select_three);

        select_one.addActionListener(new btn_panel01_1_1());
        select_two.addActionListener(new btn_panel01_2_1());
        select_three.addActionListener(new btn_panel01_3_1());
        c.addKeyListener(new Key_Action());

        imageLabel.setSize(350,150);
        imageLabel.setLocation(200,80);

        ssul.setSize(700,100);
        ssul.setFont(new Font("돋움", Font.PLAIN, 15));
        ssul.setLocation(50, 250);

        select_one.setSize(500,30);
        select_one.setLocation(150, 350);

        select_two.setSize(500,30);
        select_two.setLocation(150, 390);

        select_three.setSize(500, 30);
        select_three.setLocation(150, 390);

        c.setFocusable(true);
        c.requestFocus();

    }

    class btn_panel01_1_1 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {

            c.change("Jpanel01_1_1");

        }
    }

    class btn_panel01_2_1 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {

            c.change("Jpanel01_2_1");

        }
    }

    class btn_panel01_3_1 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {

            c.change("Jpanel01_3_1");

        }
    }

    class Key_Action extends KeyAdapter {
        public void keyPressed(KeyEvent e) {
            int keyCode = e.getKeyCode();
            Container c = (Container) e.getSource();


            switch (keyCode) {

                case KeyEvent.VK_DOWN:
                    select_three.setLocation(select_three.getX(), select_three.getY() + 10);
                    break;

            }

        }

    }

    public ImageIcon imageSetSize(ImageIcon icon, int h, int w) {
        Image ximg = icon.getImage();
        Image yimg = ximg.getScaledInstance(h, w, Image.SCALE_SMOOTH);
        ImageIcon xyimg = new ImageIcon(yimg);
        return xyimg;
    }
}

class Jpanel01_1_1 extends JPanel {

    private ImageIcon image = new ImageIcon("src/project/resource/Darkside.jpg");
    private JLabel ssul = new JLabel("<html>하필 첫날부터 전 여자친구를 만나다니,,,, 아직 졸업 안했구나,,<br>\n" +
            "                         앞으로 많이 마주칠텐데 큰일났다,,,, 조용히 학교 다녀야겠다,,</html>",JLabel.CENTER);
    private JLabel ending = new JLabel("<html> 엔딩 1. 해리포터에 나오는 투명망토 당근마켓에 있으려나,,,?? </html>");

    private returningStudent c;

    public Jpanel01_1_1 (returningStudent c) {

        this.c = c;

        setLayout(null);

        image = imageSetSize(image, 400, 170);
        JLabel imageLabel = new JLabel(image);

        add(imageLabel);
        add(ssul);
        add(ending);

        imageLabel.setSize(350,150);
        imageLabel.setLocation(200,80);

        ssul.setSize(700,100);
        ssul.setFont(new Font("돋움", Font.PLAIN, 15));
        ssul.setLocation(50, 250);

        ending.setSize(800, 100);
        ending.setFont(new Font("돋움", Font.PLAIN, 25));
        ending.setLocation(50, 300);
    }


    public ImageIcon imageSetSize(ImageIcon icon, int h, int w) {
        Image ximg = icon.getImage();
        Image yimg = ximg.getScaledInstance(h, w, Image.SCALE_SMOOTH);
        ImageIcon xyimg = new ImageIcon(yimg);
        return xyimg;
    }
}

class Jpanel01_2_1 extends JPanel {

    private ImageIcon image = new ImageIcon("src/project/resource/Army.jpg");
    private JLabel ssul = new JLabel("<html>XXX 오래만이다!! 짜식 언제 복학한거야~~~ 군대는 전역했고~~~??\n" +
            "                        나는 OO사단 나왔어~~ <br>\"~~~~~\" \"!!!!!\" (복학생들은 졸업할 때 까지 그들끼리 같이 다녔다)</html>",JLabel.CENTER);
    private JLabel ending = new JLabel("<html> 엔딩 2. 우리는_ 영원히_ 함께야_ 오늘도 리멤버 이멤버,,?? </html>");

    private returningStudent c;

    public Jpanel01_2_1 (returningStudent c) {

        this.c = c;

        setLayout(null);

        image = imageSetSize(image, 400, 170);
        JLabel imageLabel = new JLabel(image);

        add(imageLabel);
        add(ssul);
        add(ending);

        imageLabel.setSize(350,150);
        imageLabel.setLocation(200,80);

        ssul.setSize(700,100);
        ssul.setFont(new Font("돋움", Font.PLAIN, 15));
        ssul.setLocation(50, 250);

        ending.setSize(700, 100);
        ending.setFont(new Font("돋움", Font.PLAIN, 25));
        ending.setLocation(50, 300);
    }


    public ImageIcon imageSetSize(ImageIcon icon, int h, int w) {
        Image ximg = icon.getImage();
        Image yimg = ximg.getScaledInstance(h, w, Image.SCALE_SMOOTH);
        ImageIcon xyimg = new ImageIcon(yimg);
        return xyimg;
    }
}

class Jpanel01_3_1 extends JPanel {

    private ImageIcon image = new ImageIcon("src/project/resource/food.jpg");
    private JLabel ssul = new JLabel("<html>저 혹시 꽃길만 선배인가요,,??? 선배들한테 얘기 많이 들었어요!! 혹시 학식 같이 드실래요??</html>",JLabel.CENTER);

    private JButton select_one = new JButton("\"그래!! 동기들 다 모아!! 밥 먹구 커피는 내가 살께!! 카페가자!!\"");
    private JButton select_two = new JButton("\"(스윙스를 떠올리며) 울 샌애귀 오빠랑 돈까스 먹으러 갈까??ㅎㅎ\"");
    private returningStudent c;

    public Jpanel01_3_1 (returningStudent c) {

        this.c = c;

        setLayout(null);

        image = imageSetSize(image, 400, 170);
        JLabel imageLabel = new JLabel(image);

        add(imageLabel);
        add(ssul);
        add(select_one);
        add(select_two);

        select_one.addActionListener(new btn_panel01_1());
        select_two.addActionListener(new btn_panel01_2());

        imageLabel.setSize(350,150);
        imageLabel.setLocation(200,80);

        ssul.setSize(700,100);
        ssul.setFont(new Font("돋움", Font.PLAIN, 15));
        ssul.setLocation(50, 250);

        select_one.setSize(500,30);
        select_one.setLocation(150, 350);

        select_two.setSize(500,30);
        select_two.setLocation(150, 390);

    }

    class btn_panel01_1 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {

            c.change("Jpanel01_3_1_1");

        }
    }

    class btn_panel01_2 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {

            c.change("Jpanel01_3_1_2");

        }
    }

    public ImageIcon imageSetSize(ImageIcon icon, int h, int w) {
        Image ximg = icon.getImage();
        Image yimg = ximg.getScaledInstance(h, w, Image.SCALE_SMOOTH);
        ImageIcon xyimg = new ImageIcon(yimg);
        return xyimg;
    }
}


class Jpanel01_3_1_1 extends JPanel {

    private ImageIcon image = new ImageIcon("src/project/resource/flower.jpg");
    private JLabel ssul = new JLabel("<html>새로 사귄 후배랑 친해진 덕분에 다른 친구들과도 친해져 학교 생활에 잘 적응 할 수 있었다.<br>\n" +
            "앞으로 계속 좋은 대인관계를 유지하면서 학교생활을 하는거야!!</html>",JLabel.CENTER);
    private JLabel ending = new JLabel("<html>히든 엔딩 1. 부담스럽지 않은 선배가 되는 길.\n</html>");

    private returningStudent c;

    public Jpanel01_3_1_1 (returningStudent c) {

        this.c = c;

        setLayout(null);

        image = imageSetSize(image, 400, 170);
        JLabel imageLabel = new JLabel(image);

        add(imageLabel);
        add(ssul);
        add(ending);

        imageLabel.setSize(350,150);
        imageLabel.setLocation(200,80);

        ssul.setSize(700,100);
        ssul.setFont(new Font("돋움", Font.PLAIN, 15));
        ssul.setLocation(50, 250);

        ending.setSize(700, 100);
        ending.setFont(new Font("돋움", Font.PLAIN, 25));
        ending.setLocation(150, 300);
    }


    public ImageIcon imageSetSize(ImageIcon icon, int h, int w) {
        Image ximg = icon.getImage();
        Image yimg = ximg.getScaledInstance(h, w, Image.SCALE_SMOOTH);
        ImageIcon xyimg = new ImageIcon(yimg);
        return xyimg;
    }
}

class Jpanel01_3_1_2 extends JPanel {

    private ImageIcon image = new ImageIcon("src/project/resource/Swings.jpg");
    private JLabel ssul = new JLabel("<html>아;;; 근데 깜빡하구 오늘 밥 선약이 있는걸 까먹었어요,,,, 나중에 기회되면 같이먹어요 선배.</html>",JLabel.CENTER);
    private JLabel ending = new JLabel("<html>히든 엔딩 2. 나랑 돈까스 먹을래요?.\n</html>");

    private returningStudent c;

    public Jpanel01_3_1_2 (returningStudent c) {

        this.c = c;

        setLayout(null);

        image = imageSetSize(image, 200, 350);
        JLabel imageLabel = new JLabel(image);

        add(imageLabel);
        add(ssul);
        add(ending);

        imageLabel.setSize(200,350);
        imageLabel.setLocation(300,10);

        ssul.setSize(700,100);
        ssul.setFont(new Font("돋움", Font.PLAIN, 15));
        ssul.setLocation(50, 350);

        ending.setSize(700, 100);
        ending.setFont(new Font("돋움", Font.PLAIN, 25));
        ending.setLocation(150, 390);
    }


    public ImageIcon imageSetSize(ImageIcon icon, int h, int w) {
        Image ximg = icon.getImage();
        Image yimg = ximg.getScaledInstance(h, w, Image.SCALE_SMOOTH);
        ImageIcon xyimg = new ImageIcon(yimg);
        return xyimg;
    }
}


class Jpanel02 extends JPanel {

    private ImageIcon image = new ImageIcon("src/project/resource/Room.jpg");
    private JLabel ssul = new JLabel("<html>(왁자지껄한 학부방으로 들어간다) 흐음,,, 정말 오랜만이야ㅠㅠㅜㅠ 이곳에서 정말 많은 일들이 있었지,,<br>\n" +
            "정말 아는사람 한명 없구나,,, 근데 왜 아무도 나한테 인사를 하지 않는거지,,,,??? </html>",JLabel.CENTER);

    private JButton select_one = new JButton("\"너 몇학번이야!! 너 위 학번 내 밑학번으로 싹다 집합해!!\"");
    private JButton select_two = new JButton("\"정말,,, 내가 오랬동안 학교에 없긴 했구나,,, 혹시나 아는 사람이 있는지 확인해 보자.\"");
    private JButton select_three = new JButton("\"...............\"");
    private returningStudent c;

    public Jpanel02 (returningStudent c) {

        this.c = c;

        setLayout(null);

        image = imageSetSize(image, 400, 170);
        JLabel imageLabel = new JLabel(image);

        add(imageLabel);
        add(ssul);
        add(select_one);
        add(select_two);
        add(select_three);

        select_one.addActionListener(new btn_panel01_1_1());
        select_two.addActionListener(new btn_panel01_2_1());
        select_three.addActionListener(new btn_panel01_3_1());
        select_three.addMouseListener(new mouse_Action());

        imageLabel.setSize(350,150);
        imageLabel.setLocation(200,80);

        ssul.setSize(700,100);
        ssul.setFont(new Font("돋움", Font.PLAIN, 15));
        ssul.setLocation(50, 250);

        select_one.setSize(500,30);
        select_one.setLocation(150, 350);

        select_two.setSize(500,30);
        select_two.setLocation(150, 390);

        select_three.setSize(500, 30);
        select_three.setLocation(150, 430);
        select_three.setEnabled(false);

        c.setFocusable(true);
        c.requestFocus();

    }

    class btn_panel01_1_1 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {

            c.change("Jpanel02_1");

        }
    }

    class btn_panel01_2_1 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {

            c.change("Jpanel02_2");

        }
    }

    class btn_panel01_3_1 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {

            c.change("Jpanel02_3");

        }
    }

    class mouse_Action extends MouseAdapter {

        @Override
        public void mouseExited(MouseEvent e) {
            super.mouseExited(e);

            select_three.setText("\"아직 희망이 남아있어!! 용기를 내서 말을 걸어보자!!\"");
            select_three.setEnabled(true);


        }
    }



    public ImageIcon imageSetSize(ImageIcon icon, int h, int w) {
        Image ximg = icon.getImage();
        Image yimg = ximg.getScaledInstance(h, w, Image.SCALE_SMOOTH);
        ImageIcon xyimg = new ImageIcon(yimg);
        return xyimg;
    }
}

class Jpanel02_1 extends JPanel {

    private ImageIcon image = new ImageIcon("src/project/resource/Elder.jpg");
    private JLabel ssul = new JLabel("<html>허허,,, 너 몇학번이야 나 10학번인데 너 XXX알아? 걔가 후배 교육 제대로 안시켰나보네<br>" +
                                               " 오늘 학교 끝나고 터프네에서 보자~ 어찌저찌 잘 넘어가 아직 남아있는 선배들과 친하게 지내게 되었다,,,<br>" +
                                               " 근데 선배들과 친하게 지내다 보니 새로운 친구들을 사귈 수가 없다,,,,<br> " +
                                               "뭐 선배 인맥이 더 중요한거 아니겠어,,,,??? (또륵)</html>",JLabel.CENTER);
    private JLabel ending = new JLabel("<html>엔딩3.취업은 잘 할 수 있지 않을까,,,,???</html>");

    private returningStudent c;

    public Jpanel02_1 (returningStudent c) {

        this.c = c;

        setLayout(null);

        image = imageSetSize(image, 200, 350);
        JLabel imageLabel = new JLabel(image);

        add(imageLabel);
        add(ssul);
        add(ending);

        imageLabel.setSize(200,350);
        imageLabel.setLocation(300,10);

        ssul.setSize(700,100);
        ssul.setFont(new Font("돋움", Font.PLAIN, 15));
        ssul.setLocation(50, 360);

        ending.setSize(700, 100);
        ending.setFont(new Font("돋움", Font.PLAIN, 25));
        ending.setLocation(150, 430);
    }


    public ImageIcon imageSetSize(ImageIcon icon, int h, int w) {
        Image ximg = icon.getImage();
        Image yimg = ximg.getScaledInstance(h, w, Image.SCALE_SMOOTH);
        ImageIcon xyimg = new ImageIcon(yimg);
        return xyimg;
    }
}

class Jpanel02_2 extends JPanel {

    private ImageIcon image = new ImageIcon("src/project/resource/Return.jpg");
    private JLabel ssul = new JLabel("<html>혹시나 했지만 역시 아는 사람이 없다,,,,, 그냥 조용히 학교 생활이나 해야겠다,,,,</html>",JLabel.CENTER);
    private JLabel ending = new JLabel("<html>엔딩 4. 혼자서도 강할 수 있어. 인생은 마이웨이. \n</html>");

    private returningStudent c;

    public Jpanel02_2 (returningStudent c) {

        this.c = c;

        setLayout(null);

        image = imageSetSize(image, 400, 170);
        JLabel imageLabel = new JLabel(image);

        add(imageLabel);
        add(ssul);
        add(ending);

        imageLabel.setSize(350,150);
        imageLabel.setLocation(200,80);

        ssul.setSize(700,100);
        ssul.setFont(new Font("돋움", Font.PLAIN, 15));
        ssul.setLocation(50, 250);

        ending.setSize(800, 100);
        ending.setFont(new Font("돋움", Font.PLAIN, 25));
        ending.setLocation(120, 300);
    }


    public ImageIcon imageSetSize(ImageIcon icon, int h, int w) {
        Image ximg = icon.getImage();
        Image yimg = ximg.getScaledInstance(h, w, Image.SCALE_SMOOTH);
        ImageIcon xyimg = new ImageIcon(yimg);
        return xyimg;
    }
}

class Jpanel02_3 extends JPanel {

    private ImageIcon image = new ImageIcon("src/project/resource/flower.jpg");
    private JLabel ssul = new JLabel("<html>용기를 내서 새로운 친구들에게 말을 걸어보았다.<br> 다행이 내가 생각했던 것 만큼 복학생을 싫어하는 것 같지 않다.<br>" +
                                          "새로운 친구들과 사귀다 보면 언젠간 복학생 티도 안나겠지!! 앞으로 꽃길만 걸었으면 좋겠다.</html>",JLabel.CENTER);
    private JLabel ending = new JLabel("<html>히든 엔딩 3. 복학생이라고 싫어하지 않아요.<br> &emsp&emsp&emsp&emsp 다만 꼰대를 싫어할 뿐.\n</html>");

    private returningStudent c;

    public Jpanel02_3 (returningStudent c) {

        this.c = c;

        setLayout(null);

        image = imageSetSize(image, 400, 170);
        JLabel imageLabel = new JLabel(image);

        add(imageLabel);
        add(ssul);
        add(ending);

        imageLabel.setSize(350,150);
        imageLabel.setLocation(200,80);

        ssul.setSize(700,100);
        ssul.setFont(new Font("돋움", Font.PLAIN, 15));
        ssul.setLocation(50, 250);

        ending.setSize(700, 100);
        ending.setFont(new Font("돋움", Font.PLAIN, 25));
        ending.setLocation(150, 340);
    }


    public ImageIcon imageSetSize(ImageIcon icon, int h, int w) {
        Image ximg = icon.getImage();
        Image yimg = ximg.getScaledInstance(h, w, Image.SCALE_SMOOTH);
        ImageIcon xyimg = new ImageIcon(yimg);
        return xyimg;
    }
}



public class returningStudent extends JFrame {

    public Container c = getContentPane();
    Jpanel01 jpanel01 = null;
    Jpanel01_1 jpanel01_1 = null;
    Jpanel01_1_1 jpanel01_1_1 = null;
    Jpanel01_2_1 jpanel01_2_1 = null;
    Jpanel01_3_1 jpanel01_3_1 = null;
    Jpanel01_3_1_1 jpanel01_3_1_1 = null;
    Jpanel01_3_1_2 jpanel01_3_1_2 = null;
    Jpanel02 jpanel02 = null;
    Jpanel02_1 jpanel02_1 = null;
    Jpanel02_2 jpanel02_2 = null;
    Jpanel02_3 jpanel02_3 = null;


    public void change(String panelName) {

        switch (panelName) {
            case "Jpanel01_1":
                getContentPane().removeAll();
                getContentPane().add(jpanel01_1);
                revalidate();
                repaint();

                break;

            case "Jpanel01_1_1":
                getContentPane().removeAll();
                getContentPane().add(jpanel01_1_1);
                revalidate();
                repaint();

                break;

           case "Jpanel01_2_1":
                getContentPane().removeAll();
                getContentPane().add(jpanel01_2_1);
                revalidate();
                repaint();

                break;

            case "Jpanel01_3_1":
                getContentPane().removeAll();
                getContentPane().add(jpanel01_3_1);
                revalidate();
                repaint();

                break;

            case "Jpanel01_3_1_1":
                getContentPane().removeAll();
                getContentPane().add(jpanel01_3_1_1);
                revalidate();
                repaint();

                break;


            case "Jpanel01_3_1_2":
                getContentPane().removeAll();
                getContentPane().add(jpanel01_3_1_2);
                revalidate();
                repaint();

                break;

            case "Jpanel02":
                getContentPane().removeAll();
                getContentPane().add(jpanel02);
                revalidate();
                repaint();

                break;

            case "Jpanel02_1":
                getContentPane().removeAll();
                getContentPane().add(jpanel02_1);
                revalidate();
                repaint();

                break;

            case "Jpanel02_2":
                getContentPane().removeAll();
                getContentPane().add(jpanel02_2);
                revalidate();
                repaint();

                break;

            case "Jpanel02_3":
                getContentPane().removeAll();
                getContentPane().add(jpanel02_3);
                revalidate();
                repaint();

                break;
        }
    }

    public static void main(String[] args) {
        returningStudent win = new returningStudent();
        win.jpanel01 = new Jpanel01(win);
        win.jpanel01_1 = new Jpanel01_1(win);
        win.jpanel01_1_1 = new Jpanel01_1_1(win);
        win.jpanel01_2_1 = new Jpanel01_2_1(win);
        win.jpanel01_3_1 = new Jpanel01_3_1(win);
        win.jpanel01_3_1_1 = new Jpanel01_3_1_1(win);
        win.jpanel01_3_1_2 = new Jpanel01_3_1_2(win);
        win.jpanel02 = new Jpanel02(win);
        win.jpanel02_1 = new Jpanel02_1(win);
        win.jpanel02_2 = new Jpanel02_2(win);
        win.jpanel02_3 = new Jpanel02_3(win);


        win.setTitle("두근두근 복학생 시뮬레이션");
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        win.add(win.jpanel01);

        win.setSize(800, 600);
        Dimension frameSize = win.getSize();

        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

        win.setLocation((screenSize.width - frameSize.width) /2, (screenSize.height - frameSize.height) /2);

        win.setVisible(true);
        win.setFocusable(true);
        win.requestFocus();

    }




}