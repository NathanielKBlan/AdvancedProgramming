package com.codingbeyond.CustomDataStructures.Pair;

public class RelationalValue<Value, Key> {

    private Key key;
    private Value value;

    protected RelationalValue(Key key, Value value){
        this.key = key;
        this.value = value;
    }

    public Key getKey(){
        return key;
    }

    public Value getValue(){
        return value;
    }

    public void setValue(Value newValue){
        value = newValue;
    }

    public void setKey(Key newKey) { key = newKey; }

    //To work properly the key and value class type must have an override of the toString method implemented to work properly
    @Override
    public String toString(){
        return value.toString();
    }

}
