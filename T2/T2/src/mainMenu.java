import javax.swing.*;
import javax.swing.border.LineBorder;
import javax.swing.plaf.basic.BasicButtonUI;
import java.awt.*;
import java.sql.*;
import java.util.*;
import java.awt.event.*;

public class mainMenu extends JFrame implements ActionListener{
    private JLabel fundo;
    private JLabel barraPreta;
    private JLabel barraAzul;
    private ImageIcon escudoTime;
    private Image imagem;
    private JLabel jogo1;
    private JLabel camp1;
    private JLabel estadio1;
    private JLabel horario1;
    private JLabel time1c;
    private JLabel x1;
    private JLabel time1f;
    private Font fonte;
    private JLabel escudoVasco;
    private JLabel escudoFlamengo;
    private JButton comprarIngressos;
    private JLabel jogo2;
    private JLabel camp2;
    private JLabel estadio2;
    private JLabel horario2;
    private JLabel time2c;
    private JLabel x2;
    private JLabel time2f;
    private JLabel escudoAtleticoMG;
    private JLabel escudoCruzeiro;
    private JLabel ingressos2;
    String stringCasa;
    String stringFora;

    public mainMenu(){
        super("App para venda de ingressos");

        LineBorder borda = new LineBorder(Color.BLACK);
        Color azul = new Color(30,30,255);

        barraPreta = new JLabel("PRÓXIMOS JOGOS");
        barraAzul = new JLabel("");
        jogo1 = new JLabel("");

        barraPreta.setBackground(Color.BLACK);
        barraPreta.setForeground(Color.WHITE);
        barraPreta.setOpaque(true);
        barraPreta.setBorder(borda);
        barraPreta.setHorizontalAlignment(SwingConstants.CENTER);
        fonte = barraPreta.getFont();
        barraPreta.setFont(new Font(fonte.getName(), Font.BOLD, 20));

        barraAzul.setBackground(azul);
        barraAzul.setOpaque(true);
        barraPreta.setBounds(0,0,600,50);
        barraAzul.setBounds(0,50,600,5);

        //Código para o jogo 1: 
        time1c = new JLabel("VAS");
        x1 = new JLabel("X");
        time1f = new JLabel("FLA");
        camp1 = new JLabel("CAMPEONATO BRASILEIRO");
        estadio1 = new JLabel("Maracanã | Rio de Janeiro, RJ");
        horario1 = new JLabel("22/10/2023 - 16:00");
        comprarIngressos = new JButton("COMPRAR INGRESSOS");

        stringCasa = "lib/vascoEscudo.png";
        stringFora = "lib/flamengoEscudo.png";
        escudoVasco = formataEscudo(stringCasa,escudoVasco);
        escudoFlamengo = formataEscudo(stringFora,escudoFlamengo);

        jogo1.setBorder(borda);
        jogo1.setBounds(10,60,280,160);
        escudoFlamengo.setBounds(170,120,40,50);
        escudoVasco.setBounds(90,120,40,50);

        formataJogos(camp1,estadio1,horario1,time1c,x1,time1f);

        camp1.setBounds(10,70,280,13);
        estadio1.setBounds(10,85,280,10);
        horario1.setBounds(10,100,280,12);
        time1c.setBounds(25,120,55,50);
        x1.setBounds(140,120,20,50);
        time1f.setBounds(220,120,55,50);

        comprarIngressos.setBackground(azul);
        comprarIngressos.setForeground(Color.WHITE);
        comprarIngressos.setFocusPainted(false);
        comprarIngressos.setBounds(60,185,180,25);

        //Código para o jogo 2:
        time2c = new JLabel("CAM");
        x2 = new JLabel("X");
        time2f = new JLabel("CRU");
        camp2 = new JLabel("CAMPEONATO BRASILEIRO");
        estadio2 = new JLabel("Arena MRV | Belo Horizonte, MG");
        horario2 = new JLabel("22/10/2023 - 16:00");
        ingressos2 = new JLabel("INDISPONÍVEL");

        Container caixa = getContentPane();
        caixa.setLayout(null);
        caixa.setBackground(Color.WHITE);

        caixa.add(barraPreta);
        caixa.add(barraAzul);
        caixa.add(jogo1);
        caixa.add(camp1);
        caixa.add(estadio1);
        caixa.add(horario1);
        caixa.add(escudoVasco);
        caixa.add(time1c);
        caixa.add(x1);
        caixa.add(escudoFlamengo);
        caixa.add(time1f);
        caixa.add(comprarIngressos);

        setSize(600,454);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        this.setLocationRelativeTo(null);
    }

