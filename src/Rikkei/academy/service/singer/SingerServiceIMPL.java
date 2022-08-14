package Rikkei.academy.service.singer;
import Rikkei.academy.model.Singer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SingerServiceIMPL implements ISingerService {
    public static List<Singer> singerList = new ArrayList<>();

    static {
        singerList.add(new Singer(1, "Zed", 34));
        singerList.add(new Singer(2, "Avicii", 33));
        singerList.add(new Singer(3, "Shane Filan", 43));
        singerList.add(new Singer(4, "Cozi", 23));
    }

    @Override
    public List<Singer> findAll() {
        return singerList;
    }

    @Override
    public void save(Singer singer) {
        singerList.add(singer);
    }

    @Override
    public Singer findById(int id) {
       return singerList.get(id - 1);
    }

    @Override
    public void deleteById(int id) {
        singerList.remove(id - 1);
        updateId();
    }

    public void sort() {
        Collections.sort(singerList);
        updateId();
    }

    public void updateId(){
        for(int i = 0;i< singerList.size(); i ++){
            singerList.get(i).setId(i+1);
        }
    }

}
