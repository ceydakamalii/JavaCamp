//typescript : tip güvenli getirilmiş hali
//var,let,const(let kullanıcaz.)
//js tip güvenli bir dil değil.
let sayi1= 10;
sayi1="Engin Demiroğ";
let student={id:1,name:"Engin"};
//console.log(student);

function save(ogrenci,puan=10) {//default parametre en sona yazılır.
    //console.log(ogrenci.name+": "+ puan)
}
save(student);
//save(50);
save(student,100);

function saved(puan=10,ogrenci) {//default parametre en sona yazılır.
    //console.log(ogrenci.name+": "+ puan)
}
//save(student)
saved(undefined,student)

let students = ["Engin Demiroğ","Halit Kalaycı","Engin Toprak","Büşra"]
//console.log(students)

let students2=[student,{id:2,name:"Halit"},"Ankara",{city:"İstanbul"}]
//console.log(students2)

//rest : geriye kalan,rest gönderdiğimiz değerleri array olarak tutar.
//params(c# karsılığı)
//varArgs(java karsılığı)
let showProducts = function (id,...products){ //products -->rest
    console.log(id)
    console.log(products)
    console.log(products[0])
}
//console.log(typeof showProducts)
//showProducts()
//showProducts(10,"elma","armut","karpuz")


//Spread:ayrıiştirmak demek.Arrayi ayırmaya yarıyor.
let points=[1,2,3,4,50,4,60,14]
console.log(...points)
console.log(Math.max(...points))
console.log(..."ABC","D",..."EFG","H")


//Destructuring:arrayin değerlerini değişkene atama
let populations = [10000,20000,30000,[40000,100000]]
let [small,medium,high,[veryHigh,maximum]]=populations
console.log(small)
console.log(medium)
console.log(high)
console.log(veryHigh)
console.log(maximum)

function someFunction([small1,small2],number) {
    console.log(small1)
    console.log(small2)
}
someFunction(populations)

let category = {id:1,name:"İçecek"}
console.log(category.id)
console.log(category["name"])

let {id,name}=category
console.log(id)
console.log(name)