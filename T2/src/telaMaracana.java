import javax.swing.*;
import javax.swing.border.LineBorder;
import javax.swing.plaf.basic.BasicButtonUI;
import java.awt.Font;
import java.awt.*;
import java.sql.*;
import java.util.*;
import java.awt.event.*;

public class telaMaracana extends JFrame implements ActionListener{
    private JLabel estadio;
    private JLabel setoresDisponiveis;
    private JLabel legendaSetorNorte;
    private JLabel legendaSetorOeste;
    private JLabel legendaSetorLeste;
    private JLabel legendaSetorSul;
    private JLabel espacoBotoes;
    private JLabel barra1;
    private JButton voltarMenu;
    private JButton setorNorte;
    private JButton setorOeste;
    private JButton setorLeste;
    private JButton setorSul;
    private JPanel painelLegenda;

    public telaMaracana(){
        super("App para venda de Ingressos");

        ImageIcon icon = new ImageIcon("lib/Maracanã.jpg");
        //Pega a imagem salva no arquivo Maracanã.jpg e armazena na variável icon
        Image image = icon.getImage();
        int nw = 400;
        //Define a largura que a imagem vai ter na interface
        int nh = 350;
        //Define a altura da imagem

        Image reImage = image.getScaledInstance(nw,nh,Image.SCALE_SMOOTH);
        //Altera a largura e a altura da imagem
        ImageIcon nicon = new ImageIcon(reImage);
        
        estadio = new JLabel(nicon);

        Color corLegenda = new Color(200,200,200);
        Color azul = new Color(30,30,255);
        // Color cinza = new Color(192,192,192);
        LineBorder borda = new LineBorder(Color.BLACK);
        BasicButtonUI ativaazul = new BasicButtonUI(){
            @Override
            protected void paintButtonPressed(Graphics g,AbstractButton b){
                b.setBackground(azul);
            }
        };

        setoresDisponiveis = new JLabel("SETORES DISPONÍVEIS: ");
        legendaSetorNorte = new JLabel("   Setor Norte - Torcida do Flamengo");
        legendaSetorOeste = new JLabel("   Setor Oeste - Torcida mista");
        legendaSetorLeste = new JLabel("   Setor Leste - Torcida mista");
        legendaSetorSul = new JLabel("   Setor Sul - Torcida do Vasco");
        espacoBotoes= new JLabel("");
        barra1 = new JLabel("");
        setorNorte = new JButton("SETOR NORTE");
        setorLeste = new JButton("SETOR LESTE");
        setorOeste = new JButton("SETOR OESTE");
        setorSul = new JButton("SETOR SUL");
        voltarMenu = new JButton("VOLTAR AO MENU");
        painelLegenda = new JPanel(new GridLayout(4,1));

        Color verdeEscuro = new Color(0,128,0);
        legendaSetorNorte.setForeground(verdeEscuro);
        legendaSetorNorte.setBackground(Color.WHITE);
        legendaSetorNorte.setOpaque(true);

        Color azulClaro = new Color(50,50,255);
        legendaSetorOeste.setForeground(azulClaro);
        legendaSetorOeste.setBackground(Color.WHITE);
        legendaSetorOeste.setOpaque(true);

        Color vermelho = new Color(255,0,0);
        legendaSetorLeste.setForeground(vermelho);
        legendaSetorLeste.setBackground(Color.WHITE);
        legendaSetorLeste.setOpaque(true);

        Color amarelo = new Color(220,220,0);
        legendaSetorSul.setForeground(amarelo);
        legendaSetorSul.setBackground(Color.WHITE);
        legendaSetorSul.setOpaque(true);

        setoresDisponiveis.setForeground(Color.WHITE);
        setoresDisponiveis.setBackground(Color.BLACK);
        setoresDisponiveis.setOpaque(true);
        setoresDisponiveis.setBorder(borda);
        setoresDisponiveis.setHorizontalAlignment(SwingConstants.CENTER);

        espacoBotoes.setBackground(azul);
        espacoBotoes.setOpaque(true);

        barra1.setBackground(azul);
        barra1.setOpaque(true);

        Font fonte = setoresDisponiveis.getFont();
        setoresDisponiveis.setFont(new Font(fonte.getName(), Font.BOLD, 15));

        setorNorte.setForeground(Color.WHITE);
        setorNorte.setBackground(Color.BLACK);
        setorNorte.setOpaque(true);
        setorNorte.setBorder(borda);
        setorNorte.setFocusPainted(false);
        setorNorte.setUI(ativaazul);

        setorOeste.setForeground(Color.WHITE);
        setorOeste.setBackground(Color.BLACK);
        setorOeste.setOpaque(true);
        setorOeste.setBorder(borda);
        setorOeste.setFocusPainted(false);
        setorOeste.setUI(ativaazul);

        setorLeste.setForeground(Color.WHITE);
        setorLeste.setBackground(Color.BLACK);
        setorLeste.setOpaque(true);
        setorLeste.setBorder(borda);
        setorLeste.setFocusPainted(false);
        setorLeste.setUI(ativaazul);

        setorSul.setForeground(Color.WHITE);
        setorSul.setBackground(Color.BLACK);
        setorSul.setOpaque(true);
        setorSul.setBorder(borda);
        setorSul.setFocusPainted(false);
        setorSul.setUI(ativaazul);

        voltarMenu.setForeground(Color.WHITE);
        voltarMenu.setBackground(Color.BLACK);
        voltarMenu.setOpaque(true);
        voltarMenu.setBorder(borda);
        voltarMenu.setFocusPainted(false);
        voltarMenu.setUI(ativaazul);

        estadio.setBounds(0,55,400,300);
        // legendaSetorNorte.setBounds(0,295,400,15);
        // legendaSetorOeste.setBounds(0,310,400,15);
        // legendaSetorLeste.setBounds(0,325,400,15);
        // legendaSetorSul.setBounds(0,340,400,15);
        setoresDisponiveis.setBounds(0,0,600,50);
        painelLegenda.setBounds(0,350,400,60);
        // painelLegenda.setBorder(borda);
        espacoBotoes.setBounds(400,54,200,361);
        barra1.setBounds(0,50,600,5);
        setorNorte.setBounds(439,66,124,50);
        setorOeste.setBounds(439,88+50,124,50);
        setorLeste.setBounds(439,110+100,124,50);
        setorSul.setBounds(439,132+150,124,50);
        voltarMenu.setBounds(439,154+200,124,50);

        painelLegenda.add(legendaSetorNorte); painelLegenda.add(legendaSetorOeste); painelLegenda.add(legendaSetorLeste); painelLegenda.add(legendaSetorSul);

        Container caixa = getContentPane();
        caixa.setLayout(null);
        // caixa.add(legendaSetorNorte);
        // caixa.add(legendaSetorOeste);
        // caixa.add(legendaSetorLeste);
        // caixa.add(legendaSetorSul);
        caixa.add(setorNorte);
        caixa.add(setorOeste);
        caixa.add(setorLeste);
        caixa.add(setorSul);
        caixa.add(voltarMenu);
        caixa.add(barra1);
        caixa.add(setoresDisponiveis);
        caixa.add(painelLegenda);
        caixa.add(estadio);
        caixa.add(espacoBotoes);

        setorNorte.addActionListener(this);
        setorNorte.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseReleased(MouseEvent e){
                setorNorte.setBackground(Color.BLACK);
                setorNorte.setForeground(Color.WHITE);
            }
        });
        
        setorOeste.addActionListener(this);
        setorOeste.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseReleased(MouseEvent e){
                setorOeste.setBackground(Color.BLACK);
                setorOeste.setForeground(Color.WHITE);
            }
        });

        setorLeste.addActionListener(this);
        setorLeste.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseReleased(MouseEvent e){
                setorLeste.setBackground(Color.BLACK);
                setorLeste.setForeground(Color.WHITE);
            }
        });

        setorSul.addActionListener(this);
        setorSul.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseReleased(MouseEvent e){
                setorSul.setBackground(Color.BLACK);
                setorSul.setForeground(Color.WHITE);
            }
        });
        
        voltarMenu.addActionListener(this);
        voltarMenu.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseReleased(MouseEvent e){
                voltarMenu.setBackground(Color.BLACK);
                voltarMenu.setForeground(Color.WHITE);
            }
        });
        
        setSize(616,454);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        this.setLocationRelativeTo(null);
    }

    public void actionPerformed(ActionEvent e){
        if(e.getSource() == setorNorte){
            // JOptionPane.showMessageDialog(null,"Botao pressionado!");
        }
    }
}