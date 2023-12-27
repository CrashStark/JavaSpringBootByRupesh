package com.Practice.PracticeQuestion.Controller;

import com.Practice.PracticeQuestion.Entity.Building;

import java.util.*;
import java.util.stream.Collectors;

public class ApplicationClass {
    public ApplicationClass() {

    }

    public void applicationMethod() {
        Building b1 = new Building();
        b1.setBuildingId(1);
        b1.setBuildingAddress("Delhi");
        b1.setBuildingName("Super");
        Building b2 = new Building();
        b2.setBuildingId(2);
        b2.setBuildingAddress("Anand");
        b2.setBuildingName("amkl");
        Building b3 = new Building();
        b3.setBuildingId(3);
        b3.setBuildingAddress("Noida");
        b3.setBuildingName("NoidaAppartmnets");
        Building b4 = new Building();
        b4.setBuildingId(4);
        b4.setBuildingAddress("Surat");
        b4.setBuildingName("S123");
        Building b5 = new Building();
        b5.setBuildingId(4);
        b5.setBuildingAddress("NY");
        b5.setBuildingName("23");
        Building b6 = new Building();
        b6.setBuildingId(4);
        b6.setBuildingAddress("NY");
        b6.setBuildingName("23");
        List<Building> buildingList = new ArrayList<>();
        buildingList.add(b1);
        buildingList.add(b2);
        buildingList.add(b3);
        buildingList.add(b4);
        buildingList.add(b5);
        buildingList.add(b6);

        Map<Integer,Building> buildingMap=new HashMap<>();
        for(Building building:buildingList){
            System.out.println(building);
            buildingMap.put(building.getBuildingId(),building);
        }
        System.out.println("KeySet");
        System.out.println(buildingMap.keySet().contains(1));

        System.out.println(buildingList.stream().filter((e)->
                Collections.frequency(buildingList,e)>1)
                .collect(Collectors.toList()));

        System.out.println(buildingList.stream()
                .sorted(Comparator.comparing(Building::getBuildingName))
                .collect(Collectors.toList()));

    }
}
