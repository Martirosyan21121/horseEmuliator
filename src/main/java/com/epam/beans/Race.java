package com.epam.beans;

import java.time.LocalDate;
import java.util.List;

public class Race {

  private List<Horse> participatingHorses;
  private long length;
  private LocalDate startData;

  public List<Horse> getParticipatingHorses() {
    return participatingHorses;
  }

  public void setParticipatingHorses(List<Horse> participatingHorses) {
    this.participatingHorses = participatingHorses;
  }

  public long getLength() {
    return length;
  }

  public void setLength(long length) {
    this.length = length;
  }

  public LocalDate getStartData() {
    return startData;
  }

  public void setStartData(LocalDate startData) {
    this.startData = startData;
  }

  @Override
  public String toString() {
    return "Race{"
        + "participatingHorses="
        + participatingHorses
        + ", length="
        + length
        + ", startData="
        + startData
        + '}';
  }
}
