package com.softserve.edu.less9;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class NewCollection implements Comparable{
    private Integer key;
    private List<Integer> indexes;

    public NewCollection(Integer key) {
        this.key = key;
        this.indexes = new ArrayList<Integer>();
    }


    public Integer getKey() {
        return key;
    }

    public void setKey(Integer key) {
        this.key = key;
    }

    public List<Integer> getIndexes() {
        return indexes;
    }

    public void addIndexes(int index) {
        indexes.add(index);
//        indexes.contains()
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof NewCollection)) return false;
        NewCollection that = (NewCollection) o;
        return Objects.equals(getKey(), that.getKey());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getKey());
    }

    @Override
    public String toString() {
        return "NewCollection{" +
                "key=" + key +
                ", indexes=" + indexes +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
/*
//    @Override
    public boolean contains (int index){
//        boolean result = false
  for (NewCollection ind : this)
      if (ind.getKey() == index)
          return true;
  return false;
    }
    */
}
