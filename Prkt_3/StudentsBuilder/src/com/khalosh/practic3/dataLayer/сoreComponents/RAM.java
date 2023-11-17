package com.khalosh.practic3.dataLayer.сoreComponents;

import com.khalosh.practic3.businessLogic.FeatureChecker;

public enum RAM implements FeatureChecker { //оперативна память
     G_SKILL_TRIDENT_Z("G.Skill", "Trident Z", "DDR4", "64GB", 3600, 220, 450),
     CORSAIR_DOMINATOR_PLATINUM("Corsair", "Dominator Platinum", "DDR4", "32GB", 3200, 180, 680),
     HYNIX_GAMING("Hynix", "Gaming", "DDR4", "16GB", 3000, 60, 190),
     CRUCIAL_CT("Crucial", "CT", "DDR4", "32GB", 2666, 100, 270),
     SAMSUNG_CRUCIAL("Samsung", "Crucial", "DDR4", "8GB", 2400, 40, 150),
     KINGSTON_FURY("Kingston", "Fury", "DDR4", "16GB", 3000, 70, 230);

     private String name;
     private String brand;
     private String series;
     private String type;
     private int capacity;
     private int speed;
     private int cost;

     RAM(String name, String brand, String series, String type, int capacity, int speed, int cost) {
          this.name = name;
          this.brand = brand;
          this.series = series;
          this.type = type;
          this.capacity = capacity;
          this.speed = speed;
          this.cost = cost;
     }

     public String getName() {
          return name;
     }

     public String getBrand() {
          return brand;
     }

     public String getSeries() {
          return series;
     }

     public String getType() {
          return type;
     }

     public int getCapacity() {
          return capacity;
     }

     public int getSpeed() {
          return speed;
     }

     public int getCost() {
          return cost;
     }

     public String getAllFeatures() {
          return "Brand: " + brand +
                  ", Series: " + series +
                  ", Type: " + type +
                  ", Capacity: " + capacity +
                  ", Speed: " + speed + " MHz" +
                  ", Price: " + cost + "$";
     }
}