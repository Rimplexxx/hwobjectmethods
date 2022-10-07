public class Main {

    public static void main(String[] args) {
        Author alexanderPushkin = new Author("Александр", "Пушкин");
        Book rusalka = new Book("Русалка", alexanderPushkin, 1737);
        System.out.println(rusalka);

        Author nikolaiGogol = new Author("Николай", "Гоголь");
        Book tarasBulba = new Book("Тарас Бульба", nikolaiGogol, 1835);
        System.out.println(tarasBulba);
    }
}