package Rikkei.academy.controller;
import Rikkei.academy.model.Singer;
import Rikkei.academy.service.singer.ISingerService;
import Rikkei.academy.service.singer.SingerServiceIMPL;

import java.util.List;

public class SingerController {
    ISingerService singerService = new SingerServiceIMPL();

    public List<Singer> showListSinger(){
        return singerService.findAll();
    }

    public void createSinger(Singer singer){
        singerService.save(singer);
    }

    public void sortSingerList(){
        singerService.sort();
    }

    public void deleteSinger(int id){
        singerService.deleteById(id);
    }

    public Singer findById(int id){
        return singerService.findById(id);
    }

}
