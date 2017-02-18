package p1;

import java.lang.reflect.Array;

/**
 * Created by Eric on 2/18/2017.
 */
public class GenericBag <T>{
    private T[] genericArray;
    private int nElems;


    public GenericBag(int maxSize) {

        genericArray = (T[]) new Object[maxSize];
        nElems = 0;
    }

    public void add(T item){
        System.out.println("Adding \"" +item+ "\"");
        genericArray[nElems++] = item;
    }
    public void display(){
        System.out.println("-----DISPLAY ARRAY-----");
        for(int i = 0; i < nElems; i++){
            System.out.println(genericArray[i]);
        }
        System.out.println("------ARRAY DONE------");
    }
    public T find(T item){
        for(int i = 0; i < nElems; i++){
            if (genericArray[i].equals(item)){
                System.out.println("\""+ item +"\" found at index " + i);
                return item;
            }
        }
        System.out.println("\""+ item +"" +"\" Not found");
        return null;
    }
    public boolean remove(T item) {
        int j;
        for (j = 0; j < nElems; j++) {
            if (genericArray[j].equals(item)) {
                System.out.println("Deleting \"" +item+ "\"");
                break;
            }
        }

        if (j == nElems) {
            System.out.println("Item not found");
            return false;
        } else {
            for (int k = j; k < nElems - 1; k++) {
                genericArray[k] = genericArray[k + 1];

            }
            nElems--;
            return true;
        }
    }
}
