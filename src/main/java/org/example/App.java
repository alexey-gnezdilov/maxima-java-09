package org.example;

import org.example.config.SpringConfig;
import org.example.model.Bowl;
import org.example.model.Cat;
import org.example.repository.BowlRepository;
import org.example.repository.CatRepository;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class App
{
    public static void main( String[] args )
    {
        System.out.println("Hello JPA!!!");

        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

        CatRepository repoCat = context.getBean(CatRepository.class);
        BowlRepository repoBowl = context.getBean(BowlRepository.class);

        Cat murzik = new Cat("Мурзик", 10, true);
        Cat barsik = new Cat("Барсик", 5, false);
        Cat murka = new Cat("Мурка", 2, false);
        Cat arbuz = new Cat("Арбуз", 2, false);
        Cat persik = new Cat("Персик", 2, false);

//        Bowl tazik = new Bowl("Tazik");

        repoCat.save(murzik);
        repoCat.save(murka);
        repoCat.save(barsik);
        repoCat.save(arbuz);
        repoCat.save(persik);

//        tazik.setCat(Arrays.asList(murka,murzik,barsik));
//        repoBowl.save(tazik);

//        murzik.setBowl(tazik);
//        repoCat.save(murzik);

//        repoCat.save(new Cat("Мурзик", 10, true));
//        repoCat.save(new Cat("Барсик", 5, false));
//        repoCat.save(new Cat("Мурка", 2, false));

        System.out.println("Коты");
        repoCat.findAll().forEach(System.out::println);
        System.out.println("------------------------");
        repoCat.findByIsAngryTrue().forEach(System.out::println);
        System.out.println("------------------------");
        repoCat.findById(2L).ifPresent(System.out::println);
        System.out.println("------------------------");
        repoCat.updateCatName(1L, "RAMZES");
        repoCat.findById(1L).ifPresent(System.out::println);

//        System.out.println("Толстые коты");
//        repoCat.findByWeightGreaterThan(4).forEach(System.out::println);
//        System.out.println("Мурзики");
//        repoCat.findMurzik().forEach(System.out::println);

//        System.out.println("Миски: ");
//        repoBowl.findAll().forEach(System.out::println);

        //repoCat.deleteById(1L);
//        repoBowl.deleteById(1L);
//
//        System.out.println("Миски: ");
//        repoBowl.findAll().forEach(System.out::println);
//
//        System.out.println("Миски: ");
//        repoBowl.findAll().forEach(System.out::println);
    }
}