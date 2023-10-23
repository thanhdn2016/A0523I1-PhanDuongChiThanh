package ss_case_study.repository.impl;

import ss_case_study.model.House;
import ss_case_study.model.Room;
import ss_case_study.model.Villa;
import ss_case_study.repository.IFacilityRepository;

import java.util.LinkedHashMap;
import java.util.Map;


public class FacilityRepository implements IFacilityRepository {


    static Map<Villa, Integer> villaIntegerLinkedHashMap = new LinkedHashMap<>();
    static Map<House, Integer> houseIntegerLinkedHashMap = new LinkedHashMap<>();
    static Map<Room, Integer> roomIntegerLinkedHashMap = new LinkedHashMap<>();

    static {
        villaIntegerLinkedHashMap.put(new Villa("SVVL-0001", 1000, 5, 150, "Month", "Test", "Test", 40, 1), 0);
        villaIntegerLinkedHashMap.put(new Villa("SVVL-0002", 2000, 4, 120, "Day", "Test2", "Test", 40, 2), 0);

        houseIntegerLinkedHashMap.put(new House("SVHO-0001",1000,4,100,"Day","Test","test",1),0);
        houseIntegerLinkedHashMap.put(new House("SVHO-0002",2000,3,80,"Week","Test","test",1),0);

        roomIntegerLinkedHashMap.put(new Room("SVRO-0001",1000,2,40,"Hours","test","freesv"),0);
        roomIntegerLinkedHashMap.put(new Room("SVRO-0002",2000,3,60,"Day","test","freesv"),0);
    }
    public void displayVilla(){
        for (Villa v: villaIntegerLinkedHashMap.keySet()) {
            System.out.println(v);
        }
        System.out.println("--------------------------");
    }public void displayRoom(){
        for (Room r: roomIntegerLinkedHashMap.keySet()) {
            System.out.println(r);
        }
        System.out.println("--------------------------");
    }public void displayHouse(){
        for (House h: houseIntegerLinkedHashMap.keySet()) {
            System.out.println(h);
        }
        System.out.println("--------------------------");
    }
}
