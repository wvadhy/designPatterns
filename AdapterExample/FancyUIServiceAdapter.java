package org.example.AdapterExample;

import org.example.JsonData;
import org.example.XmlData;

public class FancyUIServiceAdapter implements MultiResto{

    private final FancyUIService fancyUIService;

    public FancyUIServiceAdapter() {
        this.fancyUIService = new FancyUIService();
    }

    @Override
    public void displayMenus(XmlData xmlData) {
        JsonData jsonData = convert(xmlData);
        System.out.println("Baguette");
    }

    @Override
    public void displayRecommendations(XmlData xmlData) {
        JsonData jsonData = convert(xmlData);
        System.out.println("Sandwich");
    }

    private JsonData convert(XmlData xmlData){
        System.out.println("Converting!");
        return new JsonData();
    }
}
