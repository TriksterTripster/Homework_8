package ru.netology.main;

import ru.netology.api.FormDate;
import ru.netology.api.Post;

public class Main {
    public static void main(String[] args) {
        Post post = new Post();
        post.birthday = new FormDate();
        post.name = "Николай";
        post.patronymic = "Петрович";
        post.surname = "Иванов";
        post.birthday.day = 4;
        post.birthday.month = 10;
        post.birthday.year = 1989;
        post.passport = "1675 № 095334";
        post.phone = "+7 (982)-138-77-61";
        post.subscription = true;
    }
}