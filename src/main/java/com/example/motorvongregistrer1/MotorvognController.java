package com.example.motorvongregistrer1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
@RestController
public class MotorvognController {
    public final ArrayList<Motorvong> alleMotorvognRegistrer=new ArrayList<>();
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
