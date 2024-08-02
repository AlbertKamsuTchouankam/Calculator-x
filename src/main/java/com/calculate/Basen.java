package com.calculate;

public class Basen {
     
    /**
         * Umrechnung von einer dezimalen Zahl in Binäre
         * @param a dezimale Zahl
         * @return Binäre Darstellung
         */
        public static String decInBin ( int a){

            String b = " ";

            while ( a > 0){

                b = a%10 + b;

                a = a/2;
            }
            return b;
        }








    /**
     * Aufwand Methode für die Umwandlung von Hexadezimal in binäre Darstellung
     * @param Hex resultierende Zahl aus dem Durchlauf der Stelle von dem String Parameter im "HexZuBin"
     * diese Zahl ist hier dann angewendet, um ihre Korrespondenz in Binäre zu finden, dann wird diese Korrespondenz
     * für die Weiterführung der Konvertierung in der anderen Methode gebraucht.
     * @return return die Korrespondenz falls, eine vorliegt sonst nichts.
     */
    public static String AufwandHexZuBin (String Hex){

              String RE="";

            switch (Hex){

                case "0" : RE = "0000";
                break;
                case "1" : RE = "0001";
                break;
                case "2" : RE = "0010";
                break;
                case "3" : RE = "0011";
                break;
                case "4" : RE = "0100";
                break;
                case "5" : RE = "0101";
                break;
                case "6" : RE = "0110";
                break;
                case "7" : RE = "0111";
                break;
                case "8" : RE = "1000";
                break;
                case "9" : RE = "1001";
                break;
                case "A" : RE = "1010";
                break;
                case "B" : RE = "1011";
                break;
                case "C" : RE = "1100";
                break;
                case "D" : RE = "1101";
                break;
                case "E" : RE = "1110";
                break;
                case "F" : RE = "1111";
                break;

                default : RE = "nicht Hexadezimal konvertiebar ";


            };

            return RE;

        }

    /**
     * Die Konvertierung von Hexadezimale in binäre Zahl.
     * Hier wird noch zusätzlich die Methode "hexbin" zum Aufwand benötigt um
     * @param HexadezimalZahl gegebene Hexadezimal Zahl
     * @return gib die binäre Darstellung aus.
     */

    public static String HexZuBin (String HexadezimalZahl){

            String binäreDar = "";

            if( HexadezimalZahl.length() > 1 ) {

                for (int i = 0; i < HexadezimalZahl.length(); i++) {

                    binäreDar = binäreDar + AufwandHexZuBin(String.valueOf(HexadezimalZahl.charAt(i)));


                }
            }

            else {

                binäreDar = AufwandHexZuBin(HexadezimalZahl);

            }

            return binäreDar;

        }










        /**
         * gib die Länge einer Nummer
         * @param n Nummer
         * @return Länge
         */

        public static int Length ( int n){

            int length = 0;

            while( n != 0 ){
                length++;
                n = n/10;
            }
            return length;
        }







        /**
         * Hier wird die binäre Darstellung in Dezimal konvertiert
         * @param binaereZahl die gegebene binäre Darstellung
         * @return die dezimale Darstellung
         */

        public static int BinZuDec ( int binaereZahl ){

            int DezimalZahl= 0;
            int pow = 0; // wird zu jedem Schritt des Durchlaufs von der Zahl (über Division durch 10) um 1 erhöht und wird als potenz benutz.
            while ( binaereZahl != 0){

                DezimalZahl = DezimalZahl + binaereZahl%10 * (int)Math.pow(2,pow);
                pow++;
                binaereZahl/=10;
            }
            return DezimalZahl;
        }


    /**
     * Aufwand Methode für die Umwandlung von DezimalZahl in Hexadezimal
     * @param dezimal resultierende Zahl aus dem führenden Modulo von 16 mit dem Parameter im "DecZuHex"
     * diese Zahl ist hier dann angewendet, um ihre Korrespondenz in hexadezimal zu finden, dann wird diese Korrespondenz
     * für die Weiterführung der Konvertierung in der anderen Methode gebraucht.
     * @return return die Korrespondenz falls, eine vorliegt sonst die Zahl selbst.
     */


    public static String AufwandDecZuHex (int dezimal){
         
        
        String RE="";

        switch (dezimal){

            case 10 :  RE = "A";
            break;
            case 11 : RE = "B";
            break;
            case 12 : RE = "C";
            break;
            case 13 : RE = "D";
            break;
            case 14 : RE = "E";
            break;
            case 15 : RE = "F";
            break;

            default : RE = String.valueOf(dezimal);

        };

        return RE;

    }

    /**
     * Hier wird eine dezimale Zahl in Hexadezimal umgewandelt.
     * Braucht ihrer AufwandMethode "AufwandDecZuHex", damit eine Korrespondenz mit der resultierenden Zahl über Division durch 16 zu finden.
     * dann wird hier angewendet, das Ergebnis, ist die verkettung von diesen Korrespondenten
     * @param dezimal die gegebene DezimalZahl
     * @return Hexadezimale Darstellung.
     */

    public static String DecZuHex ( int dezimal){
        String hexaDezimal = "";
        while ( dezimal !=0 ){

            hexaDezimal = AufwandDecZuHex(dezimal%16) + hexaDezimal;

            dezimal /= 16;

        }
        return hexaDezimal;
    }

    /**
     * Hier wird eine binäre Zahl in hexadezimale Darstellung umgewandelt
     * @param binaereZahl gegebene binäre Zahl
     * @return hexadezimale Darstellung.
     */

    public static String BinZuHex ( int binaereZahl){

            int dezimal = BinZuDec(binaereZahl);
            return DecZuHex(dezimal);


    }

    /**
     * Hier wird eine hexadezimale Zahl in dezimale Darstellung umgewandelt
     * durch eineigen Aufwand Methode sind wir zur Lösung gekommen
     * hexadezimale Darstellung.
     * @param hexaDezimal gegebene hexadezimale Zahl
     * @return Dezimale Darstellung,
     */

    public static int HexZuDec ( String hexaDezimal ){

        String binaere = HexZuBin(hexaDezimal);
        int Binaere = Integer.valueOf(binaere );
        return BinZuDec(Binaere);

    }

    public static double facto ( double n) {
        return n == 0 ? 1 : n *  facto(n-1) ;
    }


    }
