/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Armaduras.Armadura;
import Armas.Arma;
import Escudos.Escudo;
import Fabricas.FabricaDeOrco;
import Fabricas.FabricaElfo;
import Fabricas.FabricaHumano;
import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author estudiantes
 */
public class Ventana extends JFrame implements ActionListener{
    private JButton btn1;
    private JButton btn2;
    private JButton btn3;
    private JPanel panel;
    private Arma a;
    private Armadura ar;
    private Escudo e;
    private JLabel img1;
    private JLabel img2;
    private JLabel img3;
    
    public Ventana(){
    this.setLayout(new FlowLayout());
    this.setDefaultLookAndFeelDecorated(true);
    
    this.setTitle("Fabrica");
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    img1 = new JLabel();
    img2 = new JLabel();
    img3 = new JLabel();
    
    btn1 = new JButton("Ver Partes Orco");
    btn2 = new JButton("Ver Partes Elfo");
    btn3 = new JButton("Ver Partes Humano");
    panel = new JPanel();
    JLabel label = new JLabel("Presione para ver las partes");
    btn1.addActionListener(this);
    btn2.addActionListener(this);
    btn3.addActionListener(this);
    
    this.add(label);
    this.add(btn1);
    this.add(btn2);
    this.add(btn3);
    this.add(panel);
    this.pack();
    this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()== btn1) {            
            orco();           
        }else if(e.getSource() == btn2){
            elfo();
        }else if(e.getSource() == btn3){
            humano();
        }
    }
    
    public void orco(){
        FabricaDeOrco fOrco = new FabricaDeOrco();
        a = fOrco.crearArma();
        ar = fOrco.crearAramadura();
        e = fOrco.crearEscudo();       
        img1.setIcon( getImage(new ImageIcon("src\\img\\hacha.png")));
        img2.setIcon( getImage(new ImageIcon("src\\img\\armaduraDeOrco.png"))); 
        img3.setIcon( getImage(new ImageIcon("src\\img\\escudoOrco.png"))); 
        panel.add(img1);
        panel.add(img2);
        panel.add(img3);
        this.add(panel);
        this.pack();
        this.invalidate();
        this.validate();
        this.repaint();
    }
    
    public void elfo(){
        
        FabricaElfo fElfo = new FabricaElfo();
        a = fElfo.crearArma();
        ar = fElfo.crearAramadura();
        e = fElfo.crearEscudo();
        
        img1.setIcon( getImage( new ImageIcon("src\\img\\arco.png")));
        img2.setIcon( getImage(new ImageIcon("src\\img\\armaduraDeElfo.png"))); 
        img3.setIcon( getImage(new ImageIcon("src\\img\\escudoElfo.png"))); 
        panel.add(img1);
        panel.add(img2);
        panel.add(img3);
        this.add(panel);
        this.pack();
        this.invalidate();
        this.validate();
        this.repaint();
    }
    
    public void humano(){
        
        FabricaHumano fH = new FabricaHumano();
        a = fH.crearArma();
        ar = fH.crearAramadura();
        e = fH.crearEscudo();       
        img1.setIcon( getImage(new ImageIcon("src\\img\\espada.png")));
        img2.setIcon( getImage(new ImageIcon("src\\img\\armaduraDeHumano.png"))); 
        img3.setIcon( getImage(new ImageIcon("src\\img\\escudoHumano.png"))); 
        panel.add(img1);
        panel.add(img2);
        panel.add(img3);
        this.add(panel);
        this.pack();
        this.invalidate();
        this.validate();
        this.repaint();
    }
    
    public ImageIcon getImage(ImageIcon i){
        Image image = i.getImage(); // transform it 
        Image newimg = image.getScaledInstance(120, 120,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
        i = new ImageIcon(newimg);  // transform it back
        return i;
    }
    
}
