public class Delimiters {
    public ArrayList<String> getDelimitersList(String[] tokens){
        ArrayList<String> L = new ArrayList<String>();
        for(String S : tokens){
            if(S.equals(openDel) || S.equals(clodeDel)){
                L.add(S);
            }
        }
        return L;
    }
}

public boolean isBalanced(ArrayList<String> delimiters){
 int open = 0;
 int close = 0;
 for (String str : delimiters){
        if (str.equals(openDel)){
        open++;
        }
        else{
            close++;
        }
        if (closeCount > openCount){
            return false;
        }
    }
 if (open == close){
     return true;
    }

 else{
     return false;
    }
}
