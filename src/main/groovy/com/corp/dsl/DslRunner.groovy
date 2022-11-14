package com.corp.dsl

import static com.corp.dsl.DslBuilder.*

// Это сложно и непонятно
//def email = new Email()
//email.setFrom("from@mail.ru")
//email.setTo("to@mail.ru")
//email.setTitle("title")
//
//
//def body = new EmailBody()
//body.setText("safsd")
//body.setImages(List.of("image.jpg"))
//email.setBody(body)


// Это легко и понятно всем
mail {
    from "from@mail.ru"
    to "to@mail.ru"
    title "title"
    body {
        text "text of the letter"
        images (['image.jpg', 'image2.png'])
    }
}

