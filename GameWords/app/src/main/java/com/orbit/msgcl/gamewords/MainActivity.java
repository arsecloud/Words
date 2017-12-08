package com.orbit.msgcl.gamewords;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import static com.orbit.msgcl.gamewords.R.id.InputWordXML;
import static com.orbit.msgcl.gamewords.slovar.letter1;
import static com.orbit.msgcl.gamewords.slovar.letter10;
import static com.orbit.msgcl.gamewords.slovar.letter11;
import static com.orbit.msgcl.gamewords.slovar.letter12;
import static com.orbit.msgcl.gamewords.slovar.letter13;
import static com.orbit.msgcl.gamewords.slovar.letter14;
import static com.orbit.msgcl.gamewords.slovar.letter15;
import static com.orbit.msgcl.gamewords.slovar.letter16;
import static com.orbit.msgcl.gamewords.slovar.letter161;
import static com.orbit.msgcl.gamewords.slovar.letter162;
import static com.orbit.msgcl.gamewords.slovar.letter17;
import static com.orbit.msgcl.gamewords.slovar.letter18;
import static com.orbit.msgcl.gamewords.slovar.letter181;
import static com.orbit.msgcl.gamewords.slovar.letter19;
import static com.orbit.msgcl.gamewords.slovar.letter2;
import static com.orbit.msgcl.gamewords.slovar.letter20;
import static com.orbit.msgcl.gamewords.slovar.letter21;
import static com.orbit.msgcl.gamewords.slovar.letter22;
import static com.orbit.msgcl.gamewords.slovar.letter23;
import static com.orbit.msgcl.gamewords.slovar.letter24;
import static com.orbit.msgcl.gamewords.slovar.letter25;
import static com.orbit.msgcl.gamewords.slovar.letter26;
import static com.orbit.msgcl.gamewords.slovar.letter27;
import static com.orbit.msgcl.gamewords.slovar.letter28;
import static com.orbit.msgcl.gamewords.slovar.letter29;
import static com.orbit.msgcl.gamewords.slovar.letter3;
import static com.orbit.msgcl.gamewords.slovar.letter30;
import static com.orbit.msgcl.gamewords.slovar.letter4;
import static com.orbit.msgcl.gamewords.slovar.letter5;
import static com.orbit.msgcl.gamewords.slovar.letter6;
import static com.orbit.msgcl.gamewords.slovar.letter7;
import static com.orbit.msgcl.gamewords.slovar.letter8;
import static com.orbit.msgcl.gamewords.slovar.letter9;

public class MainActivity extends AppCompatActivity {

    String testInput , testOutput;

    int LengthWords[] = new int[34];
    int Spaces[] = new int[34];
    String inputWord="",outputWord="",message="",history=" ";
    int LengthInputWord;
    String FirstSymbolInput,LastSymbolInput,LastSymbolOut;
    boolean wordEmpty,FirLastSym=true,historyIn,slovarIn,historyOut,WasOrNotWasIn,HaveOrNotHave,WasOrNotWasOut;
    String copyWords1=letter1,copyWords2=letter2,copyWords3=letter3,copyWords4=letter4,copyWords5=letter5,copyWords6=letter6,copyWords7=letter7,copyWords8=letter8,copyWords9=letter9,copyWords10=letter10,copyWords11=letter11,copyWords12=letter12,copyWords13=letter13,copyWords14=letter14,copyWords15=letter15,copyWords16=letter16,copyWords161=letter161,copyWords162=letter162,copyWords17=letter17,copyWords18=letter18,copyWords181=letter181,copyWords19=letter19,copyWords20=letter20,copyWords21=letter21,copyWords22=letter22,copyWords23=letter23,copyWords24=letter24,copyWords25=letter25,copyWords26=letter26,copyWords27=letter27,copyWords28=letter28,copyWords29=letter29,copyWords30=letter30;
    String str="";//входное слово ввод


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LengthSpace();
    }


