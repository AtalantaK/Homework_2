package org.example;

public class Task2 {
    public static void main(String[] args) {
        Flat flat1 = new Flat("г.Москва, ул.Волхонка, д.10, кв.100", 5, 250.1, 1021382.99, "Иванов И.И", "88005551122");
        Room room1 = new Room(140.12, "Отличное", "Кухня", 3);

        System.out.println("Квартира 1:\n" +
                "Адрес: " + flat1.getAddress() + "\n" +
                "Кол-во комнат: " + flat1.getNumberRooms() + "\n" +
                "Площадь квартиры: " + flat1.getFloorArea() + "\n" +
                "Стоимость квартиры: " + flat1.getPrice() + "\n" +
                "Владелец квартиры: " + flat1.getOwner() + "\n" +
                "Контактный номер владельца: " + flat1.getContactNumber()+"\n");

        System.out.println("Комната 1:\n" +
                "Название комнаты: " + room1.getRoomName() + "\n" +
                "Размер комнаты: " + room1.getRoomSize() + "\n" +
                "Состояние комнаты: " + room1.getRoomStatus() + "\n" +
                "Количество окон: " + room1.getWindowNumber());

    }
}