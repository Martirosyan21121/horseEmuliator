package com.epam.service;

import com.epam.beans.Horse;

import java.util.List;

public class HorseServiceimpl implements HorseService{

    private List<Horse> horses;

    public HorseServiceimpl(List<Horse> horses) {
        this.horses = horses;
    }

    public List<Horse> getHorses() {
        return horses;
    }
}
