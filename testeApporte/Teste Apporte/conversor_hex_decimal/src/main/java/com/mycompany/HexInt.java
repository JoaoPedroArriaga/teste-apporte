package com.mycompany;

public class HexInt{
    public enum HexDigit {
        A('A', 10),
        B('B', 11),
        C('C', 12),
        D('D', 13),
        E('E', 14),
        F('F', 15);

        private final char hexChar;
        private final int decimalValue;
        
        HexDigit(char hexChar, int decimalValue) {
            this.hexChar = hexChar;
            this.decimalValue = decimalValue;
        }

        public char getHexChar() {
            return hexChar;
        }

        public int getDecimalValue() {
            return decimalValue;
        }

        public static int charToDecimal(char hexChar){
            for (HexDigit hex : values()) {
                if(hex.hexChar == Character.toUpperCase(hexChar)){
                    return hex.decimalValue;
                }
            }
            throw new IllegalArgumentException("Caractere hexadecimal inválido: " + hexChar);
        }

        public static boolean isHexDigit(char hexChar) {
        hexChar = Character.toUpperCase(hexChar);
        return (hexChar >= '0' && hexChar <= '9') || (hexChar >= 'A' && hexChar <= 'F');
    }
    }
    
    
    public static int parseHexInt(String hex){
        if(hex == null || hex.isEmpty()){
            throw new IllegalArgumentException("String não pode ser nula ou vazia");
        }

        if(hex.charAt(0) == '-'){
            throw new IllegalArgumentException("String hexadecimal inválida:" + hex);
        }
        
        int result = 0;
        for(int i = 0; i < hex.length(); i++){
            char hexChar = hex.charAt(i);
            if(!HexDigit.isHexDigit(hexChar)){
                throw new IllegalArgumentException("Caractere hexadecimal inválido: " + hexChar); 
            }

            int digitValue;

            if(hexChar >= '0' && hexChar <= '9'){
                digitValue = hexChar - '0';
            } else{
                digitValue = HexDigit.charToDecimal(hexChar);
            }
            
            result = result * 16 + digitValue;
        }

        return result;
    }

    public static void main(String []args){
        //Testes
        try{
            System.out.println(parseHexInt("A")); // 10
            System.out.println(parseHexInt("1F")); // 31
            System.out.println(parseHexInt("0")); // 0
            System.out.println(parseHexInt("1A")); // 26
            System.out.println(parseHexInt("FF")); // 255
            System.out.println(parseHexInt("1FA3")); // 8099

            System.out.println(parseHexInt("G")); // Deve lançar exceção
        } catch (IllegalArgumentException e) {
            System.out.println("Erro esperado: " + e.getMessage());
        }  
    }
}