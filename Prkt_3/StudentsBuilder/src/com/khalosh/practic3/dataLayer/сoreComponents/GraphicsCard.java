package com.khalosh.practic3.dataLayer.сoreComponents;

import com.khalosh.practic3.businessLogic.FeatureChecker;

public enum GraphicsCard implements FeatureChecker { //відеокарти
     NVIDIA_GEFORCE_RTX_3070("NVIDIA GEFORCE RTX 3070","NVIDIA", "GeForce RTX 3070", "8 GB GDDR6", 1600, 3500),
     AMD_RADEON_RX_6800_XT("AMD RADEON RX 6800 XT","AMD", "Radeon RX 6800 XT", "16 GB GDDR6", 1800, 1200),
     ASUS_ROG_STRIX_GTX_1650_SUPER("ASUS ROG STRIX GTX 1650 SUPER","ASUS", "ROG Strix GTX 1650 Super", "4 GB GDDR6", 900, 350),
     MSI_GAMING_X_TRIO_RTX_3060("MSI GAMING X TRIO RTX 3060","MSI", "Gaming X Trio RTX 3060", "12 GB GDDR6", 1200, 800),
     GIGABYTE_AORUS_RX_5500_XT("GIGABYTE AORUS RX 5500 XT","GIGABYTE", "AORUS RX 5500 XT", "8 GB GDDR6", 800, 450);

     private String name;
     private String brand;
     private String model;
     private String memory;
     private int baseClock;
     private int cost;

     GraphicsCard(String name, String brand, String model, String memory, int baseClock, int cost) {
          this.name = name;
          this.brand = brand;
          this.model = model;
          this.memory = memory;
          this.baseClock = baseClock;
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

     public String getMemory() {
          return memory;
     }

     public int getBaseClock() {
          return baseClock;
     }

     public int getCost() {
          return cost;
     }

     public String getAllFeatures() {
          return "Brand: " + brand +
                  ", Model: " + model +
                  ", Memory: " + memory +
                  ", Base Clock: " + baseClock + " MHz" +
                  ", Price: " + cost + "$";
     }
}
