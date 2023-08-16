 import java.util.*;
public class DrawRect01
{
 static Scanner in = new Scanner(System.in);
 public  static void main (String[] args)
 {
 
 drawRect(10,10,10);
 // width height depth
 
 // make draw rect glass next where u can see inside
 
 }
 
 public static void drawRect(int width, int height, int depth)
 {
  System.out.println("");//start a new line.
  // section 0
  for (int i=0; i<depth +1/*note #13*/ ; i++) {System.out.print(" ");} //draw the blank space outside
  for (int i=0; i< width+1/*note #13*/ ; i++) {System.out.print("_");} //draw the edge underline 
  System.out.println("");
  
  // section 1 & 2
  for (int i=0; i< depth; i++) //  go into a new line every iteration 
  {  
   for(int g=depth-i; g>0 ; g-- ) {System.out.print(" ");} // draw blank space outside
   System.out.print("/");// draw first "/"
   for (int g=0; g<width ; g++) { if(i == depth-1/*note #14*/) {System.out.print("_");} else{System.out.print(" ");}} // draw blank space ceiling or the edge line
   System.out.print("/");// draw second "/"   
   //enter if stament to whether if depth > height or otherwise.
   if(i >= height ){for(int s=0; s< height; s++){ System.out.print(" ");} System.out.print("/");}// then draw "/" instead of "|" //NEW ADDED //Explain Later 
   else {for(int g=i; g>0; g-- ) {System.out.print(" ");} System.out.print("|");}// draw them "|" //NEW ADDED //Explain Later 
   System.out.println(""); //go to the next line                                                                                                                              
  }
  
  // section 3
  for (int i=0; i< height-depth/*note 15*/; i++) //  go into a new line every iteration 
  {  
   System.out.print("|");  
   for (int g=0; g<width +1/*note #13*/; g++) {System.out.print(" ");} // draw blank space front
   System.out.print("|");  
   for (int g=0; g<depth -1/*note #17*/; g++) {System.out.print(" ");} // draw blank space side
   System.out.println("|"); 
  }
  
  //secton 4 
  for (int i=0; i< (height - Math.max(height-depth,0)); i++) //  go into a new line every iteration  BOOOOOOOOOOOOOOOOOOB height-(height-depth) used to be just depth
  { 
     System.out.print("|");  
     for (int g=0; g<width+1/*note #13*/  ; g++) { if(i == (height - Math.max(height-depth,0))-1/*note #14 & 16*/) {System.out.print("_");} else{System.out.print(" ");}} // draw blank space front or "_" BOOOOOOOOOOB like lise booob
     System.out.print("|");               //^^^^^^ a.k.a last line
     for(int g=depth-i -1 -Math.max(depth-height,0); g>0 ; g-- ) {System.out.print(" ");} // draw blank space side
     System.out.println("/");
     
     
  }
 } 
}


/*
Model:
   ____0____  << section 0: the edge line
  /    1   /|   << section 1: the entire ceiling
 /____2__ / |   << section 2: the edge line
|        |  |  
|   3    |  |   << section 3: the plane front wall
|   4    | /   << section 4: the plant side wall with slant floor
|___5____|/ << section 5: the edge line
   ________
  /ceiling/| outside
 /_______/ |
|        |side
| front  | |
|        | /
|________|/  
  

Notes:
#11- all alphabetical alphabet such as (i) are choosen for no reason, they dont indicated..
     ...anything. The creator desired to use them.
#13- The reason why we increased it by +1 if for visual pusposes. deleting this number..
     ..will diminish the the beuty.
#14- the last row of the ceiling/front is actually belong to the next section. thats why we go -1 from the...
     ...the depth. The last line of the cieling/front a.k.a next section is always depth -1....
     ...because we started from 0. 
#15- section three is about the portion that dont align with slant floor, so we subtract depth...
     ... and the rest of height will be completed in section 4.
#16- section 4 alighn with the slant floor. so if the depth is 6, then there are 6 slant lines..
     ...and that means 6 height lines aligned with it. the rest of height is done in section 3..
     ..if there was any.
#17- This ties to note #13, since we added +1 to the width for some places, we have give something....
     ...up in return.
#18- for most notes above, we can subrtact or add 1 to either 1-initilization or 2-conditonal expresions..
     ...in the for loop.


Conflicted model #2
     ________
    /       /|
   /       / | 
  /       / / 
 /       / /
/______ / /
|      | /
|______|/     



*/
//  System.out.println("Section 3:" + Math.max(height - depth, 0));
//  System.out.println("Section 4:" + (height - Math.max(height-depth,0)));
//for (int i=0; i< height+(height-depth); i++) //  go into a new line every iteration  BOOOOOOOOOOOOOOOOOOB height-(height-depth) used to be just depth
//{ 
//System.out.print("|");  
//for (int g=0; g<width+1/*note #13*/  ; g++) { if(i == depth-1/*note #14 & 16*/) {System.out.print("-");} else{System.out.print("0");}} // draw blank space front or "_" BOOOOOOOOOOB like lise booob
//System.out.print("|");               //^^^^^^ a.k.a last line
//for(int g=depth-i -1/*note #17*/; g>0 ; g-- ) {System.out.print("0");} // draw blank space side
//System.out.println("/");
//} 
  
