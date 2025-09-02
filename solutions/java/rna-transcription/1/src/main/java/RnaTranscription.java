class RnaTranscription {

    String transcribe(String dnaStrand) {
        String transcribe = "";
        for (int i = 0; i < dnaStrand.length(); i++) {
            if (dnaStrand.charAt(i) == 'A') {
                transcribe += "U";
            }else if (dnaStrand.charAt(i) == 'C') {
                transcribe += "G";
            }
            else if (dnaStrand.charAt(i) == 'G') {
                transcribe += "C";
            }else if (dnaStrand.charAt(i) == 'T') {
                transcribe += "A";
            }
        }
        return transcribe;
    }

}
