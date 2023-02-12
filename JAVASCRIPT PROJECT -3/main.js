const accordion=document.getElementsByClassName('content-container');
let state=true
for(let i=0;i<accordion.length;i++){        
    accordion[i].addEventListener('click',()=>{
        accordion[i].classList.toggle('active')
    })
}


