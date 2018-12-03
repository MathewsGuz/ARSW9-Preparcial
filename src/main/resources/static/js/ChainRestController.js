/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
var RestControllerModule =(function (){
    var postChain = function(text,callback){
        axios.post('/chain',text)
                .then(function(response){
                    callback.onSuccess(response.data);
                    console.log(text);
                    console.log(response.data);
                })
                .catch(function(error){
                    callback.onFailed(error.data);
                    console.log(error.data);
                });
    };
    
    return {
        postChain: postChain
    };
    
})();

