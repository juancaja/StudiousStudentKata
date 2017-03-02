Archivo original: http://goo.gl/edch54
# Madrid Agile & SW Craftsmanship 17 Apr 2015
[@lantoli](http://twitter.com/lantoli)

## Practice - Studious Student
### Problem
You've been given a list of words to study and memorize. Being a diligent student of language and the arts, you've decided to not study them at all and instead make up pointless games based on them. One game you've come up with is to see how you can concatenate the words to generate the lexicographically lowest possible string. 

### Input
As input for playing this game you will receive a text file containing an integer N, the number of word sets you need to play your game against. This will be followed by N word sets, each starting with an integer M, the number of words in the set, followed by M words. All tokens in the input will be separated by some whitespace and, aside from N and M, will consist entirely of lowercase letters. 

### Output
Your submission should contain the lexicographically shortest strings for each corresponding word set, one per line and in order. 
Constraints
```
1 <= N <= 100.     1 <= M <= 9.     1 <= all word lengths <= 10
``` 

Example input
``` 
5
6 facebook hacker cup for studious students
5 k duz q rc lvraw
5 mybea zdr yubx xe dyroiy
5 jibw ji jp bw jibw
5 uiuy hopji li j dcyi
```

Example output
```
cupfacebookforhackerstudentsstudious
duzklvrawqrc
dyroiymybeaxeyubxzdr
bwjibwjibwjijp
dcyihopjijliuiuy
```

When you think your implementation is done, try to use the following input file and compare your result file with the expected result file. 

Don’t make a visual comparison, use a tool or IDE to compare.
This is as if your implementation went to Production.

 * In: https://drive.google.com/open?id=0Bw7VBLGlujLgT2FQaDA0dk9qa2c
 * Out: https://drive.google.com/open?id=0Bw7VBLGlujLgcHFtLWYyZ0FMTTg

Examples Results: 
 * Leo Antoli: https://gist.github.com/lantoli/a290af048e27edb6d4dd
 * Repo Learning By Doing: https://descinet.bbva.es/stash/projects/LBD/repos/kata-studious-student/

