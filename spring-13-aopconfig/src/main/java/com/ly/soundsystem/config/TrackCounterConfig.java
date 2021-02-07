package com.ly.soundsystem.config;

import com.ly.soundsystem.aop.TrackCounter;
import com.ly.soundsystem.pojo.impl.BlankDisc;
import com.ly.soundsystem.pojo.CompactDisc;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import java.util.ArrayList;
import java.util.List;

/**
 * liyang 2021-01-25
 * java配置类，替代xml，注册bean相关配置
 */

@Configuration
@ComponentScan
@EnableAspectJAutoProxy
public class TrackCounterConfig {

    @Bean
    public CompactDisc blankDisc() {
        BlankDisc cd = new BlankDisc();
        cd.setArtist("The Beatles");
        cd.setTitle("Sgt. Peppers's Lonely Hearts Club Band");

        List<String> tracks = new ArrayList<>();
        tracks.add("Sgt. Pepper's Lonely Hearts Club Band");
        tracks.add("With a Little Help from My Friends");
        tracks.add("Lucy in the Sky with Diamonds");
        tracks.add("Getting Better");
        tracks.add("Fixing a Hole");
        tracks.add("She's Leaving Home");
        tracks.add("Being for the Benefit of Mr. Kite!");
        tracks.add("Within You Without You");
        tracks.add("Good Morning Good Morning");
        tracks.add("A Day in the Life");
        tracks.add("Lovely Rita");
        // ...other tracks omitted for brevity...
        cd.setTracks(tracks);
        return cd;
    }

    @Bean
    public TrackCounter trackCounter() {
        return new TrackCounter();
    }

}