    public void actionPerformed(ActionEvent e){

    }

    public void formataEstadio(JLabel estadio){
        estadio.setBackground(Color.WHITE);
        estadio.setForeground(Color.GRAY);
        estadio.setOpaque(true);
        estadio.setHorizontalAlignment(SwingConstants.CENTER);
        fonte = estadio.getFont();
        estadio.setFont(new Font(fonte.getName(),Font.PLAIN,10));
    }

    public void formataHorario(JLabel horario){
        horario.setBackground(Color.WHITE);
        horario.setForeground(Color.BLACK);
        horario.setOpaque(true);
        horario.setHorizontalAlignment(SwingConstants.CENTER);
        fonte = horario.getFont();
        horario.setFont(new Font(fonte.getName(),Font.BOLD,12));
    }

    public void formataCampeonato(JLabel camp){
        camp.setBackground(Color.WHITE);
        camp.setForeground(Color.BLACK);
        camp.setOpaque(true);
        camp.setHorizontalAlignment(SwingConstants.CENTER);
        fonte = camp.getFont();
        camp.setFont(new Font(fonte.getName(),Font.BOLD,13));
    }

    public void formataTimes(JLabel timec, JLabel x, JLabel timef){
        timec.setBackground(Color.WHITE);
        timec.setForeground(Color.BLACK);
        fonte = timec.getFont();
        timec.setFont(new Font(fonte.getName(),Font.PLAIN, 25));

        x.setBackground(Color.WHITE);
        x.setForeground(Color.BLACK);
        fonte = x.getFont();
        x.setFont(new Font(fonte.getName(),Font.PLAIN, 25));

        timef.setBackground(Color.WHITE);
        timef.setForeground(Color.BLACK);
        fonte = timef.getFont();
        timef.setFont(new Font(fonte.getName(),Font.PLAIN, 25));
    }

    public void formataJogos(JLabel camp, JLabel estadio, JLabel horario, JLabel timec, JLabel x, JLabel timef){
        formataEstadio(estadio);
        formataCampeonato(camp);
        formataHorario(horario);
        formataTimes(timec,x,timef);
    }

    public void formataEscudo(String e1, String e2, JLabel escudoCasa, JLabel escudoFora){
        int largura = 40;
        int altura = 50;

        escudoTime = new ImageIcon(e1);
        imagem = escudoTime.getImage();
        imagem = imagem.getScaledInstance(largura,altura,Image.SCALE_SMOOTH);
        escudoTime = new ImageIcon(imagem);
        escudoCasa = new JLabel(escudoTime);

        escudoTime = new ImageIcon(e2);
        imagem = escudoTime.getImage();
        imagem = imagem.getScaledInstance(largura,altura,Image.SCALE_SMOOTH);
        escudoTime = new ImageIcon(imagem);
        escudoFora = new JLabel(escudoTime);
    }

    public JLabel formataEscudo(String e, JLabel escudo){
        int largura = 40;
        int altura = 50;

        escudoTime = new ImageIcon(e);
        imagem = escudoTime.getImage();
        imagem = imagem.getScaledInstance(largura,altura,Image.SCALE_SMOOTH);
        escudoTime = new ImageIcon(imagem);
        escudo = new JLabel(escudoTime);

        return escudo;
    }
}
