package org.example;

public class Item {
    private String nameItem;
    private String article;
    private double priceItem;
    private int quantityItem;
    private String manufacter;

    public Item(String nameItem, String article, int quantityItem, String manufacter) {
        this.nameItem = nameItem;
        this.article = article;
        this.quantityItem = quantityItem;
        this.manufacter = manufacter;
    }

    public Item(String nameItem, String article, double priceItem, int quantityItem, String manufacter) {
        this.nameItem = nameItem;
        this.article = article;
        this.priceItem = priceItem;
        this.quantityItem = quantityItem;
        this.manufacter = manufacter;
    }

    public String getNameItem() {
        return nameItem;
    }

    public String getArticle() {
        return article;
    }

    public double getPriceItem() {
        return priceItem;
    }

    public int getQuantityItem() {
        return quantityItem;
    }

    public String getManufacter() {
        return manufacter;
    }
}
