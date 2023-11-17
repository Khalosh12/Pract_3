package com.khalosh.practic3.dataLayer.helperComponents;

import com.khalosh.practic3.businessLogic.FeatureChecker;

public enum Speaker implements FeatureChecker { //динаміки
     Creative_Inspire_T10("Creative Inspire T10", "Creative", "black", 150),
     Logitech_Z333("Logitech Z333", "Logitech", "black", 180),
     Edifier_R980T("Edifier R980T", "Edifier", "walnut", 200),
     Bose_Companion_20("Bose Companion 20", "Bose", "silver", 350),
     Harman_Kardon_SoundSticks_III("Harman Kardon SoundSticks III", "Harman Kardon", "clear", 400);

     private String name;
     private String brand;
     private String color;
     private int cost;

     Speaker(String name, String brand, String color, int cost) {
          this.name = name;
          this.brand = brand;
          this.color = color;
          this.cost = cost;
     }

     public String getName() {
          return name;
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

     public String getAllFeatures() {
          return "Name: " + name +
                  ", brand: " + brand +
                  ", color: " + color +
                  ", cost: " + cost + "$";
     }
}
