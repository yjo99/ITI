var splitbtn = document.getElementById("split")


splitbtn.onclick = function(){

    var stringVar = document.getElementById("substring").value;
    var splitVar = document.getElementById("splitVal").value;
    var txt = document.getElementById('textarea');

    var rslt= stringVar.split(splitVar);

    txt.value ="";
    for(var i=0; i<rslt.length ;i++){
        txt.value += rslt[i] + '\n';
    }


    var fChar = document.getElementById('fChars');
    fChar.value = stringVar.substring(0,10);

}