//Функция подготавливает словари к использованию
    public void LengthSpace(){
//cчитаем длину всех словарей
        LengthWords[1]=copyWords1.length();
        LengthWords[2]=copyWords2.length();
        LengthWords[3]=copyWords3.length();
        LengthWords[4]=copyWords4.length();
        LengthWords[5]=copyWords5.length();
        LengthWords[6]=copyWords6.length();
        LengthWords[7]=copyWords7.length();
        LengthWords[8]=copyWords8.length();
        LengthWords[9]=copyWords9.length();
        LengthWords[10]=copyWords10.length();
        LengthWords[11]=copyWords11.length();
        LengthWords[12]=copyWords12.length();
        LengthWords[13]=copyWords13.length();
        LengthWords[14]=copyWords14.length();
        LengthWords[15]=copyWords15.length();
        LengthWords[16]=copyWords16.length();
        LengthWords[17]=copyWords17.length();
        LengthWords[18]=copyWords18.length();
        LengthWords[19]=copyWords19.length();
        LengthWords[20]=copyWords20.length();
        LengthWords[21]=copyWords21.length();
        LengthWords[22]=copyWords22.length();
        LengthWords[23]=copyWords23.length();
        LengthWords[24]=copyWords24.length();
        LengthWords[25]=copyWords25.length();
        LengthWords[26]=copyWords26.length();
        LengthWords[27]=copyWords27.length();
        LengthWords[28]=copyWords28.length();
        LengthWords[29]=copyWords29.length();
        LengthWords[30]=copyWords30.length();
        LengthWords[31]=copyWords161.length();
        LengthWords[32]=copyWords162.length();
        LengthWords[33]=copyWords181.length();
        for (int i = 0; i < LengthWords[1]; i++) {
            char a = copyWords1.charAt(i);
            if (a == ' ') {
                Spaces[1]++;
            }
        }
        Spaces[1]--;
        for (int i = 0; i < LengthWords[2]; i++) {
            char a = copyWords2.charAt(i);
            if (a == ' ') {
                Spaces[2]++;
            }
        }
        Spaces[2]--;
        for (int i = 0; i < LengthWords[3]; i++) {
            char a = copyWords3.charAt(i);
            if (a == ' ') {
                Spaces[3]++;
            }
        }
        Spaces[3]--;
        for (int i = 0; i < LengthWords[4]; i++) {
            char a = copyWords4.charAt(i);
            if (a == ' ') {
                Spaces[4]++;
            }
        }
        Spaces[4]--;
        for (int i = 0; i < LengthWords[5]; i++) {
            char a = copyWords5.charAt(i);
            if (a == ' ') {
                Spaces[5]++;
            }
        }
        Spaces[5]--;
        for (int i = 0; i < LengthWords[6]; i++) {
            char a = copyWords6.charAt(i);
            if (a == ' ') {
                Spaces[6]++;
            }
        }
        Spaces[6]--;
        for (int i = 0; i < LengthWords[7]; i++) {
            char a = copyWords7.charAt(i);
            if (a == ' ') {
                Spaces[7]++;
            }
        }
        Spaces[7]--;
        for (int i = 0; i < LengthWords[8]; i++) {
            char a = copyWords8.charAt(i);
            if (a == ' ') {
                Spaces[8]++;
            }
        }
        Spaces[8]--;
        for (int i = 0; i < LengthWords[9]; i++) {
            char a = copyWords9.charAt(i);
            if (a == ' ') {
                Spaces[9]++;
            }
        }
        Spaces[9]--;
        for (int i = 0; i < LengthWords[10]; i++) {
            char a = copyWords10.charAt(i);
            if (a == ' ') {
                Spaces[10]++;
            }
        }
        Spaces[10]--;
        for (int i = 0; i < LengthWords[11]; i++) {
            char a = copyWords11.charAt(i);
            if (a == ' ') {
                Spaces[11]++;
            }
        }
        Spaces[11]--;
        for (int i = 0; i < LengthWords[12]; i++) {
            char a = copyWords12.charAt(i);
            if (a == ' ') {
                Spaces[12]++;
            }
        }
        Spaces[12]--;
        for (int i = 0; i < LengthWords[13]; i++) {
            char a = copyWords13.charAt(i);
            if (a == ' ') {
                Spaces[13]++;
            }
        }
        Spaces[13]--;
        for (int i = 0; i < LengthWords[14]; i++) {
            char a = copyWords14.charAt(i);
            if (a == ' ') {
                Spaces[14]++;
            }
        }
        Spaces[14]--;
        for (int i = 0; i < LengthWords[15]; i++) {
            char a = copyWords15.charAt(i);
            if (a == ' ') {
                Spaces[15]++;
            }
        }
        Spaces[15]--;
        for (int i = 0; i < LengthWords[16]; i++) {
            char a = copyWords16.charAt(i);
            if (a == ' ') {
                Spaces[16]++;
            }
        }
        Spaces[16]--;
        for (int i = 0; i < LengthWords[17]; i++) {
            char a = copyWords17.charAt(i);
            if (a == ' ') {
                Spaces[17]++;
            }
        }
        Spaces[17]--;
        for (int i = 0; i < LengthWords[18]; i++) {
            char a = copyWords18.charAt(i);
            if (a == ' ') {
                Spaces[18]++;
            }
        }
        Spaces[18]--;
        for (int i = 0; i < LengthWords[19]; i++) {
            char a = copyWords19.charAt(i);
            if (a == ' ') {
                Spaces[19]++;
            }
        }
        Spaces[19]--;
        for (int i = 0; i < LengthWords[20]; i++) {
            char a = copyWords20.charAt(i);
            if (a == ' ') {
                Spaces[20]++;
            }
        }
        Spaces[20]--;
        for (int i = 0; i < LengthWords[21]; i++) {
            char a = copyWords21.charAt(i);
            if (a == ' ') {
                Spaces[21]++;
            }
        }
        Spaces[21]--;
        for (int i = 0; i < LengthWords[22]; i++) {
            char a = copyWords22.charAt(i);
            if (a == ' ') {
                Spaces[22]++;
            }
        }
        Spaces[22]--;
        for (int i = 0; i < LengthWords[23]; i++) {
            char a = copyWords23.charAt(i);
            if (a == ' ') {
                Spaces[23]++;
            }
        }
        Spaces[23]--;
        for (int i = 0; i < LengthWords[24]; i++) {
            char a = copyWords24.charAt(i);
            if (a == ' ') {
                Spaces[25]++;
            }
        }
        Spaces[25]--;
        for (int i = 0; i < LengthWords[26]; i++) {
            char a = copyWords26.charAt(i);
            if (a == ' ') {
                Spaces[26]++;
            }
        }
        Spaces[26]--;
        for (int i = 0; i < LengthWords[27]; i++) {
            char a = copyWords27.charAt(i);
            if (a == ' ') {
                Spaces[27]++;
            }
        }
        Spaces[27]--;
        for (int i = 0; i < LengthWords[28]; i++) {
            char a = copyWords28.charAt(i);
            if (a == ' ') {
                Spaces[28]++;
            }
        }
        Spaces[28]--;
        for (int i = 0; i < LengthWords[29]; i++) {
            char a = copyWords29.charAt(i);
            if (a == ' ') {
                Spaces[29]++;
            }
        }
        Spaces[29]--;
        for (int i = 0; i < LengthWords[30]; i++) {
            char a = copyWords30.charAt(i);
            if (a == ' ') {
                Spaces[30]++;
            }
        }
        Spaces[30]--;
        for (int i = 0; i < LengthWords[31]; i++) {
            char a = copyWords161.charAt(i);
            if (a == ' ') {
                Spaces[31]++;
            }
        }
        Spaces[31]--;
        for (int i = 0; i < LengthWords[32]; i++) {
            char a = copyWords162.charAt(i);
            if (a == ' ') {
                Spaces[32]++;
            }
        }
        Spaces[32]--;
        for (int i = 0; i < LengthWords[33]; i++) {
            char a = copyWords181.charAt(i);
            if (a == ' ') {
                Spaces[33]++;
            }
        }
        Spaces[33]--;
/*
проверка на словари
        for(int i = 1; i<34;i++){
            log=log+i+" "+LengthWords[i]+" "+ Spaces[i]+";";
        }
 */
    }
