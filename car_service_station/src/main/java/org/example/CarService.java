package org.example;

import java.util.HashMap;

public class CarService {
    private HashMap<String, HashMap<String,Integer>> servicePrice;
    private HashMap<String,String> serviceDesc;

    public CarService(){

        servicePrice=new HashMap();
        HashMap<String,Integer> hatchBackPrices=new HashMap();
        hatchBackPrices.put("BS01",2000);
        hatchBackPrices.put("EF01",5000);
        hatchBackPrices.put("CF01",2000);
        hatchBackPrices.put("BF01",1000);
        hatchBackPrices.put("GF01",3000);
        servicePrice.put("Hatchback",hatchBackPrices);

        HashMap<String,Integer> sedanPrices=new HashMap();
        sedanPrices.put("BS01",4000);
        sedanPrices.put("EF01",8000);
        sedanPrices.put("CF01",4000);
        sedanPrices.put("BF01",1500);
        sedanPrices.put("GF01",6000);
        servicePrice.put("Sedan",sedanPrices);

        HashMap<String,Integer> suvPrices=new HashMap();
        suvPrices.put("BS01",4000);
        suvPrices.put("EF01",8000);
        suvPrices.put("CF01",4000);
        suvPrices.put("BF01",1500);
        suvPrices.put("GF01",6000);
        servicePrice.put("SUV",suvPrices);

        serviceDesc=new HashMap();
        serviceDesc.put("BS01","Basic Servicing");
        serviceDesc.put("EF01","Engine Fixing");
        serviceDesc.put("CF01","Clutch Fixing");
        serviceDesc.put("BF01","Break Fixing");
        serviceDesc.put("GF01","Gear Fixing");
    }


    public void generateBill(String carType, String serviceCode) {
        int totalBill=0;
        System.out.println("Type of Car "+carType);
        System.out.println("Service codes "+serviceCode);
        String[] serviceCodeArray=serviceCode.split(",");
        for(String i: serviceCodeArray){
            int charge= servicePrice.get(carType).get(i);
            System.out.println("Charges for "+serviceDesc.get(i)+" - Rs."+charge);
            totalBill+=charge;

        }

        System.out.println("Total Bill - Rs."+totalBill);

    }
}
