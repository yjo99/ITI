
var table = document.getElementById('table')


function factorial(num){
    var x = 1
    for(var i =1; i<=num; i++){
         x = x * i;
    }

    return x;
}

for(var i =1;i <= 10; i++){

    var row = table.insertRow(i+1)

    var col1 = row.insertCell(0);
    var col2 = row.insertCell(1);

    col1.innerHTML = i + "!";
    col2.innerHTML = factorial(i);
}

var factoiralbtn = document.getElementById("find");
factoiralbtn.onclick = function(){
   var val = prompt("blease add number ");

   var valP = parseInt(val);

   if(isNaN(valP)){
    alert("Please Enter the number: ");    
   }else{

        var rslt = factorial(val);

        alert(rslt)
    }
}
