/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nhom3.qlcf.helper;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

/**
 *
 * @author baotri1998
 */
public class Soundhelper {

    private Player player;
    private String filename;

    public Soundhelper(String filename) {
        this.filename = filename;
    }

    public void stop() {
        if (player != null) {
            player.close();
        }
    }

    public void play() {
        try {
            BufferedInputStream bis = new BufferedInputStream(new FileInputStream(filename));
            player = new Player(bis);
        } catch (FileNotFoundException | JavaLayerException ex) {
            System.out.println(ex);
        }

        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    player.play();
                } catch (Exception ex) {
                    System.out.println(ex);
                }
            }
        }).start();
    }
}
