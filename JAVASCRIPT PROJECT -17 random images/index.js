const nextEl=document.querySelector('.next')

const img=document.querySelectorAll('img') 

const prevEl=document.querySelector('.prev')
let currentImg=1;
let timeout;

const imageContainerEl=document.querySelector('.image-container')

updateImg();

nextEl.addEventListener('click',()=>{
    currentImg++
    clearTimeout(timeout)
    updateImg();
})
function updateImg(){
    if(currentImg>=img.length){        
        currentImg=1
    }
    else if(currentImg<1){
        currentImg=img.length-1;
    }
    imageContainerEl.style.transform=`translateX(-${currentImg*500}px)`   
    timeout=setTimeout(()=>{
        currentImg++;
       updateImg();
    },3000)
}

prevEl.addEventListener('click',()=>{
   currentImg--;
   clearTimeout(timeout);
   updateImg(); 
})
