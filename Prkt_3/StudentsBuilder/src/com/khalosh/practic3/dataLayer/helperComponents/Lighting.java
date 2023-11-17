package com.khalosh.practic3.dataLayer.helperComponents;

import com.khalosh.practic3.businessLogic.FeatureChecker;

public enum Lighting implements FeatureChecker { //підсвітка
     SmartLux_Smart_Bulb("SmartLux Smart Bulb","SmartLux", "white", 110),
     AuroraWave_LightPanels("AuroraWave LightPanels","AuroraWave", "multicolor", 170),
     EcoGlow_Smart_Bulb("EcoGlow Smart Bulb","EcoGlow", "multicolor", 90),
     SmartConnect_Smart_Bulb("SmartConnect Smart Bulb","SmartConnect", "white", 60),
     ColorWave_RGB_LightStrips("ColorWave RGB LightStrips","ColorWave", "multicolor", 70);

     private String name;
     private String brand;
     private String color;
     private int cost;

     Lighting(String name, String brand, String color, int cost) {
          this.name = name;
          this.brand = brand;
          this.color = color;
          this.cost = cost;
     }

     public String getName() {
          return name;
     }

     public Lighting setName(String name) {
          this.name = name;
          return this;
     }

     public String getBrand() {
          return brand;
     }

     public Lighting setBrand(String brand) {
          this.brand = brand;
          return this;
     }

     public String getColor() {
          return color;
     }

     public Lighting setColor(String color) {
          this.color = color;
          return this;
     }

     public int getCost() {
          return cost;
     }

     public Lighting setCost(int cost) {
          this.cost = cost;
          return this;
     }
     public String getAllFeatures(){
          return "Name: " + name +
                  ", brand: " + brand +
                  ", color: " + color +
                  ", cost: " + cost + "$";
     }
}
