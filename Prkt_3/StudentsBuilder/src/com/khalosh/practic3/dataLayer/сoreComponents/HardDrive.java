package com.khalosh.practic3.dataLayer.сoreComponents;

import com.khalosh.practic3.businessLogic.FeatureChecker;

public enum HardDrive implements FeatureChecker { //жорсткі диски
     WESTERN_DIGITAL_BLACK("WESTERN DIGITAL BLACK","Western Digital", "Black", "NVMe SSD", 1200, 150),
     CRUCIAL_P5("CRUCIAL P5","Crucial", "P5", "NVMe SSD", 1100, 180),
     SAMSUNG_QVO("SAMSUNG QVO","Samsung", "QVO", "SATA SSD", 800, 100),
     SEAGATE_IRONWOLF("SEAGATE IRONWOLF","Seagate", "IronWolf", "HDD", 2500, 110),
     KINGSTON_KC600("KINGSTON KC600","Kingston", "KC600", "SATA SSD", 900, 70),
     TOSHIBA_X300("TOSHIBA X300","Toshiba", "X300", "HDD", 2800, 85);

     private String name;
     private String brand;
     private String model;
     private String type;
     private int capacityGB;
     private int cost;

     HardDrive(String name, String brand, String model, String type, int capacityGB, int cost) {
          this.name = name;
          this.brand = brand;
          this.model = model;
          this.type = type;
          this.capacityGB = capacityGB;
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

     public String getType() {
          return type;
     }

     public int getCapacityGB() {
          return capacityGB;
     }

     public int getPrice() {
          return cost;
     }


     public int getCost() {
          return cost;
     }

     public String getAllFeatures() {
          return "Name: " + name +
                  ", Brand: " + brand +
                  ", Model: " + model +
                  ", Type: " + type +
                  ", Capacity: " + capacityGB + " GB" +
                  ", Price: " + cost + "$";
     }
}
