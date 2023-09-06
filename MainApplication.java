package com.edu;

import java.util.ArrayList;
import java.util.List;

class Insect {
    private String insectName;
    private int insectWeight;

    public Insect(String insectName, int insectWeight) {
        this.insectName = insectName;
        this.insectWeight = insectWeight;
    }

    public String getInsectName() {
        return insectName;
    }

    public void setInsectName(String insectName) {
        this.insectName = insectName;
    }

    public int getInsectWeight() {
        return insectWeight;
    }

    public void setInsectWeight(int insectWeight) {
        this.insectWeight = insectWeight;
    }

    @Override
    public String toString() {
        return "Insect [insectName=" + insectName + ", insectWeight=" + insectWeight + "]";
    }
}

class Insecticides {
    public List<String> mapInsectstName(List<Insect> list) {
        List<String> insectNames = new ArrayList<>();
        for (Insect insect : list) {
            insectNames.add(insect.getInsectName());
        }
        return insectNames;
    }

    public List<Insect> getWeight(List<Insect> list) {
        List<Insect> filteredInsects = new ArrayList<>();
        for (Insect insect : list) {
            int weight = insect.getInsectWeight();
            if (weight > 40 && weight <= 100) {
                filteredInsects.add(insect);
            }
        }
        return filteredInsects;
    }
}

public class MainApplication{
    public static void main(String[] args) {
        Insecticides i = new Insecticides();
        List<Insect> list = new ArrayList<Insect>();

        list.add(new Insect("Ant", 45));
        list.add(new Insect("Cockroach", 65));
        list.add(new Insect("Bee", 99));
        list.add(new Insect("Paper Wasp", 111));

        List<String> insectNames = i.mapInsectstName(list);
        List<Insect> filteredInsects = i.getWeight(list);

        System.out.println("Insect Names: " + insectNames);
        System.out.println("Filtered Insects: " + filteredInsects);
    }
}