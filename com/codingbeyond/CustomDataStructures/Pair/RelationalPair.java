package com.codingbeyond.CustomDataStructures.Pair;


//Just a data structure I made cause I was bored out of my mind
//It's just a simple key-value pair, can represent anything having to do with pairs
//i.e. a point, a vector, etc...
public class RelationalPair<Key, Value>{

    private RelationalKey<Key,Value> key;
    private RelationalValue<Value, Key> value;

    public RelationalPair(Key key, Value value){


        this.key = new RelationalKey<>(key, value);
        this.value = new RelationalValue<>(key, value);


    }


    public RelationalValue getValue(){
        return value;
    }

    public RelationalKey getKey(){
        return key;
    }

    public void setKey(RelationalKey newKey){
        key = newKey;
    }

    public void setValue(RelationalValue newValue){
        value = newValue;
    }

    //To work properly the key and value class type must have an override of the toString method implemented to work properly
    @Override
    public String toString(){
        return  '<' + key.toString() + ", " + value.toString() + ">";
    }
}