//проверка входящаего слова на повторение, существование , взятие последней буквы для ответа компьютера, проверка на первую букву
    public void PrepareInputWord() {
        testInput = "";
        inputWord = "";

        EditText et = (EditText) findViewById(InputWordXML);
        LengthInputWord = et.getText().length() - 1;//как по массиву длина будет снижена на 1 на самом же деле длина на 1 больше указанного числа
        if (LengthInputWord == -1) {
            wordEmpty = true;

        } else {
            wordEmpty=false;
            if (et.getText().charAt(LengthInputWord) != ' ') {
                LastSymbolInput = "" + et.getText().charAt(LengthInputWord);
            } else {
                boolean b = true;
                while (b != false) {
                    if ((et.getText().charAt(LengthInputWord) == ' ') && (LengthInputWord > 0)) {
                        LengthInputWord = LengthInputWord - 1;
                    } else {
                        b = false;
                    }
                }
            }

            LastSymbolInput = "" + et.getText().charAt(LengthInputWord);
            if ((LastSymbolInput.startsWith("ь") == true)) {
                LastSymbolInput = "" + et.getText().charAt(LengthInputWord - 1);
            }
            if (LastSymbolInput.length() == 0) {
                inputWord = "ааа";
            } else {
                for (int i = 0; i < et.getText().length(); i++) {
                    if (et.getText().charAt(i) != ' ') {
                        inputWord = inputWord + et.getText().charAt(i);
                        inputWord = inputWord.toLowerCase();
                    }
                }
            }



    /*String k="";
    for(int i = 0;i<inputWord.length();i++){
        if(inputWord.charAt(i)!=' '){
            k=k+inputWord.charAt(i);
        }
    }
    inputWord=k;*/
            char ch = inputWord.charAt(0);
            FirstSymbolInput = "" + ch;
            String st = "" + FirstSymbolInput;
            if (LastSymbolOut != null) {
                message = FirstSymbolInput + " " + LastSymbolOut + " ";
                if (FirstSymbolInput.charAt(0) == LastSymbolOut.charAt(0)) {
                    FirLastSym = true;
                } else {
                    FirLastSym = false;
                    message = "Твоё слово должно начинаться с буквы " + LastSymbolOut;
                }
            }
        }
    }
