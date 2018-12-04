/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

var ChainControllerModule =(function(){
    var sendChain=function(text){
        var callback ={
            onSuccess: function(answer){
                location.reload();
                console.log(text);
                alert("cadena aceptada:" +text);
                crateTab();
            },
            onFailed: function(answer){
                alert("la peticion no pudo ser completada");
                console.log(answer);
            }
        };
        RestControllerModule.postChain(text,callback);
    };
    
    var crateTab=function(){
        var callback={
            onSuccess: function(answer){
//                $("#Top10").remove();
                
                var table = document.getElementById("Top10");
//                // creating rows
                
                for (var r = 0; r < 10; r++) {
                    var row = document.createElement("tr");

                     // create cells in row
                     //document.createTextNode(Math.floor(Math.random() * (10 - 1 + 1)) + 1);
                    var columnaChain = document.createElement("td");
                    var Text = document.createTextNode(answer[r]["text"]);
                    columnaChain.appendChild(Text);
                    var columnaDate = document.createElement("td");
                    var Date = document.createTextNode(answer[r]["date"]);
                    columnaDate.appendChild(Date);
         
                    row.appendChild(columnaChain);
                    row.appendChild(columnaDate);
 
                table.appendChild(row); // add the row to the end of the table body
                }
//                alert("cadena ingresada");
                console.log(answer);
            },
            onFailed: function(answer){
                alert("cadena no ibgresada");
                console.log(answer);
            }     
        };
        RestControllerModule.getChain(callback);
    };
    
    return{
        sendChain: sendChain,
        crateTab: crateTab
    };
})();

