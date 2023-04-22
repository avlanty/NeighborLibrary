package org.yup.neighborlibrary;

import java.sql.SQLOutput;

public class NeighborLibraryApp {
    public static void main(String[] args){
        Books rots = new Books(0, "666", "Revenge of the Sith", "Anthony");
        Books hpgof = new Books(1, "000", "Harry Potter and the Goblet of Fire", "Hany");
        Books spm = new Books(2, "333","Super Mario", "Eric");
        Books drc = new Books(3, "123", "Dracula", "");
        Books resev = new Books(4, "456", "Resident Evil", "");
        System.out.println(rots.getCheckedOutTo());
        System.out.println(hpgof.getCheckedOutTo());
        System.out.println(spm.getCheckedOutTo());
        System.out.println(drc.getCheckedOutTo());
        System.out.println(resev.getCheckedOutTo());
        rots.checkIn();
        System.out.println(rots.getCheckedOutTo());
        rots.checkOut("Peter");
        System.out.println(rots.getCheckedOutTo());
        System.out.println(rots.getId());
    }
}