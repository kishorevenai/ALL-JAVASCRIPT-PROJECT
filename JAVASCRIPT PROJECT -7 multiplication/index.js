const randno1=Math.floor(Math.random()*10);
const randno2=Math.floor(Math.random()*10);
const question=document.getElementById('question');
const score=document.getElementById('score');
const formEl=document.getElementById('form');
const input=document.getElementById('input');
const correctAns=randno1*randno2;
let scor=JSON.parse(localStorage.getItem('scor'));


function multiplication(){
    question.innerText=`What is ${randno1} Multiply by ${randno2}?`;    
    score.innerText=`score:${scor}`
}
multiplication();

formEl.addEventListener('submit',()=>{               
   const userAns=input.value;   
   if(userAns==correctAns){
     scor++;
     updateLocalStorage();
   }
   else{
     scor--;
     updateLocalStorage();     
   }   
})

function updateLocalStorage(){
    localStorage.setItem("scor",JSON.stringify(scor));
}
