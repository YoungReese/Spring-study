package com.ly.soundsystem.pojo.impl;

import com.ly.soundsystem.pojo.CompactDisc;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * liyang 2021-01-25
 * 压缩唱片的是实现
 */
@Component
public class BlankDisc implements CompactDisc {
    private String title;
    private String artist;
    private List<String> tracks;

    public BlankDisc() {}

    @Override
    public void play() {
        System.out.println("Playing " + title + " by " + artist);
    }

    @Override
    public void playTrack(int trackNumber) {
        System.out.println("Playing " + tracks.get(trackNumber) + " by " + artist);
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public void setTracks(List<String> tracks) {
        this.tracks = tracks;
    }
}
