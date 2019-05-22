package com.example.nfc;

import java.util.ArrayList;

public class TreinadorUser {

    private String username;
    private String password;
    private int NFCAID;
    public static ArrayList<String> avisossub14=new ArrayList<>();
    public static ArrayList<String> avisossub8=new ArrayList<>();
    public static ArrayList<String> atletassub8=new ArrayList<>();
    public static ArrayList<String> atletassub14=new ArrayList<>();
    public static ArrayList<String> convocados=new ArrayList<>();


    public TreinadorUser(String username,String password, int NFCAID){
        this.username=username;
        this.password=password;
        this.NFCAID=NFCAID;
    }

    public String getUsername(){return this.username;}
    public String getPassword(){return this.password;}
    public int getNFCAID(){return this.NFCAID;}




}
