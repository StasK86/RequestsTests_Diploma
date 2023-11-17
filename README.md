<h2 align="center"> Проект по автоматизации тестирования API для сайта сайта <a target="_blank" href="https://reqres.in/">reqres.in </a> </h2>

<a target="_blank" href="https://reqres.in/">
<p align="center">
  <img src="images/logo/reqres.png" width="800">
</p></a>

## :green_book:	Содержание


> ➠ [Стек технологий](#classical_building-стек-технологий)
>
> ➠ [Реализованные проверки](#earth_africa-реализованные-проверки)
>
> ➠ [Запуск тестов из терминала](#запуск-тестов-из-терминала)
>
> ➠ [Запуск тестов из Jenkins](#запуск-тестов-из-jenkins)
>
> ➠ [Отчет о результатах тестирования в Allure Report](#skier-главная-страница-allure-отчета)
>
> ➠ [Интеграция с Allure TestOps](#интеграция-с-allure-testops)
> 
> ➠ [Уведомления в Telegram с использованием бота](#-уведомления-в-telegram-с-использованием-бота)


## :classical_building: Стек технологий

<p align="center">
<img width="6%" title="IntelliJ IDEA" src="images/logo/Intelij_IDEA.svg">
<img width="6%" title="Java" src="images/logo/Java.svg">
<img width="6%" title="Selenide" src="images/logo/Selenide.svg">
<img width="6%" title="Selenoid" src="images/logo/Selenoid.svg">
<img width="6%" title="Allure Report" src="images/logo/Allure_Report.svg">
<img width="6%" title="Allure TestOps" src="images/logo/AllureTestOps.svg">
<img width="6%" title="Gradle" src="images/logo/Gradle.svg">
<img width="6%" title="JUnit5" src="images/logo/JUnit5.svg">
<img width="6%" title="GitHub" src="images/logo/GitHub.svg">
<img width="6%" title="Jenkins" src="images/logo/Jenkins.svg">
<img width="6%" title="Telegram" src="images/logo/Telegram.svg">
<img width="6%" title="Rest-Assured" src="images/logo/Rest_Assured.svg">
<img width="6%" title="Lombok" src="images/logo/Lombok.svg">

</p>

## :earth_africa: Реализованные проверки

1. - :heavy_check_mark:_Проверка сведений о пользователе_
2. - :heavy_check_mark:_Проверка удалений_
3. - :heavy_check_mark:_Проверка запросов_
4. - :heavy_check_mark:_Создание нового пользователя_
5. - :heavy_check_mark:_Проверка данных пользователей_

## Запуск тестов из терминала

### :robot: Команда запуска тестов:

```
gradle clean test 
-Dhost=local
```


### <img src="images/logo/Jenkins.svg" width="50" height="50"/> Сборка в [Jenkins](https://jenkins.autotests.cloud/job/RequestsTests_jenkins)

<p align="center">
  <img src="images/screenshots/Screenshot4.png" width="800">
</p>

## <img src="images/logo/Allure_Report.svg" width="50" height="50"/> [Allure](https://jenkins.autotests.cloud/job/RequestsTests_jenkins/10/allure/) отчет
### :skier: Главная страница Allure-отчета

<p align="center">
<img title="Allure Overview" src="images/screenshots/Screenshot5.png" width="800">
</p>

### :eye_speech_bubble: Тест-кейсы

<p align="center">
<img title="Allure Behaviors" src="images/screenshots/Screenshot6.png" width="800">
</p>

### :frog: Основной Dashboard

<p align="center">
<img title="Allure Overview Dashboard" src="images/screenshots/Screenshot7.png" width="800">
</p>

## <img src="images/logo/AllureTestOps.svg" width="50" height="50"/> Интеграция с [Allure TestOps](https://allure.autotests.cloud/launch/32178/tree?treeId=0)
### :skier: Dashboard Allure TestOps

<p align="center">
<img title="Allure TestOps Overview" src="images/screenshots/Screenshot2.png" width="800">
</p>

### :eye_speech_bubble: Тест-кейсы

<p align="center">
<img title="Allure TestOps Behaviors" src="images/screenshots/Screenshot1.png" width="800">
</p>

## <img src="images/logo/Telegram.svg" width="50" height="50"/> Уведомления в Telegram с использованием бота

> После завершения сборки специальный бот, созданный в <code>Telegram</code>, автоматически обрабатывает и отправляет сообщение с отчетом о прохождении тестов.

<p align="center">
<img title="Telegram Notifications" src="images/screenshots/Screenshot3.png" width="400">
</p>


