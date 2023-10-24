import javax.swing.*;
import javax.swing.border.LineBorder;
import javax.swing.plaf.basic.BasicButtonUI;
import java.awt.*;
import java.sql.*;
import java.util.*;
import java.awt.event.*;

public class mainMenu extends JFrame implements ActionListener{
    private JLabel barraPreta;
    private JLabel barraAzul;
    private JLabel jogo1;
    private JLabel camp;
    private JLabel estadio;
    private JLabel horario;
    private JLabel time1c;
    private JLabel x1;
    private JLabel time1f;
    private Font fonte;
    private ImageIcon escudoTime;
    private Image imagem;
    private JLabel escudoVasco;
    private JLabel escudoFlamengo;

    public mainMenu(){
        super("App para venda de ingressos");

        LineBorder borda = new LineBorder(Color.BLACK);
        Color azul = new Color(30,30,255);
        int largura = 40;
        int altura = 50;

        barraPreta = new JLabel("PRÓXIMOS JOGOS");
        barraAzul = new JLabel("");
        jogo1 = new JLabel("");
        time1c = new JLabel("VAS");
        x1 = new JLabel("X");
        time1f = new JLabel("FLA");

        escudoTime = new ImageIcon("lib/vascoEscudo.png");
        imagem = escudoTime.getImage();
        imagem = imagem.getScaledInstance(largura,altura,Image.SCALE_SMOOTH);
        escudoTime = new ImageIcon(imagem);
        escudoVasco = new JLabel(escudoTime);

        escudoTime = new ImageIcon("lib/flamengoEscudo.png");
        imagem = escudoTime.getImage();
        imagem = imagem.getScaledInstance(largura,altura,Image.SCALE_SMOOTH);
        escudoTime = new ImageIcon(imagem);
        escudoFlamengo = new JLabel(escudoTime);

        barraPreta.setBackground(Color.BLACK);
        barraPreta.setForeground(Color.WHITE);
        barraPreta.setOpaque(true);
        barraPreta.setBorder(borda);
        barraPreta.setHorizontalAlignment(SwingConstants.CENTER);
        fonte = barraPreta.getFont();
        barraPreta.setFont(new Font(fonte.getName(), Font.BOLD, 15));

        barraAzul.setBackground(azul);
        barraAzul.setOpaque(true);

        jogo1.setBorder(borda);

        time1c.setBackground(Color.WHITE);
        time1c.setForeground(Color.BLACK);
        fonte = time1c.getFont();
        time1c.setFont(new Font(fonte.getName(),Font.PLAIN, 25));

        x1.setBackground(Color.WHITE);
        x1.setForeground(Color.BLACK);
        fonte = x1.getFont();
        x1.setFont(new Font(fonte.getName(),Font.PLAIN, 25));

        time1f.setBackground(Color.WHITE);
        time1f.setForeground(Color.BLACK);
        fonte = time1f.getFont();
        time1f.setFont(new Font(fonte.getName(),Font.PLAIN, 25));

        barraPreta.setBounds(0,0,600,50);
        barraAzul.setBounds(0,50,600,5);
        jogo1.setBounds(10,60,270,150);
        time1c.setBounds(25,120,60,50);
        escudoVasco.setBounds(85,120,40,50);
        x1.setBounds(135,120,20,50);
        escudoFlamengo.setBounds(165,120,40,50);
        time1f.setBounds(215,120,60,50);

        Container caixa = getContentPane();
        caixa.setLayout(null);

        caixa.add(barraPreta);
        caixa.add(barraAzul);
        caixa.add(jogo1);
        caixa.add(escudoVasco);
        caixa.add(time1c);
        caixa.add(x1);
        caixa.add(escudoFlamengo);
        caixa.add(time1f);

        setSize(616,454);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        this.setLocationRelativeTo(null);
    }

    public void actionPerformed(ActionEvent e){

    }
}
