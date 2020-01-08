package com.dyb.CommandPattern;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.*;
/**
 * @author dyb
 * @date 2020-01-08 11:17
 */



public class Main extends JFrame implements ActionListener,MouseMotionListener,WindowListener{

    private MacroCommand history=new MacroCommand() ;

    private JButton btnClear=new JButton("清除");
    private JButton btnRePaint=new JButton("重现");

    private DrawCanvas canvas=new DrawCanvas(400,400,history);

    public Main(String title){
        super(title);

        this.addWindowListener(this);
        canvas.addMouseMotionListener(this);
        btnClear.addActionListener(this);
        btnRePaint.addActionListener(this);

        Box btnBox=new Box(BoxLayout.X_AXIS);
        btnBox.add(btnClear);
        btnBox.add(btnRePaint);

        Box mainBox=new Box(BoxLayout.Y_AXIS);
        mainBox.add(btnBox);
        mainBox.add(canvas);

        getContentPane().add(mainBox);

        pack();
        show();
    }

    public static void main(String[] args) {

        new Main("命令模式");

    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==btnClear){
            history.clear();
            canvas.repaint();
        }else if(e.getSource()==btnRePaint){
            canvas.repaint();
        }
    }


    @Override
    public void mouseDragged(MouseEvent e) {
        Command cmd=new DrawCommand(canvas,e.getPoint());
        history.append(cmd);
        cmd.execute();
    }

    @Override
    public void windowClosing(WindowEvent e) {
        System.exit(0);
    }




    @Override
    public void windowOpened(WindowEvent e) {
    }

    @Override
    public void windowClosed(WindowEvent e) {
    }

    @Override
    public void windowIconified(WindowEvent e) {
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
    }

    @Override
    public void windowActivated(WindowEvent e) {
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
    }

    @Override
    public void mouseMoved(MouseEvent e) {
    }
}