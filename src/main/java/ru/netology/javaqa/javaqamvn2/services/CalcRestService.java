package ru.netology.javaqa.javaqamvn2.services;

public class CalcRestService {
    public int calculate(int income, int expenses, int trashold) {
        int count = 0; // счётчик месяцев отдыха
        int money = 0; // количество денег на счету
        for (int month = 0; month < 12; month++) {
            if (money >= trashold) { // можем ли отдыхать?
                money = (money - expenses) / 3;
                count++;
            } else {
                money = money + income - expenses;
            }
        }
        return count;
}
}
