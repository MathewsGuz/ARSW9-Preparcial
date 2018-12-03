/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

var ChainControllerModule =(function(){
    var sendChain=function(text){
        var callback ={
            onSuccess: function(answer){
                //se mostrara la tabla 
                var table = document.getElementById("Top10");
//                table.
                console.log(text);
                alert("cadena aceptada:" +text);
            },
            onFailed: function(answer){
                alert("la peticion no pudo ser completada");
                console.log(answer);
            }
        };
        RestControllerModule.postChain(text,callback)
    };
    
    return{
        sendChain: sendChain
    };
})();

