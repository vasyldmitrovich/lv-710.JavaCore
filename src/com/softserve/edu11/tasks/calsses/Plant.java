package com.softserve.edu11.tasks.calsses;

import com.softserve.IO.Output;

public class Plant {

    private int size;
    private Color color;
    private Type type;

    public Plant(int size, Color color, Type type) {
        this.size = size;
        try {
            setColor(color);
        } catch (ColorExeption e){
                Output.print("You try to create " + color + " plant, but plant can be any color as long as it’s green!");
                this.color = Color.GREEN;
        }
        try {
            setType(type);
        }catch (TypeExeption e){
            Output.print("You try to create " + type + " plant, but plant can be any type as long as it’s tree!");
           this.type = Type.TREE;
        }

    }

    public void setColor(Color color) throws ColorExeption {
        if (color != Color.GREEN)
            throw new ColorExeption();
        this.color = color;
    }

    public void setType(Type type) throws TypeExeption {
        if (type != Type.TREE)
            throw new TypeExeption();
        this.type = type;
    }

    @Override
    public String toString() {
        return "Plant{" +
                "size=" + size +
                ", color=" + color +
                ", type=" + type +
                '}';
    }

    public enum Color {
        RED,
        GREEN,
        BLUE
    }

    public enum Type {
        TREE,
        BUSH,
        GRASS
    }
}





