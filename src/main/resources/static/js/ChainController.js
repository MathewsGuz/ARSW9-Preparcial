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

                // creating rows
                for (var r = 0; r < 10; r++) {
                    var row = document.createElement("tr");

                     // create cells in row
                     for (var c = 0; c < 2; c++) {
                        var cell = document.createElement("td");
                        var cellText = document.createTextNode(Math.floor(Math.random() * (10 - 1 + 1)) + 1);
                        cell.appendChild(cellText);
                        row.appendChild(cell);
                    }           

                table.appendChild(row); // add the row to the end of the table body
                }


                console.log(text);
                alert("cadena aceptada:" +text);
            },
            onFailed: function(answer){
                alert("la peticion no pudo ser completada");
                console.log(answer);
            }
        };
        RestControllerModule.postChain(text,callback);
    };
    
    return{
        sendChain: sendChain
    };
})();

