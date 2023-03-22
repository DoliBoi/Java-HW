package cz.cvut.fel.pjv;


public class BruteForceAttacker extends Thief {
    char[]  pswd;
    char[] alphaString;
    
    @Override
    public void breakPassword(int sizeOfPassword) {
        pswd = new char[sizeOfPassword];
        alphaString = getCharacters();
        
        if (!tryOpen(pswd))
        loop(0, sizeOfPassword);
    }
    
    private boolean loop(int index, int sizeOfPassword) {
       for (int i = 0; i < alphaString.length; i++) {
           pswd[index] = alphaString[i];
           if (index == pswd.length - 1) 
                if (tryOpen(pswd))
                    return true;
           if(index < sizeOfPassword - 1) {
               if (loop(index + 1, sizeOfPassword))
                   return true;
           }
       }
      return false; 
    }

}
    



