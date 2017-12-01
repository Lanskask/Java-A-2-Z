## Определение проблемы

Создайте крошечный веб-сервис RESTful со следующими бизнес-требованиями:

1. Приложение должно предоставлять конечные точки API REST для следующих функций:
    1. подать заявку на получение кредита (сумма кредита, срок, имя, фамилия и личный идентификатор должны быть предоставлены)
    2. Перечислите все утвержденные кредиты
    3. Перечислить все утвержденные кредиты пользователем
4. Служба должна выполнить проверку заявки на получение кредита в соответствии со следующими правилами и отклонить заявку, если:
    1. Заявка поступает из персонального идентификатора с черным списком
    2. Приложение N / второе получено от одной страны (по сути, мы хотим ограничить количество заявок на получение займов, поступающих из страны за определенный промежуток времени)
3. Служба должна выполнить разрешение страны происхождения с помощью веб-службы (вы должны выбрать ее) и сохранить код страны вместе с заявкой на получение кредита. Поскольку сеть ненадежна, и службы, как правило, терпят неудачу, давайте соглашаемся на код страны по умолчанию - «lv».

## Технические требования

У вас есть полный контроль над каркасом и инструментами.
Не стесняйтесь писать тесты на любом языке JVM.

## Что оценивается

1. Соответствие требованиям бизнеса
2. Качество кода, включая проверяемость
3. Как легко запускать и развертывать службу (не заставляйте нас устанавливать базу данных Oracle, пожалуйста;)