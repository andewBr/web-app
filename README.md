# web_app-master

# Инструкция для запуска проекта 
## Для запуска проекта потребуется: IntelliJ IDEA, PostgreSQL 

Склонировать проект в IntelliJ IDEA

В postgesql необходимо создать новую базу данных с таблицей user:

## Колонки:

### Имя: username, Тип: character varing
### Имя: password, Тип: character varing


В файле Application.kt в методе Database.connect() необходимо указать:

ulr (пример: "jdbc:postgresql://localhost/example", порт - 5432
user - postgres
password - 123
Проект готов к запуску

можно запустить в IntelliJ IDEA пакет com.example => SweaterApplication
