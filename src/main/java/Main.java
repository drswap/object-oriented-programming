public class Main {
    public static void main(String[] args) {

        Post post = new Post();

        post.name = "Иван";
        post.surname = "Иванов";
        post.patronymic = "Иванович";
        post.phone = 98888888;
        post.passport = 12345678;
        post.subscription = true;

        post.birthday = new FormDate();

        post.birthday.day = 29;
        post.birthday.month = 2023;
        post.birthday.year = 4;

    }

}
