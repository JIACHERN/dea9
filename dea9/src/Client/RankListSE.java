/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Client;
import Entity.RankListSE;
import adt.ArrayListInterfaceSE;
import adt.ArrayListSE;
import adt.SortedArrayListInterfaceSE;
import adt.SortedArrayListSE;

/**
 *
 * @author Thiew Soa Ein
 */
public class RankListSE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
    ArrayListInterfaceSE<RankListSE> rankList = new ArrayListSE<>(11);
        SortedArrayListInterfaceSE<Integer> position = new SortedArrayListSE<>(11);
        //SortedArrayListInterfaceSE<String> updatePoint = new SortedArrayListSE<>();

        /*String username ="...";
        int point = 0;
        RankListSE list = new RankListSE(point, username);
        rankList.add(position.add(list.Point), list);*/
        
        RankListSE list1 = new RankListSE (700, "Aimer_03");
        RankListSE list2 = new RankListSE (500,"Pew_08");
        RankListSE list3 = new RankListSE (9,"Nigel_12");
        RankListSE list4 = new RankListSE (500,"Nigel_07");
        RankListSE list5 = new RankListSE (600,"Aimir_04");
        RankListSE list6 = new RankListSE (530,"Pew_06");
        RankListSE list7 = new RankListSE (330, "Aimer_09");
        RankListSE list8 = new RankListSE (1000,"Pew_01");
        RankListSE list9 = new RankListSE (900,"Nigel_02");
        RankListSE list10 = new RankListSE (200,"Nigel_10");
        RankListSE list11 = new RankListSE (100,"Aimir_11");
        RankListSE list12 = new RankListSE (540,"Pew_05");

        rankList.add(position.add(list1.Point), list1);
        rankList.add(position.add(list2.Point), list2);
        rankList.add(position.add(list3.Point), list3);
        rankList.add(position.add(list4.Point), list4);
        rankList.add(position.add(list5.Point), list5);
        rankList.add(position.add(list6.Point), list6);
        rankList.add(position.add(list7.Point), list7);
        rankList.add(position.add(list8.Point), list8);
        int point9 = position.add(list9.Point);
        rankList.add(point9, list9);
        int point10 = position.add(list10.Point);
        rankList.add(point10, list10);
        int point11 = position.add(list11.Point);
        rankList.add(point11, list11);
        rankList.add(position.add(list12.Point), list12);

        System.out.println("==============================Rank List=======================================");
        System.out.println("|     \t  Top   \t\t   Username\t\t\t\t\t\t\tPoints\t\t\t|");
        System.out.println(rankList.toString());
        System.out.println("==================================End=========================================\n");

    }
    
}
