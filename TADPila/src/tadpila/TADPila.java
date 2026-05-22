package tadpila;

public class TADPila {

    public static void main(String[] args) {
//        Pila p = new Pila();
//        
//        p.apilar(5);
//        p.apilar(1);
//        p.apilar(3);
//        p.apilar(7);
//        
//        p.mostrar();


        // ([{}]) True
        // ([{}]} False
        // ([{}])[] True
        
        String exp1 = "([{}])";
        String exp2 = "([{}]}";
        String exp3 = "([{}])[]";
        
        System.out.println("Es balanceado: " + balanceoParentesis(exp3));
    }
    
    public static boolean balanceoParentesis(String exp){
        if(exp.length() % 2 != 0) return false;
        
        Pila p = new Pila();
        
        for (int i = 0; i < exp.length(); i++) {
            char c = exp.charAt(i);
            
            if(c == '(' || c == '[' || c == '{'){
                p.apilar(c);
            }else if(c == ')' || c == ']' || c == '}'){
                if(p.esVacia()) return false;
                
                char cPila = (char)p.top();
                if(esPareja(cPila, c)){
                    p.desapilar();
                }
            }
        }
        
        return p.esVacia();
    }
    
    public static boolean esPareja(char cApertura, char cCierre){
        return cApertura == '(' && cCierre == ')' ||
               cApertura == '{' && cCierre == '}' ||
               cApertura == '[' && cCierre == ']';
    }
    
}
