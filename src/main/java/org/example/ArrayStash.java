package org.example;

public class ArrayStash {
    private int [][] stashedArray;

    public ArrayStash(int ctolb,int ctrok){
        this.stashedArray=new int[ctrok][ctolb];
    }

    public int getCountCtrok() {
       return stashedArray[0].length;
    }
    public int[] getCtrok(int rowNumber){
        return stashedArray[rowNumber];
    }
    public int getCountCtolb(){
        return stashedArray.length;

    }
}
