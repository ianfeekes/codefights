//centuryFromYear.c
//Codefights
//Arcade
//Introduction
//The Journey Begins
//#2

int centuryFromYear(int year) {
    if(year%100==0) return (int)year/100;
    else return (int)year/100+1;
}



