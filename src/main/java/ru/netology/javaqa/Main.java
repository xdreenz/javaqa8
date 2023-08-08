package ru.netology.javaqa;

public class Main {
    public static void main(String[] args) {
        Post post = new Post();

        post.birthday = new FormDate();
        post.birthday.day = 13;
        post.birthday.month = 10;
        post.birthday.year = 1995;
        post.name = "Олег";
        post.passport = "8264 № 36240861";
        post.phone = "+7 (999) 123-45-67";
        post.surname = "Петров";
        post.patronymic = "Николаевич";
        post.subscription = false;

    }
}