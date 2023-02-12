const btnEl=document.querySelector('.btn')
const  closeIconEl=document.querySelector('.xicon')
const trailerContainerEl=document.querySelector('.trailer-container');
const mainContainer=document.querySelector('.main-container')
const videoEl=document.querySelector('video');
console.log(trailerContainerEl);


btnEl.addEventListener('click',()=>{
    trailerContainerEl.classList.remove('active')
    closeIconEl.classList.remove("active")
    mainContainer.style.display="none"   
    videoEl.currentTime=0;
})

closeIconEl.addEventListener('click',()=>{
    trailerContainerEl.classList.add('active');
    closeIconEl.classList.add("active")
    mainContainer.style.display="block"
})