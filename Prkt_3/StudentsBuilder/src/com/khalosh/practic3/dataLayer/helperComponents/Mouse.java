package com.khalosh.practic3.dataLayer.helperComponents;

import com.khalosh.practic3.businessLogic.FeatureChecker;

public enum Mouse implements FeatureChecker { //мишка
     Roccat_Kone_AIMO("Roccat Kone AIMO", "Roccat", "black", 1050),
     SteelSeries_Rival_710("SteelSeries Rival 710", "SteelSeries", "black", 420),
     Logitech_G703("Logitech G703", "Logitech", "black", 530),
     Cooler_Master_MM531("Cooler Master MM531", "Cooler Master", "black", 890),
     G_Wolves_Skoll("G-Wolves Skoll", "G-Wolves", "black", 640);
     private String name;
     private String brand;
     private String color;
     private int cost;

     Mouse(String name, String brand, String color, int cost){
          this.name = name;
          this.brand = brand;
          this.color = color;
          this.cost = cost;
     }

     public String getBrand() {
          return brand;
     }

     public String getColor() {
          return color;
     }

     public int getCost() {
          return cost;
     }
     public String getName() {
          return name;
     }
     public String getAllFeatures(){
          return "Name: " + name +
                  " | brand: " + brand +
                  " | color: " + color +
                  " | cost: " + cost + "$";
     }
}
