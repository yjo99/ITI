var srbtn = document.getElementById('search');
srbtn.onclick = function(){
    var taVal = document.getElementById("textarea").value;
    var charVal = document.getElementById('substring').value;
    var indx = document.getElementById('indx').value;

    var indxP = parseInt(indx);


    if(isNaN(indxP)){
        window.alert("Please Enter Valid Number of indexing")
    }

    var foli = document.getElementById("foli")
    var loli = document.getElementById("loli");
    var fofli = document.getElementById("fofli")
    var lofli = document.getElementById("lofli");

    if(foli.value != -1){
        foli.value = taVal.indexOf(charVal);
    } else{
        foli.value = "Not Fount";
    }

    if(loli.value != -1){
        loli.value = taVal.lastIndexOf(charVal);
    } else{
        loli.value = "Not Fount";
    }

    if(fofli.value != -1){
        fofli.value = taVal.indexOf(charVal, indxP);
    } else{
        fofli.value = "Not Fount";
    }
    if(lofli.value != -1){
        lofli.value = taVal.lastIndexOf(charVal,indxP);
    } else{
        lofli.value = "Not Fount"
    }


   
    

}


