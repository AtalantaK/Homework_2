package org.example;

public class Task3 {
    public static void main(String[] args) {
        Item item1 = new Item("Samsung Galaxy A25 5G 6/128GB Light blue", "265161", 140_000, 21, "China");
        Item item2 = new Item("Apple iPad 10.9 2024 Wi-Fi 64GB Silver", "265162", 199_000, 3, "USA");
        Item item3 = new Item("LG 55 55UT80006LA LED UHD Smart Ashed Blue", "265163", 0, "Russia");
        Item item4 = new Item("Philips LatteGo EP-3241/50", "265164", 21_999, 115, "China");
        Item item5 = new Item("Dyson Airwrap id HS08 Curly+Coily", "265165", 0, "Germany");

        System.out.println("Товар 1: " + item1.getArticle() +
                " - " + item1.getNameItem() +
                " - " + item1.getPriceItem() +
                " - " + item1.getQuantityItem() +
                " - " + item1.getManufacter());

        System.out.println("Товар 2: " + item2.getArticle() +
                " - " + item2.getNameItem() +
                " - " + item2.getPriceItem() +
                " - " + item2.getQuantityItem() +
                " - " + item2.getManufacter());

        System.out.println("Товар 3: " + item1.getArticle() +
                " - " + item3.getNameItem() +
                " - " + item3.getPriceItem() +
                " - " + item3.getQuantityItem() +
                " - " + item3.getManufacter());

        System.out.println("Товар 4: " + item4.getArticle() +
                " - " + item4.getNameItem() +
                " - " + item4.getPriceItem() +
                " - " + item4.getQuantityItem() +
                " - " + item4.getManufacter());

        System.out.println("Товар 5: " + item5.getArticle() +
                " - " + item5.getNameItem() +
                " - " + item5.getPriceItem() +
                " - " + item5.getQuantityItem() +
                " - " + item5.getManufacter());
    }
}
