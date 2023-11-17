package com.khalosh.practic3.dataLayer.сoreComponents;

import com.khalosh.practic3.businessLogic.FeatureChecker;

public enum CPU implements FeatureChecker { //процесора
     RYZEN("Ryzen", "Ryzen 9 5900X", "4.8 GHz", 12, 24, 480),
     NVIDIA_TEGRA("NVIDIA Tegra", "X2", "2.0 GHz", 6, 6, 180),
     ARM("ARM", "Cortex-A77", "3.0 GHz", 8, 8, 220),
     QUALCOMM("Qualcomm", "Snapdragon 888+", "2.96 GHz", 8, 24, 320 ),
     INTEL("Intel", "Core i7", "3.7 GHz", 8, 16, 550),
     IBM_POWER("IBM Power", "POWER10", "4.0 GHz", 14, 28, 850),
     APPLE_M1("Apple M1", "M1 Pro", "3.5 GHz", 10, 10, 650);

     private String name;
     private String model;
     private String clockSpeed;
     private int cores;
     private int threads;
     private int cost;

     CPU(String name, String model, String clockSpeed, int cores, int threads, int cost) {

          this.name = name;
          this.model = model;
          this.clockSpeed = clockSpeed;
          this.cores = cores;
          this.threads = threads;
          this.cost = cost;
     }

     public String getName() {
          return name;
     }

     public String getModel() {
          return model;
     }

     public String getClockSpeed() {
          return clockSpeed;
     }

     public int getCores() {
          return cores;
     }

     public int getThreads() {
          return threads;
     }

     public int getCost() {
          return cost;
     }

     public String getAllFeatures() {
          return "Brand: " + name +
                  ", Model: " + model +
                  ", Clock Speed: " + clockSpeed +
                  ", Cores: " + cores +
                  ", Threads: " + threads +
                  ", Price: " + cost + "$";
     }
}
