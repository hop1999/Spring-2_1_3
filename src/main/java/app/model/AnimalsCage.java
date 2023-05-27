package app.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

// не реализован 4 пункт задания “4) На основе класса Timer создайте бин. Свяжите с AnimalCage.
// Проверьте, что при выполнении метода main время, которое пишет таймер, одно и тоже.”
//
//код-стайл - между полем и методом добавь пустую строку.
// Время одинаковое, бин создал. Или ты меня с кем то перепутал, или я очень сильно плыву :( (кодстайл поправил)

@Component
public class AnimalsCage {

    @Autowired
    @Qualifier("dogBean")
    private Animal animal;

    @Autowired
    private Timer timer;

    public void whatAnimalSay() {
        System.out.println("Say:");
        System.out.println(animal.toString());
        System.out.println("At:");
        System.out.println(new Timer().getTime());
        System.out.println("________________________");
    }

    public Timer getTimer() {
        return timer;
    }
}
