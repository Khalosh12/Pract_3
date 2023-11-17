package com.khalosh.practic3.dataLayer.helperComponents;

import com.khalosh.practic3.businessLogic.FeatureChecker;

public enum Keyboard implements FeatureChecker { //клавіатура
     Acer_Predator_Aethon_500("Acer Predator Aethon 500", "Acer", "blue", 550),
     Dell_Alienware_ProMech_AW768("Dell Alienware ProMech AW768", "Dell", "red", 700),
     HP_OMEN_Sequencer("HP OMEN Sequencer", "HP", "green", 420),
     Lenovo_Legion_K500("Lenovo Legion K500", "Lenovo", "purple", 800),
     MSI_Vigor_GK80("MSI Vigor GK80", "MSI", "pink", 1200);

     private String name;
     private String brand;
     private String color;
     private int cost;

     Keyboard(String name, String brand, String color, int cost){
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
                  ", brand: " + brand +
                  ", color: " + color +
                  ", cost: " + cost + "$";
     }
}