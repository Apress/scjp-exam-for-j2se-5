
 class CodeWalkThree {
    public static void main(String [] args) {
        CodeWalkThree cw = new CodeWalkThree();   
        CodeWalkThree cw2 = new CodeWalkThree();
        System.out.print(cw == cw2);
        cw2 = operate(cw,cw2);
        System.out.print(" " + (cw == cw2));
    }
    static CodeWalkThree operate(CodeWalkThree cw1, CodeWalkThree cw2) {
        CodeWalkThree cw3 = cw1;  
        cw1 = cw2;  
        return cw3;
    }
  }
