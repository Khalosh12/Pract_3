package com.khalosh.practic3.dataLayer.helperComponents;

import com.khalosh.practic3.businessLogic.FeatureChecker;

public enum Monitor implements FeatureChecker { //монітор
     MSI_Optix_Pro("MSI Optix Pro", "MSI", "27-inch", "2560x1440", 550),
     Samsung_Odyssey_Neo("Samsung Odyssey Neo", "Samsung", "32-inch", "3840x2160", 700),
     ViewSonic_Elite_XG("ViewSonic Elite XG", "ViewSonic", "34-inch", "3440x1440", 850),
     Dell_Alienware_Aurora("Dell Alienware Aurora", "Dell", "27-inch", "2560x1440", 500),
     AOC_CQ32G1("AOC CQ32G1", "AOC", "31.5-inch", "2560x1440", 400);



     private String name;
     private String brand;
     private String size;
     private String resolution;
     private int cost;

     Monitor(String name, String brand, String size, String resolution, int cost) {
          this.name = name;
          this.brand = brand;
          this.size = size;
          this.resolution = resolution;
          this.cost = cost;
     }

     public String getName() {
          return name;
     }

     public String getBrand() {
          return brand;
     }

     public String getSize() {
          return size;
     }

     public String getResolution() {
          return resolution;
     }

     public int getCost() {
          return cost;
     }
     public String getAllFeatures(){
          return "Name: " + name +
                  ", brand: " + brand +
                  ", color: " + size +
                  ", resolution: " + resolution +
                  ", cost: " + cost + "$";
     }
}
