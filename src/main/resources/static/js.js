function regMotorvogn() {
    let personnr=$("#personnr").val();
    let navn=$("#eiersNavn").val();
    let adresse=$("#eiersAdresse").val();
    let kjennetegn=$("#kjennetegn").val();
    let bilmerke=$("#bilMerke").val();
    let biltype=$("#biltype").val();
    const liste={
        eierPersonNr:personnr,
        eiersNavn:navn,
        eiersAdresse:adresse,
        kjennetegn:kjennetegn,
        bilMerke:bilmerke,
        biltype:biltype
    }
    $.post("/add",liste, function (){

    })
    let alleMotorvong=$.get("/hentalle",function (){

    })
    for(let eier of alleMotorvong){
        
    }
    console.log(alleMotorvong)


}
