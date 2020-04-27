//replace all public static and public static with just public.
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MoneyGameFiles;

//Francesco Barranca
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class QnA extends Question {

    public static final long serialVersionUID = -2402721521852825686L;
    public static Question selected = new Question();
    public static Answer selectedA = new Answer();
    private static Resource Res = new Resource();
    //Level 1
    private static Question Q1 = new Question("What does a Canadian Penny look like?");
    private static Question Q2 = new Question("What does a Canadian Nickel look like?");
    private static Question Q3 = new Question("What does a Canadian Dime look like?");
    private static Question Q4 = new Question("What does a Canadian Quarter look like?");
    private static Question Q5 = new Question("What does a Canadian Loonie look like?");
    private static Question Q6 = new Question("What does a Canadian Toonie look like?");
    private static Question Q7 = new Question("What does a Canadian five dollar bill look like?");
    private static Question Q8 = new Question("What does a Canadian ten dollar bill look like?");
    private static Question Q9 = new Question("What does a Canadian twenty dollar bill look like?");
    private static Question Q10 = new Question("What does a Canadian fifty dollar bill look like?");
    private static Question Q11 = new Question("What does a Canadian hundred dollar look like?");
    private static Question Q12 = new Question("What is the value of a penny?", Res.PENNY);
    private static Question Q13 = new Question("What is the value of a nickel?", Res.NICKEL);
    private static Question Q14 = new Question("What is the value of a dime?", Res.DIME);
    private static Question Q15 = new Question("What is the value of a quarter?", Res.QUARTER);
    private static Question Q16 = new Question("What is the value of a loonie?", Res.LOONIE);
    private static Question Q17 = new Question("What is the value of a toonie?", Res.TOONIE);
    private static Question Q18 = new Question("What is the colour of a five dollar bill?");
    private static Question Q19 = new Question("What is the colour of a ten dollar bill?");
    private static Question Q20 = new Question("What is the colour of a twenty dollar bill?");
    private static Question Q21 = new Question("What is the colour of a fifty dollar bill?");
    private static Question Q22 = new Question("What is the colour of a hundred dollar bill?");
    private static Question Q23 = new Question("What is the value of the green bill?");
    private static Question Q24 = new Question("What is the value of the blue bill?");
    private static Question Q25 = new Question("What is the value of the red bill?");
    //Level 2
    private static Question Q26 = new Question("What is a Toonie plus a Penny?", Res.PENNY, Res.TOONIE);
    private static Question Q27 = new Question("What is a Toonie plus a Nickel?", Res.TOONIE, Res.NICKEL);
    private static Question Q28 = new Question("What is a Toonie plus a Dime?", Res.TOONIE, Res.DIME);
    private static Question Q29 = new Question("What is a Toonie plus a Quarter?", Res.TOONIE, Res.QUARTER);
    private static Question Q30 = new Question("What is a Toonie plus a Loonie?", Res.TOONIE, Res.LOONIE);
    private static Question Q31 = new Question("What is a Toonie plus a Toonie?", Res.TOONIE, Res.TOONIE);
    private static Question Q32 = new Question("What is a Loonie plus a Penny?", Res.LOONIE, Res.PENNY);
    private static Question Q33 = new Question("What is a Loonie plus a Nickel?", Res.LOONIE, Res.NICKEL);
    private static Question Q34 = new Question("What is a Loonie plus a Dime?", Res.LOONIE, Res.DIME);
    private static Question Q35 = new Question("What is a Loonie plus a Quarter?", Res.LOONIE, Res.QUARTER);
    private static Question Q36 = new Question("What is a Loonie plus a Loonie?", Res.LOONIE, Res.LOONIE);
    private static Question Q37 = new Question("What is a Quarter plus a Penny?", Res.QUARTER, Res.PENNY);
    private static Question Q38 = new Question("What is a Quarter plus a Nickel?", Res.QUARTER, Res.NICKEL);
    private static Question Q39 = new Question("What is a Quarter plus a Dime?", Res.QUARTER, Res.DIME);
    private static Question Q40 = new Question("What is a Quarter plus a Quarter?", Res.QUARTER, Res.QUARTER);
    private static Question Q41 = new Question("What is a Dime plus a Penny?", Res.DIME, Res.PENNY);
    private static Question Q42 = new Question("What is a Dime plus a Nickel?", Res.DIME, Res.NICKEL);
    private static Question Q43 = new Question("What is a Dime plus a Dime?", Res.DIME, Res.DIME);
    private static Question Q44 = new Question("What is a Nickel plus a Penny?", Res.NICKEL, Res.PENNY);
    private static Question Q45 = new Question("What is a Nickel plus a Nickel?", Res.NICKEL, Res.NICKEL);
    private static Question Q46 = new Question("What is a Toonie plus a Loonie, plus a Dime?", Res.TOONIE, Res.LOONIE, Res.DIME);
    private static Question Q47 = new Question("What is a Toonie plus a Loonie, plus a Quarter?", Res.TOONIE, Res.LOONIE, Res.QUARTER);
    private static Question Q48 = new Question("What is a Toonie plus a Loonie, plus a Penny?", Res.TOONIE, Res.LOONIE, Res.PENNY);
    private static Question Q49 = new Question("What is a Toonie plus a Loonie, plus a Nickel?", Res.TOONIE, Res.LOONIE, Res.NICKEL);
    private static Question Q50 = new Question("What is a Toonie plus a Loonie, plus a Toonie?", Res.TOONIE, Res.LOONIE, Res.TOONIE);
    //Level 3
    private static Question Q51 = new Question("What is five dollars minus a Toonie?", Res.DOLLAR5, Res.TOONIE);
    private static Question Q52 = new Question("What is five dollars minus a Loonie?", Res.DOLLAR5, Res.LOONIE);
    private static Question Q53 = new Question("What is five dollars minus three dollars?", Res.DOLLAR5, Res.TOONIE, Res.LOONIE);
    private static Question Q54 = new Question("What is five dollars minus four dollars?", Res.DOLLAR5, Res.TOONIE, Res.TOONIE);
    private static Question Q55 = new Question("What is five dollars minus five dollars?", Res.DOLLAR5, Res.DOLLAR5);
    private static Question Q56 = new Question("What is five dollars minus a Quarter?", Res.DOLLAR5, Res.QUARTER);
    private static Question Q57 = new Question("What is five dollars minus a Dime?", Res.DOLLAR5, Res.DIME);
    private static Question Q58 = new Question("What is five dollars minus a Nickel?", Res.DOLLAR5, Res.NICKEL);
    private static Question Q59 = new Question("What is five dollars minus a Penny?", Res.DOLLAR5, Res.PENNY);
    private static Question Q60 = new Question("What is ten dollars minus a Loonie?", Res.DOLLAR10, Res.LOONIE);
    private static Question Q61 = new Question("What is ten dollars minus a Toonie?", Res.DOLLAR10, Res.TOONIE);
    private static Question Q62 = new Question("What is ten dollars minus three dollars?", Res.DOLLAR10, Res.TOONIE, Res.TOONIE);
    private static Question Q63 = new Question("What is ten dollars minus four dollars?", Res.DOLLAR10, Res.TOONIE, Res.LOONIE);
    private static Question Q64 = new Question("What is ten dollars minus five dollars?", Res.DOLLAR10, Res.DOLLAR5);
    private static Question Q65 = new Question("What is ten dollars minus six dollars?", Res.DOLLAR10, Res.DOLLAR5, Res.LOONIE);
    private static Question Q66 = new Question("What is ten dollars minus seven dollars?", Res.DOLLAR10, Res.DOLLAR5, Res.TOONIE);
    private static Question Q67 = new Question("What is ten dollars minus eight dollars?", Res.DOLLAR10, Res.DOLLAR5, Res.TOONIE, Res.LOONIE);
    private static Question Q68 = new Question("What is ten dollars minus nine dollars?", Res.DOLLAR10, Res.DOLLAR5, Res.TOONIE, Res.TOONIE);
    private static Question Q69 = new Question("What is ten dollars minus ten dollars?", Res.DOLLAR10, Res.DOLLAR10);
    private static Question Q70 = new Question("What is ten dollars minus five dollars, minus a Penny?", Res.DOLLAR10, Res.DOLLAR5, Res.PENNY);
    private static Question Q71 = new Question("What is ten dollars minus five dollars, minus a Nickel?", Res.DOLLAR10, Res.DOLLAR5, Res.NICKEL);
    private static Question Q72 = new Question("What is ten dollars minus five dollars, minus a Dime?", Res.DOLLAR10, Res.DOLLAR5, Res.DIME);
    private static Question Q73 = new Question("What is ten dollars minus five dollars, minus a Quarter?", Res.DOLLAR10, Res.DOLLAR5, Res.QUARTER);
    private static Question Q74 = new Question("What is ten dollars minus five dollars, minus a Loonie?", Res.DOLLAR10, Res.DOLLAR5, Res.LOONIE);
    private static Question Q75 = new Question("What is ten dollars minus five dollars, minus a Toonie?", Res.DOLLAR10, Res.DOLLAR5, Res.TOONIE);
    //Level 4
    private static Question Q76 = new Question("What is twenty dollars times one?", Res.DOLLAR20);
    private static Question Q77 = new Question("What is twenty dollars times two?", Res.DOLLAR20);
    private static Question Q78 = new Question("What is twenty dollars times three?", Res.DOLLAR20);
    private static Question Q79 = new Question("What is twenty dollars times four?", Res.DOLLAR20);
    private static Question Q80 = new Question("What is twenty dollars times five?", Res.DOLLAR20);
    private static Question Q81 = new Question("What is twenty dollars times six?", Res.DOLLAR20);
    private static Question Q82 = new Question("What is twenty dollars times seven?", Res.DOLLAR20);
    private static Question Q83 = new Question("What is twenty dollars times eight?", Res.DOLLAR20);
    private static Question Q84 = new Question("What is twenty dollars times nine?", Res.DOLLAR20);
    private static Question Q85 = new Question("What is twenty dollars times ten?", Res.DOLLAR20);
    private static Question Q86 = new Question("What is fifty dollars times one?", Res.DOLLAR50);
    private static Question Q87 = new Question("What is fifty dollars times two?", Res.DOLLAR50);
    private static Question Q88 = new Question("What is fifty dollars times three?", Res.DOLLAR50);
    private static Question Q89 = new Question("What is fifty dollars times four?", Res.DOLLAR50);
    private static Question Q90 = new Question("What is fifty dollars times five?", Res.DOLLAR50);
    private static Question Q91 = new Question("What is fifty dollars times six?", Res.DOLLAR50);
    private static Question Q92 = new Question("What is fifty dollars times seven?", Res.DOLLAR50);
    private static Question Q93 = new Question("What is fifty dollars times eight?", Res.DOLLAR50);
    private static Question Q94 = new Question("What is fifty dollars times nine?", Res.DOLLAR50);
    private static Question Q95 = new Question("What is fifty dollars times ten?", Res.DOLLAR50);
    private static Question Q96 = new Question("What is fifty dollars times twenty, minus 5 dollars?", Res.DOLLAR50, Res.DOLLAR20);
    private static Question Q97 = new Question("What is fifty dollars times twenty, minus 10 dollars?", Res.DOLLAR50, Res.DOLLAR20);
    private static Question Q98 = new Question("What is fifty dollars times twenty, minus 20 dollars?", Res.DOLLAR50, Res.DOLLAR20);
    private static Question Q99 = new Question("What is fifty dollars times twenty, minus 50 dollars?", Res.DOLLAR50, Res.DOLLAR20);
    private static Question Q100 = new Question("What is fifty dollars times twenty, minus 100 dollars?", Res.DOLLAR50, Res.DOLLAR20);
    //Level 5
    private static Question Q101 = new Question("What is one hundred dollars divided by one?", Res.DOLLAR100);
    private static Question Q102 = new Question("What is one hundred dollars divided by two?", Res.DOLLAR100);
    private static Question Q103 = new Question("What is one hundred dollars divided by three?", Res.DOLLAR100);
    private static Question Q104 = new Question("What is one hundred dollars divided by four?", Res.DOLLAR100);
    private static Question Q105 = new Question("What is one hundred dollars divided by five?", Res.DOLLAR100);
    private static Question Q106 = new Question("What is one hundred dollars divided by six?", Res.DOLLAR100);
    private static Question Q107 = new Question("What is one hundred dollars divided by seven?", Res.DOLLAR100);
    private static Question Q108 = new Question("What is one hundred dollars divided by eight?", Res.DOLLAR100);
    private static Question Q109 = new Question("What is one hundred dollars divided by nine?", Res.DOLLAR100);
    private static Question Q110 = new Question("What is one hundred dollars divided by ten?", Res.DOLLAR100);
    private static Question Q111 = new Question("What is one hundred dollars divided by eleven?", Res.DOLLAR100);
    private static Question Q112 = new Question("What is one hundred dollars divided by twelve?", Res.DOLLAR100);
    private static Question Q113 = new Question("What is one hundred dollars divided by thirteen?", Res.DOLLAR100);
    private static Question Q114 = new Question("What is one hundred dollars divided by fourteen?", Res.DOLLAR100);
    private static Question Q115 = new Question("What is one hundred dollars divided by fifteen?", Res.DOLLAR100);
    private static Question Q116 = new Question("What is one hundred dollars divided by sixteen?", Res.DOLLAR100);
    private static Question Q117 = new Question("What is one hundred dollars divided by seventeen?", Res.DOLLAR100);
    private static Question Q118 = new Question("What is one hundred dollars divided by eighteen?", Res.DOLLAR100);
    private static Question Q119 = new Question("What is one hundred dollars divided by ninteen?", Res.DOLLAR100);
    private static Question Q120 = new Question("What is one hundred dollars divided by twenty?", Res.DOLLAR100);
    private static Question Q121 = new Question("What is one hundred dollars divided by fifty, plus 5 dollars?", Res.DOLLAR100);
    private static Question Q122 = new Question("What is one hundred dollars divided by fifty, plus 10 dollars?", Res.DOLLAR100);
    private static Question Q123 = new Question("What is one hundred dollars divided by fifty, plus 20 dollars?", Res.DOLLAR100);
    private static Question Q124 = new Question("What is one hundred dollars divided by fifty, plus 50 dollars?", Res.DOLLAR100);
    private static Question Q125 = new Question("What is one hundred dollars divided by fifty, plus 100 dollars?", Res.DOLLAR100);
    public static Question Qarr1[] = {Q1, Q2, Q3, Q4, Q5, Q6, Q7, Q8, Q9, Q10, Q11, Q12,
        Q13, Q14, Q15, Q16, Q17,Q18, Q19, Q20, Q21, Q22, Q23, Q24, Q25};
    //public static Question Qarr1[] = {Q1, Q2, Q3, Q4, Q5, Q6, Q7,Q8,Q9,Q10}; //for testing 
    
    public static Question Qarr2[] = {Q26, Q27, Q28, Q29, Q30, Q31, Q32, Q33, Q34, Q35, Q36, Q37,
        Q38, Q39, Q40, Q41, Q42, Q43, Q44, Q45, Q46, Q47, Q48, Q49, Q50};
    //this doesn't work because the questions and answers are synced
    // public static Question Qarr2[] = {Q26}; //for testing

    public static Question Qarr3[] = {Q51, Q52, Q53, Q54, Q55, Q56, Q57, Q58, Q59, Q60, Q61, Q62,
        Q63, Q64, Q65, Q66, Q67, Q68, Q69, Q70, Q71, Q72, Q73, Q74, Q75};
    //public static Question Qarr3[] = {Q51}; //for testing

    public static Question Qarr4[] = {Q76, Q77, Q78, Q79, Q80, Q81, Q82, Q83, Q84, Q85, Q86, Q87,
        Q88, Q89, Q90, Q91, Q92, Q93, Q94, Q95, Q96, Q97, Q98, Q99, Q100};
    //public static Question Qarr4[] = {Q76}; //for testing

    public static Question Qarr5[] = {Q101, Q102, Q103, Q104, Q105, Q106, Q107, Q108, Q109,
        Q110, Q111, Q112, Q113, Q114, Q115, Q116, Q117, Q118, Q119, Q120, Q121,
        Q122, Q123, Q124, Q125};
    //ublic static Question Qarr5[] = {Q101}; //for testing
    public static Question[][] QarrList = {Qarr1, Qarr2, Qarr3, Qarr4, Qarr5};
    //Level 1
    //Question #1
    private static Answer A1 = new Answer(Res.PENNY, true);
    private static Answer A2 = new Answer(Res.NICKEL, false);
    private static Answer A3 = new Answer(Res.DIME, false);
    private static Answer A4 = new Answer(Res.QUARTER, false);
    //Question #2
    private static Answer A5 = new Answer(Res.PENNY, false);
    private static Answer A6 = new Answer(Res.NICKEL, true);
    private static Answer A7 = new Answer(Res.DIME, false);
    private static Answer A8 = new Answer(Res.QUARTER, false);
    //Question #3
    private static Answer A9 = new Answer(Res.PENNY, false);
    private static Answer A10 = new Answer(Res.NICKEL, false);
    private static Answer A11 = new Answer(Res.DIME, true);
    private static Answer A12 = new Answer(Res.QUARTER, false);
    //Question #4
    private static Answer A13 = new Answer(Res.QUARTER, true);
    private static Answer A14 = new Answer(Res.PENNY, false);
    private static Answer A15 = new Answer(Res.NICKEL, false);
    private static Answer A16 = new Answer(Res.DIME, false);
    //Question #5
    private static Answer A17 = new Answer(Res.LOONIE, true);
    private static Answer A18 = new Answer(Res.TOONIE, false);
    private static Answer A19 = new Answer(Res.QUARTER, false);
    private static Answer A20 = new Answer(Res.DIME, false);
    //Question #6
    private static Answer A21 = new Answer(Res.LOONIE, false);
    private static Answer A22 = new Answer(Res.TOONIE, true);
    private static Answer A23 = new Answer(Res.QUARTER, false);
    private static Answer A24 = new Answer(Res.DIME, false);
    //Question #7
    private static Answer A25 = new Answer(Res.DOLLAR5, true);
    private static Answer A26 = new Answer(Res.DOLLAR10, false);
    private static Answer A27 = new Answer(Res.DOLLAR20, false);
    private static Answer A28 = new Answer(Res.QUARTER, false);
    //Question #8
    private static Answer A29 = new Answer(Res.DOLLAR5, false);
    private static Answer A30 = new Answer(Res.DOLLAR10, true);
    private static Answer A31 = new Answer(Res.DOLLAR20, false);
    private static Answer A32 = new Answer(Res.DOLLAR50, false);
    //Question #9
    private static Answer A33 = new Answer(Res.DOLLAR5, false);
    private static Answer A34 = new Answer(Res.DOLLAR10, false);
    private static Answer A35 = new Answer(Res.DOLLAR20, true);
    private static Answer A36 = new Answer(Res.DOLLAR50, false);
    //Question #10
    private static Answer A37 = new Answer(Res.DOLLAR100, false);
    private static Answer A38 = new Answer(Res.DOLLAR10, false);
    private static Answer A39 = new Answer(Res.DOLLAR20, false);
    private static Answer A40 = new Answer(Res.DOLLAR50, true);
    //Question #11
    private static Answer A41 = new Answer(Res.DOLLAR100, true);
    private static Answer A42 = new Answer(Res.DOLLAR10, false);
    private static Answer A43 = new Answer(Res.DOLLAR20, false);
    private static Answer A44 = new Answer(Res.DOLLAR50, false);
    //Question #12
    private static Answer A45 = new Answer("1 cent", true);
    private static Answer A46 = new Answer("5 cents", false);
    private static Answer A47 = new Answer("10 cents", false);
    private static Answer A48 = new Answer("25 cents", false);
    //Question #13
    private static Answer A49 = new Answer("1 cent", false);
    private static Answer A50 = new Answer("5 cents", true);
    private static Answer A51 = new Answer("10 cents", false);
    private static Answer A52 = new Answer("25 cents", false);
    //Question #14
    private static Answer A53 = new Answer("1 cent", false);
    private static Answer A54 = new Answer("5 cents", false);
    private static Answer A55 = new Answer("10 cents", true);
    private static Answer A56 = new Answer("25 cents", false);
    //Question #15
    private static Answer A57 = new Answer("1 cent", false);
    private static Answer A58 = new Answer("5 cents", false);
    private static Answer A59 = new Answer("10 cents", false);
    private static Answer A60 = new Answer("25 cents", true);
    //Question #16
    private static Answer A61 = new Answer("1 Dollar", true);
    private static Answer A62 = new Answer("5 cents", false);
    private static Answer A63 = new Answer("2 Dollars", false);
    private static Answer A64 = new Answer("25 cents", false);
    //Question #17
    private static Answer A65 = new Answer("1 Dollar", false);
    private static Answer A66 = new Answer("5 cents", false);
    private static Answer A67 = new Answer("2 Dollars", true);
    private static Answer A68 = new Answer("25 cents", false);
    //Question #18
    private static Answer A69 = new Answer("Blue", true);
    private static Answer A70 = new Answer("Red", false);
    private static Answer A71 = new Answer("Purple", false);
    private static Answer A72 = new Answer("Green", false);
    //Question #19
    private static Answer A73 = new Answer("Blue", false);
    private static Answer A74 = new Answer("Red", false);
    private static Answer A75 = new Answer("Purple", true);
    private static Answer A76 = new Answer("Green", false);
    //Question #20
    private static Answer A77 = new Answer("Blue", false);
    private static Answer A78 = new Answer("Red", false);
    private static Answer A79 = new Answer("Purple", false);
    private static Answer A80 = new Answer("Green", true);
    //Question #21
    private static Answer A81 = new Answer("Brown", false);
    private static Answer A82 = new Answer("Red", true);
    private static Answer A83 = new Answer("Purple", false);
    private static Answer A84 = new Answer("Green", false);
    //Question #22
    private static Answer A85 = new Answer("Brown", true);
    private static Answer A86 = new Answer("Red", false);
    private static Answer A87 = new Answer("Purple", false);
    private static Answer A88 = new Answer("Green", false);
    //Question #23
    private static Answer A89 = new Answer("$20", true);
    private static Answer A90 = new Answer("$5", false);
    private static Answer A91 = new Answer("$10", false);
    private static Answer A92 = new Answer("$50", false);
    //Question #24
    private static Answer A93 = new Answer("$20", false);
    private static Answer A94 = new Answer("$5", true);
    private static Answer A95 = new Answer("$10", false);
    private static Answer A96 = new Answer("$50", false);
    //Question #25
    private static Answer A97 = new Answer("$20", false);
    private static Answer A98 = new Answer("$5", false);
    private static Answer A99 = new Answer("$10", false);
    private static Answer A100 = new Answer("$50", true);
    //Level 2
    //Question #26
    private static Answer A101 = new Answer("$2.01", true);
    private static Answer A102 = new Answer("$2.10", false);
    private static Answer A103 = new Answer("$2.15", false);
    private static Answer A104 = new Answer("$2.20", false);
    //Question #27
    private static Answer A105 = new Answer("$2.05", true);
    private static Answer A106 = new Answer("$2.10", false);
    private static Answer A107 = new Answer("$2.15", false);
    private static Answer A108 = new Answer("$2.20", false);
    //Question #28
    private static Answer A109 = new Answer("$2.05", false);
    private static Answer A110 = new Answer("$2.10", true);
    private static Answer A111 = new Answer("$2.15", false);
    private static Answer A112 = new Answer("$2.20", false);
    //Question #29
    private static Answer A113 = new Answer("$2.10", false);
    private static Answer A114 = new Answer("$2.15", false);
    private static Answer A115 = new Answer("$2.25", true);
    private static Answer A116 = new Answer("$2.20", false);
    //Question #30
    private static Answer A117 = new Answer("$3.00", true);
    private static Answer A118 = new Answer("$2.10", false);
    private static Answer A119 = new Answer("$2.00", false);
    private static Answer A120 = new Answer("$1.00", false);
    //Question #31
    private static Answer A121 = new Answer("$4.00", true);
    private static Answer A122 = new Answer("$3.00", true);
    private static Answer A123 = new Answer("$2.00", false);
    private static Answer A124 = new Answer("$3.50", false);
    //Question #32
    private static Answer A125 = new Answer("$1.00", false);
    private static Answer A126 = new Answer("$1.05", false);
    private static Answer A127 = new Answer("$1.10", false);
    private static Answer A128 = new Answer("$1.01", true);
    //Question #33
    private static Answer A129 = new Answer("$1.00", false);
    private static Answer A130 = new Answer("$1.05", true);
    private static Answer A131 = new Answer("$1.10", false);
    private static Answer A132 = new Answer("$1.01", false);
    //Question #34
    private static Answer A133 = new Answer("$1.00", false);
    private static Answer A134 = new Answer("$1.05", false);
    private static Answer A135 = new Answer("$1.10", true);
    private static Answer A136 = new Answer("$1.01", false);
    //Question #35
    private static Answer A137 = new Answer("$1.00", false);
    private static Answer A138 = new Answer("$1.25", true);
    private static Answer A139 = new Answer("$1.15", false);
    private static Answer A140 = new Answer("$1.01", false);
    //Question #36
    private static Answer A141 = new Answer("$2.00", true);
    private static Answer A142 = new Answer("$1.00", false);
    private static Answer A143 = new Answer("$1.15", false);
    private static Answer A144 = new Answer("$1.10", false);
    //Question #37
    private static Answer A145 = new Answer("$0.26", true);
    private static Answer A146 = new Answer("$0.35", false);
    private static Answer A147 = new Answer("$0.45", false);
    private static Answer A148 = new Answer("$0.15", false);
    //Question #38
    private static Answer A149 = new Answer("$0.67", false);
    private static Answer A150 = new Answer("$0.35", false);
    private static Answer A151 = new Answer("$0.45", false);
    private static Answer A152 = new Answer("$0.30", true);
    //Question #39
    private static Answer A153 = new Answer("$0.35", true);
    private static Answer A154 = new Answer("$0.30", false);
    private static Answer A155 = new Answer("$0.67", false);
    private static Answer A156 = new Answer("$0.45", false);
    //Question #40
    private static Answer A157 = new Answer("$0.50", true);
    private static Answer A158 = new Answer("$0.45", false);
    private static Answer A159 = new Answer("$0.30", false);
    private static Answer A160 = new Answer("$0.25", false);
    //Question #41
    private static Answer A161 = new Answer("$0.11", true);
    private static Answer A162 = new Answer("$0.15", false);
    private static Answer A163 = new Answer("$0.05", false);
    private static Answer A164 = new Answer("$0.10", false);
    //Question #42
    private static Answer A165 = new Answer("$0.11", false);
    private static Answer A166 = new Answer("$0.15", true);
    private static Answer A167 = new Answer("$0.06", false);
    private static Answer A168 = new Answer("$0.10", false);
    //Question #43
    private static Answer A169 = new Answer("$0.10", false);
    private static Answer A170 = new Answer("$0.15", false);
    private static Answer A171 = new Answer("$0.25", false);
    private static Answer A172 = new Answer("$0.20", true);
    //Question #44
    private static Answer A173 = new Answer("$0.06", true);
    private static Answer A174 = new Answer("$0.11", false);
    private static Answer A175 = new Answer("$0.15", false);
    private static Answer A176 = new Answer("$0.10", false);
    //Question #45
    private static Answer A177 = new Answer("$0.10", true);
    private static Answer A178 = new Answer("$0.06", false);
    private static Answer A179 = new Answer("$0.11", false);
    private static Answer A180 = new Answer("$0.15", false);
    //Question #46
    private static Answer A181 = new Answer("$3.10", true);
    private static Answer A182 = new Answer("$3.25", false);
    private static Answer A183 = new Answer("$3.01", false);
    private static Answer A184 = new Answer("$3.05", false);
    //Question #47
    private static Answer A185 = new Answer("$3.25", true);
    private static Answer A186 = new Answer("$3.10", false);
    private static Answer A187 = new Answer("$3.01", false);
    private static Answer A188 = new Answer("$3.05", false);
    //Question #48
    private static Answer A189 = new Answer("$3.25", false);
    private static Answer A190 = new Answer("$3.10", false);
    private static Answer A191 = new Answer("$3.01", true);
    private static Answer A192 = new Answer("$3.05", false);
    //Question #49
    private static Answer A193 = new Answer("$3.25", false);
    private static Answer A194 = new Answer("$3.10", false);
    private static Answer A195 = new Answer("$3.05", true);
    private static Answer A196 = new Answer("$5.00", false);
    //Question #50
    private static Answer A197 = new Answer("$3.25", false);
    private static Answer A198 = new Answer("$3.10", false);
    private static Answer A199 = new Answer("$3.05", false);
    private static Answer A200 = new Answer("$5.00", true);
    //level 3
    //Question #51
    private static Answer A201 = new Answer("$3.00", true);
    private static Answer A202 = new Answer("$2.00", false);
    private static Answer A203 = new Answer("$4.00", false);
    private static Answer A204 = new Answer("$5.00", false);
    //Question #52
    private static Answer A205 = new Answer("$3.00", false);
    private static Answer A206 = new Answer("$2.00", false);
    private static Answer A207 = new Answer("$4.00", true);
    private static Answer A208 = new Answer("$5.00", false);
    //Question #53
    private static Answer A209 = new Answer("$1.00", false);
    private static Answer A210 = new Answer("$2.00", true);
    private static Answer A211 = new Answer("$4.00", false);
    private static Answer A212 = new Answer("$0.00", false);
    //Question #54
    private static Answer A213 = new Answer("$1.00", true);
    private static Answer A214 = new Answer("$2.00", false);
    private static Answer A215 = new Answer("$4.00", false);
    private static Answer A216 = new Answer("$0.00", false);
    //Question #55
    private static Answer A217 = new Answer("$1.00", false);
    private static Answer A218 = new Answer("$2.00", false);
    private static Answer A219 = new Answer("$4.00", false);
    private static Answer A220 = new Answer("$0.00", true);
    //Question #56
    private static Answer A221 = new Answer("$4.75", true);
    private static Answer A222 = new Answer("$4.50", false);
    private static Answer A223 = new Answer("$4.25", false);
    private static Answer A224 = new Answer("$4.85", false);
    //Question #57
    private static Answer A225 = new Answer("$4.85", false);
    private static Answer A226 = new Answer("$4.75", false);
    private static Answer A227 = new Answer("$4.90", true);
    private static Answer A228 = new Answer("$4.95", false);
    //Question #58
    private static Answer A229 = new Answer("$4.95", true);
    private static Answer A230 = new Answer("$4.99", false);
    private static Answer A231 = new Answer("$4.85", false);
    private static Answer A232 = new Answer("$4.75", false);
    //Question #59
    private static Answer A233 = new Answer("$4.95", false);
    private static Answer A234 = new Answer("$4.99", true);
    private static Answer A235 = new Answer("$4.85", false);
    private static Answer A236 = new Answer("$4.75", false);
    //Question #60
    private static Answer A237 = new Answer("$9.00", true);
    private static Answer A238 = new Answer("$10.00", false);
    private static Answer A239 = new Answer("$8.00", false);
    private static Answer A240 = new Answer("$7.00", false);
    //Question #61
    private static Answer A241 = new Answer("$9.00", false);
    private static Answer A242 = new Answer("$10.00", false);
    private static Answer A243 = new Answer("$8.00", true);
    private static Answer A244 = new Answer("$7.00", false);
    //Question #62
    private static Answer A245 = new Answer("$9.00", false);
    private static Answer A246 = new Answer("$6.00", false);
    private static Answer A247 = new Answer("$8.00", false);
    private static Answer A248 = new Answer("$7.00", true);
    //Question #63
    private static Answer A249 = new Answer("$5.00", false);
    private static Answer A250 = new Answer("$6.00", true);
    private static Answer A251 = new Answer("$8.00", false);
    private static Answer A252 = new Answer("$7.00", false);
    //Question #64
    private static Answer A253 = new Answer("$5.00", true);
    private static Answer A254 = new Answer("$7.00", false);
    private static Answer A255 = new Answer("$6.00", false);
    private static Answer A256 = new Answer("$4.00", false);
    //Question #65
    private static Answer A257 = new Answer("$5.00", false);
    private static Answer A258 = new Answer("$6.00", false);
    private static Answer A259 = new Answer("$3.00", false);
    private static Answer A260 = new Answer("$4.00", true);
    //Question #66
    private static Answer A261 = new Answer("$5.00", false);
    private static Answer A262 = new Answer("$2.00", false);
    private static Answer A263 = new Answer("$3.00", true);
    private static Answer A264 = new Answer("$4.00", false);
    //Question #67
    private static Answer A265 = new Answer("$1.00", false);
    private static Answer A266 = new Answer("$2.00", true);
    private static Answer A267 = new Answer("$3.00", false);
    private static Answer A268 = new Answer("$4.00", false);
    //Question #68
    private static Answer A269 = new Answer("$1.00", true);
    private static Answer A270 = new Answer("$2.00", false);
    private static Answer A271 = new Answer("$3.00", false);
    private static Answer A272 = new Answer("$0.00", false);
    //Question #69
    private static Answer A273 = new Answer("$1.00", false);
    private static Answer A274 = new Answer("$2.00", false);
    private static Answer A275 = new Answer("$3.00", false);
    private static Answer A276 = new Answer("$0.00", true);
    //Question #70
    private static Answer A277 = new Answer("$4.99", true);
    private static Answer A278 = new Answer("$4.95", false);
    private static Answer A279 = new Answer("$4.90", false);
    private static Answer A280 = new Answer("$4.75", false);
    //Question #71
    private static Answer A281 = new Answer("$4.95", true);
    private static Answer A282 = new Answer("$4.99", false);
    private static Answer A283 = new Answer("$4.90", false);
    private static Answer A284 = new Answer("$4.75", false);
    //Question #72
    private static Answer A285 = new Answer("$4.95", false);
    private static Answer A286 = new Answer("$4.99", false);
    private static Answer A287 = new Answer("$4.90", true);
    private static Answer A288 = new Answer("$4.75", false);
    //Question #73
    private static Answer A289 = new Answer("$4.95", false);
    private static Answer A290 = new Answer("$4.90", false);
    private static Answer A291 = new Answer("$4.99", false);
    private static Answer A292 = new Answer("$4.75", true);
    //Question #74
    private static Answer A293 = new Answer("$2.00", false);
    private static Answer A294 = new Answer("$3.00", false);
    private static Answer A295 = new Answer("$4.00", true);
    private static Answer A296 = new Answer("$5.00", false);
    //Question #75
    private static Answer A297 = new Answer("$2.00", false);
    private static Answer A298 = new Answer("$3.00", true);
    private static Answer A299 = new Answer("$4.00", false);
    private static Answer A300 = new Answer("$5.00", false);
    //level 4
    //Question #76
    private static Answer A301 = new Answer("$20.00", true);
    private static Answer A302 = new Answer("$19.00", false);
    private static Answer A303 = new Answer("$21.00", false);
    private static Answer A304 = new Answer("$15.00", false);
    //Question #77
    private static Answer A305 = new Answer("$40.00", true);
    private static Answer A306 = new Answer("$20.00", false);
    private static Answer A307 = new Answer("$22.00", false);
    private static Answer A308 = new Answer("$60.00", false);
    //Question #78
    private static Answer A309 = new Answer("$40.00", false);
    private static Answer A310 = new Answer("$80.00", false);
    private static Answer A311 = new Answer("$60.00", true);
    private static Answer A312 = new Answer("$100.00", false);
    //Question #79
    private static Answer A313 = new Answer("$40.00", false);
    private static Answer A314 = new Answer("$80.00", true);
    private static Answer A315 = new Answer("$60.00", false);
    private static Answer A316 = new Answer("$100.00", false);
    //Question #80
    private static Answer A317 = new Answer("$120.00", false);
    private static Answer A318 = new Answer("$80.00", false);
    private static Answer A319 = new Answer("$60.00", false);
    private static Answer A320 = new Answer("$100.00", true);
    //Question #81
    private static Answer A321 = new Answer("$120.00", true);
    private static Answer A322 = new Answer("$140.00", false);
    private static Answer A323 = new Answer("$100.00", false);
    private static Answer A324 = new Answer("$160.00", false);
    //Question #82
    private static Answer A325 = new Answer("$120.00", false);
    private static Answer A326 = new Answer("$140.00", true);
    private static Answer A327 = new Answer("$100.00", false);
    private static Answer A328 = new Answer("$160.00", false);
    //Question #83
    private static Answer A329 = new Answer("$140.00", false);
    private static Answer A330 = new Answer("$160.00", true);
    private static Answer A331 = new Answer("$180.00", false);
    private static Answer A332 = new Answer("$200.00", false);
    //Question #84
    private static Answer A333 = new Answer("$160.00", false);
    private static Answer A334 = new Answer("$180.00", true);
    private static Answer A335 = new Answer("$220.00", false);
    private static Answer A336 = new Answer("$200.00", false);
    //Question #85
    private static Answer A337 = new Answer("$160.00", false);
    private static Answer A338 = new Answer("$180.00", false);
    private static Answer A339 = new Answer("$200.00", true);
    private static Answer A340 = new Answer("$220.00", false);
    //Question #86
    private static Answer A341 = new Answer("$50.00", true);
    private static Answer A342 = new Answer("$100.00", false);
    private static Answer A343 = new Answer("$25.00", false);
    private static Answer A344 = new Answer("$75.00", false);
    //Question #87
    private static Answer A345 = new Answer("$50.00", false);
    private static Answer A346 = new Answer("$100.00", true);
    private static Answer A347 = new Answer("$75.00", false);
    private static Answer A348 = new Answer("$150.00", false);
    //Question #88
    private static Answer A349 = new Answer("$150.00", true);
    private static Answer A350 = new Answer("$125.00", false);
    private static Answer A351 = new Answer("$100.00", false);
    private static Answer A352 = new Answer("$200.00", false);
    //Question #89
    private static Answer A353 = new Answer("$150.00", false);
    private static Answer A354 = new Answer("$200.00", true);
    private static Answer A355 = new Answer("$250.00", false);
    private static Answer A356 = new Answer("$275.00", false);
    //Question #90
    private static Answer A357 = new Answer("$250.00", true);
    private static Answer A358 = new Answer("$275.00", false);
    private static Answer A359 = new Answer("$225.00", false);
    private static Answer A360 = new Answer("$300.00", false);
    //Question #91
    private static Answer A361 = new Answer("$300.00", true);
    private static Answer A362 = new Answer("$275.00", false);
    private static Answer A363 = new Answer("$350.00", false);
    private static Answer A364 = new Answer("$375.00", false);
    //Question #92
    private static Answer A365 = new Answer("$350.00", true);
    private static Answer A366 = new Answer("$375.00", false);
    private static Answer A367 = new Answer("$400.00", false);
    private static Answer A368 = new Answer("$325.00", false);
    //Question #93
    private static Answer A369 = new Answer("$400.00", true);
    private static Answer A370 = new Answer("$375.00", false);
    private static Answer A371 = new Answer("$450.00", false);
    private static Answer A372 = new Answer("$425.00", false);
    //Question #94
    private static Answer A373 = new Answer("$400.00", false);
    private static Answer A374 = new Answer("$500.00", false);
    private static Answer A375 = new Answer("$450.00", true);
    private static Answer A376 = new Answer("$475.00", false);
    //Question #95
    private static Answer A377 = new Answer("$500.00", true);
    private static Answer A378 = new Answer("$450.00", false);
    private static Answer A379 = new Answer("$475.00", false);
    private static Answer A380 = new Answer("$550.00", false);
    //Question #96
    private static Answer A381 = new Answer("$995.00", true);
    private static Answer A382 = new Answer("$990.00", false);
    private static Answer A383 = new Answer("$980.00", false);
    private static Answer A384 = new Answer("$950.00", false);
    //Question #97
    private static Answer A385 = new Answer("$995.00", false);
    private static Answer A386 = new Answer("$990.00", true);
    private static Answer A387 = new Answer("$980.00", false);
    private static Answer A388 = new Answer("$950.00", false);
    //Question #98
    private static Answer A389 = new Answer("$995.00", false);
    private static Answer A390 = new Answer("$990.00", false);
    private static Answer A391 = new Answer("$980.00", true);
    private static Answer A392 = new Answer("$950.00", false);
    //Question #99
    private static Answer A393 = new Answer("$900.00", false);
    private static Answer A394 = new Answer("$990.00", false);
    private static Answer A395 = new Answer("$980.00", false);
    private static Answer A396 = new Answer("$950.00", true);
    //Question #100
    private static Answer A397 = new Answer("$900.00", true);
    private static Answer A398 = new Answer("$990.00", false);
    private static Answer A399 = new Answer("$995.00", false);
    private static Answer A400 = new Answer("$950.00", false);
    //level 5
    //Question #101
    private static Answer A401 = new Answer("$100.00", true);
    private static Answer A402 = new Answer("$50.00", false);
    private static Answer A403 = new Answer("$25.00", false);
    private static Answer A404 = new Answer("$115.00", false);
    //Question #102
    private static Answer A405 = new Answer("$100.00", false);
    private static Answer A406 = new Answer("$50.00", true);
    private static Answer A407 = new Answer("$115.00", false);
    private static Answer A408 = new Answer("$150.00", false);
    //Question #103
    private static Answer A409 = new Answer("$33.30", true);
    private static Answer A410 = new Answer("$55.99", false);
    private static Answer A411 = new Answer("$23.39", false);
    private static Answer A412 = new Answer("33.55", false);
    //Question #104
    private static Answer A413 = new Answer("$25.00", true);
    private static Answer A414 = new Answer("$50.00", false);
    private static Answer A415 = new Answer("$15.00", false);
    private static Answer A416 = new Answer("$35.00", false);
    //Question #105
    private static Answer A417 = new Answer("$20.00", true);
    private static Answer A418 = new Answer("$25.00", false);
    private static Answer A419 = new Answer("$35.00", false);
    private static Answer A420 = new Answer("$45.00", false);
    //Question #106
    private static Answer A421 = new Answer("$16.70", true);
    private static Answer A422 = new Answer("$8.20", false);
    private static Answer A423 = new Answer("$22.55", false);
    private static Answer A424 = new Answer("$25.99", false);
    //Question #107
    private static Answer A425 = new Answer("$16.70", false);
    private static Answer A426 = new Answer("$14.30", true);
    private static Answer A427 = new Answer("$22.55", false);
    private static Answer A428 = new Answer("$8.20", false);
    //Question #108
    private static Answer A429 = new Answer("$14.30", false);
    private static Answer A430 = new Answer("$16.70", false);
    private static Answer A431 = new Answer("$12.50", true);
    private static Answer A432 = new Answer("$8.20", false);
    //Question #109
    private static Answer A433 = new Answer("$14.30", false);
    private static Answer A434 = new Answer("$16.70", false);
    private static Answer A435 = new Answer("$12.50", false);
    private static Answer A436 = new Answer("$11.10", true);
    //Question #110
    private static Answer A437 = new Answer("$12.50", false);
    private static Answer A438 = new Answer("$14.30", false);
    private static Answer A439 = new Answer("$10.00", true);
    private static Answer A440 = new Answer("$11.10", false);
    //Question #111
    private static Answer A441 = new Answer("$9.10", true);
    private static Answer A442 = new Answer("$11.10", false);
    private static Answer A443 = new Answer("$12.50", false);
    private static Answer A444 = new Answer("$10.00", false);
    //Question #112
    private static Answer A445 = new Answer("$9.10", false);
    private static Answer A446 = new Answer("$8.35", true);
    private static Answer A447 = new Answer("$10.00", false);
    private static Answer A448 = new Answer("$11.10", false);
    //Question #113
    private static Answer A449 = new Answer("$9.10", false);
    private static Answer A450 = new Answer("$7.70", true);
    private static Answer A451 = new Answer("$8.35", false);
    private static Answer A452 = new Answer("$6.25", false);
    //Question #114
    private static Answer A453 = new Answer("$7.15", true);
    private static Answer A454 = new Answer("$8.35", false);
    private static Answer A455 = new Answer("$7.70", false);
    private static Answer A456 = new Answer("$9.10", false);
    //Question #115
    private static Answer A457 = new Answer("$7.35", false);
    private static Answer A458 = new Answer("$8.35", false);
    private static Answer A459 = new Answer("$9.15", false);
    private static Answer A460 = new Answer("$6.70", true);
    //Question #116
    private static Answer A461 = new Answer("$7.35", false);
    private static Answer A462 = new Answer("$8.35", false);
    private static Answer A463 = new Answer("$9.15", false);
    private static Answer A464 = new Answer("$6.25", true);
    //Question #117
    private static Answer A465 = new Answer("$7.35", false);
    private static Answer A466 = new Answer("$8.35", false);
    private static Answer A467 = new Answer("$9.15", false);
    private static Answer A468 = new Answer("$5.88", true);
    //Question #118
    private static Answer A469 = new Answer("$5.55", true);
    private static Answer A470 = new Answer("$5.88", false);
    private static Answer A471 = new Answer("$7.35", false);
    private static Answer A472 = new Answer("$9.15", false);
    //Question #119
    private static Answer A473 = new Answer("$7.35", false);
    private static Answer A474 = new Answer("$9.15", false);
    private static Answer A475 = new Answer("$5.88", false);
    private static Answer A476 = new Answer("$5.30", true);
    //Question #120
    private static Answer A477 = new Answer("$5.88", false);
    private static Answer A478 = new Answer("$5.30", false);
    private static Answer A479 = new Answer("$5.55", false);
    private static Answer A480 = new Answer("$5.00", true);
    //Question #121
    private static Answer A481 = new Answer("$7.00", true);
    private static Answer A482 = new Answer("12.00", false);
    private static Answer A483 = new Answer("22.00", false);
    private static Answer A484 = new Answer("52.00", false);
    //Question #122
    private static Answer A485 = new Answer("7.00", false);
    private static Answer A486 = new Answer("12.00", true);
    private static Answer A487 = new Answer("22.00", false);
    private static Answer A488 = new Answer("52.00", false);
    //Question #123
    private static Answer A489 = new Answer("7.00", false);
    private static Answer A490 = new Answer("12.00", false);
    private static Answer A491 = new Answer("22.00", true);
    private static Answer A492 = new Answer("52.00", false);
    //Question #124
    private static Answer A493 = new Answer("102.00", false);
    private static Answer A494 = new Answer("12.00", false);
    private static Answer A495 = new Answer("22.00", false);
    private static Answer A496 = new Answer("52.00", true);
    //Question #125
    private static Answer A497 = new Answer("102.00", true);
    private static Answer A498 = new Answer("12.00", false);
    private static Answer A499 = new Answer("22.00", false);
    private static Answer A500 = new Answer("52.00", false);
    public static Answer Aarr1[][] = {{A1, A2, A3, A4},
    {A5, A6, A7, A8},
    {A9, A10, A11, A12},
    {A13, A14, A15, A16},
    {A17, A18, A19, A20},
    {A21, A22, A23, A24},
    {A25, A26, A27, A28},
    {A29, A30, A31, A32},
    {A33, A34, A35, A36},
    {A37, A38, A39, A40},
    {A41, A42, A43, A44},
    {A45, A46, A47, A48},
    {A49, A50, A51, A52},
    {A53, A54, A55, A56},
    {A57, A58, A59, A60},
    {A61, A62, A63, A64},
    {A65, A66, A67, A68},
    {A69, A70, A71, A72},
    {A73, A74, A75, A76},
    {A77, A78, A79, A80},
    {A81, A82, A83, A84},
    {A85, A86, A87, A88},
    {A89, A90, A91, A92},
    {A93, A94, A95, A96},
    {A97, A98, A99, A100}};
    public static Answer Aarr2[][] = {{A101, A102, A103, A104},
    {A105, A106, A107, A108},
    {A109, A110, A111, A112},
    {A113, A114, A115, A116},
    {A117, A118, A119, A120},
    {A121, A122, A123, A124},
    {A125, A126, A127, A128},
    {A129, A130, A131, A132},
    {A133, A134, A135, A136},
    {A137, A138, A139, A140},
    {A141, A142, A143, A144},
    {A145, A146, A147, A148},
    {A149, A150, A151, A152},
    {A153, A154, A155, A156},
    {A157, A158, A159, A160},
    {A161, A162, A163, A164},
    {A165, A166, A167, A168},
    {A169, A170, A171, A172},
    {A173, A174, A175, A176},
    {A177, A178, A179, A180},
    {A181, A182, A183, A184},
    {A185, A186, A187, A188},
    {A189, A190, A191, A192},
    {A193, A194, A195, A196},
    {A197, A198, A199, A200}};
    public static Answer Aarr3[][] = {{A201, A202, A203, A204},
    {A205, A206, A207, A208},
    {A209, A210, A211, A212},
    {A213, A214, A215, A216},
    {A217, A218, A219, A220},
    {A221, A222, A223, A224},
    {A225, A226, A227, A228},
    {A229, A230, A231, A232},
    {A233, A234, A235, A236},
    {A237, A238, A239, A240},
    {A241, A242, A243, A244},
    {A245, A246, A247, A248},
    {A249, A250, A251, A252},
    {A253, A254, A255, A256},
    {A257, A258, A259, A260},
    {A261, A262, A263, A264},
    {A265, A266, A267, A268},
    {A269, A270, A271, A272},
    {A273, A274, A275, A276},
    {A277, A278, A279, A280},
    {A281, A282, A283, A284},
    {A285, A286, A287, A288},
    {A289, A290, A291, A292},
    {A293, A294, A295, A296},
    {A297, A298, A299, A300}};
    public static Answer Aarr4[][] = {{A301, A302, A303, A304},
    {A305, A306, A307, A308},
    {A309, A310, A311, A312},
    {A313, A314, A315, A316},
    {A317, A318, A319, A320},
    {A321, A322, A323, A324},
    {A325, A326, A327, A328},
    {A329, A330, A331, A332},
    {A333, A334, A335, A336},
    {A337, A338, A339, A340},
    {A341, A342, A343, A344},
    {A345, A346, A347, A348},
    {A349, A350, A351, A352},
    {A353, A354, A355, A356},
    {A357, A358, A359, A360},
    {A361, A362, A363, A364},
    {A365, A366, A367, A368},
    {A369, A370, A371, A372},
    {A373, A374, A375, A376},
    {A377, A378, A379, A380},
    {A381, A382, A383, A384},
    {A385, A386, A387, A388},
    {A389, A390, A391, A392},
    {A393, A394, A395, A396},
    {A397, A398, A399, A400}};
    public static Answer Aarr5[][] = {{A401, A402, A403, A404},
    {A405, A406, A407, A408},
    {A409, A410, A411, A412},
    {A413, A414, A415, A416},
    {A417, A418, A419, A420},
    {A421, A422, A423, A424},
    {A425, A426, A427, A428},
    {A429, A430, A431, A432},
    {A433, A434, A435, A436},
    {A437, A438, A439, A440},
    {A441, A442, A443, A444},
    {A445, A446, A447, A448},
    {A449, A450, A451, A452},
    {A453, A454, A455, A456},
    {A457, A458, A459, A460},
    {A461, A462, A463, A464},
    {A465, A466, A467, A468},
    {A469, A470, A471, A472},
    {A473, A474, A475, A476},
    {A477, A478, A479, A480},
    {A481, A482, A483, A484},
    {A485, A486, A487, A488},
    {A489, A490, A491, A492},
    {A493, A494, A495, A496},
    {A497, A498, A499, A500}};
    public static Answer[][][] AarrList = {Aarr1, Aarr2, Aarr3, Aarr4, Aarr5};
    static Random rand = new Random();
    //random column number. has a one time use, then gets appended to randomcolnumber list so it doesn't get used again
    static int randomCol = 0;
    static ArrayList<Answer> stored_answers_for_each_question_arrayList = new ArrayList<Answer>();

    public void QnA() {
    }

}
