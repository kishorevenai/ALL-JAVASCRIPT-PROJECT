const navbarEl=document.querySelector('.navbar');

const navfonts=document.querySelectorAll('.fonts')



const bottomContainerEl=document.querySelector('.bottom-container')

const title=document.querySelector('.title');

window.addEventListener('scroll',()=>{  
    if(window.scrollY>title.offsetTop)    
    {
       navbarEl.style.backgroundColor="black"       
       for(var i=0;i<navfonts.length;i++)       {
        navfonts[i].style.color="white"
       }
    }
    else{
        navbarEl.style.backgroundColor="white"        
        for(var i=0;i<navfonts.length;i++)       {
            navfonts[i].style.color="black"
           }
    }
    
})
