package com.khalosh.practic3.dataLayer.сoreComponents;

import com.khalosh.practic3.businessLogic.FeatureChecker;

public enum Motherboard implements FeatureChecker { //материнські плати
     GIGABYTE_AORUS_X570("GIGABYTE", "AORUS X570 PRO", "ATX", "AM4", 220, 950),
     ASUS_ROG_STRIX_B550_F("ASUS", "ROG STRIX B550-F", "ATX", "AM4", 180, 400),
     MSI_MAG_B450M("MSI", "MAG B450M MORTAR", "Micro-ATX", "AM4", 110, 300),
     ASROCK_X570_PHANTOM("ASRock", "X570 Phantom Gaming X", "ATX", "AM4", 250, 600),
     MSI_B460M_PRO("MSI", "B460M PRO-VDH WIFI", "Micro-ATX", "LGA 1200", 100, 250),
     GIGABYTE_H310M_A("GIGABYTE", "H310M A 2.0", "Micro-ATX", "LGA 1151", 60, 90);

     private String name;
     private String brand;
     private String model;
     private String formFactor;
     private int socket;
     private int cost;

     Motherboard(String name, String brand, String model, String formFactor, int socket, int cost) {
          this.name = name;
          this.brand = brand;
          this.model = model;
          this.formFactor = formFactor;
          this.socket = socket;
          this.cost = cost;
     }

     public String getName() {
          return name;
     }

     public String getBrand() {
          return brand;
     }

     public String getModel() {
          return model;
     }

     public String getFormFactor() {
          return formFactor;
     }

     public int getSocket() {
          return socket;
     }

     public int getCost() {
          return cost;
     }

     public String getAllFeatures() {
          return "Brand: " + brand +
                  ", Model: " + model +
                  ", Form Factor: " + formFactor +
                  ", Socket: " + socket +
                  ", Price: " + cost + "$";
     }
}
