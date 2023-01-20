function passValid(x,y){

    if(x.value === y.value){
        return true;
    }else{
        return false;
    }
    
}


var submit = document.getElementById('sub')
var pass = document.getElementById('pass')
var confPass = document.getElementById('confPass')

submit.onclick = function(event){

    if(userName.value == '' || pass.value == '' || confPass == '' ||Name.value == '' 
        || date.value == '' || Browser.value == '' ){

    }else{

    // if(!passValid(document.getElementById('pass').value, document.getElementById('confPass').value)){
       
    // }
    
    if(passValid(pass,confPass )){
    var myWin = window.open("","testing","width=800, height=600");

    
    var form = document.forms['form']

    var total = "<html> <head> <title>jooo</title> </head> <body> <h1>All Information is : </h1> ";

    for(var i=0; i<(form.length-2); i++){

        if(!form[i] || !form[i].value){
            continue;
        }

           total += `<h4> ${form[i].name} : ${form[i].value}</h4>`;
         
    }
    total += "</body>";
    myWin.document.write(total)
    } else{
        alert("Password did not identical.")
        event.preventDefault();
    }



    }



}


confPass.onblur = function(){
    if(!passValid(pass,this)){
        confPass.style.borderColor = 'red';
    }else{
        confPass.style.borderColor = null;

    }

    console.log('hello')
}




