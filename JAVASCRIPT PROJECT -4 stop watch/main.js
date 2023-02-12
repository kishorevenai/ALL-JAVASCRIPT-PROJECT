/*VARIABLE FOR BUTTON*/
const startStopBtn=document.querySelector('#startStopBtn')
const resetBtn=document.querySelector('#resetBtn')
/*VARIABLES FOR TIME VALUES*/
let seconds=0;
let minutes=0;
let hours=0;

/*VARIABLES FOR LEADING ZERO*/
let leadingSeconds=0;
let leadingMinutes=0;
let leadingHours=0;

/*VARIABLES FOR SET INTERVAL & TIMERSTATUS*/
let timerInterval=null;
let timerStatus="stopped";

/*STOP WATCH FUNCTION*/

function stopWatch(){


    seconds++
    if(seconds/60===1){
        seconds=0;
        minutes++;
        if(minutes/60===1){
            minutes=0;
            hours++;
        }
    }
    if(seconds<10){
        leadingSeconds="0" + seconds.toString();
    }else{
        leadingSeconds=seconds;
    }
    if(minutes<10){
        leadingMinutes="0" + minutes.toString();
    }else{
        leadingMinutes=minutes;
    }
    if(hours<10){
        leadingHours="0" + hours.toString();
    }else{
        leadingHours=hours;
    }
    document.getElementById('timer').innerText=
    leadingHours +":"+leadingMinutes+":"+leadingSeconds;
}
window.setInterval(stopWatch,1000)

startStopBtn.addEventListener('click',()=>{
    if(timerStatus=="stopped"){
        timerInterval=window.setInterval(stopWatch,1000);
        document.getElementById('startStopBtn').innerHTML=`<i class="fa-solid fa-pause" id="pause">&#9654;</i>`;
        timerStatus="started";
    }else{
        window.clearInterval(timerInterval);
        document.getElementById('startStopBtn').innerHTML=`<i class="fa-solid fa-play" id="play">&#9208;</i>`;
        timerStatus="stopped"
    }
})


resetBtn.addEventListener('click',()=>{
    window.clearInterval(timerInterval)
    seconds=0;
    minutes=0;
    hours=0;
    document.getElementById('timer').innerHTML="0"+seconds+":"+"0"+minutes+":"+"0"+hours
})