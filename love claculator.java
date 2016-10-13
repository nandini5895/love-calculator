
function avg(x,y) {
    return (x+y)/2;
}

function countLoveLettersIn(name) {
    LoveCount = 0;
    for (var Count = 0; Count < name.length; Count++) {
        letter1 = name.substring(Count, Count + 1);

        if (letter1 == 'L') LoveCount += 2;
        if (letter1 == 'O') LoveCount += 3;
        if (letter1 == 'V') LoveCount += 2;
        if (letter1 == 'E') LoveCount += 2;
        if (letter1 == 'Y') LoveCount += 3;
        if (letter1 == 'U') LoveCount += 3;
    }
    return LoveCount;
}


function computeMagicFormula(LoveCount, avgLength) {
    amount = 0;
    if (LoveCount > 0) amount = 5 - avgLength;
    if (LoveCount > 2) amount = 10 - avgLength;
    if (LoveCount > 4) amount = 20 - avgLength;
    if (LoveCount > 6) amount = 30 - avgLength;
    if (LoveCount > 8) amount = 40 - avgLength;
    if (LoveCount > 10) amount = 50 - avgLength;
    if (LoveCount > 12) amount = 60 - avgLength;
    if (LoveCount > 14) amount = 70 - avgLength;
    if (LoveCount > 16) amount = 80 - avgLength;
    if (LoveCount > 18) amount = 90 - avgLength;
    if (LoveCount > 20) amount = 100 - avgLength;
    if (LoveCount > 22) amount = 110 - avgLength;
    return amount;
}
function outputScore(amount) {
        document.loveform.output.value = amount + "%";
}
function ensureLegalPct(amount) {
    if (amount < 0) {
        return 0;
    } else if (amount > 99) {
        return 99;  
    } else {
        return amount;
    }
}
    

function calc() {
    
    first = document.loveform.name1.value.toUpperCase();
    second = document.loveform.name2.value.toUpperCase();
    var avgLength = avg(first.length, second.length);
    var LoveCount = countLoveLettersIn(first) + countLoveLettersIn(second);
    var amount = computeMagicFormula(LoveCount, avgLength);
    var legalAmount = ensureLegalPct(amount); 
    outputScore(legalAmount);
}