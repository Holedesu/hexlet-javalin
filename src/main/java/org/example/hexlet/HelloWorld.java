package org.example.hexlet;

import io.javalin.Javalin;

public class HelloWorld {
    public static void main(String[] args) {
        // Создаем приложение
        var app = Javalin.create(config -> {
            config.plugins.enableDevLogging();
        });
        // Описываем, что загрузится по адресу /
        app.get("/hello", ctx -> {
            var name = ctx.queryParam("name");
            ctx.html("<h1> Hello " + name + "</h1>");
        });

        app.start(7070); // Стартуем веб-сервер
    }
}
