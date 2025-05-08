package org.example;

public class Task2 {
    public static void main(String[] args) {
        Room[] rooms = new Room[3];
        rooms[0] = new Room(140.12, "Отличное", "Кухня", 3);
        rooms[1] = new Room(40.5, "Хорошее", "Ванная", 0);
        rooms[2] = new Room(69.48, "Хорошее", "Гостиная", 2);
        Flat flat1 = new Flat("г.Москва, ул.Волхонка, д.10, кв.100", 5, 250.1, 1021382.99, "Иванов И.И", "88005551122", rooms);

        System.out.println("Квартира 1:\n" +
                "Адрес: " + flat1.getAddress() + "\n" +
                "Кол-во комнат: " + flat1.getNumberRooms() + "\n" +
                "Площадь квартиры: " + flat1.getFloorArea() + "\n" +
                "Стоимость квартиры: " + flat1.getPrice() + "\n" +
                "Владелец квартиры: " + flat1.getOwner() + "\n" +
                "Контактный номер владельца: " + flat1.getContactNumber() + "\n");

        for (int i = 0; i < rooms.length; i++) {
            System.out.println("Комната " + (int) (i + 1) + ":\n" +
                    "Название комнаты: " + rooms[i].getRoomName() + "\n" +
                    "Размер комнаты: " + rooms[i].getRoomSize() + "\n" +
                    "Состояние комнаты: " + rooms[i].getRoomStatus() + "\n" +
                    "Количество окон: " + rooms[i].getWindowNumber() + "\n");
        }
    }
}