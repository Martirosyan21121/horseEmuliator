package com.epam;

import com.epam.service.HorseService;
import com.epam.service.RaceService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDemoRunner {

  public static void main(String[] args) {
    ApplicationContext context = new ClassPathXmlApplicationContext("myBeans.xml");

    HorseService horseService = context.getBean("horseService", HorseService.class);

    System.out.println(horseService.getHorses());


    RaceService raceService = context.getBean("raceService", RaceService.class);

    System.out.println(raceService.getRace());
  }
}
