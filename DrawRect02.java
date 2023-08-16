 import java.util.*;
public class DrawRect02
{
 static Scanner in = new Scanner(System.in);
 public  static void main (String[] args)
 {
 drawRect(5,5,5);
 // width height depth
 // make draw rect glass next where u can see inside
 }
 
 
 public static void drawRect(int width, int height, int depth)
 {
  if(width==0 || height ==0 || depth==0){System.out.println("This shape don't exist."); System.exit(0);} //If any of the dimensions are 0
  System.out.println("");//start a new line.
  
  // section 0
  for (int i=0; i< depth+1/*note #13*/ ; i++) {System.out.print(" ");} //draw the blank space outside
  for (int i=0; i< width+1/*note #13*/ ; i++) {System.out.print("_");} //draw the edge underline 
  System.out.println(""); //go to the next line  
  
  // section 1 & 2
  for (int i=0; i< depth; i++) // go into a new line every iteration 
  {  
   for(int g=depth-i; g>0 ; g-- ) {System.out.print(" ");} // draw blank space outside
   System.out.print("/");// draw first "/"
   for (int g=0; g<width ; g++) { if(i == depth-1/*note #14*/) {System.out.print("_");} else{System.out.print(" ");}} // draw blank space ceiling or the edge line
   System.out.print("/");// draw second "/"   
   //Read note #35 for the next two lines.
   if(i < height ){for(int g=i; g>0; g-- ) {System.out.print(" ");} System.out.print("|");}
   else {for(int s=0; s< height; s++){ System.out.print(" ");} System.out.print("/");}
   System.out.println(""); //go to the next line                                                                                                                              
  }
  
  // section 3
  for (int i=0; i< height-depth/*note 15*/; i++) //  go into a new line every iteration 
  {  
   System.out.print("|");  
   for (int g=0; g<width +1/*note #13*/; g++) {System.out.print(" ");} // draw blank space front
   System.out.print("|");  
   for (int g=0; g<depth -1/*note #17*/; g++) {System.out.print(" ");} // draw blank space side
   System.out.print("|"); 
   System.out.println(""); //go to the next line  
  }
  
  //secton 4 & 5
  for (int i=0; i< (height - Math.max(height-depth,0))/*note #19*/; i++) // go into a new line every iteration 
  { 
     System.out.print("|");  
     for (int g=0; g<width+1/*note #13*/ ; g++) { if(i == (height - Math.max(height-depth,0))-1/*note #14 & 20*/) {System.out.print("_");} else{System.out.print(" ");}} // draw blank space front or "_".
     System.out.print("|");                                  //^^^^^^ a.k.a last line
     for(int g=depth-i-1/*note #17*/ -Math.max(depth-height,0)/*note #22*/; g>0 ; g-- ) {System.out.print(" ");} // draw blank space side
     System.out.print("/");
     System.out.println(""); //go to the next line  
  }
  
  
 } 
}


/*
Models:
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
#19- This one is little bit complicated.Section 4 is the remainder of the height wasent covered in section 3.
     Therefore, we subtract this: height - section 3 = height - (height - depth). But Wait! section 3 should be..
     ...either a 0 or natural number, this will not harm section 3, but it will harm section 4 if we leave it like that.
     So we use the Math,max method to either get the number itself if it's positive or zero if negative.
#35- ok,look at Conflicted models #1&2. Notice the difference at point Q. model #1 has Q align with front...
     ....while model #2 has Q to align with ceiling. So, if(i< height), that means that we havent crossed...
     ...the height of the shape, thats why we go with "|". as I increase, it will pass the height, meaning...
     ...that depth is larger and all "|" have been placed.Therefore, we start drawing thre "/".This fixes...
     ...the big issued with the two conflicted models.
#20- This long formual and taking one (becuase we start counting i from zero)indicate the last line.So if it was..
     ...the last line, then we draw the "_".
#22- adding -Math.max(depth-height,0) is a bit complicted. Basically, many of the slant lines for depth might have....
     ...been already taken by section 2. So we have to take that into account or else it draws it from far begining...
     ...from right. noting, this issue can only be found in conflicted model #2 because Q point comes in section 2...
     ...and take some of the slant lines there. Anyway, we have to subtract the space already taken from the one we..
     ..gonna draw. Also, it must be a 0 or a natural number or else it will cause problems. So we repeat the Math.max..
     ..just like note #19.

Conflicted model #1
   ________
  /       /| 
 /_______/ |
|        | |
|        | |
|        | /< point Q
|________|/  
  
Conflicted model #2
     ________
    /       /|
   /       / | < point Q
  /       / / 
 /       / /
/______ / /
|      | /
|______|/     

*/

