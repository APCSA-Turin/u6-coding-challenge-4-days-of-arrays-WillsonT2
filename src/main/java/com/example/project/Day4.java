package com.example.project;
import java.util.Random;

public class Day4 {
    
    private static String[] reindeer_names = {"Dasher", "Dancer", "Prancer", "Vixen", "Comet", "Cupid", "Donner", "Blitzen"};

    public static class Reindeer { // you must have at least a name, distance travelled, speed, run duration, and rest duration attribute
        private String name;
        private int distance;
        private int speed;
        private int runDuration;
        private int restDuration;
        private int runLeft;
        private int restLeft;

        // Constructor 
        public Reindeer(String name, int speed, int runDuration, int restDuration) {
            this.name = name;
            this.speed = speed;
            this.runDuration = runDuration;
            this.restDuration = restDuration;
            this.restLeft = restDuration;
            this.runLeft = runDuration;
        }

        public int getDistanceTraveled(){ // this method is required
            return distance;
        }

        public String getName(){
            return name;
        }
        

        public void simulateSecond(){ //this method is required but not tested
            if (runLeft > 0){
                distance += speed;
                runLeft--;
            }else if (restLeft > 0){
                restLeft--;
            }else {
                runLeft = runDuration;
                restLeft = restDuration;
            }
        }

    }

    public static String simulateRace(int time, Reindeer[] reindeers){ //you will be tested on this method
        String result = reindeers[0].getName();
        int farthest = 0;
        for (int i = 0; i < reindeers.length; i++){
            for (int j = 0; j <= time; j++){
                reindeers[i].simulateSecond();
            }
            if (reindeers[i].getDistanceTraveled() > farthest){
                farthest = reindeers[i].getDistanceTraveled();
                result = reindeers[i].getName();
            }
        }
        return result;
    }

    
    public static void main(String[] args) { // for testing purposed

    }

 
}



