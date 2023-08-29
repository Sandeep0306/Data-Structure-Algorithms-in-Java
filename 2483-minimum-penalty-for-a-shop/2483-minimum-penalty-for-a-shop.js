/**
 * @param {string} customers
 * @return {number}
 */
var bestClosingTime = function(customers) {
    let min_penalty = 0;
    let cur_penalty=0;
    let earlier_hour =0;
    
    for(let i=0; i<customers.length;i++){
        if(customers.charAt(i)=='Y'){
            cur_penalty--;
        }
        else {
            cur_penalty++;
        }
        
        if(cur_penalty < min_penalty){
            earlier_hour =i+1;
            min_penalty = cur_penalty;
        }
    }
    return earlier_hour;
};