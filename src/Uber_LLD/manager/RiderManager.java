package Uber_LLD.manager;

import Uber_LLD.Entity.Rider;

import java.util.HashMap;

public class RiderManager {

    HashMap<String, Rider> riderHashMap;

    public static RiderManager instance = null;

    private RiderManager() {
        this.riderHashMap = new HashMap<>();
    }

    public static RiderManager getInstance() {
        if(instance == null) {
            instance = new RiderManager();
        }
        return instance;
    }


    public void addRider( Rider rider) {
        System.out.println("Added Rider " + rider.getName());

        riderHashMap.put(rider.getName(), rider);
    }

    public HashMap<String, Rider> getRiderHashMap() {
        return riderHashMap;
    }
}
