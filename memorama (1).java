/*

LUIS RICARDO MARTINEZ LAZARO
KAROL JOSÉ ROBLEDO MORA
ABIGAY GUADALUPE CARMONA FERNANDEZ
ROCIO QUINTO LAZARO
MARCO ANTONIO AMORÓS HERMIDA

*/





import java.awt.*;
import java.awt.event.*;
public class memorama extends Frame implements ActionListener
{
Button boton,boton11,boton12,boton13,boton14,boton21,boton22,boton23,boton24,boton31,boton32,boton33,boton34,boton41,boton42,boton43,boton44;
int contador=1;
String opc;
public memorama()
{


super("Ejemplo de Frame ");
setSize(500,500);
setLayout(new GridLayout(4,4));
addWindowListener(new WindowListener()
{
public void windowClosing(WindowEvent e){System.exit(0);}
public void windowOpened(WindowEvent e){}
public void windowClosed(WindowEvent e){}
public void windowIconified(WindowEvent e) {}
public void windowDeiconified(WindowEvent e){}
public void windowActivated(WindowEvent e){}
public void windowDeactivated(WindowEvent e){}
});
boton11 = new Button("@@@");add(boton11);boton11.addActionListener(this);
boton11.setBackground(Color.black);

boton12 = new Button("$$$");add(boton12);boton12.addActionListener(this);
boton12.setBackground(Color.black);

boton13 = new Button("###");add(boton13);boton13.addActionListener(this);
boton13.setBackground(Color.black);

boton14 = new Button("XXX");add(boton14);boton14.addActionListener(this);
boton14.setBackground(Color.black);

boton21 = new Button("@@@");add(boton21);boton21.addActionListener(this);
boton21.setBackground(Color.black);

boton22 = new Button("WWW");add(boton22);boton22.addActionListener(this);
boton22.setBackground(Color.black);

boton23 = new Button("&&&");add(boton23);boton23.addActionListener(this);
boton23.setBackground(Color.black);

boton24 = new Button("WWW");add(boton24);boton24.addActionListener(this);
boton24.setBackground(Color.black);

boton31 = new Button("%%%");add(boton31);boton31.addActionListener(this);
boton31.setBackground(Color.black);

boton32 = new Button("&&&");add(boton32);boton32.addActionListener(this);
boton32.setBackground(Color.black);

boton33 = new Button("???");add(boton33);boton33.addActionListener(this);
boton33.setBackground(Color.black);

boton34 = new Button("###");add(boton34);boton34.addActionListener(this);
boton34.setBackground(Color.black);

boton41 = new Button("$$$");add(boton41);boton41.addActionListener(this);
boton41.setBackground(Color.black);

boton42 = new Button("XXX");add(boton42);boton42.addActionListener(this);
boton42.setBackground(Color.black);

boton43 = new Button("???");add(boton43);boton43.addActionListener(this);
boton43.setBackground(Color.black);

boton44 = new Button("%%%");add(boton44);boton44.addActionListener(this);
boton44.setBackground(Color.black);

}




public void actionPerformed (ActionEvent e)
{
boton = (Button)e.getSource(); //polimorfismo o casting
System.out.println(boton.getLabel());




if (contador==1)//primera carta seleccionada
{
System.out.println("PRIMERA CARTA");
contador=2;
opc=boton.getLabel();
boton.setBackground(Color.pink);
boton.setEnabled(false);

}
else
{
System.out.println("SEGUNDA CARTA");
contador=1;


if (opc==boton.getLabel()){
boton.setEnabled(false);
boton.setBackground(Color.pink);

/*boton.setVisible(false);*/
System.out.println("PAR ENCONTRADO");
}


else{
try
{
boton.setBackground(Color.red);
setEnabled(true);
System.out.print("ERROR, CARTAS INCORRECTAS, REINICIANDO JUEGO EN 5 SEGUNDOS");
Thread.sleep(5000);
memorama.main (null);
}
catch (InterruptedException ex)
{
System.out.print("ERROR");
}
}

}
}



public static void main(String[] args)
{
memorama f = new memorama();
f.setVisible(true);
}
}