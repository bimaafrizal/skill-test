const dataArray = [1, 4, 5, 3, 2, 5, 3, 4, 8, 5, 4, 3, 6, 0, 4, 3, 2, 1, 5, 9, 9, 4, 3, 1, 3, 0, 2, 2, 4, 6, 2, 4, 7, 4];
let dataArrayTampung = [];
let dataArrayCount = [];

for(let i = 0; i<dataArray.length; i++) {
    let ketemu = false;

    for(let a =0; a<dataArrayTampung.length; a++) {
        if(dataArray[i] == dataArrayTampung[a]) {
            ketemu = true;
        }
    }
    let totalKetemu = 0;
    if(!ketemu) {
        dataArrayTampung.push(dataArray[i]);
        for(let x = 0; x < dataArray.length; x++) {
            if(dataArray[i] == dataArray[x]){
                totalKetemu = totalKetemu+1;
            }
        }
        dataArrayCount += `Angka ${dataArray[i]} sebanyak ${totalKetemu} \n`;
    }
}

console.log(dataArrayTampung);
console.log(dataArrayCount);