//testInput = ""+inputWord+" "+LastSymbolInput+" "+LengthInputWord;

    //int random_number= x + (int) (Math.random() * y);;
    //outputword=""
//подготовка ответного слова по последней букве пользователя, проверка на повтор, взятие последней буквы
    //choose letter ( буква с прописная, буква заглавная, количество пробелов в данном словаре, сам словарь
    public  void chooseLetter(int sp,String copySlovar) {


                int x = 0, random_number, space_ = 0, startsRandom;
                random_number = x + (int) (Math.random() * sp);
                for (startsRandom = 1; space_ != random_number; startsRandom++) {
                    char symbol = copySlovar.charAt(startsRandom);
                    if (symbol == ' ') {
                        space_++;
                    }
                }
                char symbol = 'g';
                for (int i = startsRandom; symbol != ' '; i++) {
                    symbol = copySlovar.charAt(i);
                    if (symbol != ' ') {
                        outputWord = outputWord + symbol;
                    }
                }
            }

void Check(String word,boolean bool){
    String s=FirstSymbolInput;
    if ((s.startsWith("а") == true) || (s.startsWith("А") == true)) {
        CheckSlovar(word, copyWords1, bool);

    }


    if ((s.startsWith("б") == true) || (s.startsWith("Б") == true)) {
        CheckSlovar(word, copyWords2, bool);

    }
    if ((s.startsWith("в") == true) || (s.startsWith("В") == true)) {
        CheckSlovar(word, copyWords3, bool);
    }
    if ((s.startsWith("г") == true) || (s.startsWith("Г") == true)) {
        CheckSlovar(word, copyWords4, bool);
    }
    if ((s.startsWith("д") == true) || (s.startsWith("Д") == true)) {
        CheckSlovar(word, copyWords5, bool);

    }
    if ((s.startsWith("е") == true) || (s.startsWith("Е") == true)) {
        CheckSlovar(word, copyWords6, bool);
    }
    if ((s.startsWith("ё") == true) || (s.startsWith("Ё") == true)) {
        CheckSlovar(word, copyWords30, bool);

    }
    if ((s.startsWith("ж") == true) || (s.startsWith("Ж") == true)) {
        CheckSlovar(word, copyWords7, bool);


    }
    if ((s.startsWith("з") == true) || (s.startsWith("З") == true)) {
        CheckSlovar(word, copyWords8, bool);

    }

    if ((s.startsWith("и") == true) || (s.startsWith("И") == true)) {
        CheckSlovar(word, copyWords9, bool);

    }
    if ((s.startsWith("к") == true) || (s.startsWith("К") == true)) {
        CheckSlovar(word, copyWords11, bool);

    }
    if ((s.startsWith("л") == true) || (s.startsWith("Л") == true)) {
        CheckSlovar(word, copyWords12, bool);

    }
    if ((s.startsWith("м") == true) || (s.startsWith("М") == true)) {
        CheckSlovar(word, copyWords13, bool);

    }
    if ((s.startsWith("н") == true) || (s.startsWith("Н") == true)) {
        CheckSlovar(word, copyWords14, bool);

    }
    if ((s.startsWith("о") == true) || (s.startsWith("О") == true)) {
        CheckSlovar(word, copyWords15, bool);

    }
    if ((s.startsWith("п") == true) || (s.startsWith("П") == true)) {
        CheckSlovar(word, copyWords16, bool);
    }
    if ((s.startsWith("р") == true) || (s.startsWith("Р") == true)) {
        CheckSlovar(word, copyWords17, bool);

    }
    if ((s.startsWith("с") == true) || (s.startsWith("С") == true)) {
        CheckSlovar(word, copyWords18, bool);

    }
    if ((s.startsWith("т") == true) || (s.startsWith("Т") == true)) {
        CheckSlovar(word, copyWords19, bool);

    }
    if ((s.startsWith("у") == true) || (s.startsWith("У") == true)) {
        CheckSlovar(word, copyWords20, bool);
    }
    if ((s.startsWith("ф") == true) || (s.startsWith("Ф") == true)) {
        CheckSlovar(word, copyWords21, bool);

    }
    if ((s.startsWith("ч") == true) || (s.startsWith("Ч") == true)) {
        CheckSlovar(word, copyWords24, bool);

    }
    if ((s.startsWith("э") == true) || (s.startsWith("Э") == true)) {
        CheckSlovar(word, copyWords27, bool);

    }
    if ((s.startsWith("ю") == true) || (s.startsWith("Ю") == true)) {
        CheckSlovar(word, copyWords28, bool);


    }
    if ((s.startsWith("я") == true) || (s.startsWith("Я") == true)) {
        CheckSlovar(word, copyWords29, bool);
    }
    if ((s.startsWith("х") == true) || (s.startsWith("Х") == true)) {
        CheckSlovar(word, copyWords22, bool);
    }
    if ((s.startsWith("ц") == true) || (s.startsWith("Ц") == true)) {
        CheckSlovar(word, copyWords23, bool);
    }
    if ((s.startsWith("щ") == true) || (s.startsWith("Щ") == true)) {
        CheckSlovar(word, copyWords26, bool);
    }
    if ((s.startsWith("ш") == true) || (s.startsWith("Ш") == true)) {
        CheckSlovar(word, copyWords25, bool);
    }

    if ((s.startsWith("й") == true) || (s.startsWith("Й") == true)) {
        CheckSlovar(word, copyWords10, bool);

    }

}

    public void PrepareOutputWord() {
        /*Check(inputWord, history, historyIn);
        Check(outputWord, history, historyOut);
        if (historyIn)
        {
            log=log+"historyIn is t ";
        }
        else log=log+"hIn f";
        if (historyOut)
        {
            log=log+"historyOut is t ";
        }        else log=log+"hOut f";
*/
        if (FirLastSym == true) {
            testOutput = "";
            String s = LastSymbolInput;

            outputWord = "";
            if ((s.startsWith("а") == true) || (s.startsWith("А") == true)) {
                chooseLetter(Spaces[1], copyWords1);
            }


            if ((s.startsWith("б") == true) || (s.startsWith("Б") == true)) {
                chooseLetter(Spaces[2], copyWords2);
            }
            if ((s.startsWith("в") == true) || (s.startsWith("В") == true)) {
                chooseLetter(Spaces[3], copyWords3);
            }
            if ((s.startsWith("г") == true) || (s.startsWith("Г") == true)) {
                chooseLetter(Spaces[4], copyWords4);
            }
            if ((s.startsWith("д") == true) || (s.startsWith("Д") == true)) {
                chooseLetter(Spaces[5], copyWords5);

            }
            if ((s.startsWith("е") == true) || (s.startsWith("Е") == true)) {
                chooseLetter(Spaces[6], copyWords6);
            }
            if ((s.startsWith("ё") == true) || (s.startsWith("Ё") == true)) {
                chooseLetter(Spaces[30], copyWords30);
            }
            if ((s.startsWith("ж") == true) || (s.startsWith("Ж") == true)) {
                chooseLetter(Spaces[7], copyWords7);

            }
            if ((s.startsWith("з") == true) || (s.startsWith("З") == true)) {
                chooseLetter(Spaces[8], copyWords8);
            }

            if ((s.startsWith("и") == true) || (s.startsWith("И") == true)) {
                chooseLetter(Spaces[9], copyWords9);
            }
            if ((s.startsWith("к") == true) || (s.startsWith("К") == true)) {
                chooseLetter(Spaces[11], copyWords11);
            }
            if ((s.startsWith("л") == true) || (s.startsWith("Л") == true)) {
                chooseLetter(Spaces[12], copyWords12);
            }
            if ((s.startsWith("м") == true) || (s.startsWith("М") == true)) {
                chooseLetter(Spaces[13], copyWords13);
            }
            if ((s.startsWith("н") == true) || (s.startsWith("Н") == true)) {
                chooseLetter(Spaces[14], copyWords14);
            }
            if ((s.startsWith("о") == true) || (s.startsWith("О") == true)) {
                chooseLetter(Spaces[15], copyWords15);
            }
            if ((s.startsWith("п") == true) || (s.startsWith("П") == true)) {
                chooseLetter(Spaces[16], copyWords16);
            }
            if ((s.startsWith("р") == true) || (s.startsWith("Р") == true)) {
                chooseLetter(Spaces[17], copyWords17);
            }
            if ((s.startsWith("с") == true) || (s.startsWith("С") == true)) {
                chooseLetter(Spaces[18], copyWords18);
            }
            if ((s.startsWith("т") == true) || (s.startsWith("Т") == true)) {
                chooseLetter(Spaces[19], copyWords19);
            }
            if ((s.startsWith("у") == true) || (s.startsWith("У") == true)) {
                chooseLetter(Spaces[20], copyWords20);
            }
            if ((s.startsWith("ф") == true) || (s.startsWith("Ф") == true)) {
                chooseLetter(Spaces[21], copyWords21);
            }
            if ((s.startsWith("ч") == true) || (s.startsWith("Ч") == true)) {
                chooseLetter(Spaces[24], copyWords24);
            }
            if ((s.startsWith("э") == true) || (s.startsWith("Э") == true)) {
                chooseLetter(Spaces[27], copyWords27);
            }
            if ((s.startsWith("ю") == true) || (s.startsWith("Ю") == true)) {
                chooseLetter(Spaces[28], copyWords28);

            }
            if ((s.startsWith("я") == true) || (s.startsWith("Я") == true)) {
                chooseLetter(Spaces[29], copyWords29);
            }
            if ((s.startsWith("х") == true) || (s.startsWith("Х") == true)) {
                chooseLetter(Spaces[22], copyWords22);
            }
            if ((s.startsWith("ц") == true) || (s.startsWith("Ц") == true)) {
                chooseLetter(Spaces[23], copyWords23);
            }
            if ((s.startsWith("щ") == true) || (s.startsWith("Щ") == true)) {
                chooseLetter(Spaces[26], copyWords26);
            }
            if ((s.startsWith("ш") == true) || (s.startsWith("Ш") == true)) {
                chooseLetter(Spaces[25], copyWords25);
            }

            if ((s.startsWith("й") == true) || (s.startsWith("Й") == true)) {
                chooseLetter(Spaces[10], copyWords10);
            }

            int len = outputWord.length() - 1;
            char ch = outputWord.charAt(len);
            LastSymbolOut = "" + ch;

            if ((LastSymbolOut.startsWith("ь")) || (LastSymbolOut.startsWith("ы"))) {
                LastSymbolOut = "" + outputWord.charAt(len - 1);
            }
            message = "тебе на " + LastSymbolOut;
        }
    }

    void CheckOut(String word,String slovar){
       boolean flag = false;

        String checker="";
        int position=0;
        if(slovar!="") {
            while (flag != true) {
                int i = slovar.indexOf(word, position);

                if (i != -1) {
                    if((slovar.charAt(i-1)==' ')&&(slovar.charAt(i+word.length())==' ') )     {
                        flag=true;
                       WasOrNotWasOut=false;
                    }
                    else{
                        position=i+word.length();
                        flag=false;
                        WasOrNotWasOut=true;
                    }

                } else {flag=true;
                    WasOrNotWasOut=true;
                }
            }

        }
        else{
            WasOrNotWasOut=true;
        }
    }
    void CheckIn(String word,String slovar){
        boolean flag = false;

        String checker="";
        int position=0;
        if(slovar!="") {
            while (flag != true) {
                int i = slovar.indexOf(word, position);

                if (i != -1) {
                    if((slovar.charAt(i-1)==' ')&&(slovar.charAt(i+word.length())==' ') )     {
                        flag=true;
                        WasOrNotWasIn=false;
                    }
                    else{
                        position=i+word.length();
                        flag=false;
                        WasOrNotWasIn=true;
                    }

                } else {flag=true;
                    WasOrNotWasIn=true;
                }
            }

        }
        else{
            WasOrNotWasIn=true;
        }
    }
    //Я ЗАКОНЧИЛ НА ПРОВЕРКЕ ПОЧЕМУ ЭТО ГОВНО ВЫЛЕТАЕТ ВОЗМОЖНО НАДО ПЕРЕПИСАТЬ ЭТУ ЕБУЧУЮ ФУНКЦИЮ
    void CheckSlovar(String word,String slovar,boolean flag){
        flag = false;

        String checker="";
        int position=0;
        if(slovar!="") {
            while (flag != true) {
                int i = slovar.indexOf(word, position);

                if (i != -1) {
             if((slovar.charAt(i-1)==' ')&&(slovar.charAt(i+word.length())==' ') )     {
                 flag=true;
                 HaveOrNotHave=true;
             }
             else{
                 position=i+word.length();
                 flag=false;
                 HaveOrNotHave=false;
             }

                } else {flag=true;
                    HaveOrNotHave=false;
                }
            }

        }
    }

