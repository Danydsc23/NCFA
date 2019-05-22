package com.example.nfc;

import java.util.ArrayList;

public class Atleta {

    private String username;
    private String password;
    private int NFCAID;

    public Atleta(String username,String password, int NFCAID){
        this.username=username;
        this.password=password;
        this.NFCAID=NFCAID;
    }

    public String getUsername(){return this.username;}
    public String getPassword(){return this.password;}
    public int getNFCAID(){return this.NFCAID;}


    public ArrayList<String> avisosub14(){
        ArrayList<String> avisossub14=new ArrayList<>();
        avisossub14.add(" Este é o primeiro aviso que vai aparecer");
        avisossub14.add(" Este é o segund aviso que vai aparecer");
        avisossub14.add(" Este é o terceiro aviso que vai aparecer");
        avisossub14.add(" Este é o quarto aviso que vai aparecer");
        avisossub14.add(" Este é o quinto aviso que vai aparecer");
        avisossub14.add(" Este é o sexto aviso que vai aparecer so para ver se o scroll funciona como deve de ser ");
        return avisossub14;
    }
    public ArrayList<String> avisosub8(){
        ArrayList<String> avisossub14=new ArrayList<>();
        avisossub14.add(" Este é o primeiro aviso que vai aparecer");
        avisossub14.add(" Este é o segund aviso que vai aparecer");
        avisossub14.add(" Este é o terceiro aviso que vai aparecer");
        avisossub14.add(" Este é o quarto aviso que vai aparecer");
        avisossub14.add(" Este é o quinto aviso que vai aparecer");
        avisossub14.add(" Este é o sexto aviso que vai aparecer so para ver se o scroll funciona como deve de ser ");
        return avisossub14;
    }

}
