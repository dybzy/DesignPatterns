package com.dyb.CommandPattern;

import java.awt.*;

/**
 * @author dyb
 * @date 2020-01-08 10:18
 */
public class DrawCommand implements Command {
    private Drawable drawable;
    private Point position;
    public DrawCommand(Drawable drawable,Point position){
        this.drawable=drawable;
        this.position=position;
    }
    @Override
    public void execute() {
        drawable.draw(position.x, position.y);
    }
}
