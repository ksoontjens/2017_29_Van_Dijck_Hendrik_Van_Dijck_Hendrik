package hellotvxlet;

import java.awt.Color;
import java.awt.event.ActionEvent;
import javax.tv.xlet.*;
import org.havi.ui.*;
import org.havi.ui.event.HActionListener;

public class HelloTVXlet implements Xlet, HActionListener {

HScene scene;
HStaticText tekst2=new HStaticText("tekst2",200,200,400,100);

//getallen rekenmachine

int getal0 = 0;
int getal1 = 1;
int getal2 = 2;
int getal3 = 3;
int getal4 = 4;
int getal5 = 5;
int getal6 = 6;
int getal7 = 7;
int getal8 = 8;
int getal9 = 9;
int som, getal;
String strI;

public HelloTVXlet() {

}

public void initXlet(XletContext context){
scene=HSceneFactory.getInstance().getDefaultHScene();

HStaticText tekst1=new HStaticText("Calculator",10,50,700,50);
tekst1.setBackgroundMode(HVisible.BACKGROUND_FILL);
tekst1.setBackground(Color.GRAY);
scene.add(tekst1);

//Eerste 3 cijfers
HTextButton button1=new HTextButton("1",10,300,50,50);
button1.setBackgroundMode(HVisible.BACKGROUND_FILL);
button1.setBackground(Color.GRAY);
scene.add(button1);

HTextButton button2=new HTextButton("2",60,300,50,50);
button2.setBackgroundMode(HVisible.BACKGROUND_FILL);
button2.setBackground(Color.GRAY);
scene.add(button2);

HTextButton button3=new HTextButton("3",110,300,50,50);
button3.setBackgroundMode(HVisible.BACKGROUND_FILL);
button3.setBackground(Color.GRAY);
scene.add(button3);

//cijfers: 4, 5 en 6
HTextButton button4=new HTextButton("4",10,350,50,50);
button4.setBackgroundMode(HVisible.BACKGROUND_FILL);
button4.setBackground(Color.GRAY);
scene.add(button4);

HTextButton button5=new HTextButton("5",60,350,50,50);
button5.setBackgroundMode(HVisible.BACKGROUND_FILL);
button5.setBackground(Color.GRAY);
scene.add(button5);

HTextButton button6=new HTextButton("6",110,350,50,50);
button6.setBackgroundMode(HVisible.BACKGROUND_FILL);
button6.setBackground(Color.GRAY);
scene.add(button6);

//cijfers: 7, 8 en 9
HTextButton button7=new HTextButton("7",10,400,50,50);
button7.setBackgroundMode(HVisible.BACKGROUND_FILL);
button7.setBackground(Color.GRAY);
scene.add(button7);

HTextButton button8=new HTextButton("8",60,400,50,50);
button8.setBackgroundMode(HVisible.BACKGROUND_FILL);
button8.setBackground(Color.GRAY);
scene.add(button8);

HTextButton button9=new HTextButton("9",110,400,50,50);
button9.setBackgroundMode(HVisible.BACKGROUND_FILL);
button9.setBackground(Color.GRAY);
scene.add(button9);

//Cijfer 0 en komma
HTextButton button0=new HTextButton("0",10,450,100,50);
button0.setBackgroundMode(HVisible.BACKGROUND_FILL);
button0.setBackground(Color.GRAY);
scene.add(button0);

HTextButton buttonKomma=new HTextButton(".",110,450,50,50);
buttonKomma.setBackgroundMode(HVisible.BACKGROUND_FILL);
buttonKomma.setBackground(Color.GRAY);
scene.add(buttonKomma);

button1.setFocusTraversal(null, button4, null, button2); // boven onder links rechts
button2.setFocusTraversal(null, button5, button1, button3);
button3.setFocusTraversal(null, button6, button2, null);
button4.setFocusTraversal(button1, button7, null, button5);
button5.setFocusTraversal(button2, button8, button4, button6); // boven onder links rechts
button6.setFocusTraversal(button3, button9, button5, null);
button7.setFocusTraversal(button4, button0, null, button8);
button8.setFocusTraversal(button5, button0, button7, button9);
button9.setFocusTraversal(button6, buttonKomma, button8, null);
button0.setFocusTraversal(button8, null, null, buttonKomma);
buttonKomma.setFocusTraversal(button9, null, button0, null);

button1.setActionCommand("button1a");
button2.setActionCommand("button2a");
button3.setActionCommand("button3a");
button4.setActionCommand("button4a");
button5.setActionCommand("button5a");
button6.setActionCommand("button6a");
button7.setActionCommand("button7a");
button8.setActionCommand("button8a");
button9.setActionCommand("button9a");
button0.setActionCommand("button0a");
buttonKomma.setActionCommand("buttonKommaa");

button1.addHActionListener(this);
button2.addHActionListener(this);
button3.addHActionListener(this);
button4.addHActionListener(this);
button5.addHActionListener(this);
button6.addHActionListener(this);
button7.addHActionListener(this);
button8.addHActionListener(this);
button9.addHActionListener(this);
button0.addHActionListener(this);
buttonKomma.addHActionListener(this);

button5.requestFocus();

scene.validate(); scene.setVisible(true);
}

public void startXlet() {

}

public void pauseXlet() {

}

public void destroyXlet(boolean unconditional) {

}
public void actionPerformed(ActionEvent arg0) {
strI= Integer.toString(getal3);

tekst2.setBackgroundMode(HVisible.BACKGROUND_FILL);
tekst2.setBackground(Color.GREEN);
if(arg0.getActionCommand().equals("button0a")){
tekst2.setTextContent(Integer.toString(getal0),HVisible.NORMAL_STATE);
}
else if(arg0.getActionCommand().equals("button1a")){
tekst2.setTextContent(Integer.toString(getal1),HVisible.NORMAL_STATE);
}
else if(arg0.getActionCommand().equals("button2a")){
tekst2.setTextContent(Integer.toString(getal2),HVisible.NORMAL_STATE);
}
else if(arg0.getActionCommand().equals("button3a")){
tekst2.setTextContent(Integer.toString(getal3),HVisible.NORMAL_STATE);
}
else if(arg0.getActionCommand().equals("button4a")){
tekst2.setTextContent(Integer.toString(getal4),HVisible.NORMAL_STATE);
}
else if(arg0.getActionCommand().equals("button5a")){
tekst2.setTextContent(Integer.toString(getal5),HVisible.NORMAL_STATE);
}
else if(arg0.getActionCommand().equals("button6a")){
tekst2.setTextContent(Integer.toString(getal6),HVisible.NORMAL_STATE);
}
else if(arg0.getActionCommand().equals("button7a")){
tekst2.setTextContent(Integer.toString(getal7),HVisible.NORMAL_STATE);
}
else if(arg0.getActionCommand().equals("button8a")){
tekst2.setTextContent(Integer.toString(getal8),HVisible.NORMAL_STATE);
}
else if(arg0.getActionCommand().equals("button9a")){
tekst2.setTextContent(Integer.toString(getal9),HVisible.NORMAL_STATE);
}
else{
tekst2.setTextContent("Fout",HVisible.NORMAL_STATE);
tekst2.setBackground(Color.RED);

};

scene.add(tekst2);
//scene.popToFront(tekst1);
scene.repaint();
throw new UnsupportedOperationException("Not supported yet.");
}

public void optellen(int som, int getal){
som = som + getal;
}
}