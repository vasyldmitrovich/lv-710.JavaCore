package com.softserve.edu11.Tasks.Exeptions;

import com.softserve.edu11.Tasks.Entity.Type;

import java.util.ArrayList;

public class TypeException extends Exception{

    private static final ArrayList<Type> possibleTypes = new ArrayList<>();
    static {
        possibleTypes.add(Type.HERB);
        possibleTypes.add(Type.FLOWER);
    }

    public TypeException(String message) {
        super(message);
    }
    public static void isPossible(Type type) throws TypeException{
        if (!possibleTypes.contains(type)){
            throw new TypeException(type.name() +" type is not allowed!");
        }
    }
}
