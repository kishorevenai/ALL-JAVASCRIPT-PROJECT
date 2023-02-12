/*variables*/

let btn=document.querySelector('#new-quote');
let quote=document.querySelector('.quote')
let person=document.querySelector('.person')

const quotes=[{
    quote:`"The Best way to find yourself is to lose yourself in the service of others."`,
    person:`Mahatma Gandhi` 
},{
    quote:`If you want to live a happy life,tie it to a goal, not to people or things.`,
    person:`Albert Einstein`    
},{
    quote:`At his best , man is the noblest of all animals; separated from law and justics he is the worst`,    
    person:`Aristotle`    
},{
    quote:`Your time is limited, so dont waste it living someone else's life`,
    person:`Steve `    
},{
    quote:`"Tell me and I forget.Teach me and i remember.Invlove me and I learn."`,
    person:`Benjamin Frankline`    
},{
    quote:`"If you look at what you have in life, you'll always have more.If you look at what you don't have in life, you'll never have enough"`,
    person:`Oprah Winfrey`    
},{
    quote:`"T does not matter how slowly you go as long as you do not stop."`,
    person:`Confucius`    
},{
    quote:`"Our lives begin to end the day we become silent about things that matters"`,
    person:`Martin Luther King, jr.`    
},{
    quote:`"Remember that not getting what you want is sometimes a wonderful stroke of luck"`,
    person:`Dalali Lama`    
},{
    quote:`"The journey of a thousand miles begins with one step"`,
    person:`Lao Tzu`    
}
]

btn.addEventListener('click',()=>{
    let random=Math.floor(Math.random()*quotes.length)
    quote.innerText=quotes[random].quote
    person.innerText=quotes[random].person
})