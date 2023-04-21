package org.yup.neighborlibrary;

import java.sql.SQLOutput;

public class NeighborLibraryApp {
    public static void main(String[] args){
        Books rots = new Books(0, "666", "Revenge Of The Sith", "Anthony");
        Books hpgof = new Books(1, "000", "Harry Potter And The Goblet Of Fire", "");
        System.out.println(rots.getCheckedOutTo());
    }
}