//подготовка всей информации для вывода(Ответное слово , ошибки пользователя, на какую букву ходить)
    void Output(String input,String output){
        TextView ClearIn=(TextView) findViewById(InputWordXML);
        ClearIn.setText("");
        TextView TestoutputW = (TextView) findViewById(R.id.OutputWordXML);
        TestoutputW.setText(output);
        TextView message_ = (TextView) findViewById(R.id.messageXML);
        message_.setText(message);

    }
    void OutputMes(String messag){

        TextView message_ = (TextView) findViewById(R.id.messageXML);
        message_.setText(messag);

    }
    void yo(View view){
        str=str+"ё";
        TextView add = (TextView) findViewById(InputWordXML);
        add.setText(str);
    }
    void q(View view){
        str=str+"й";
        TextView add = (TextView) findViewById(InputWordXML);
        add.setText(str);
    }
    void w(View view){
        str=str+"ц";
        TextView add = (TextView) findViewById(InputWordXML);
        add.setText(str);
    }
    void e(View view){
        str=str+"у";
        TextView add = (TextView) findViewById(InputWordXML);
        add.setText(str);
    }
    void r(View view){
        str=str+"к";
        TextView add = (TextView) findViewById(InputWordXML);
        add.setText(str);
    }
    void t(View view){
        str=str+"е";
        TextView add = (TextView) findViewById(InputWordXML);
        add.setText(str);
    }
    void y(View view){
        str=str+"н";
        TextView add = (TextView) findViewById(InputWordXML);
        add.setText(str);
    }
    void u(View view){
        str=str+"г";
        TextView add = (TextView) findViewById(InputWordXML);
        add.setText(str);
    }
    void i(View view){
        str=str+"ш";
        TextView add = (TextView) findViewById(InputWordXML);
        add.setText(str);
    }
    void o(View view){
        str=str+"щ";
        TextView add = (TextView) findViewById(InputWordXML);
        add.setText(str);
    }
    void p(View view){
        str=str+"з";
        TextView add = (TextView) findViewById(InputWordXML);
        add.setText(str);
    }
    void he(View view){
        str=str+"х";
        TextView add = (TextView) findViewById(InputWordXML);
        add.setText(str);
    }
    void tz(View view){
        str=str+"ъ";
        TextView add = (TextView) findViewById(InputWordXML);
        add.setText(str);
    }


    void a(View view){
        str=str+"ф";
        TextView add = (TextView) findViewById(InputWordXML);
        add.setText(str);
    }
    void s(View view){
        str=str+"ы";
        TextView add = (TextView) findViewById(InputWordXML);
        add.setText(str);
    }
    void d(View view){
        str=str+"в";
        TextView add = (TextView) findViewById(InputWordXML);
        add.setText(str);
    }
    void f(View view){
        str=str+"а";
        TextView add = (TextView) findViewById(InputWordXML);
        add.setText(str);
    }
    void g(View view){
        str=str+"п";
        TextView add = (TextView) findViewById(InputWordXML);
        add.setText(str);
    }
    void h(View view){
        str=str+"р";
        TextView add = (TextView) findViewById(InputWordXML);
        add.setText(str);
    }
    void j(View view){
        str=str+"о";
        TextView add = (TextView) findViewById(InputWordXML);
        add.setText(str);
    }
    void k(View view){
        str=str+"л";
        TextView add = (TextView) findViewById(InputWordXML);
        add.setText(str);
    }
    void l(View view){
        str=str+"д";
        TextView add = (TextView) findViewById(InputWordXML);
        add.setText(str);
    }
    void je(View view){
        str=str+"ж";
        TextView add = (TextView) findViewById(InputWordXML);
        add.setText(str);
    }
    void ee(View view){
        str=str+"э";
        TextView add = (TextView) findViewById(InputWordXML);
        add.setText(str);
    }
    void z(View view){
        str=str+"я";
        TextView add = (TextView) findViewById(InputWordXML);
        add.setText(str);
    }
    void x(View view){
        str=str+"ч";
        TextView add = (TextView) findViewById(InputWordXML);
        add.setText(str);
    }

    void c(View view){
        str=str+"с";
        TextView add = (TextView) findViewById(InputWordXML);
        add.setText(str);
    }
    void v(View view){
        str=str+"м";
        TextView add = (TextView) findViewById(InputWordXML);
        add.setText(str);
    }
    void b (View view){
        str=str+"и";
        TextView add = (TextView) findViewById(InputWordXML);
        add.setText(str);
    }
    void n(View view){
        str=str+"т";
        TextView add = (TextView) findViewById(InputWordXML);
        add.setText(str);
    }
    void m (View view){
        str=str+"ь";
        TextView add = (TextView) findViewById(InputWordXML);
        add.setText(str);
    }
    void be(View view){
        str=str+"б";
        TextView add = (TextView) findViewById(InputWordXML);
        add.setText(str);
    }
    void yu(View view){
        str=str+"ю";
        TextView add = (TextView) findViewById(InputWordXML);
        add.setText(str);
    }
    void space(View view){
        str=str+" ";
        TextView add = (TextView) findViewById(InputWordXML);
        add.setText(str);
    }
    void del(View view){
        String copyStr="";
        int lens=str.length()-1;
        for(int i=0;i<lens;i++){
            copyStr= copyStr+str.charAt(i);
        }
        str=copyStr;
        TextView add = (TextView) findViewById(InputWordXML);
        add.setText(str);
    }

    void delF(View view){

        str="";
        TextView add = (TextView) findViewById(InputWordXML);
        add.setText(str);
    }


    //отображение на экран
    void Display(View view){
            PrepareInputWord();
        if(wordEmpty!=true){
        Check(inputWord,slovarIn);
        CheckIn(inputWord,history);
        if((HaveOrNotHave==true)&&(WasOrNotWasIn==true)) {
            WasOrNotWasOut = false;
            while (WasOrNotWasOut != true) {
                PrepareOutputWord();
                CheckOut(outputWord, history);
                history = history + outputWord + " ";
                history = history + inputWord + " ";
            }
            str="";
            Output(inputWord,outputWord);}

        else if(HaveOrNotHave==false){
            message="такого слова не существует!!";
            OutputMes(message);
        }
        else if(WasOrNotWasIn==false){
            message="это слово уже было!!!!!";
            OutputMes(message);

        }
        }
        else{
            message="Вы ничего не ввели";
            OutputMes(message);
        }


        // Check(outputWord,history,historyOut);





        }

}
