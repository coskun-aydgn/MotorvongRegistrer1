package com.example.motorvongregistrer1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
@RestController
public class MotorvognController {
    public final ArrayList<Motorvong> alleMotorvognRegistrer=new ArrayList<>();
    public final ArrayList<Bil> biler=new ArrayList<>();
    public MotorvognController(){
        Bil bil1= new Bil("Auidi", "Q7");
        biler.add(bil1);
        Bil bil2= new Bil("Auidi", "Q6");
        biler.add(bil2);
        Bil bil3= new Bil("Auidi", "Q5");
        biler.add(bil3);
        Bil bil4= new Bil("Volvo", "V40");
        biler.add(bil4);
        Bil bil5= new Bil("Volvo", "V50");
        biler.add(bil5);
        Bil bil6= new Bil("Volvo", "V80");
        biler.add(bil6);
    }
    @GetMapping("/hentbiler")
    public ArrayList<Bil> hentbiler(){
        String sql="select * Bil";

        return biler;}

    @PostMapping("/add")
    public void add(Motorvong motorvong){
        alleMotorvognRegistrer.add(motorvong);
    }
    @GetMapping("/hentalle")
    public ArrayList<Motorvong> hentAlleMotorvong(){
        return alleMotorvognRegistrer;
    }
    @GetMapping("/slett")
    public void sletAlleMotorvong(){
        alleMotorvognRegistrer.clear();
    }
}
