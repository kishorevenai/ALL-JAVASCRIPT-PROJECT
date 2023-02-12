const textareaEl=document.getElementById('textarea');
const totalcounter=document.getElementById('total-counter');
const remainingcounter=document.getElementById('remaining-counter');
const container=document.querySelector('.container')
textareaEl.addEventListener('keyup',()=>{
    updateCounter();
})
function updateCounter(){    
     totalcounter.innerText=textareaEl.value.length
     remainingcounter.innerText=textareaEl.getAttribute('maxLength')-textareaEl.value.length;     
}