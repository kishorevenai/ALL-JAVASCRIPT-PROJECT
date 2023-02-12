const kit=["boom","boom1","boom2","boom3"];
const container=document.querySelector('.container')
kit.forEach((kit)=>{
     const btnEl=document.createElement('button')
     btnEl.setAttribute('class','btn')
     btnEl.innerText=kit
     container.appendChild(btnEl);
     const audioEl=document.createElement('audio')
     audioEl.src=`/SOUNDS/${kit}.mp3`
     container.appendChild(audioEl);
     btnEl.addEventListener('click',()=>{
        audioEl.play();        
     })    
})