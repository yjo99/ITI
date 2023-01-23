var valArr = [];

var add = document.getElementById('add')
var dlt = document.getElementById('dlt')
var val = document.getElementById('name')
var slct = document.getElementById('slct')

add.onclick = function(){

        if(!valArr.includes(val.value)){
            valArr.push(val.value);


        }else{
            alert('this value is already Exist');
        }


        var text = ''
        for(i=0;i<valArr.length; i++){
            text += `<option id=${i} value=${valArr[i]}>${valArr[i]}</option>`;
        }
        slct.innerHTML = text;
}

dlt.onclick = function(){


    slctVal = document.querySelector('#slct')
    
    var i = valArr.indexOf(slctVal.value)
    if(i != -1){
        valArr.splice(i,1)
        slct.remove(i)
    }
}





