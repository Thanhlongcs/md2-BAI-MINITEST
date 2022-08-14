package Rikkei.academy.service.song;

import Rikkei.academy.model.Song;

import java.util.ArrayList;
import java.util.List;

public class SongServiceIMPL implements ISongService{
    public static List<Song> songList = new ArrayList<>();
    static {
        songList.add(new Song(1,"bai1",1000,100));
        songList.add(new Song(2,"bai2",2000,200));
        songList.add(new Song(3,"bai3",3000,300));
        songList.add(new Song(4,"bai4",4000,400));


    }

    @Override
    public List<Song> findAll() {
        return songList;
    }

    @Override
    public void sort() {

    }

    @Override
    public void save(Song song) {
        songList.add(song);

    }

    @Override
    public Song findById(int id) {

    }

    @Override
    public void deleteById(int id) {

    }
}
